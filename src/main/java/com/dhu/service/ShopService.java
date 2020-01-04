package com.dhu.service;

import com.dhu.bean.Page;
import com.dhu.bean.Shop;

import java.util.List;

public interface ShopService {

    void saveshop(Shop shop);//购物信息，用户下单后自动生成一条信息

    void deleteshop(String shopid);//通过订单号删除订单

    void updateshop(Shop shop);//更新订单的信息

    Shop findshop(String shopid);//根据订单号查找订单

    List<Shop> getAll();//得到所有订单

    public Shop findlastshop();//得到最新的一条订单

    Page<Shop> selectShopByPage(int page);

    List<Shop> getshopbyuserid(String userId);

    List<String> selectuserbystatus();

    List<Shop> selectshopbystatus();

}
