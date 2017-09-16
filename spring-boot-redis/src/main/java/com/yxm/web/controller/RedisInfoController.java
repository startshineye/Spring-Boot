package com.yxm.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.yxm.web.entity.RedisInfo;
import com.yxm.web.service.RedisInfoService;
@Controller
public class RedisInfoController {
    @Autowired
	private RedisInfoService redisInfoService;
    
    @RequestMapping("/find")
    @ResponseBody
    public String find(){
    	RedisInfo loaded = redisInfoService.findById(1);
    	System.out.println("loaded["+loaded+"]");
    	RedisInfo cached = redisInfoService.findById(1);
    	System.out.println("cached["+cached+"]");
    	loaded = redisInfoService.findById(2);
    	System.out.println("loaded["+loaded+"]");
    	return "findById";
    }
    
    @RequestMapping("/delete")
    @ResponseBody
    public String delete(long id){
    	redisInfoService.deleteCache(id);
    	return "delete";
    }
    
    @RequestMapping("/test")
    @ResponseBody
    public String test(){
    	redisInfoService.test();
    	System.out.println("--test--");
    	return "test";
    }
}

















































































