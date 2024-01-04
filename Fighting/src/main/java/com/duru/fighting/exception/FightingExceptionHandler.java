package com.duru.fighting.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@ControllerAdvice
@RestControllerAdvice
public class FightingExceptionHandler {
	@ExceptionHandler(value = Exception.class)
	public String globalExceptionHandler(Exception e) {
		return "<h1>" + e.getMessage() + "</h1>";
	}

}
