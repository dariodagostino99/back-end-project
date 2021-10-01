package com.java.darioproject.controller;

import com.java.darioproject.model.TodoItem;
import com.java.darioproject.service.TodoService;
import com.java.darioproject.service.dto.TodoItemDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/todo-resource")
public class TodoResource {

    @Autowired
    private TodoService todoService;

    @RequestMapping(path="/all", method = RequestMethod.GET)
    private List<TodoItem> getAll(){
        return todoService.findAll();
    }

    @RequestMapping(path="/{id}", method = RequestMethod.GET)
    private TodoItem getById(@PathVariable("id")Long id){
        return todoService.findById(id);
    }

    @RequestMapping(path="/post", method = RequestMethod.POST)
    private TodoItem post(@RequestBody TodoItemDTO todoItemDTO){
        return todoService.post(todoItemDTO.getAuthor(), todoItemDTO.getDescription());
    }

    @RequestMapping(path="/{id}/delete", method = RequestMethod.DELETE)
    private TodoItem delete(@PathVariable("id") Long id){
        return todoService.delete(id);
    }

    @RequestMapping(path="/{id}/update", method = RequestMethod.POST)
    private TodoItem update(@PathVariable("id") Long id, @RequestBody TodoItemDTO todoItemDTO){
        return todoService.update(id, todoItemDTO.getAuthor(), todoItemDTO.getDescription());
    }

}
