package com.dhu.service.Impl;

import com.dhu.bean.Book;
import com.dhu.bean.BookExample;
import com.dhu.bean.Page;
import com.dhu.dao.BookMapper;
import com.dhu.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;


@Service
public class BookServiceImpl implements BookService {


    @Autowired
    BookMapper bookMapper;

    /**
     * 新增一本书籍的信息
     * @param book
     */
    public void saveBook(Book book)
    {
        bookMapper.insertSelective(book);
    }

    /**
     * 检验书籍名是否可用
     * @param bookname
     * @return  true：代表当前姓名可用   fasle：不可用
     */
    public boolean CheckBookName(String bookname)
    {
        // TODO Auto-generated method stub
        BookExample example = new BookExample();
        BookExample.Criteria criteria = example.createCriteria();
        criteria.andBooknameEqualTo(bookname);
        long count = bookMapper.countByExample(example);
        return count == 0;
    }

    /**
     * 更新书籍信息
     * @param book
     */
    public void updateBook(Book book)
    {
        bookMapper.updateByPrimaryKey(book);
    }

    /**
     * 根据书籍名查找书籍
     * @param bookname
     * @return
     */
    public Book findBook(String bookname)
    {
        return bookMapper.selectByBookName(bookname);
    }

    /**
     * 根据书籍名删除书籍
     * @param bookname
     */
    public void deleteBookByName(String bookname)
    {
        bookMapper.deleteByBookName(bookname);
    }

    /**
     * 返回所有的书籍信息
     * @return
     */
    public List<Book> getAll()
    {
        return bookMapper.selectByExample(null);
    }

    /**
     * 返回某个专业所有的书籍
     * @param major
     * @return
     */
    public List<Book> getAllByMajor(String major)
    {
        return bookMapper.findBymajor(major);
    }


    /**
     * 根据书籍的id删除图书
     * @param bookid
     */
    @Override
    public void deleteBookById(String bookid) {
        bookMapper.deleteByPrimaryKey(bookid);
    }

    /**
     * 根据现有书籍的数量判断是否能购买书籍
     */
    @Override
    public int buybook(String bookid,int counts){
        int a;
        Book book1=new Book();
        book1=bookMapper.selectByPrimaryKey(bookid);
        int i=Integer.parseInt(book1.getBookstock());
        if(i-counts>=0){
            String s=String.valueOf(i-counts);
            book1.setBookstock(s);
            bookMapper.updateByPrimaryKey(book1);
            a=1;
        }
        else{
            a=0;
        }
        return a;
    }

    public Book selectByPrimaryKey(String bookid){
        return bookMapper.selectByPrimaryKey(bookid);
    }

    public Page<Book> selectBookByPage(int currentPage){
        HashMap<String,Object> map=new HashMap<String,Object>();
        Page<Book> page=new Page<Book>();
        //封装当前页数
        page.setCurrPage(currentPage);
        //每页显示的数据
        int pageSize=50;
        page.setPageSize(pageSize);
        //封装总记录数
        int totalCount=bookMapper.selectCount();
        page.setTotalCount(totalCount);
        //封装总页数
        double totalcount=totalCount;
        Double num=Math.ceil(totalcount/pageSize);
        page.setTotalPage(num.intValue());//转换为整数
        List<Book> list=bookMapper.selectBookByPage((currentPage-1)*pageSize,page.getPageSize());
        page.setList(list);
        return page;
    }

    public void addbookwithoutpicture(Book book){
        bookMapper.addbookwithoutpicture(book);
    }

    public List<Book> findBybookname(String bookname){
        return bookMapper.findBybookname(bookname);
    }

    public void updateimage(Book record){
        bookMapper.updateimage(record);
    }

}
