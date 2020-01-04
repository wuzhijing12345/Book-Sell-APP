package com.dhu.controller;


import com.dhu.bean.Msg;
import com.dhu.bean.Shop;
import com.dhu.bean.User;
import com.dhu.service.ShopService;
import com.dhu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller

@RequestMapping(value="/shop")
public class ShopController {

    @Autowired
    ShopService shopService;

    @Autowired
    UserService userService;


    /**
     * 保存一条购物信息
     * @param shop
     * @param request
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/saveshop", method = RequestMethod.PUT)
    public Msg saveShop(Shop shop, HttpServletRequest request) {
        //System.out.println("请求体中的值：" + request.getParameter("gender"));
        //System.out.println("将要更新的购物信息数据：" + shop);
        shopService.saveshop(shop);
        return Msg.success();
    }



    /**
     * 单个批量二合一 批量删除：1-2-3 单个删除：1，
     * 订单多选的时候需要用到批量删除
     * @param
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/delete/{ids}", method = RequestMethod.DELETE)
    public Msg deleteShop(@PathVariable("ids") String ids) {
        // 批量删除
        if (ids.contains("-")) {
            List<String> del_ids = new ArrayList<String>();
            String[] str_ids = ids.split("-");
            // 组装id的集合
            for (String str : str_ids){
                shopService.deleteshop(str);
            }
        } else {
            shopService.deleteshop(ids);
        }
        return Msg.success();
    }


    /**
     * 更新购物信息
     * @param shop
     * @param request
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/updateshop", method = RequestMethod.PUT)
    public Msg updateShop(Shop shop, HttpServletRequest request) {
        System.out.println("请求体中的值：" + request.getParameter("gender"));
        System.out.println("将要更新的购物数据：" + shop);
        shopService.updateshop(shop);
        return Msg.success();
    }


    /**
     * 查询所有的订单
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    public Msg getall()
    {
        List<Shop> l=shopService.getAll();
        if(l!=null){
            return Msg.success().add("shoplist",l);
        }
        else {
            return Msg.fail().add("va_msg", "找不到相关订单列表");
        }
    }

    /**
     * 根据订单号查询订单
     * @param shopid
     * @return
     */
    @RequestMapping(value = "/findshop/{shopid}", method = RequestMethod.GET)
    @ResponseBody
    public Msg findShop(@RequestParam("shopid") String shopid)
    {

        Shop s = shopService.findshop(shopid);
        if(s!=null){
            return Msg.success().add("shopId",s.getShopid())
                    .add("bookId",s.getBookid())
                    .add("userId",s.getUseid())
                    .add("bookIntro",s.getBookintroduction())
                    .add("bookname",s.getBookname())
                    .add("bookprice",s.getBookprice())
                    .add("paystatus",s.getPaystatus())
                    .add("shopimage",s.getShopimage())
                    .add("shopstatus",s.getShopstatus());
        }
        else
        {
            return Msg.fail().add("va_msg","找不到相关订单");
        }
    }

    /*
    管理员返回所有已领取订单
     */
    @RequestMapping(value = "/findshopyes", method = RequestMethod.GET)
    @ResponseBody
    public Msg findShopbystatus()
    {
        List<Shop> l = shopService.selectshopbystatus();
        if(l!=null){
            return Msg.success().add("shop",l);
        }
        else
        {
            return Msg.fail().add("va_msg","找不到相关订单");
        }
    }

    /*
    管理员返回所有有为配置订单的用户
     */
    @RequestMapping(value = "/findusernot", method = RequestMethod.GET)
    @ResponseBody
    public Msg findShopbyuser()
    {
        List<String> useridl = shopService.selectuserbystatus();
        List<User> ul=new ArrayList<>();
        if(useridl!=null){
            for(String userid : useridl){
                User user= userService.findUser(userid);
                ul.add(user);
            }
            return Msg.success().add("userlist",ul);
        }
        else
        {
            return Msg.fail().add("va_msg","找不到此类用户");
        }
    }

}
