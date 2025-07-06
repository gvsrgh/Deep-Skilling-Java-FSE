package com.example.student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.student.model.Student;
import com.example.student.repository.StudentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;


@SpringBootApplication
public class StudentApplication implements CommandLineRunner {

    @Autowired
    private StudentRepository studentRepository;

    public static void main(String[] args) {
        SpringApplication.run(StudentApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Student s1 = new Student();
        s1.setId(4);
        s1.setName("Rahul");

        Student s2 = new Student();
        s2.setId(5);
        s2.setName("Rohan");

        Student s3 = new Student();
        s3.setId(6);
        s3.setName("Ramesh");

        studentRepository.save(s1);
        studentRepository.save(s2);
        studentRepository.save(s3);

        System.out.println("Students saved using Spring Data JPA!");
    }
}
