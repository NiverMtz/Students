package org.generation.Students.controller;

import org.generation.Students.StudentsApplication;
import org.generation.Students.data.entity.Student;
import org.generation.Students.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin( "*" )
@RestController
public class StudentsController {
    private StudentService studentService;

    public StudentsController( @Autowired StudentService studentService )
    {
        this.studentService = studentService;
    }

    @GetMapping("/student/{id}")
    public Student get(@PathVariable int id){
        return studentService.get(id);
    }

}
