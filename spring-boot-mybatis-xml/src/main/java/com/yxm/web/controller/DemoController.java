package com.yxm.web.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yxm.web.bean.Demo;
import com.yxm.web.service.DemoService;
@Controller
@RequestMapping("/demo")
public class DemoController {
	@Autowired
	private DemoService demoService;
   
	@RequestMapping("/save")
	@ResponseBody
	public Demo save(){
	   Demo demo = new Demo();
	    demo.setName("lisi");
		demoService.save(demo);
		return demo;
	}
	@RequestMapping("/delete")
	@ResponseBody
	public int delete(Integer id){
		return demoService.deleteById(id);
	}
	@RequestMapping("/get")
	@ResponseBody
	public Demo get(Integer id){
		return demoService.getById(id);
	}
	@RequestMapping("/getAll")
	@ResponseBody
	public List<Demo> getAll(){
		return demoService.getAll();
	}
	@RequestMapping("/update")
	@ResponseBody
	public int update(int id,String name){
		Demo demo = new Demo();
		demo.setId(id);
		demo.setName(name);
		int updateDemo = demoService.updateDemo(demo);
		return updateDemo;
	}
}
