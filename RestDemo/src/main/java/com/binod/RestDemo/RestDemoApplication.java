package com.binod.RestDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
//@EnableAutoConfiguration
@RestController
//@ComponentScan("com.binod.RestDemo")
public class RestDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestDemoApplication.class, args);
	}
	
	@RequestMapping(value="/check")
	public String getData(){
		return "Testing for one URL path";
	}
	
		
	@RequestMapping(value="/")
	public String firstPage(){
		return "This is my index page of web site";
	}

}
