package com.test.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.bean.Test;
import com.test.mapper.TestMapper;

@Service
public class TestService {

	@Autowired
	private TestMapper testMapper;
	
	public Test getTest(Map<String,Object> map) {
		return testMapper.getTest(map);
	}
	
	public void save(Test test) {
		testMapper.save(test);
	}
	
	public List<Test> getTestList(Map<String,Object> map) {
		return testMapper.getTestList(map);
	}
}
