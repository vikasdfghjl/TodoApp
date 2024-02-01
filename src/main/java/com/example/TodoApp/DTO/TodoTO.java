package com.example.TodoApp.DTO;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TodoTO {
    private String id;
    private String task;
}
