package com.yxm.web.service;

import com.yxm.web.entity.RedisInfo;

public interface RedisInfoService {

	public RedisInfo findById(long id);
	
	public void deleteCache(long id);
	
	void test();
}
