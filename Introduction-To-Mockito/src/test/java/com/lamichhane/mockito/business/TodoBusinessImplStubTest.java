package com.lamichhane.mockito.business;



import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.lamichhane.mockito.data.api.ToDoService;
import com.lamichhane.mockito.data.api.TodoServiceStub;

class TodoBusinessImplStubTest {

	@Test
	void testRetrieveTodosRelatedToSpring_usingAStub() {
		ToDoService todoServiceStub=new TodoServiceStub();
		TodoBusinessImpl todoBusinessImpl=new TodoBusinessImpl(todoServiceStub);
		
		List<String> filteredTodos=todoBusinessImpl.retrieveTodosRelatedToSpring("Mahesh");
		assertEquals(2,filteredTodos.size());
	}

}
