package com.example.amigoscode.demo.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudent(){
        return List.of(
                new Student(1L, "Mary Mike","mary.lol@eure.ok", LocalDate.of(2000, Month.JANUARY,5),23)
        );
    }
}
