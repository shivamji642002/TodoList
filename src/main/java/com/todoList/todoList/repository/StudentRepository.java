package com.todoList.todoList.repository;

import com.todoList.todoList.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
