package com.example.TodoApplication.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloWorld {
	
	@RequestMapping("hello-world")
	public String sayHello() {
		return "Hello World of Web!";
	}
}
