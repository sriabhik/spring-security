package com.anudip.controller;


import com.anudip.entities.Student;
import com.anudip.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @PostMapping("/registerStudent")
    public Student createStudent(@RequestBody Student student){

        return this.studentService.registerStudent(student);

    }
}
