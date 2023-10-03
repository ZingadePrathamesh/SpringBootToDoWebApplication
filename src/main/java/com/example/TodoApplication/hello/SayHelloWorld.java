package com.example.TodoApplication.hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SayHelloWorld {
	
	@RequestMapping("hello-world")
	public String sayHello() {
		return "Hello World of Web!";
	}
	
	@RequestMapping("say-hello-jsp")
	public String sayHelloJsp(@RequestParam String name, ModelMap model) {
		model.put("name", name);
		return "sayHello";
	}
}
