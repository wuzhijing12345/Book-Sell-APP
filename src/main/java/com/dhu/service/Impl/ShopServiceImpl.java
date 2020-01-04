package com.dhu.service.Impl;

import com.dhu.bean.Page;
import com.dhu.bean.Shop;
import com.dhu.dao.ShopMapper;
import com.dhu.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;


@Service
public class ShopServiceImpl implements ShopService {

    @Autowired
    ShopMapper shopMapper;

    /**
     * 购书信息，用户下单后会自动生成一条信息，这里需要对书籍的库存进行处理（还未实现）
     * @param shop
     */
    public void saveshop(Shop shop)
    {
        shopMapper.insertSelective(shop);
    }

    /**
     *通过订单号删除订单
     * @param shopid
     */
    public void deleteshop(String shopid)
    {
        shopMapper.deleteByPrimaryKey(shopid);
    }

    /**
     * 更新订单信息
     * @param shop
     */
    public void updateshop(Shop shop)
    {
        shopMapper.updateByPrimaryKey(shop);
    }

    /**
     * 根据订单号查找订单
     * @param shopid
     * @return
     */
    public Shop findshop(String shopid)
    {
        return shopMapper.selectByPrimaryKey(shopid);
    }

    /**
     * 查找所有的订单
     * @return
     */
    public List<Shop> getAll()
    {
        return shopMapper.selectByExample(null);
    }
    /**
     * 查找最新的一条订单
     * @return
     */
    public Shop findlastshop()
    {
        return shopMapper.findlastinform();
    }

    public Page<Shop> selectShopByPage(int currentPage){
        HashMap<String,Object> map=new HashMap<String,Object>();
        Page<Shop> page=new Page<Shop>();
        //封装当前页数
        page.setCurrPage(currentPage);
        //每页显示的数据
        int pageSize=50;
        page.setPageSize(pageSize);
        //封装总记录数
        int totalCount=shopMapper.selectCount();
        page.setTotalCount(totalCount);
        //封装总页数
        double totalcount=totalCount;
        Double num=Math.ceil(totalcount/pageSize);
        page.setTotalPage(num.intValue());//转换为整数
        List<Shop> list=shopMapper.selectShopByPage((currentPage-1)*pageSize,page.getPageSize());
        page.setList(list);
        return page;
    }

    public List<Shop> getshopbyuserid(String userId){
        return shopMapper.selectshopbyid(userId);
    }

    public List<String> selectuserbystatus(){
        return shopMapper.selectuserbystatus("no","pay");
    }

    public List<Shop> selectshopbystatus(){
        return shopMapper.selectshopbystatus("yes","pay");
    }

}
