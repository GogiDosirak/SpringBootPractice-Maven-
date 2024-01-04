package com.duru.fighting.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
	
	@GetMapping("/html")
	public String html() {
		System.out.println("html 요청 처리");
		return "redirect:hello.html";
	}
	
	@GetMapping("/image")
	public String image() {
		System.out.println("image 요청 처리");
		return "redirect:image/dog.jpg";
	}
	
	@GetMapping("/jsp")
	public String jsp(Model model) {
		System.out.println("jsp 요청 처리");
		model.addAttribute("username", "양성준");
		return "hello";
	}

}
