package com.example.My_App;

import com.example.My_App.entity.Student;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {

    @GetMapping("/{id}")
    public Student getStudent(@PathVariable String id) {
        Student student = new Student();
        student.setId(777);
        student.setName("Akshay Anant Dharpale");
        student.setAge(27);
        student.setCity("Pune");
        student.setBranch("Computer Engineering");

        return student;
    }

    @PutMapping
    public Student updateStudent(@RequestBody Student student) {
        return student;
    }
}
