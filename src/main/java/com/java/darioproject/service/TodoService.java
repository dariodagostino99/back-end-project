package com.java.darioproject.service;

import com.java.darioproject.model.TodoItem;
import com.java.darioproject.repository.TodoRepository;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.client.HttpResponseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
@Slf4j
public class TodoService {

    @Autowired
    private TodoRepository todoRepository;

    @SneakyThrows
    @Transactional(readOnly = true)
    public TodoItem findById(Long id){
        TodoItem todoItem = todoRepository.findById(id).orElse(null);
        if (todoItem == null){
            throw new HttpResponseException(404, "Item with id: " + id + " doesn't exists." );
        }
        return todoItem;
    }

    @Transactional(readOnly = true)
    public List<TodoItem> findAll() {
        return todoRepository.findAll();
    }

    @Transactional
    public TodoItem post(String author, String description) {
        if (author == null || author.equals("")){
            author = "Dario";
        }
        TodoItem todoItem = TodoItem.builder()
                .author(author)
                .createdAt(new Date())
                .description(description)
                .build();
        //
        todoRepository.save(todoItem);
        return todoItem;
    }

    @Transactional
    public TodoItem delete(Long id) {
        TodoItem todoItem = findById(id);
        todoRepository.delete(todoItem);
        return todoItem;
    }

    @Transactional
    public TodoItem update(Long id, String author, String description) {
        TodoItem todoItem = findById(id);
        todoItem.setAuthor(author);
        todoItem.setDescription(description);
        todoItem.setUpdatedAt(new Date());
        //
        return todoItem;
    }
}
