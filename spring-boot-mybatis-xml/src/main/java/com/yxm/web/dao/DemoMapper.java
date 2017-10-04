package com.yxm.web.dao;

import java.util.List;

import com.yxm.web.bean.Demo;

public interface DemoMapper {
   void save(Demo demo);
   int deleteById(Integer id);
   Demo getById(Integer id);
   List<Demo> getAll();
   int updateDemo(Demo demo);
}
