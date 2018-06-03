package io.swagger.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import io.swagger.model.Exam;


public interface ExamRepository extends CrudRepository<Exam, Long> {

	@Query("SELECT e FROM Exam e where e.examId = :examId")
    Exam findByExamId(@Param("examId") String examId);
}