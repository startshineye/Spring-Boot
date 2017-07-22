package com.yxm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageHelper;
import com.yxm.entity.Demo;
import com.yxm.service.DemoService;

@RestController
public class DemoController {

	@Autowired
	private DemoService demoService;
	
	@RequestMapping("/test")
	public Demo test(){
		Demo demo = new Demo();
		demo.setId(1);
		demo.setName("zs");
		return demo;
	}
	@RequestMapping("/name")
	public Demo getByName(String name){
		return demoService.getByName(name);
	};
	
	@RequestMapping("/id")
	public Demo getById(String id){
		return demoService.getById(id);
	};
	@RequestMapping("/getNameById")
	public String getNameById(String id){
		return demoService.getNameById(id);
	}; 
	
	@RequestMapping("/getByPage")
	public List<Demo> getByPage(){
		 PageHelper.startPage(1,2);
		 return demoService.get();
	}
	
	@RequestMapping("/save")
	public Demo save(){
		Demo demo = new Demo();
		demo.setName("张三");
		demoService.save(demo);
		return demo;
	}
}
