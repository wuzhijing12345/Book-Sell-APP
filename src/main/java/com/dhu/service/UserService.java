package com.dhu.service;

import java.util.List;
import java.util.Map;
import com.dhu.bean.*;

public interface UserService {

    int login(User user);//用户的登陆函数

    void logoff(User user);

    int loginagain(String token);

    void loginchange(User user);

    User getuserbytoken(String token);

    User getuserbyid(String id);

    String returntoken(String username);//返回token函数

    String returnid(String username);//返回userid函数

    boolean CheckUserName(String username);//检查用户名是否合法

    void updateUser(User user);//更新用户个人信息

    User findUser(String userid);//查找用户，通过用户的id

    void deleteUser(String userid);//删除用户，通过用户id

    List<User> getAll();//查询所有学生；

    Page<User> selectUserByPage(int page);
}

