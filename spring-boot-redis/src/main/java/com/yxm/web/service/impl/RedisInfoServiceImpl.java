package com.yxm.web.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import com.yxm.web.dao.RedisInfoRepository;
import com.yxm.web.entity.RedisInfo;
import com.yxm.web.service.RedisInfoService;

@Service
public class RedisInfoServiceImpl implements RedisInfoService{
    
	@Autowired
	private RedisInfoRepository repository;
	
	@Autowired
	private RedisTemplate<String,String> redisTemplate;
	
	@Cacheable(value="redisInfo")//缓存,这里没有指定key
	public RedisInfo findById(long id) {
		System.out.println("------从数据库里面获取-------"+id);
		return repository.findOne(id);
	}
	@CacheEvict(value="redisInfo") 
	public void deleteCache(long id) {
		System.out.println("--------d从缓存中删除----------");
	}

	public void test() {
		ValueOperations<String,String> valueOperations = redisTemplate.opsForValue();  
	    valueOperations.set("redisKey", "random="+Math.random());  
	    System.out.println(valueOperations.get("redisKey"));
	}

}
