package com.example.studenti.services;


import com.example.studenti.Entities.Result;
import com.example.studenti.Entities.Student;
import com.example.studenti.repositories.ResultRepo;
import com.example.studenti.repositories.StudentRepo;
import com.example.studenti.viewObjects.ResultsInfoVO;
import com.example.studenti.viewObjects.StudentInfoVO;
import com.example.studenti.viewObjects.StudentResultsInfoVO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepo studentRepo;

    @Autowired
    ResultRepo resultRepo;

    public StudentInfoVO getStudentInfo(Integer student_id){
        ModelMapper modelMapper = new ModelMapper();

        List<Result> results = resultRepo.findAllByStudentId(student_id);
        List<StudentResultsInfoVO> resultsInfoVOS = new ArrayList<StudentResultsInfoVO>();

        for(Result r : results){
            resultsInfoVOS.add(modelMapper.map(r,StudentResultsInfoVO.class));
        }

        StudentInfoVO studentInfoVO = new StudentInfoVO();
        studentInfoVO.setStudentResultsInfoVO(resultsInfoVOS);
        studentInfoVO.setName(studentRepo.findById(student_id).get().getName());
        studentInfoVO.setSurname(studentRepo.findById(student_id).get().getSurname());
        studentInfoVO.setBr_indeksa(studentRepo.findById(student_id).get().getBr_indeksa());
        return studentInfoVO;

    }
}
