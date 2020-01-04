package com.dhu.servelet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

@WebServlet("/FileServlet")
public class FileServelet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */

    public FileServelet()
    {
        super();
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        response.getWriter().append("Served at: ").append(request.getContextPath());
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    // 参考CSDN苍狼写作
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        // 可以实现小文件放内存，大文件放磁盘
        DiskFileItemFactory factory = new DiskFileItemFactory();
        // 小文件与大文件的分界点，默认10kb
        factory.setSizeThreshold(20*1024);

        ServletFileUpload upload = new ServletFileUpload(factory);

        // 文件最大为1
        upload.setSizeMax(1024*1024*1024);

        List itemList;
        try {
            itemList = upload.parseRequest(request);

            Iterator it = itemList.iterator();

            while(it.hasNext())
            {

                FileItem item =(FileItem) it.next();

                if(item.isFormField())
                {
                    String name = (String)item.getFieldName();

                }
                else
                {

                    String name =item.getName();


                    File file = new File(request.getServletContext().getRealPath("/document"), name);


                    file.getParentFile().mkdirs();

                    item.write(file);

                    response.getWriter().print(file.getPath());

                }

            }



        } catch (FileUploadException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
