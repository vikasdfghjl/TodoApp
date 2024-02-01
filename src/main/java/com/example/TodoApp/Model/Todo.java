package com.example.TodoApp.Model;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "todoApp")
@Data
@Builder
public class Todo {
    @Id
    private String id;
    private String task;
}
