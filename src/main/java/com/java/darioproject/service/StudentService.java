package com.java.darioproject.service;

import com.java.darioproject.model.Student;
import com.java.darioproject.repository.StudentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Slf4j
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Transactional
    public Student createStudent(Integer age, Integer dni, String name, String lastName) {
        Student student = Student.builder()
                .age(age)
                .name(name)
                .lastName(lastName)
                .dni(dni)
                .build();
        studentRepository.save(student);
        return student;
    }
}
