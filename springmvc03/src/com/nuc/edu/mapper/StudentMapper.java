package com.nuc.edu.mapper;

import com.nuc.edu.pojo.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentMapper {
    //添加操作
    public int insert(Student student);

    //查询操作
    public List<Student> selectAll();
}
