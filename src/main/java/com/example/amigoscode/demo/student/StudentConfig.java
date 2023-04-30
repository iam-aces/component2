package com.example.amigoscode.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner (StudentRepository repository){
        return args -> {
            Student mariam = new Student(
                    "Marian", "plome@134.ca", LocalDate.of(2000, Month.JANUARY,10)
            );
            Student mimi = new Student(
                    "Mimi", "mimi@435.com", LocalDate.of(2004, Month.JULY,23)
            );

         repository.saveAll(
                 List.of(mariam,mimi)
         );
        };
    }
}
