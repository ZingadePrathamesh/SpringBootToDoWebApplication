package com.example.TodoApplication.todo;

import java.time.LocalDate;

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
	public String addTodos(ModelMap model) {
		String username = (String)model.get("name");
		
		Todo todo = new Todo(0, username, "", LocalDate.now().plusYears(1), false);
		model.put("todo", todo);
		
		return "todo";
	}
	
	@RequestMapping(value = "add-todo" , method = RequestMethod.POST)
	public String addTodosPost(ModelMap model, Todo todo) {
		String username = (String) model.get("name");
		todoService.addTodo(username, todo.getDescription(), LocalDate.now().plusYears(1), false);
		return "redirect:list-todos";
	}

}
