package io.swagger.api;

import io.swagger.model.Student;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-10-21T05:34:25.338932692Z[GMT]")
@RestController
public class StudentApiController implements StudentApi {

    private static final Logger log = LoggerFactory.getLogger(StudentApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public StudentApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<List<Student>> studentAllGet(@Min(1) @Max(1000) @Parameter(in = ParameterIn.QUERY, description = "Maximum size of student list to return" ,schema=@Schema(allowableValues={ "1", "1000" }, minimum="1", maximum="1000"
)) @Valid @RequestParam(value = "bodyLimit", required = false) Integer bodyLimit,@Min(1) @Max(20) @Parameter(in = ParameterIn.QUERY, description = "Maximum number of pages to return" ,schema=@Schema(allowableValues={ "1", "20" }, minimum="1", maximum="20"
)) @Valid @RequestParam(value = "pageLimit", required = false) Integer pageLimit) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Student>>(objectMapper.readValue("[ {\n  \"firstName\" : \"John\",\n  \"lastName\" : \"Doe\",\n  \"dateOfBirth\" : \"2000-01-01\",\n  \"id\" : 1,\n  \"email\" : \"johndoe@gmail.com\"\n}, {\n  \"firstName\" : \"John\",\n  \"lastName\" : \"Doe\",\n  \"dateOfBirth\" : \"2000-01-01\",\n  \"id\" : 1,\n  \"email\" : \"johndoe@gmail.com\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Student>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Student>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> studentDelete(@NotNull @Parameter(in = ParameterIn.QUERY, description = "Student ID" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "id", required = true) Integer id) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Student> studentGet(@NotNull @Parameter(in = ParameterIn.QUERY, description = "Student ID" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "id", required = true) Integer id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Student>(objectMapper.readValue("{\n  \"firstName\" : \"John\",\n  \"lastName\" : \"Doe\",\n  \"dateOfBirth\" : \"2000-01-01\",\n  \"id\" : 1,\n  \"email\" : \"johndoe@gmail.com\"\n}", Student.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Student>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Student>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Student>> studentIdGet(@Parameter(in = ParameterIn.PATH, description = "The ID of the student", required=true, schema=@Schema()) @PathVariable("id") Integer id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Student>>(objectMapper.readValue("[ {\n  \"firstName\" : \"John\",\n  \"lastName\" : \"Doe\",\n  \"dateOfBirth\" : \"2000-01-01\",\n  \"id\" : 1,\n  \"email\" : \"johndoe@gmail.com\"\n}, {\n  \"firstName\" : \"John\",\n  \"lastName\" : \"Doe\",\n  \"dateOfBirth\" : \"2000-01-01\",\n  \"id\" : 1,\n  \"email\" : \"johndoe@gmail.com\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Student>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Student>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Student> studentPost(@Parameter(in = ParameterIn.DEFAULT, description = "",schema=@Schema()) @RequestParam(value="firstName", required=false)  String firstName,@Parameter(in = ParameterIn.DEFAULT, description = "",schema=@Schema()) @RequestParam(value="lastName", required=false)  String lastName,@Parameter(in = ParameterIn.DEFAULT, description = "",schema=@Schema()) @RequestParam(value="dateOfBirth", required=false)  String dateOfBirth,@Parameter(in = ParameterIn.DEFAULT, description = "",schema=@Schema()) @RequestParam(value="email", required=false)  String email) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Student>(objectMapper.readValue("{\n  \"firstName\" : \"John\",\n  \"lastName\" : \"Doe\",\n  \"dateOfBirth\" : \"2000-01-01\",\n  \"id\" : 1,\n  \"email\" : \"johndoe@gmail.com\"\n}", Student.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Student>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Student>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Student> studentPut(@NotNull @Parameter(in = ParameterIn.QUERY, description = "Student ID" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "id", required = true) Integer id,@Parameter(in = ParameterIn.DEFAULT, description = "",schema=@Schema()) @RequestParam(value="firstName", required=false)  String firstName,@Parameter(in = ParameterIn.DEFAULT, description = "",schema=@Schema()) @RequestParam(value="lastName", required=false)  String lastName,@Parameter(in = ParameterIn.DEFAULT, description = "",schema=@Schema()) @RequestParam(value="dateOfBirth", required=false)  String dateOfBirth,@Parameter(in = ParameterIn.DEFAULT, description = "",schema=@Schema()) @RequestParam(value="email", required=false)  String email) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Student>(objectMapper.readValue("{\n  \"firstName\" : \"John\",\n  \"lastName\" : \"Doe\",\n  \"dateOfBirth\" : \"2000-01-01\",\n  \"id\" : 1,\n  \"email\" : \"johndoe@gmail.com\"\n}", Student.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Student>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Student>(HttpStatus.NOT_IMPLEMENTED);
    }

}
