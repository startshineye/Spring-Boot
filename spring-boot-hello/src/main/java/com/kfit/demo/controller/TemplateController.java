package com.kfit.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/template")
public class TemplateController {

	/**
	 * 跳转页面不携带数据
	 * @return
	 */
	@RequestMapping("/th")
	public String helloThymeleaf(){
		return "hello";
	}
	/**
	 * 返回页面并携带参数
	 * @return
	 */
	@RequestMapping("/th1")
	public String helloThymeleaf1(Map<String,Object> map){
		map.put("hello","Hello Thymeleaf");
		return "hello";
	}
	
	@RequestMapping("/freemark")
	public String helloFreeMarker(Map<String,Object> map){
		map.put("hello","hello FreeMarker!");//返回的数据
		return "hello";//返回的页面
	}
}
