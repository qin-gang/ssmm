package com.nuc.edu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestResultFul {
    @RequestMapping("/{path}")
    public String f1(@PathVariable String path){
        return path;
    }
}
