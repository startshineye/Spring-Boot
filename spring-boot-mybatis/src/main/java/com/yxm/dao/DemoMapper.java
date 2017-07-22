package com.yxm.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import com.yxm.entity.Demo;

public interface DemoMapper {
   
	@Select("select * from demo where name = #{name}")
	public Demo getByName(String name);
	
	@Select("select * from demo where id = #{id}")
	public Demo getById(String id);
	
	@Select("select name from demo where id = #{id}")
	public String getNameById(String id);
	
	@Select("select * from demo")
	public List<Demo> get();
	
	/**
	 * 保存数据.
	 */
	@Insert("insert into Demo(name) values(#{name})")
	@Options(useGeneratedKeys=true,keyProperty="id",keyColumn="id")
	public void save(Demo demo);
}
