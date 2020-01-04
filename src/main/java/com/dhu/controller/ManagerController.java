package com.dhu.controller;

import com.dhu.service.*;
import com.dhu.bean.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/ssmcrud1")
public class ManagerController {
    @Autowired
    private BookService bs;

    @Autowired
    private ShopService ss;

    @Autowired
    private UserService us;

    String Usid;

    @RequestMapping("toAddPaper")
    public String toAddPaper(Model model) {
        model.addAttribute("id" ,Usid);
        return "addPaper";
    }

    @RequestMapping("toManbook")
    public String toManbook(@RequestParam(defaultValue="1") int currentPage, Model model, HttpServletRequest request){
        Page<Book> page= bs.selectBookByPage(currentPage) ;
        model.addAttribute("list3",page );//设置一个属性
        model.addAttribute("id" ,Usid);
        return "managerbook";
    }

    @RequestMapping("toManshop")
    public String toManshop(@RequestParam(defaultValue="1") int currentPage, Model model, HttpServletRequest request){
        Page<Shop> page= ss.selectShopByPage(currentPage) ;
        model.addAttribute("list3",page );//设置一个属性
        model.addAttribute("id" ,Usid);
        return "managershop";
    }

    @RequestMapping("tologin")
    public String toManlogin(Model model){
        User user=new User();
        model.addAttribute("user" ,user);
        return "login";
    }

    @RequestMapping("login")
    public String login(@RequestParam("username") String name, @RequestParam("userpassword")String password, Model model
            ,@RequestParam(defaultValue="1") int currentPage, HttpServletRequest request){
        User user=new User();
        user.setUsername(name);
        user.setUserpassword(password);
        int a=us.login(user);
        if(a==2){
            String id=us.returnid(name);
            Usid=id;
            model.addAttribute("user" ,user);
            model.addAttribute("id" ,Usid);
            Page<Book> list = bs.selectBookByPage(currentPage);
            model.addAttribute("list3", list);
            return "managerbook";
        }
        else
        {
            model.addAttribute("user" ,user);
            model.addAttribute("error" ,"登录信息有误");
            return "login";
        }
    }

    @RequestMapping("logout")
    public String logout(Model model,@RequestParam("id")String id){
        User user=new User();
        user = us.getuserbyid(id);
        if(user!=null) {
            us.logoff(user);
        }
        model.addAttribute("user" ,user);
        return "login";
    }

    @RequestMapping("toAddbook")
    public String toAddFlight(Model model){
        Book book=new Book();
        model.addAttribute("book",book);
        model.addAttribute("id" ,Usid);
        return "addbook";
    }

    @RequestMapping("/toUpdatebook")
    public String toUpdatePaper(Model model,String id) {
        Book book=new Book();
        book=bs.selectByPrimaryKey(id);
        model.addAttribute("book",book);
        model.addAttribute("id" ,Usid);
        return "updatebook";
    }

    @RequestMapping("/addbook")
    public String addPaper(Book book,Model model,
                           @RequestParam(defaultValue="1") int currentPage) {
        bs.addbookwithoutpicture(book);
        model.addAttribute("book",book);
        Page<Book> list = bs.selectBookByPage(currentPage);
        model.addAttribute("list3", list);
        model.addAttribute("id" ,Usid);
        return "managerbook";
    }
    @RequestMapping("/updatebook")
    public String updateFlight(Model model,Book book,
                               @RequestParam(defaultValue="1") int currentPage) {
        model.addAttribute("book",book);
        bs.updateBook(book);
        System.out.println(book.getBookname());
        Page<Book> list = bs.selectBookByPage(currentPage);
        model.addAttribute("list3", list);
        model.addAttribute("id" ,Usid);
        return "managerbook";
    }

    @RequestMapping("/delbook/{book.bookid}")
    public String deleteBook(@PathVariable("book.bookid") String id,Model model,
                              @RequestParam(defaultValue="1") int currentPage) {
        Book book=new Book();
        model.addAttribute("book",book);
        bs.deleteBookById(id);
        Page<Book> list = bs.selectBookByPage(currentPage);
        model.addAttribute("id" ,Usid);
        model.addAttribute("list3", list);
        return "managerbook";
    }

    @RequestMapping("/delshop/{shop.shopid}")
    public String deleteShop(@PathVariable("shop.shopid") String id,Model model,
                              @RequestParam(defaultValue="1") int currentPage) {
        Shop shop=new Shop();
        model.addAttribute("shop",shop);
        ss.deleteshop(id);
        Page<Shop> list = ss.selectShopByPage(currentPage);
        model.addAttribute("list3", list);
        model.addAttribute("id" ,Usid);
        return "managershop";
    }

    @RequestMapping(value = "/updatebookimage/{book.bookid}")
    public String addBook(@PathVariable("book.bookid")String id, MultipartFile file, HttpServletRequest request
    ,@RequestParam(defaultValue="1") int currentPage,Model model) throws IOException {
        Book book =new Book();
        book=bs.selectByPrimaryKey(id);
        String path = request.getSession().getServletContext().getRealPath("/upload");
        ; //定义图片上传后的路径
        String fileName = file.getOriginalFilename();//获取原始图片的拓展名
        String newfilename = fileName;
        File dir = new File(path, fileName);//封装上传文件位置的全路径
        if (!dir.exists()) {
            dir.mkdirs();
        }
        //MultipartFile自带的解析方法
        file.transferTo(dir);//把本地文件上传到封装文件位置的全路径
        book.setBookimage(newfilename);
        System.out.println("最后的book:" + book);
        bs.updateimage(book);
        Page<Book> list = bs.selectBookByPage(currentPage);
        model.addAttribute("list3", list);
        model.addAttribute("id" ,Usid);
        return "managerbook";
    }
}
