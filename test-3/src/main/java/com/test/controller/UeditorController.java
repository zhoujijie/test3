package com.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.test.bean.Test;
import com.test.service.TestService;

@Controller
@RequestMapping(value = "/ueditor")
public class UeditorController{
	
	@Autowired
	private TestService testService;
	
	
	/**
	 * 百度富文本编辑器ueditor测试，页面跳转
	 */
	@RequestMapping("/toSavePage")
	public String ueditorTest() {
		return "/ueditor/ueditorTest";
	}
	
	/**
	 * 百度富文本编辑器ueditor测试,保存内容
	 */
	@RequestMapping("/save")
	public String ueditorTest(String editorValue) {
		Test test = new Test();
		test.setAge(20);
		test.setName(editorValue);
		testService.save(test);
		return "redirect:/ueditor/list";
	}
	
	/**
	 * 百度富文本编辑器ueditor测试,展示列表内容
	 */
	@RequestMapping("/list")
	public ModelAndView list() {
		List<Test> testList = testService.getTestList(null);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/ueditor/list");
		mv.addObject("testList",testList);
		return mv;
	}
	
}
