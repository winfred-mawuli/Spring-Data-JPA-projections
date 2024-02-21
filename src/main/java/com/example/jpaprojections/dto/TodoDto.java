package com.example.jpaprojections.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class TodoDto {
    String name;
    String description;
    String author;
}