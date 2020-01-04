package com.dhu.bean;

public class Book {
    private String bookid;

    private String bookname;

    private Double bookprice;

    private String bookimage;

    private String bookstock;

    private String bookfrom;

    private String bookintroduction;

    public String getBookid() {
        return bookid;
    }

    public void setBookid(String bookid) {
        this.bookid = bookid == null ? null : bookid.trim();
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname == null ? null : bookname.trim();
    }

    public Double getBookprice() {
        return bookprice;
    }

    public void setBookprice(Double bookprice) {
        this.bookprice = bookprice;
    }

    public String getBookimage() {
        return bookimage;
    }

    public void setBookimage(String bookimage) {
        this.bookimage = bookimage == null ? null : bookimage.trim();
    }

    public String getBookstock() {
        return bookstock;
    }

    public void setBookstock(String bookstock) {
        this.bookstock = bookstock == null ? null : bookstock.trim();
    }

    public String getBookfrom() {
        return bookfrom;
    }

    public void setBookfrom(String bookfrom) {
        this.bookfrom = bookfrom == null ? null : bookfrom.trim();
    }

    public String getBookintroduction() {
        return bookintroduction;
    }

    public void setBookintroduction(String bookintroduction) {
        this.bookintroduction = bookintroduction == null ? null : bookintroduction.trim();
    }
}