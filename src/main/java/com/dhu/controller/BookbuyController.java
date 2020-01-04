package com.dhu.controller;
import com.dhu.bean.Book;
import com.dhu.bean.User;
import java.math.BigDecimal;
import com.dhu.bean.Msg;
import com.dhu.service.BookService;
import com.dhu.bean.Shop;
import com.dhu.service.ShopService;
import com.dhu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller

@RequestMapping(value = "/bookbuy")
public class BookbuyController {

    @Autowired
    BookService bookService;

    @Autowired
    ShopService shopService;

    @Autowired
    UserService userService;
    /**
     * 用户将一本书籍添加进数据库并添加进购物车
     * 整合两个操作，更新（传入user token和book bookId和购买数量的int counts）
     */
    @ResponseBody
    @RequestMapping(value = "/addtobuy/{userId}/{bookId}/{counts}",method = RequestMethod.GET)
    public Msg addtobuy(@PathVariable("userId") String id, @PathVariable("bookId") String bookId, @PathVariable("counts") int counts){
        Book book=new Book();
        if(id.equals(null)){
            return Msg.fail().add("va_msg", "不合法id");
        }
        book=bookService.selectByPrimaryKey(bookId);
        if(book==null){
            return Msg.fail().add("va_msg", "该书不存在");
        }
        User user=userService.getuserbyid(id);
        if(user==null){
            return Msg.fail().add("va_msg", "不存在该用户");
        }
        int a=bookService.buybook(bookId,counts);
        if(a == 1){
            Shop shop=new Shop();
            Date now = new Date();
            DateFormat d5 = DateFormat.getDateTimeInstance();
            String str5 = d5.format(now);
            shop.setShopid(user.getUserid()+str5);
            shop.setBookid(book.getBookid());
            shop.setBookname(book.getBookname());
            double money=book.getBookprice()*counts;
            BigDecimal price=new BigDecimal(money);
            shop.setBookprice(price);
            shop.setUseid(user.getUserid());
            shop.setShopimage(book.getBookimage());
            shop.setBookintroduction(Integer.toString(counts));
            shop.setPaystatus("notpay");
            shop.setShopstatus("no");
            shopService.saveshop(shop);
            return Msg.success().add("shopId",shop.getShopid());
        }
        else
        {
            return Msg.fail().add("va_msg", "该书籍已卖光");
        }
    }


    /**
     * 用户将一本书籍退货，删除订单
     */
    @ResponseBody
    @RequestMapping(value = "/backbook/{shopId}",method = RequestMethod.GET)
    public Msg backbook(@PathVariable("shopId") String shopId) {
        if(shopId==null){
            return Msg.fail().add("va_msg", "不存在该订单");
        }
        else{
            shopService.deleteshop(shopId);
            Shop shop=new Shop();
            return Msg.success();
        }
    }

    /**
     * 用户支付，将支付状态变为已支付
     */
    @ResponseBody
    @RequestMapping(value = "/buybook/{shopId}",method = RequestMethod.GET)
    public Msg buybook(@PathVariable("shopId") String shopId) {
        Shop shop=new Shop();
        shop=shopService.findshop(shopId);
        if(shop==null){
            return Msg.fail().add("va_msg", "不存在该订单");
        }
        else{
            shop.setPaystatus("pay");
            shopService.updateshop(shop);
            return Msg.success();
        }
    }

    /**
     * 管理员修改货物的状态到待提取
     */
    @ResponseBody
    @RequestMapping(value = "/changestatus1/{shopId}",method = RequestMethod.GET)
    public Msg changestatus1(@PathVariable("shopId") String shopId) {
        Shop shop=new Shop();
        shop=shopService.findshop(shopId);
        if(shop==null){
            return Msg.fail().add("va_msg", "不存在该订单");
        }
        else{
            shop.setShopstatus("wait");
            shopService.updateshop(shop);
            return Msg.success();
        }
    }

    /**
     * 管理员修改货物的状态到已提取
     */
    @ResponseBody
    @RequestMapping(value = "/changestatus2/{shopId}",method = RequestMethod.GET)
    public Msg changestatus2(@PathVariable("shopId") String shopId) {
        Shop shop=new Shop();
        shop=shopService.findshop(shopId);
        if(shop==null){
            return Msg.fail().add("va_msg", "不存在该订单");
        }
        else{
            shop.setShopstatus("yes");
            shopService.updateshop(shop);
            return Msg.success();
        }
    }

    @ResponseBody
    @RequestMapping(value = "/getinform/{userId}",method = RequestMethod.GET)
    public Msg getinform(@PathVariable("userId") String userId){
        List<Shop> list=shopService.getshopbyuserid(userId);
        List<Shop> result1  = new ArrayList<>();
        List<Shop> result2  = new ArrayList<>();
        List<Shop> result3  = new ArrayList<>();
        List<Shop> result4  = new ArrayList<>();
        Book book = new Book();
        if(list==null){
            return Msg.fail().add("va_msg", "不存在该订单");
        }
        for(Shop shop1:list){
            if(shop1.getPaystatus().equals("pay")&&shop1.getShopstatus().equals("yes")){
                book=bookService.selectByPrimaryKey(shop1.getBookid());
                shop1.setBookstock(book.getBookstock());
                result4.add(shop1);
            }
            else if(shop1.getPaystatus().equals("pay")&&shop1.getShopstatus().equals("wait")){
                book=bookService.selectByPrimaryKey(shop1.getBookid());
                shop1.setBookstock(book.getBookstock());
                result3.add(shop1);
            }
            else if(shop1.getPaystatus().equals("pay")&&shop1.getShopstatus().equals("no")){
                book=bookService.selectByPrimaryKey(shop1.getBookid());
                shop1.setBookstock(book.getBookstock());
                result2.add(shop1);
            }
            else if(shop1.getPaystatus().equals("notpay")){
                book=bookService.selectByPrimaryKey(shop1.getBookid());
                shop1.setBookstock(book.getBookstock());
                result1.add(shop1);
            }
            else{
                return Msg.fail().add("va_msg", "订单信息错误");
            }
        }
        return Msg.success().add("购物车列表",result1).add("未配置列表",result2).add("待提取列表",result3).add("已提取列表",result4);
    }
}
