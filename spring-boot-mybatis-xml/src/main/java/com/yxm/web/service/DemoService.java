package com.yxm.web.service;

import java.util.List;

import com.yxm.web.bean.Demo;

public interface DemoService {
  void save(Demo demo);
  int deleteById(Integer id);
  Demo getById(Integer id);
  List<Demo> getAll();
  int updateDemo(Demo demo);
}
