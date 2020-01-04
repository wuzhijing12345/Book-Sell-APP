package com.dhu.controller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.dhu.bean.*;


import com.dhu.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;



@Controller
@RequestMapping(value = "/user")
public class UserLoginController {

    @Autowired
    private UserService userService;

    @RequestMapping(value="/login/{username}/{userpassword}", method = RequestMethod.GET)
    @ResponseBody
    public Msg login(@PathVariable("username") String name,@PathVariable("userpassword")String password){
        User user=new User();
        user.setUsername(name);
        user.setUserpassword(password);
        int a=userService.login(user);
        if(a==1){
            return Msg.success().add("va_msg","此时登录成功为用户");
        }
        else if(a==2){
            return Msg.success().add("va_msg","此时登录成功为管理员");
        }
        else if(a==3){
            return Msg.fail().add("va_msg","此时用户已登录，不可重复登录");
        }
        else if(a==4){
            return Msg.fail().add("va_msg","登录密码不正确");
        }
        else {
            return Msg.fail().add("va_msg","不存在这个用户");
        }
    }

    @RequestMapping(value = "/loginagain/{userId}", method = RequestMethod.GET)
    @ResponseBody
    public Msg loginagain (@PathVariable("userId") String id){
        User user1 = new User();
        user1 = userService.getuserbyid(id);
        if(user1!=null){
            if(user1.getUsertoken()==null){
                return Msg.fail().add("va_msg","无效token");
            }
            else
            {
                int a=userService.loginagain(user1.getUsertoken());
                if(a==1){
                    return Msg.success().add("va_msg","此时登录成功为用户");
                }
                else if(a==2){
                    return Msg.success().add("va_msg","此时登录成功为管理员");
                }
                else if(a==3){
                    return Msg.fail().add("va_msg","此时用户已登录，不可重复登录");
                }
                else if(a==4){
                    return Msg.fail().add("va_msg","登录密码不正确");
                }
                else {
                    return Msg.fail().add("va_msg","不存在这个用户");
                }
            }
        }
        else
        {
            return Msg.fail().add("va_msg","无效id");
        }
    }

    @RequestMapping(value = "/logoff/{userId}", method = RequestMethod.GET)
    @ResponseBody
    public void logoff (@PathVariable("userId") String id){
        User user = new User();
        user = userService.getuserbyid(id);
        if(user!=null) {
            userService.logoff(user);
        }
    }
    /*
    此函数为清空数据库中的token，如果调用这个函数，要把本地的token删除
     */
    @RequestMapping(value = "/loginchange/{userId}", method = RequestMethod.GET)
    @ResponseBody
    public void loginchange (@PathVariable("userId") String id){
        User user = new User();
        user = userService.getuserbyid(id);
        if(user!=null) {
            userService.loginchange(user);
        }
    }
    /*
    此函数为获得token的函数，由于token是一个时间函数，所以每次登陆都会生成新的token，所以每次登陆后就要用用户名再获得一次token
     */
    @RequestMapping(value = "/returntoken/{username}", method = RequestMethod.GET)
    @ResponseBody
    public Msg returntoken(@PathVariable("username") String name){
        String token=userService.returntoken(name);
        String id=userService.returnid(name);
        if(token!=null&&id!=null){
            return Msg.success().add("token",token).add("userId",id);
        }
        else if(token==null){
            return Msg.fail().add("token","token的值为空");
        }
        else{
            return Msg.fail().add("token","token的值为空");
        }
    }
}
