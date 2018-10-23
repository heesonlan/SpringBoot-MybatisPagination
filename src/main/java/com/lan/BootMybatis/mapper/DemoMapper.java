package com.lan.BootMybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.lan.BootMybatis.base.model.Page;
import com.lan.BootMybatis.model.Demo;

public interface DemoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Demo record);

    int insertSelective(Demo record);

    Demo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Demo record);

    int updateByPrimaryKey(Demo record);

	List<Demo> findPage(@Param("page") Page page);
}