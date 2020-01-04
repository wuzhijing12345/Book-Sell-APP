package com.dhu.dao;

import com.dhu.bean.User;
import com.dhu.bean.UserExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper     //声明是一个Mapper,与springbootApplication中的@MapperScan二选一写上即可
@Repository
public interface UserMapper {
    long countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(String userid);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(String userid);

    User selectOneByToken(String usertoken);

    void updateStatusById(@Param("userid")String userid, @Param("status") String status);

    void updateTokenById(@Param("userid") String userid, @Param("token") String token);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User userid);

    List<User> getUserinfom();

    List<User> selectUserByPage(@Param("start") int start,@Param("size") int size);

    User getUserbyName(@Param("username")String username);

    int selectCount();

}