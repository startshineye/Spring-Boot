package com.kfit.demo.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kfit.demo.bean.Cat;
import com.kfit.demo.service.CatService;

@RestController
@RequestMapping("/cat")
public class CatController {
	
	@Resource
	private CatService catService;
	
	@RequestMapping("/save")
	public String save(){
		Cat cat = new Cat();
		cat.setCatName("jack");
		cat.setCatAge(3);
		catService.save(cat);
		return "save ok.";
	}
	
	@RequestMapping("/delete")
	public String delete(){
		catService.delete(1);
		return "delete ok";
	}
	
	@RequestMapping("/getAll")
	public Iterable<Cat> getAll(){
		return catService.getAll();
	}
	
	@RequestMapping("/catName")
	public Cat findByCatName(String catName){
		return catService.findByCatName(catName);
	}
	
	@RequestMapping("/myName")
	public Cat findMyCat(String catName){
		return catService.findMyCat(catName);
	}
	
	@RequestMapping("/findByJdbcTemplate")
	public Cat findByJdbcTemplate(String catName){
		return catService.findByCatName(catName);
	}
	
}
