package com.example.generator.dao;

import com.example.generator.entity.bbstopic;

public interface bbstopicMapper {
    int insert(bbstopic record);

    int insertSelective(bbstopic record);
}