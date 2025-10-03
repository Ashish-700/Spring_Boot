package com.javapoint;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	@RequestMapping("/MVC")

	public String display() {
		
		return "index";
	}
}
