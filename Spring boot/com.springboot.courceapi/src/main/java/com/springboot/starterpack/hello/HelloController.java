package com.springboot.starterpack.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	
	@GetMapping("/hello")
	public String sayHi() {
		return "HI MAHESH";
	}
	
	
	
}