package io.swagger.api;

import io.swagger.model.Exam;
import jdk.internal.jline.internal.Log;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
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
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-01T16:56:33.976Z")

@Controller
public class ExamApiController implements ExamApi {

    private static final Logger log = LoggerFactory.getLogger(ExamApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ExamApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    /** @Robert: add new exam to DB and change Http.Status in ResponseEntity to HttpStatus.OK*/
    public ResponseEntity<Void> addExam(@ApiParam(value = "Add exam object" ,required=true )  @Valid @RequestBody Exam body) {
        String accept = request.getHeader("Accept");
        log.info(body.toString());
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    /** @Robert: delete exam in DB and change Http.Status in ResponseEntity to HttpStatus.OK*/
    public ResponseEntity<Void> deleteExam(@ApiParam(value = "The exam that needs to be deleted",required=true) @PathVariable("examId") String examId) {
        String accept = request.getHeader("Accept");
        log.info(examId);
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    /** @Robert: update exam in DB and change Http.Status in ResponseEntity to HttpStatus.OK*/
    public ResponseEntity<Void> updateExam(@ApiParam(value = "Updated exam object" ,required=true )  @Valid @RequestBody Exam body) {
        String accept = request.getHeader("Accept");
        log.info(body.toString());
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
