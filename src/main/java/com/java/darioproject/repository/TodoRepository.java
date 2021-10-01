package com.java.darioproject.repository;


import com.java.darioproject.model.TodoItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends JpaRepository<TodoItem, Long> {

}
