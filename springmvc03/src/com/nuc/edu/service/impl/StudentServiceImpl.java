package com.nuc.edu.service.impl;

import com.nuc.edu.mapper.StudentMapper;
import com.nuc.edu.pojo.Student;
import com.nuc.edu.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentMapper studentMapper;
    @Override
    public int save(Student student) {
        return studentMapper.insert(student);
    }

    @Override
    public List<Student> findAll() {
        return studentMapper.selectAll();
    }
}
