/**
 * NOTE: This class is auto generated by the swagger code generator program (1.0.12-1).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Exam;
import io.swagger.model.Exams;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-01T16:56:33.976Z")

@Api(value = "exam", description = "the exam API")
public interface ExamApi {

	@CrossOrigin(maxAge = 3600)
    @ApiOperation(value = "Add exam", nickname = "addExam", notes = "This can only be done by the logged in professor.", tags={ "exam", })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "Invalid exam supplied"),
        @ApiResponse(code = 404, message = "Exam not found") })
    @RequestMapping(value = "/exam",
        produces = { "application/json", "application/xml" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Exams> addExam(@ApiParam(value = "Add exam object" ,required=true )  @Valid @RequestBody Exam body);

	@CrossOrigin(maxAge = 3600)
    @ApiOperation(value = "Delete exam", nickname = "deleteExam", notes = "This can only be done by the logged in professor.", tags={ "exam", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Exam successfully deleted"),
        @ApiResponse(code = 400, message = "Invalid examId supplied"),
        @ApiResponse(code = 404, message = "Exam not found") })
    @RequestMapping(value = "/exam/{examId}",
        produces = { "application/json", "application/xml" }, 
        consumes = { "application/json" },
        method = RequestMethod.DELETE)
    ResponseEntity<Exams> deleteExam(@ApiParam(value = "The exam that needs to be deleted",required=true) @PathVariable("examId") String examId);

	@CrossOrigin(maxAge = 3600)
    @ApiOperation(value = "Updated exam", nickname = "updateExam", notes = "This can only be done by the logged in professor.", tags={ "exam", })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "Invalid exam supplied"),
        @ApiResponse(code = 404, message = "Exam not found") })
    @RequestMapping(value = "/exam",
        produces = { "application/json", "application/xml" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<Exams> updateExam(@ApiParam(value = "Updated exam object" ,required=true )  @Valid @RequestBody Exam body);

}
