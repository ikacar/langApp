package com.example.studenti.controllers;

import com.example.studenti.Entities.Exam;
import com.example.studenti.Entities.Student;
import com.example.studenti.repositories.ExamRepo;
import com.example.studenti.services.ExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class ExamController {

    @Autowired
    ExamService examService;
//    GET ALL EXAMS
    @RequestMapping("/exam/all")
    public List<Exam> getAllExams(){

        return examService.getAllExams();

    }
//    GET EXAM BY ID
    @RequestMapping("/exam/{id}")
    public Optional<Exam> getExam(@PathVariable Integer id){

        return examService.getExam(id);
    }

//    CREATE EXAM
    @RequestMapping(value = "/exam/add", method = RequestMethod.POST)
    public void addExam(@RequestBody Exam exam){

        examService.save(exam);

    }
//    UPDATE EXAM
    @RequestMapping(value = "/exam/update/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Exam> updateExam(@PathVariable Integer id, @RequestBody Exam exam){
        if(!examService.findById(id).isPresent()){

            ResponseEntity.badRequest().build();//sta je

        }

        return ResponseEntity.ok(examService.save(exam));
    }
//    DELETE EXAM
    @RequestMapping(value="/exam/delete/{id}", method=RequestMethod.DELETE)
    public ResponseEntity deleteExam(@PathVariable Integer id){
        if(!examService.findById(id).isPresent()){
            ResponseEntity.badRequest().build();
        }
        examService.deleteById(id);
        return ResponseEntity.ok().build();

    }
}
