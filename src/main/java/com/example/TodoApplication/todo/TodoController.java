package com.example.TodoApplication.todo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TodoController {
	
	@RequestMapping("list-todos")
	public String listTodos(ModelMap model) {
		return "listTodos";
	}

}
