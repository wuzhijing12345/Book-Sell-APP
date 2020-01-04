package com.dhu.controller;


import com.dhu.bean.Msg;
import com.dhu.bean.User;
import com.dhu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Controller


@RequestMapping(value = "User")
public class UserController {

    @Autowired
    UserService userService;

    /**
     * 检查用户名是否合法
     * @param username
     * @return
     */
    @ResponseBody
    @RequestMapping("/checkuser/{username}")
    public Msg checkuser(@PathVariable("username") String username) {
        // 先判断用户名是否是合法的表达式;
        String regx = "(^[a-zA-Z0-9_-]{6,16}$)|(^[\u2E80-\u9FFF]{2,5})";
        if (!username.matches(regx)) {
            return Msg.fail().add("va_msg", "用户名必须是6-16位数字和字母的组合或者2-5位中文");
        }

        // 数据库用户名重复校验
        boolean b = userService.CheckUserName(username);
        if (b) {
            return Msg.success();
        } else {
            return Msg.fail().add("va_msg", "用户名不可用");
        }
    }


    /**
     * 通过用户id查找用户
     * @param userid
     * @return
     */
    @RequestMapping(value = "/finduser/{userid}", method = RequestMethod.GET)
    @ResponseBody
    public Msg findone(@PathVariable("userid") String userid)
    {
        User u=userService.findUser(userid);
        if(u!=null){
            return Msg.success().add("user",u);
        }
        else
        {
            return Msg.fail().add("va_msg","找不到相关订单");
        }
    }

    /**
     *更新用户信息
     * @param user
     * @param file
     * @param request
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/updateuser" , method = RequestMethod.POST)
    public String updateUser(User user,MultipartFile file,HttpServletRequest request) throws Exception{
        System.out.println("修改提交的用户："+user);
        String path = request.getSession().getServletContext().getRealPath("/upload");; //定义图片上传后的路径
        String fileName = file.getOriginalFilename();//获取原始图片的拓展名
        String newfilename = fileName;
        File dir = new File(path,fileName);//封装上传文件位置的全路径
        //user.setUserimage();
        if(!dir.exists())
        {
            dir.mkdirs();
        }
        //MultipartFile自带的解析方法
        file.transferTo(dir);//把本地文件上传到封装文件位置的全路径
        user.setUserimage(newfilename);
        userService.updateUser(user);
        return "redirfaect:/index";
    }


    /**
     * 单个批量二合一 批量删除：1-2-3 单个删除：1
     *
     * @param
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/delete/{ids}", method = RequestMethod.DELETE)
    public Msg deleteEmp(@PathVariable("ids") String ids) {
        // 批量删除
        if (ids.contains("-")) {
            List<String> del_ids = new ArrayList<String>();
            String[] str_ids = ids.split("-");
            // 组装id的集合
            for (String str : str_ids){
                userService.deleteUser(str);
            }
        } else {
            userService.deleteUser(ids);
        }
        return Msg.success();
    }


    /**
     * 查找所有的用户
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    public Msg getall()
    {
        List<User> l=userService.getAll();
        if(l!=null){
            return Msg.success().add("userlist",l);
        }
        else {
            return Msg.fail().add("va_msg", "找不到相关用户列表");
        }

    }
}
