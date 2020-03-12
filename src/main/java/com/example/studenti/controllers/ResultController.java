package com.example.studenti.controllers;

import com.example.studenti.Entities.Exam;
import com.example.studenti.Entities.Result;
import com.example.studenti.services.ExamService;
import com.example.studenti.services.ResultService;
import com.example.studenti.viewObjects.ExamResultsVO;
import com.example.studenti.viewObjects.ResultsInfoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class ResultController {

    @Autowired
    ResultService resultService;
    @Autowired
    ExamService examService;

//    @RequestMapping("/result/student/{id}")
//    public Result lastStudentResult(@PathVariable("id") Integer studentId, Integer examId){
//
//        return resultService.studentResult(studentId, examId);
//    }
//   ADD result TODO zove samo student, ne moze jovica
    @RequestMapping(value="/result/add", method = RequestMethod.POST)
    public void addResult(Result result){

        resultService.updateResult(result);

    }

//   UPDATE RESULT
    @RequestMapping(value="/result/update/{result_id}", method = RequestMethod.PUT)
    public ResponseEntity<Result> updateResult(@RequestBody Result result, @PathVariable Integer result_id){
        if(!resultService.findById(result_id).isPresent()){

            ResponseEntity.badRequest().build();//sta je

        }

        return ResponseEntity.ok(resultService.save(result));

    }
    //    GET Results for LATEST EXAM
    @RequestMapping("/result/exam/latest")
    public ExamResultsVO getResultsForLatestExam(){

        return resultService.getResultsForLatestExam();
    }

    @RequestMapping("/result/exam/{exam_id}")
    public ExamResultsVO getResultsForExam(@PathVariable Integer exam_id){
        if(!examService.findById(exam_id).isPresent()){
            ResponseEntity.badRequest().build();
        }

        return resultService.findResultsInfoForExam(exam_id);
    }

    @RequestMapping("/result/student/exam/{student_id}/{exam_id}")
    public Result getResultForStudentAndExam(@PathVariable Integer student_id, @PathVariable Integer exam_id){

        if(!examService.findById(exam_id).isPresent()) ResponseEntity.badRequest().build();
         return resultService.studentResult(student_id,exam_id);

    }
}
