package com.java.darioproject.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "todo_items")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TodoItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String description;
    @Column
    private String author;
    @Column(name = "created_at")
    private Date createdAt;
    @Column(name="updated_at")
    private Date updatedAt;


}
