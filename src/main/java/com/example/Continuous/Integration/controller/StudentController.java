package com.example.Continuous.Integration.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.Continuous.Integration.model.Student;
import com.example.Continuous.Integration.service.StudentService;

import java.util.List;
@RestController
@RequestMapping("/student")
public class StudentController {
@Autowired
private StudentService studentService;
@PostMapping("/add")
public String add(@RequestBody Student student) {
studentService.saveStudent(student);
return "New student is added";
}
@GetMapping("/getAll")
public List<Student> getAllStudents() {
return studentService.getAllStudents();
}

 @DeleteMapping("/delete/{id}")
 public String deleteStudent(@PathVariable int id) {
	 studentService.deleteStudent(id);
	 return "Student deleted";
 }
}