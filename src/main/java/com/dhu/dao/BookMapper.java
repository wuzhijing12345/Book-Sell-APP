package com.dhu.dao;

import com.dhu.bean.Book;
import com.dhu.bean.BookExample;
import java.util.List;

import com.dhu.bean.User;
import org.apache.ibatis.annotations.Param;

public interface BookMapper {
    long countByExample(BookExample example);

    int deleteByExample(BookExample example);

    int deleteByPrimaryKey(String bookid);

    int deleteByBookName(String bookname);

    int insert(Book record);

    int insertSelective(Book record);

    List<Book> selectByExample(BookExample example);

    Book selectByPrimaryKey(String bookid);

    Book selectByBookName(String bookname);

    int updateByExampleSelective(@Param("record") Book record, @Param("example") BookExample example);

    int updateByExample(@Param("record") Book record, @Param("example") BookExample example);

    int updateByPrimaryKeySelective(Book record);

    int updateByPrimaryKey(Book record);

    List<Book> selectBookByPage(@Param("start") int start, @Param("size") int size);

    int selectCount();

    void addbookwithoutpicture(Book book);

    List<Book> findBybookname(@Param("bookname")String bookname);

    int updateimage(Book record);

    List<Book> findBymajor(@Param("bookfrom")String bookfrom);
}