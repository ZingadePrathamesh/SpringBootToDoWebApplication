package com.example.TodoApplication.todo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class TodoController {

	public TodoController(TodoService todoService) {
		super();
		this.todoService = todoService;
	}

	private TodoService todoService;

	@RequestMapping("list-todos")
	public String listTodos(ModelMap model) {
		model.addAttribute("todos", todoService.getTodos("prathamesh"));
		return "listTodos";
	}
	
	@RequestMapping(value = "add-todo", method = RequestMethod.GET)
	public String addTodos() {
		return "todo";
	}
	
	@RequestMapping(value = "add-todo" , method = RequestMethod.POST)
	public String addTodosPost() {
		return "redirect:list-todos";
	}

}
