package com.example.Continuous.Integration.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Continuous.Integration.model.Student;
import com.example.Continuous.Integration.repository.StudentRepository;

import java.util.List;
@Service
public class StudentService {
@Autowired
private StudentRepository studentRepository;
public Student saveStudent(Student student) {
return studentRepository.save(student);
}
public List<Student> getAllStudents() {
return studentRepository.findAll();
}
 public void deleteStudent(int id) {
	 studentRepository.deleteById(id);
 }
}
