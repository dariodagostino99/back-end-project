package com.java.darioproject.controller;

import com.java.darioproject.model.Student;
import com.java.darioproject.service.StudentService;
import com.java.darioproject.service.dto.StudentDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping()
    public Student create (@RequestBody StudentDTO studentDTO){
        return studentService.createStudent(studentDTO.getAge(), studentDTO.getDni(), studentDTO.getName(), studentDTO.getLastName());
    }

}
