package com.example.TodoApp.Service;

import com.example.TodoApp.DTO.TodoTO;
import com.example.TodoApp.Model.Todo;
import com.example.TodoApp.Repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {
    @Autowired
    private TodoRepository todoRepository;
    public String createTask(TodoTO todoTO) {
        try{
            Todo todo = Todo.builder()
                    .task(todoTO.getTask()).build();
            todoRepository.save(todo);
        }catch(Exception ignored){}
    return "Task created Successfully";
    }

    public List<Todo> getTask() {
        List<Todo> todoList = new ArrayList<>();
        try{
            todoList = todoRepository.findAll();
        }catch (Exception ignored){}
        return todoList;

    }

    public String deleteTask(String id) {
        try{
            todoRepository.deleteById(id);
        }catch (Exception ignored){

        }
        return "Task deleted Successfully";
    }

    public String updateTask(TodoTO todo) {
        try{
            Todo task = Todo.builder()
                    .id(todo.getId())
                    .task(todo.getTask()).build();
            todoRepository.save(task);
        }catch(Exception ignored){

        }

        return "Task Updated Successfully";
    }

}
