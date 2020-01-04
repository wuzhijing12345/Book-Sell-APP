package com.dhu.service.Impl;

import com.dhu.bean.Page;
import com.dhu.bean.UserExample;
import com.dhu.service.UserService;

import com.dhu.bean.User;
import com.dhu.dao.UserMapper;
import com.dhu.encrypt_decrypt.RSA;
import com.dhu.bean.Enum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    public int login(User user) {
        List<User> list = userMapper.getUserinfom();
        String username = user.getUsername();
        String password = user.getUserpassword();
        String token = user.getUsertoken();
        if (token == null) {
            password = RSA.passwordEncrypt(password);
            System.out.println(password);
            for (User user1 : list) {
                if (username.equals(user1.getUsername()) && password.equals(user1.getUserpassword())) {
                    user.setUserid(user1.getUserid());
                    String state = user1.getStatus();
                    String userstate = user1.getUserstatus();
                    token = RSA.tokenEncrypt(username, password);
                    userMapper.updateTokenById(user1.getUserid(), token);
                    user.setUsertoken(token);
                    if (state.equals("offline")) {
                        userMapper.updateStatusById(user1.getUserid(), user1.getStatus());
                        if (userstate.equals("manager")) {
                            return 2;
                        } else if (userstate.equals("client")) {
                            return 1;
                        }
                    } else if (state.equals("online")) {
                        return 3;
                    }
                } else if (username.equals(user1.getUsername()) && password.equals(user1.getUserpassword()) == false) {
                    return 4;
                }
            }
        }
        return 5;
    }

    public int loginagain(String token) {
        List<User> list = userMapper.getUserinfom();
        int flag=2;
        for (User user1 : list) {
            if (token.equals(user1.getUsertoken())) {
                String state = user1.getStatus();
                String userstate = user1.getUserstatus();
                if (state.equals("offline")) {
                    userMapper.updateStatusById(user1.getUserid(), user1.getStatus());
                    if (userstate.equals("manager")) {
                        return 2;
                    } else if (userstate.equals("client")) {
                        return 1;
                    }
                }
                else if (state.equals("online")) {
                    return 3;
                }
            }
        }
        return 5;
    }

    public void logoff(User user){
        User user1=userMapper.selectOneByToken(user.getUsertoken());
        System.out.println(user1.getUserid()+user1.getStatus());
        userMapper.updateStatusById(user1.getUserid(), user1.getStatus());
    }

    public void loginchange(User user){
        User user1=userMapper.selectOneByToken(user.getUsertoken());
        userMapper.updateTokenById(user1.getUserid(),null);
    }

    public User getuserbytoken(String token)
    {
        return userMapper.selectOneByToken(token);
    }

    public String returntoken(String username){
        User user=userMapper.getUserbyName(username);
        return user.getUsertoken();
    }

    public String returnid(String username){
        User user=userMapper.getUserbyName(username);
        return user.getUserid();
    }

    public User getuserbyid(String id)
    {
        return userMapper.selectByPrimaryKey(id);
    }


    /**
     * 检验用户名是否可用
     *
     * @param username
     * @return  true：代表当前姓名可用   fasle：不可用
     */
    public boolean CheckUserName(String username) {
        // TODO Auto-generated method stub
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andUsernameEqualTo(username);
        long count = userMapper.countByExample(example);
        return count == 0;
    }

    /**
     * 更新用户的个人信息
     *
     * @param user
     */
    public void updateUser(User user)
    {
        userMapper.updateByPrimaryKey(user);
    }

    /**
     * 根据用户id查找用户
     * @param userid
     * @return
     */

    public  User findUser(String userid)
    {
        User user = userMapper.selectByPrimaryKey(userid);
        return user;
    }

    /**
     * 根据用户id删除用户
     * @param userid
     */
    public void deleteUser(String userid)
    {
        userMapper.deleteByPrimaryKey(userid);
    }

    /**
     * 查找所有用户的信息
     * @return
     */
    public List<User>getAll()
    {
        return userMapper.selectByExample(null);
    }

    public Page<User> selectUserByPage(int currentPage){
        HashMap<String,Object> map=new HashMap<String,Object>();
        Page<User> page=new Page<User>();
        //封装当前页数
        page.setCurrPage(currentPage);
        //每页显示的数据
        int pageSize=50;
        page.setPageSize(pageSize);
        //封装总记录数
        int totalCount=userMapper.selectCount();
        page.setTotalCount(totalCount);
        //封装总页数
        double totalcount=totalCount;
        Double num=Math.ceil(totalcount/pageSize);
        page.setTotalPage(num.intValue());//转换为整数
        List<User> list=userMapper.selectUserByPage((currentPage-1)*pageSize,page.getPageSize());
        page.setList(list);
        return page;
    }




}
