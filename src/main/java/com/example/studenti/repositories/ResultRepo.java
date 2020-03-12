package com.example.studenti.repositories;

import com.example.studenti.Entities.Result;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ResultRepo extends CrudRepository<Result, Integer> {

    @Query(value="Select * from Result where student_id=?1 and exam_id=?2",
            nativeQuery = true
    )
    Result findByStudentIdAndExamId(Integer studentId, Integer examId);
    List<Result> findAllByExamId(Integer examId);
    List<Result> findAllByStudentId(Integer studentId);

}
