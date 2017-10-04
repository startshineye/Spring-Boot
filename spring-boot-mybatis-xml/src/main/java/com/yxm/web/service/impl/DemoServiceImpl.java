package com.yxm.web.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yxm.web.bean.Demo;
import com.yxm.web.dao.DemoMapper;
import com.yxm.web.service.DemoService;

@Service
public class DemoServiceImpl implements DemoService{

	@Autowired
	private DemoMapper demoMapper;
	
	public void save(Demo demo) {
		demoMapper.save(demo);
		
	}
	public Demo getById(Integer id) {
		return demoMapper.getById(id);
	}
	public int deleteById(Integer id) {
		return demoMapper.deleteById(id);
	}
	public List<Demo> getAll() {
		return demoMapper.getAll();
	}
	public int updateDemo(Demo demo) {
		return demoMapper.updateDemo(demo);
	}
	 
   
}
