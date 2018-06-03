package io.swagger.api;

import io.swagger.model.Exams;
import io.swagger.repository.ExamRepository;
import io.swagger.repository.UserRepository;

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
public class GetAllExamsApiController implements GetAllExamsApi {

    private static final Logger log = LoggerFactory.getLogger(GetAllExamsApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;
    
    private ExamRepository examRepository;

    @org.springframework.beans.factory.annotation.Autowired
    public GetAllExamsApiController(ObjectMapper objectMapper, HttpServletRequest request,  ExamRepository examRepository) {
        this.objectMapper = objectMapper;
        this.request = request;
        this.examRepository = examRepository;
    }

    /** @Robert: return all Exams from DB and change Http.Status in ResponseEntity where NOT_IMPLEMENTED to HttpStatus.OK*/
    public ResponseEntity<Exams> getAllExams() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
            	log.info(examRepository.findAll().toString());
                return new ResponseEntity<Exams>(objectMapper.readValue("\"\"", Exams.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Exams>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        if (accept != null && accept.contains("application/xml")) {
            try {
                return new ResponseEntity<Exams>(objectMapper.readValue("null", Exams.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/xml", e);
                return new ResponseEntity<Exams>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Exams>(HttpStatus.NOT_IMPLEMENTED);
    }

}
