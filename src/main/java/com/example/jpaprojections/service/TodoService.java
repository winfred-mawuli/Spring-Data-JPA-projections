package com.example.jpaprojections.service;

import com.example.jpaprojections.dto.TodoDto;
import com.example.jpaprojections.dto.TodoResponse;

import java.util.Collection;

public interface TodoService {
    String createTodo(TodoDto todo);
    Collection<TodoResponse> getAllTodo();
}
