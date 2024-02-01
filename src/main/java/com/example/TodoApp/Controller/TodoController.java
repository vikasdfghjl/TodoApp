package com.example.TodoApp.Controller;

import com.example.TodoApp.DTO.TodoTO;
import com.example.TodoApp.Model.Todo;
import com.example.TodoApp.Service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

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

    @GetMapping("/get/task")
    @ResponseStatus(HttpStatus.OK)
    public List<Todo> getTasks(){
        return todoService.getTask();
    }

    @GetMapping("/delete/task")
    @ResponseStatus(HttpStatus.OK)
    public String deleteTask(@RequestParam String id){
        return todoService.deleteTask(id);
    }
}
