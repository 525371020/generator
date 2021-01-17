package com.example.generator.controller;/*
 @autor AIPMAN
 @ 15:15
 文件说明：无
*/

import com.example.generator.dao.bbsadminMapper;
import com.example.generator.entity.bbsadmin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
    @Autowired
    private com.example.generator.dao.bbsadminMapper bbsadminMapper;

    @GetMapping("/testUser")
    public bbsadmin getUser(){
        bbsadmin list= bbsadminMapper.selectByPrimaryKey(1);
        return list;
    }
}
