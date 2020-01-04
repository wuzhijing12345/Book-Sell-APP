package com.dhu.controller;

import com.dhu.bean.User;
import com.dhu.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URLEncoder;
import java.util.UUID;

@RequestMapping("file")
@Controller

public class FileController {

    @Resource
    private UserService userService;

    @RequestMapping(value="upload", method = RequestMethod.POST)
    @ResponseBody

    /**
     * 文件上传功能
     * @param file
     * @return
     * throws IOException
     */
    public String upload(User user,MultipartFile file, HttpServletRequest request) throws IOException {
         String path = request.getSession().getServletContext().getRealPath("upload");//保存图片的路径
         String fileName = file.getOriginalFilename();//获取原始图片的拓展名
         String newfilename = UUID.randomUUID()+fileName;
         File dir = new File(path,fileName);//封装上传文件位置的全路径
         //user.setUserimage();
         if(!dir.exists())
         {
             dir.mkdirs();
         }
        //MultipartFile自带的解析方法
        file.transferTo(dir);//把本地文件上传到封装文件位置的全路径
        user.setUserimage(newfilename);
        //
        return "redirect:/list.do";
    }

    /**
     * 文件下载功能
     * @param request
     * @param response
     * @throws Exception
     */
    @RequestMapping(value="down/{road:.+}", method = RequestMethod.GET)
    public void down(HttpServletRequest request, HttpServletResponse response, @PathVariable("road") String road) throws Exception{
        //模拟文件，myfile.txt为需要下载的文件
        String fileName = request.getSession().getServletContext().getRealPath("upload")+"/"+road;
        //获取输入流
        InputStream bis = new BufferedInputStream(new FileInputStream(new File(fileName)));
        //假如以中文名下载的话
        //String filename = "下载文件.jpg"
        //转码，免得文件名中文乱码
        road = URLEncoder.encode(road,"UTF-8");
        //设置文件下载头
        response.addHeader("Content-Disposition", "attachment;filename=" + road);
        //1.设置文件ContentType类型，这样设置，会自动判断下载文件类型
        response.setContentType("multipart/form-data");
        BufferedOutputStream out = new BufferedOutputStream(response.getOutputStream());
        int len = 0;
        while((len = bis.read()) != -1){
            out.write(len);
            out.flush();
        }
        out.close();
    }
}
