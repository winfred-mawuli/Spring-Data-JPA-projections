package com.example.jpaprojections.dto;

import java.io.Serializable;
import java.util.UUID;

public interface TodoResponse extends Serializable {
    UUID getId();
    String getName();
    String getDescription();
    String getAuthor();
}
