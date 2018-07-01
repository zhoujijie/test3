package com.test.mapper;

import java.util.List;
import java.util.Map;

import com.test.bean.Test;

public interface TestMapper {

	public Test getTest(Map<String,Object> map);
	
	public List<Test> getTestList(Map<String,Object> map);
	
	public void save(Test test);
}
