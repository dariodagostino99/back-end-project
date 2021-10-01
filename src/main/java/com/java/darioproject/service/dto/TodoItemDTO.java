package com.java.darioproject.service.dto;

import lombok.Data;
import java.util.Date;

@Data
public class TodoItemDTO {

    private String description;
    private String author;
    private Date createdAt;
    private Date updatedAt;
}
