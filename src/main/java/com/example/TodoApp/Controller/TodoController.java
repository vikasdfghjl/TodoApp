package com.example.TodoApp.Controller;

import com.example.TodoApp.DTO.TodoTO;
import com.example.TodoApp.Service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/todo")
public class TodoController {
    @Autowired
    private TodoService todoService;
    @PostMapping("/create/task")
    @ResponseStatus(HttpStatus.CREATED)
    public String createTask(@RequestBody TodoTO task){
        return todoService.createTask(task);
    }
}
