package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	
	@RequestMapping(value = "/")
	public String index() {
		//TEST3
		//TEST-PIPLINE LOG
		//TEST4
		return "index";
	}
}
