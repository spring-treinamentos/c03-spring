package com.context;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

	public String hello() {
		
		System.out.println("Entrei no método!!!");
		
		return "hello";
		
	}
	
}
