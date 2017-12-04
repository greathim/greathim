package com.example.demo;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.board.mapper.BoardMapper;

@Controller
public class JspTest {


    @Resource(name="com.example.demo.board.mapper.BoardMapper")
    BoardMapper mBoardMapper;



	
	@RequestMapping("/test")
	public  String jspTest() throws Exception{
		System.out.println("test called");
		System.out.println(mBoardMapper.boardCount()); 
		return "/test/test";
	}
	
}
