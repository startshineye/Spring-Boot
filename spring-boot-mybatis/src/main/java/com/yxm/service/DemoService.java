package com.yxm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yxm.dao.DemoMapper;
import com.yxm.entity.Demo;

@Service
public class DemoService {

	@Autowired
	private DemoMapper demoMappper;
	
	public Demo getByName(String name){
		return demoMappper.getByName(name);
	};
	
	public Demo getById(String id){
		return demoMappper.getById(id);
	};
	
	public String getNameById(String id){
		return demoMappper.getNameById(id);
	}; 
	
	public List<Demo> get(){
		return demoMappper.get();
	};
	
	@Transactional//添加事务.
	public void save(Demo demo){
		demoMappper.save(demo);
	}
}
