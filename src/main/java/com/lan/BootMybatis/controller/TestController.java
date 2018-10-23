package com.lan.BootMybatis.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lan.BootMybatis.base.model.Page;
import com.lan.BootMybatis.service.IDemoService;

@RestController
public class TestController {

	@Resource
	private IDemoService demoService;
	
	@RequestMapping("findPage")
	public Page findPage(Page page){
		return demoService.findPage(page);
	}
}
