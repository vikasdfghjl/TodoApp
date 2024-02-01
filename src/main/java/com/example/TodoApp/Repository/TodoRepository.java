package com.example.TodoApp.Repository;

import com.example.TodoApp.DTO.TodoTO;
import com.example.TodoApp.Model.Todo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends MongoRepository<Todo, String> {
}
