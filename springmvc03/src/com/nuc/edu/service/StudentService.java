package com.nuc.edu.service;

import com.nuc.edu.pojo.Student;

import java.util.List;

public interface StudentService {

    public int save(Student student);

    public List<Student> findAll();
}
