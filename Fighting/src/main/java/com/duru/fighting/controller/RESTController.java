package com.duru.fighting.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.duru.fighting.domain.User;

@RestController
public class RESTController {
	@GetMapping("/jblog")
	public User httpGet() {
		User findUser = User.builder()
				.id(1)
				.username("test123")
				.password("123")
				.email("123")
				.build();
		return findUser;
	}
	
	@PostMapping("/jblog") 
	public String httpPost(User user) {
		return "POST 요청 처리 완료 : " + user.toString();
	}
	
	@PutMapping("/jblog")
	public String httpPut(User user) {
		return "PUT 요청 처리 완료 : " + user.toString();
	}
	
	@DeleteMapping("/jblog")
	public String httpDelete(@RequestParam int id) {
	return "DELETE 요청 처리 완료 : " + id;
	}

}
