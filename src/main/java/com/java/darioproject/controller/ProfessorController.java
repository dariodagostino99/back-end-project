package com.java.darioproject.controller;

import com.java.darioproject.model.Professor;
import com.java.darioproject.model.ProfessorDTO;
import com.java.darioproject.service.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/professors")
public class ProfessorController {

    @Autowired
    private ProfessorService professorService;


}