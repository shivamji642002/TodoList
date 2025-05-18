package com.todoList.todoList.controller;

import com.todoList.todoList.entity.Student;
import com.todoList.todoList.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/")
    public String viewHomePage(Model model) {
        model.addAttribute("students", studentService.getAllStudents());
        return "students";
    }

    @GetMapping("/add")
    public String showCreateForm(Model model) {
        model.addAttribute("student", new Student());
        return "create_student";
    }

    @PostMapping("/save")
    public String saveStudent(@ModelAttribute("student") Student student) {
        studentService.saveStudent(student);
        return "redirect:/";
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable Long id, Model model) {
        model.addAttribute("student", studentService.getStudentById(id));
        return "update_student";
    }

    @PostMapping("/update/{id}")
    public String updateStudent(@PathVariable Long id, @ModelAttribute("student") Student student) {
        Student existing = studentService.getStudentById(id);
        existing.setName(student.getName());
        existing.setEmail(student.getEmail());
        existing.setDepartment(student.getDepartment());
        studentService.saveStudent(existing);
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String deleteStudent(@PathVariable Long id) {
        studentService.deleteStudent(id);
        return "redirect:/";
    }
}