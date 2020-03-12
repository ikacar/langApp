package com.example.studenti.repositories;

import com.example.studenti.Entities.Exam;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExamRepo extends CrudRepository<Exam, Integer> {

@Query(value="SELECT MAX(e.id) FROM Exam e")
Integer findLatestId();

}
