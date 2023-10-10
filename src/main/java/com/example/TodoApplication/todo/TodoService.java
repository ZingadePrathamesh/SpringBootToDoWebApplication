package com.example.TodoApplication.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;

import jakarta.validation.Valid;

@Service
public class TodoService {
	
	private static int todoCount = 0;

	private static List<Todo> todos = new ArrayList<Todo>();
	
	static {
		todos.add(new Todo(++todoCount, "prathamesh", "Learn AWS", LocalDate.now().plusYears(1), false));
		todos.add(new Todo(++todoCount, "prathamesh", "Learn Cloud", LocalDate.now().plusYears(2), false));
		todos.add(new Todo(++todoCount, "prathamesh", "Learn Jenkins", LocalDate.now().plusYears(2), false));
		todos.add(new Todo(++todoCount, "rakesh", "Learn Jenkins", LocalDate.now().plusYears(2), false));
		}
	
	public List<Todo> getTodosByUsername(String username){
		Predicate<? super Todo> predicate = todo -> todo.getUsername().equalsIgnoreCase(username);
		return todos.stream().filter(predicate).toList();
	}
	
	public void addTodo(String username, String description, LocalDate targetDate, boolean done) {
		todos.add(new Todo(++todoCount, username, description, targetDate, done));
	}
	
	public void deleteById(int id) {
		Predicate<? super Todo> predicate = todo -> todo.getId() == id;
		todos.removeIf(predicate ); 
	}
	
	public Todo findById(int id) {
		Predicate<? super Todo> predicate = todo -> todo.getId() == id;
		Todo todo = todos.stream().filter(predicate).findFirst().get();
		return todo;
	}

	public void updateTodo(@Valid Todo todo) {
		deleteById(todo.getId());
		todos.add(todo);
	}
}
