package com.example.Continuous.Integration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Continuous.Integration.model.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
}
