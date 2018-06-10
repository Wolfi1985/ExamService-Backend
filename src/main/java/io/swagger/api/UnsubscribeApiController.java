package io.swagger.api;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.swagger.annotations.*;
import io.swagger.model.Enrollment;
import io.swagger.model.User;
import io.swagger.repository.EnrollmentRepository;
import io.swagger.repository.ExamRepository;
import io.swagger.repository.UserRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-01T16:56:33.976Z")

@Controller
public class UnsubscribeApiController implements UnsubscribeApi {

    private static final Logger log = LoggerFactory.getLogger(UnsubscribeApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;
    
    private UserRepository userRepository;
    
    private EnrollmentRepository enrollmentRepository;

    private ExamRepository examRepository;
    
    @org.springframework.beans.factory.annotation.Autowired
    public UnsubscribeApiController(ObjectMapper objectMapper, HttpServletRequest request, UserRepository userRepository, EnrollmentRepository enrollmentRepository, ExamRepository examRepository) {
        this.objectMapper = objectMapper;
        this.request = request;
        this.userRepository = userRepository;
        this.enrollmentRepository = enrollmentRepository;
        this.examRepository = examRepository;
    }

    public ResponseEntity<Void> unsubscribe(@NotNull @ApiParam(value = "The user mkNumber", required = true) @Valid @RequestParam(value = "mkNumber", required = true) String mkNumber,@NotNull @ApiParam(value = "The user mkNumber", required = true) @Valid @RequestParam(value = "examId", required = true) String examId) {
    	String accept = request.getHeader("Accept");
        log.info("UNSUBSCRIBE");
        User user = userRepository.findByMkNumber(mkNumber);
        
        if(user != null){
        	Enrollment enrollment = enrollmentRepository.findByExamId(examId);
        	if(enrollment != null){
        		 enrollment.deleteParticipantsItem(user);
        		 enrollment.setEnrollments(enrollment.getParticipants().size());
        		 log.info(enrollmentRepository.findAll().toString());
        		 return new ResponseEntity<Void>(HttpStatus.OK);
        	}
        	return new ResponseEntity<Void>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        
        return new ResponseEntity<Void>(HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
