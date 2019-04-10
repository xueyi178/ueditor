package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

	@RequestMapping("/test")
	public String test(String text){
		System.out.println("-----进入方法-----");
		System.out.println(text);
		return "测试成功";
	}
}
