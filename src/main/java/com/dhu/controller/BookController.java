package com.dhu.controller;


import com.dhu.bean.Book;
import com.dhu.bean.Msg;
import com.dhu.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Controller


@RequestMapping(value = "/book")
public class BookController {


    @Autowired
    BookService bookService;


    /**
     * 增加一本书籍
     * @param book
     * @param file
     * @param request
     * @return
     * @throws IOException
     */
    @RequestMapping(value = "/savebook")
    public String addBook(Book book, MultipartFile file, HttpServletRequest request) throws IOException {
        System.out.println("提交的用户：" + book);
        String path = request.getSession().getServletContext().getRealPath("/upload");
        ; //定义图片上传后的路径
        String fileName = file.getOriginalFilename();//获取原始图片的拓展名
        String newfilename = fileName;
        File dir = new File(path, fileName);//封装上传文件位置的全路径
        //user.setUserimage();
        if (!dir.exists()) {
            dir.mkdirs();
        }
        //MultipartFile自带的解析方法
        file.transferTo(dir);//把本地文件上传到封装文件位置的全路径
        book.setBookimage(newfilename);
        System.out.println("最后的book:" + book);
        bookService.saveBook(book);
        return "redirect:/index";
    }


    /**
     * 检查书籍名是否合法
     * @param bookname
     * @return
     */
    @ResponseBody
    @RequestMapping("/checkbookname/{bookname}")
    public Msg checkuser(@PathVariable("bookname") String bookname) {
        // 先判断书籍名是否是合法的表达式;
        String regx = "(^[a-zA-Z0-9_-]{1,30}$)|(^[\u2E80-\u9FFF]{1,20})";
        if (!bookname.matches(regx)) {
            return Msg.fail().add("va_msg", "书籍名必须是1-30位数字和字母的组合或者1-20位中文");
        }

        // 数据库书籍名重复校验
        boolean b = bookService.CheckBookName(bookname);
        if (b) {
            return Msg.success();
        } else {
            return Msg.fail().add("va_msg", "书籍名不合法");
        }
    }


    /**
     * 根据书籍名查找书籍
     * @param bookname
     * @return
     */
    @RequestMapping(value = "/findbook/{bookname}", method = RequestMethod.GET)
    @ResponseBody
    public Msg findBook(@PathVariable("bookname") String bookname)
    {
        Book b=bookService.findBook(bookname);
        if(b!=null){
            return Msg.success().add("bookId",b.getBookid())
                    .add("bookForm",b.getBookfrom())
                    .add("bookImage",b.getBookimage())
                    .add("bookIntro",b.getBookintroduction())
                    .add("bookname",b.getBookname())
                    .add("bookprice",b.getBookprice())
                    .add("bookstock",b.getBookstock());
        }
        else
        {
            return Msg.fail().add("va_msg","找不到相关书籍");
        }
    }


    /**
     * 更新书籍信息，包括更新书籍的图片
     * @param bookId
     * @param file
     * @param request
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/updatebook",method = RequestMethod.POST)
    public Msg updatebook(@PathVariable("bookId")String bookId,@PathVariable("file")MultipartFile file, HttpServletRequest request) throws Exception{
        System.out.println("修改提交的用户："+bookId);
        String path = request.getSession().getServletContext().getRealPath("/upload");; //定义图片上传后的路径
        String fileName = file.getOriginalFilename();//获取原始图片的拓展名
        String newfilename = UUID.randomUUID()+fileName;
        File dir = new File(path,fileName);//封装上传文件位置的全路径
        //user.setUserimage();
        if(!dir.exists())
        {
            dir.mkdirs();
        }
        //MultipartFile自带的解析方法
        file.transferTo(dir);//把本地文件上传到封装文件位置的全路径
        Book book =new Book();
        book=bookService.selectByPrimaryKey(bookId);
        book.setBookimage(newfilename);
        bookService.updateBook(book);
        return Msg.success().add("va_msg","成功修改图片");
    }


    /**
     * 单个批量二合一 批量删除：1-2-3 单个删除：1
     * 这里是根据书籍的编号进行删除
     * 书籍多选的时候需要用到批量删除
     * @param
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/deletebyid/{ids}", method = RequestMethod.DELETE)
    public Msg deletebookbyid(@PathVariable("ids") String ids) {
        // 批量删除
        if (ids.contains("-")) {
            List<String> del_ids = new ArrayList<String>();
            String[] str_ids = ids.split("-");
            // 组装id的集合
            for (String str : str_ids){
                bookService.deleteBookById(str);
            }
        } else {
            bookService.deleteBookById(ids);
        }
        return Msg.success();
    }

    /**
     * 通过书籍名一个一个删除
     * @param ids
     * @return
     */
    @RequestMapping(value = "/deletebyname/{ids}", method = RequestMethod.DELETE)
    public Msg deletebookbyname(@PathVariable("ids") String ids)
    {
        bookService.deleteBookById(ids);
        return  Msg.success();
    }

    /**
     * 查找所有的书籍
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    public Msg getall()
    {
        List<Book> l=bookService.getAll();
        if(l!=null){
            return Msg.success().add("booklist",l);
        }
        else
        {
            return Msg.fail().add("va_msg","找不到相关书籍列表");
        }

    }


    /**
     * 查找与专业相关的书籍
     * @param major
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/getAllByMajor/{major}",method = RequestMethod.GET)
    public Msg getallbymajor(@PathVariable("major") String major)
    {
        List<Book> l=bookService.getAllByMajor(major);
        if(l!=null){
            return Msg.success().add("booklist",l);
        }
        else
        {
            return Msg.fail().add("va_msg","找不到相关书籍列表");
        }
    }

    @RequestMapping(value = "/findbookbyname/{bookname}", method = RequestMethod.GET)
    @ResponseBody
    public Msg findBookbyname(@PathVariable("bookname") String bookname)
    {
        List<Book> lb=bookService.findBybookname(bookname);
        if(lb!=null){
            return Msg.success().add("booklist",lb);
        }
        else
        {
            return Msg.fail().add("va_msg","找不到相关书籍");
        }
    }

}
