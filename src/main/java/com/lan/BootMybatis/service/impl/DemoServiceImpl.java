package com.lan.BootMybatis.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lan.BootMybatis.base.model.Page;
import com.lan.BootMybatis.mapper.DemoMapper;
import com.lan.BootMybatis.model.Demo;
import com.lan.BootMybatis.service.IDemoService;

@Service("demoService")
public class DemoServiceImpl implements IDemoService{

	@Resource
	private DemoMapper demoMapper;
	
	@Override
	public Page findPage(Page page) {
		List<Demo> list = demoMapper.findPage(page);
		page.setData(list);
		return page;
	}
}
