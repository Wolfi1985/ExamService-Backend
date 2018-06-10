package io.swagger.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import io.swagger.model.Enrollment;


public interface EnrollmentRepository extends CrudRepository<Enrollment, Long> {

	@Query("SELECT e FROM Enrollment e where e.examId = :examId")
    Enrollment findByExamId(@Param("examId") String examId);
}