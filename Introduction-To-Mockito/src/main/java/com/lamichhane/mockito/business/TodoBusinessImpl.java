package com.lamichhane.mockito.business;

import java.util.ArrayList;
import java.util.List;

import com.lamichhane.mockito.data.api.ToDoService;

public class TodoBusinessImpl
{
	private ToDoService todoService;

	public TodoBusinessImpl(ToDoService todoService)
	{
		this.todoService = todoService;
	}
	
	public List<String> retrieveTodosRelatedToSpring(String user)
	{
		List<String> filteredTodos=new ArrayList<>();
		List<String> todos=todoService.retrieveTodos(user);
		
		for(String todo:todos)
		{
			if(todo.contains("Spring"))
			{
				filteredTodos.add(todo);
			}
		}
		
		
		return filteredTodos;
	}
	
	public void deleteToDosNotRelatedToSpring(String user)
	{
		
		List<String> todos=todoService.retrieveTodos(user);
		
		
		for(String todo:todos)
		{
			
			if(!todo.contains("Spring"))
			{
			
				todoService.deleteTodo(todo); 
			}
		}
		
	}
	
	
}
