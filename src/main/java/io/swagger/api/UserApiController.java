package io.swagger.api;

import io.swagger.model.User;
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
public class UserApiController implements UserApi {

    private static final Logger log = LoggerFactory.getLogger(UserApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public UserApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    /** @Robert: check if User exists in DB and return user data*/
    public ResponseEntity<User> loginUser(@NotNull @ApiParam(value = "The user name for login", required = true) @Valid @RequestParam(value = "username", required = true) String username,@NotNull @ApiParam(value = "The password for login in clear text", required = true) @Valid @RequestParam(value = "password", required = true) String password) {
        String accept = request.getHeader("Accept");
        if (username.equals("Wolfi")&&password.equals("1234")) {
            log.info(username);
			User wolfi = new User();
			wolfi.setFirstName("Wolfgang");
			wolfi.setIsFemale(false);
			wolfi.setIsStudent(true);
			wolfi.setMkNumber("K0123456");
			wolfi.setSurName("Heindl");
			wolfi.setUserName("Wolfi");
			return new ResponseEntity<User>(wolfi, HttpStatus.OK);
			
        }else if(username.equals("Steve")&&password.equals("1234")){
            log.info(username);
     			User wolfi = new User();
     			wolfi.setFirstName("Stefan");
     			wolfi.setIsFemale(false);
     			wolfi.setIsStudent(true);
     			wolfi.setMkNumber("PROFESSOR");
     			wolfi.setSurName("Mayr");
     			wolfi.setUserName("Steve");
     			return new ResponseEntity<User>(wolfi, HttpStatus.OK);
        }else{
            return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
        }
    }

}
