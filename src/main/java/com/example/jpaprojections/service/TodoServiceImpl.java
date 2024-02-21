package com.example.jpaprojections.service;

import com.example.jpaprojections.dto.TodoDto;
import com.example.jpaprojections.dto.TodoResponse;
import com.example.jpaprojections.model.Todo;
import com.example.jpaprojections.repository.TodoRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
@RequiredArgsConstructor
public class TodoServiceImpl implements TodoService {
    private final TodoRepository repository;
    private final ObjectMapper mapper;
    @Override
    public String createTodo(TodoDto todo) {
        Todo newTodo = mapper.convertValue(todo, Todo.class);
        repository.save(newTodo);
        return  "Todo created successfully";
    }

    @Override
    public Collection<TodoResponse> getAllTodo() {
        return repository.getAllTodo();
    }
}
