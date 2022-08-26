package com.example.springhello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MyController {
	
	@RequestMapping("/")
	public String sayHello() {			
		return "testing 123 *** Hello Spring boot";
	}	
		
	
	@RequestMapping("/bello")
	public String saySomething() {			
		return "bello hello";
	}
	
	
	@RequestMapping("/h22")
	public String saySomething22() {			
		return " hello 22 ";
	}
		
	
	@RequestMapping("/h33")
	public String saySomething33() {			
		return "hello 33";
	}
	
	
	@RequestMapping("/h55")
	public String saySomething55() {			
		return "hi lets have lunch at Restruant no. 55";
	}
	
	
}
