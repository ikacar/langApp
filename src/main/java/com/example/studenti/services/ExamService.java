package com.example.studenti.services;

import com.example.studenti.Entities.Exam;
import com.example.studenti.Entities.Result;
import com.example.studenti.Entities.Student;
import com.example.studenti.repositories.ExamRepo;
import com.example.studenti.repositories.ResultRepo;
import com.example.studenti.repositories.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class ExamService {

    @Autowired
    ExamRepo examRepo;
    @Autowired
    StudentRepo studentRepo;

    @Autowired
    ResultRepo resultRepo;
    public List<Exam> getAllExams(){

        List<Exam> exams = (ArrayList<Exam>)examRepo.findAll();
        return exams;

    }
    public Optional<Exam> findById(Integer id){

        return examRepo.findById(id);

    }

    public Optional<Exam> getExam(Integer id){

        return examRepo.findById(id);
    }

//    public void addExam(Exam exam){
//        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
//        Date date = new Date();
//        System.out.println(formatter.format(date));
//
//        exam.setStartTime(date);
//        examRepo.save(exam);
//        List<Student> studenti =(ArrayList<Student>) studentRepo.findAll();
//        studenti.forEach(student ->{
//            System.out.println("student id " + student.getId());
//            System.out.println("student id " + examRepo.findLatestId());
//            resultRepo.save(new Result(student.getId(), examRepo.findLatestId(),"","","",new BigDecimal(5)));
//
//        });
//    }

    public Exam save(Exam exam){

        return examRepo.save(exam);
    }
    public void deleteById(Integer id){

        examRepo.deleteById(id);
    }

//    public Integer getLastExamId(){
//        examRepo.
//    }

}
