package com.example.studenti.services;

import com.example.studenti.Entities.Exam;
import com.example.studenti.Entities.Result;
import com.example.studenti.repositories.ExamRepo;
import com.example.studenti.repositories.ResultRepo;
import com.example.studenti.repositories.StudentRepo;
import com.example.studenti.viewObjects.ExamResultsVO;
import com.example.studenti.viewObjects.ResultsInfoVO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ResultService {


    @Autowired
    ResultRepo resultRepo;

    @Autowired
    ExamRepo examRepo;

    @Autowired
    StudentRepo studentRepo;

    public Result studentResult(Integer studentId, Integer examId){

        return resultRepo.findByStudentIdAndExamId(studentId, examId);
    }

    public void updateResult(Result result){

        resultRepo.save(result);
    }

    public ExamResultsVO findResultsInfoForExam(Integer exam_id){
        ModelMapper modelMapper = new ModelMapper();

        Optional<Exam> exam = examRepo.findById(exam_id);
        List<Result> results  = resultRepo.findAllByExamId(exam_id);
        List<ResultsInfoVO> resultsVO = new ArrayList<ResultsInfoVO>();
        Integer mark= 0;

        for(Result r : results){
            if(r.getResult()!=null) mark+=r.getResult();

            String name = studentRepo.findById(r.getStudentId()).get().getName();
            String surname  = studentRepo.findById(r.getStudentId()).get().getSurname();
            ResultsInfoVO resultVO = modelMapper.map(r, ResultsInfoVO.class);
            resultVO.setName(name);
            resultVO.setSurname(surname);
            resultsVO.add(resultVO);
        }

        ExamResultsVO examResultsVO = new ExamResultsVO();
        examResultsVO.setExamId(exam_id);
        if(mark!=0)        examResultsVO.setMark(mark/results.size());
        else examResultsVO.setMark(mark);
        System.out.println("mark " + examResultsVO.getMark());

        examResultsVO.setDone(exam.get().isEnded());
        examResultsVO.setResultsInfoVOS(resultsVO);
        return examResultsVO;
    }

    public ExamResultsVO getResultsForLatestExam(){

        return this.findResultsInfoForExam(examRepo.findLatestId());
    }
    public Optional<Result> findById(Integer result_id){

        return resultRepo.findById(result_id);

    }

    public Result save(Result result){

        return resultRepo.save(result);
    }

}
