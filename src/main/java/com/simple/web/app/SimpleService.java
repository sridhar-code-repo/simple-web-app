package com.simple.web.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/simple")
public class SimpleService {

	@GetMapping
	public String getHello() {
		return "GET Hello";
	}

	@PostMapping
	public String postHello() {
		return "POST Hello";
	}

}
