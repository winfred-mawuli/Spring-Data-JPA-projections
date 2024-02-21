package com.example.jpaprojections.repository;

import com.example.jpaprojections.dto.TodoResponse;
import com.example.jpaprojections.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.UUID;

@Repository
public interface TodoRepository extends JpaRepository<Todo, UUID> {
    @Query("from Todo t")
    Collection<TodoResponse> getAllTodo();
}