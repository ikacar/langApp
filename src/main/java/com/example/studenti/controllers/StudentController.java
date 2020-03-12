package com.example.studenti.controllers;

import com.example.studenti.Entities.Exam;
import com.example.studenti.Entities.Student;
import com.example.studenti.repositories.ExamRepo;
import com.example.studenti.repositories.StudentRepo;
import com.example.studenti.services.StudentService;
import com.example.studenti.viewObjects.StudentInfoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class StudentController {

    @Autowired
    StudentRepo studentRepo;

    @Autowired
    StudentService studentService;

    @RequestMapping("/student/all")
    public List<Student> getAllStudents(){

        return (ArrayList<Student>)studentRepo.findAll();
    }

//    @RequestMapping("/student/{id}")
//    public Optional<Student> getStudent(@PathVariable Integer id){
//
//
//        return studentRepo.findById(id);
//    }

    @RequestMapping("/student/{id}")
    public StudentInfoVO getStudent(@PathVariable Integer id){


        return studentService.getStudentInfo(id);
    }

    //    da li treba response code
    @RequestMapping(value = "/student/add", method = RequestMethod.POST)
    public void addStudent(Student student){

        studentRepo.save(student);

    }


}
