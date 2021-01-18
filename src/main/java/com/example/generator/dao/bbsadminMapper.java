package com.example.generator.dao;

import com.example.generator.entity.bbsadmin;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface bbsadminMapper  {
    int deleteByPrimaryKey(Integer aid);

    int insert(bbsadmin record);

    int insertSelective(bbsadmin record);
    bbsadmin selectByPrimaryKey(Integer aid);

    int updateByPrimaryKeySelective(bbsadmin record);

    int updateByPrimaryKey(bbsadmin record);
}