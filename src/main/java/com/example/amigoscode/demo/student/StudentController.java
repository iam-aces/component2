package com.example.amigoscode.demo.student;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/student")
public class StudentController {
    private final StudentService studentService;

//    use sesc dependency injection to resolve the error on student service. using "@component" and "@autowired"
    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> getStudent() {
        return studentService.getStudent();
    }

    @PostMapping
    public void RegNewStudent(@RequestBody Student student){
        studentService.addNewStudent(student);
    }

}
