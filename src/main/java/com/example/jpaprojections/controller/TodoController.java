package com.example.jpaprojections.controller;

import com.example.jpaprojections.dto.ResponseHandler;
import com.example.jpaprojections.dto.TodoDto;
import com.example.jpaprojections.service.TodoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/todos")
public class TodoController {
    private final TodoService todoService;

    @PostMapping("/")
    public ResponseEntity<Object> createTodo(@RequestBody TodoDto todoDto){
        String response = todoService.createTodo(todoDto);
        return  ResponseHandler.successResponse(HttpStatus.CREATED,response);
    }

    @GetMapping("/")
    public ResponseEntity<Object> getAllTodo(){
        return  ResponseHandler.successResponse(HttpStatus.OK,todoService.getAllTodo());
    }

}
