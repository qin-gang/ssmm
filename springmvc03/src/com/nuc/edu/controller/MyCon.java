package com.nuc.edu.controller;

import com.nuc.edu.pojo.Student;
import com.nuc.edu.service.StudentService;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.List;
import java.util.UUID;

/**
 * 文件上传的问题：
 *      1、上传的时候名字中文乱码
 *            <property name="defaultEncoding" value="utf-8"></property>
 *      2、上传的文件夹必须事先创建好
 *      3、上传不到服务器的目录中
 *      4、相同的图片名称会覆盖
 *      5、无法指定图片的大小
 *      6、无法指定上传图片的类型
 *
 */
@Controller
public class MyCon {
    @Autowired
    StudentService studentService;

    //文件下载操作
    @RequestMapping("fileDown")
    public void fileDown(String phototype,String photoname, HttpServletRequest req, HttpServletResponse resp) throws IOException {
        //把需要下载的文件从服务器读出来
        //获得服务器目录
        String realPath = req.getServletContext().getRealPath("/upload");
        File file=new File(realPath+"/"+photoname);
        InputStream inputStream=new FileInputStream(file);

        //设置属性下载到本地
        resp.setContentLength((int)file.length());
        resp.setContentType(phototype);
        resp.setHeader("Content-Disposition", "attachment;fileName=" + photoname);


        //把读取的文件写到本地
        OutputStream outputStream=resp.getOutputStream();
        IOUtils.copy(inputStream,outputStream);

        outputStream.close();
        inputStream.close();
    }

    //查询所有学生信息
    @RequestMapping("stufindAll")
    public String stufindAll(HttpServletRequest req){
        List<Student> list = studentService.findAll();
        req.setAttribute("list",list);
        return "forward:/success.jsp";
    }
      

    //文件上传
    @RequestMapping("file")
    public String fileUpload(Student student,String uname,MultipartFile fi, HttpServletRequest req) throws IOException {
       /* System.out.println(uname+":"+age);
        System.out.println(fi.getName()+":"+fi.getSize()+":"+fi.getContentType()+":"+fi.getOriginalFilename());*/

        String suffix = fi.getOriginalFilename().substring(fi.getOriginalFilename().lastIndexOf("."));
        //6、上传文件的类型
        if(!".png".equals(suffix)){
            req.setAttribute("error","上传文件只能是png类型的");
            return "forward:/show.jsp";
        }

       //5、限定上传文件的大小
        /*if (fi.getSize()>20*1024){
            req.setAttribute("error","上传文件最大是20K");
            return "forward:/show.jsp";
        }*/

       //4、相同图片名称覆盖问题
        String uuid = UUID.randomUUID().toString();
        String filename=uuid+suffix;

        //3、获得服务器的目录
       String realPath = req.getServletContext().getRealPath("/upload");
       req.setCharacterEncoding("utf-8");
        //2、自动创建文件目录
       File file=new File(realPath);
       if (!file.exists()){
           file.mkdirs();
       }

       student.setName(uname);
       student.setRealname(fi.getOriginalFilename());
       student.setPhotoname(filename);
       student.setPhototype(fi.getContentType());

       System.out.println(student);
       fi.transferTo(new File(file,filename));
       int save = studentService.save(student);

       if (save>0){
           return "forward:/stufindAll";

       }else {
           req.setAttribute("error","添加失败");
           return "forward:/show.jsp";
       }

    }
}
