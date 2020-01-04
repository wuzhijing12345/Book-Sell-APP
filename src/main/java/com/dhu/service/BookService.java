package com.dhu.service;

import com.dhu.bean.Book;
import com.dhu.bean.Page;
import com.dhu.bean.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookService {

    boolean CheckBookName(String bookname);//检查书籍名是否合法

    void updateBook(Book book);//更新书籍信息

    Book findBook(String bookname);//通过书籍名查找书籍

    void deleteBookByName(String bookname);//通过书籍名删除书籍

    void deleteBookById(String bookid);//通过书籍的编号删除书籍

    List<Book> getAll();//查询所有书籍；

    List<Book> getAllByMajor(String major);//查找某个专业所有的书籍

    void saveBook(Book book);//新增书籍

    int buybook(String bookid,int counts);//判断是否可以购买该书

    Book selectByPrimaryKey(String bookid);

    Page<Book> selectBookByPage(int page);

    void addbookwithoutpicture(Book book);

    List<Book> findBybookname(String bookname);

    void updateimage(Book record);

}
