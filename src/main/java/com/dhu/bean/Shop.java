package com.dhu.bean;

import java.math.BigDecimal;

public class Shop {
    private String shopid;

    private String bookname;

    private BigDecimal bookprice;

    private String bookintroduction;

    private int booknum;

    private String bookstock;

    private String shopstatus;

    private String shopimage;

    private String useid;

    private String bookid;

    private String paystatus;

    public String getShopid() {
        return shopid;
    }

    public void setShopid(String shopid) {
        this.shopid = shopid == null ? null : shopid.trim();
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname == null ? null : bookname.trim();
    }

    public BigDecimal getBookprice() {
        return bookprice;
    }

    public void setBookprice(BigDecimal bookprice) {
        this.bookprice = bookprice;
    }

    public String getBookintroduction() {
        return bookintroduction;
    }

    public void setBookintroduction(String bookintroduction) {
        this.bookintroduction = bookintroduction == null ? null : bookintroduction.trim();
    }

    public String getShopstatus() {
        return shopstatus;
    }

    public void setShopstatus(String shopstatus) {
        this.shopstatus = shopstatus == null ? null : shopstatus.trim();
    }

    public String getShopimage() {
        return shopimage;
    }

    public void setShopimage(String shopimage) {
        this.shopimage = shopimage == null ? null : shopimage.trim();
    }

    public String getUseid() {
        return useid;
    }

    public void setUseid(String useid) {
        this.useid = useid == null ? null : useid.trim();
    }

    public String getBookid() {
        return bookid;
    }

    public void setBookid(String bookid) {
        this.bookid = bookid == null ? null : bookid.trim();
    }

    public String getPaystatus() {
        return paystatus;
    }

    public void setPaystatus(String paystatus) {
        this.paystatus = paystatus == null ? null : paystatus.trim();
    }

    public int getBooknum() {
        return booknum;
    }

    public void setBooknum(int booknum) {
        this.booknum = booknum;
    }

    public String getBookstock() {
        return bookstock;
    }

    public void setBookstock(String bookstock) {
        this.bookstock = bookstock;
    }
}