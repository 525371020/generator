package com.example.generator.controller;/*
 @autor AIPMAN
 @ 15:15
 文件说明：无
*/

import com.example.generator.dao.bbsadminMapper;
import com.example.generator.entity.bbsadmin;
import com.example.generator.service.adminServiceI;
import com.fasterxml.jackson.core.JsonProcessingException;
import jdk.nashorn.internal.parser.Token;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
public class controller{
    @Autowired
    private adminServiceI adminServiceI;

//    @GetMapping("/testUser")
//    public bbsadmin getUser(){
//        bbsadmin bbsadmin= adminServiceI.selectByPrimaryKey(1);
//        return bbsadmin;
//    }
    @GetMapping("/testUser")
    public bbsadmin getUser(){
        bbsadmin bbsadmin= adminServiceI.selectByPrimaryKey(1);
        return bbsadmin;
    }
}
