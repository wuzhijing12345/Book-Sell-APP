package com.dhu.dao;

import com.dhu.bean.Shop;
import com.dhu.bean.ShopExample;
import java.util.List;

import com.dhu.bean.User;
import org.apache.ibatis.annotations.Param;

public interface ShopMapper {
    long countByExample(ShopExample example);

    int deleteByExample(ShopExample example);

    int deleteByPrimaryKey(String shopid);

    int insert(Shop record);

    int insertSelective(Shop record);

    List<Shop> selectByExample(ShopExample example);

    Shop selectByPrimaryKey(String shopid);

    Shop findlastinform();

    int updateByExampleSelective(@Param("record") Shop record, @Param("example") ShopExample example);

    int updateByExample(@Param("record") Shop record, @Param("example") ShopExample example);

    int updateByPrimaryKeySelective(Shop record);

    int updateByPrimaryKey(Shop record);

    List<Shop> selectShopByPage(@Param("start") int start, @Param("size") int size);

    int selectCount();

    List<Shop> selectshopbyid(@Param("userid")String userid);

    List<String> selectuserbystatus(@Param("shopstatus") String shop, @Param("paystatus") String pay);

    List<Shop> selectshopbystatus(@Param("shopstatus") String shop, @Param("paystatus") String pay);

}