package com.example.TodoApplication.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoService {
	
	private static int todoCount = 0;

	private static List<Todo> todos = new ArrayList<Todo>();
	
	static {
		todos.add(new Todo(++todoCount, "prathamesh", "Learn AWS", LocalDate.now().plusYears(1), false));
		todos.add(new Todo(++todoCount, "prathamesh", "Learn Cloud", LocalDate.now().plusYears(2), false));
		todos.add(new Todo(++todoCount, "prathamesh", "Learn Jenkins", LocalDate.now().plusYears(2), false));
		}
	
	public List<Todo> getTodos(String username){
		return todos;
	}
	
	public void addTodo(String username, String description, LocalDate targetDate, boolean done) {
		todos.add(new Todo(++todoCount, username, description, targetDate, done));
	}
}
