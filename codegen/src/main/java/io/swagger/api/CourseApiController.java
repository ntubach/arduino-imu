package io.swagger.api;

import io.swagger.model.Course;
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
public class CourseApiController implements CourseApi {

    private static final Logger log = LoggerFactory.getLogger(CourseApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public CourseApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<List<Course>> courseAllGet(@Min(1) @Max(1000) @Parameter(in = ParameterIn.QUERY, description = "Maximum size of course list to return" ,schema=@Schema(allowableValues={ "1", "1000" }, minimum="1", maximum="1000"
)) @Valid @RequestParam(value = "bodyLimit", required = false) Integer bodyLimit,@Min(1) @Max(20) @Parameter(in = ParameterIn.QUERY, description = "Maximum number of pages to return" ,schema=@Schema(allowableValues={ "1", "20" }, minimum="1", maximum="20"
)) @Valid @RequestParam(value = "pageLimit", required = false) Integer pageLimit) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Course>>(objectMapper.readValue("[ {\n  \"courseTitle\" : \"Introduction to Mathematics\",\n  \"courseNumber\" : 101\n}, {\n  \"courseTitle\" : \"Introduction to Mathematics\",\n  \"courseNumber\" : 101\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Course>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Course>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> courseDelete(@NotNull @Parameter(in = ParameterIn.QUERY, description = "Course Number" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "courseNumber", required = true) Integer courseNumber) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Course> courseGet(@NotNull @Parameter(in = ParameterIn.QUERY, description = "Course Number" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "courseNumber", required = true) Integer courseNumber) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Course>(objectMapper.readValue("{\n  \"courseTitle\" : \"Introduction to Mathematics\",\n  \"courseNumber\" : 101\n}", Course.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Course>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Course>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Course> coursePost(@Parameter(in = ParameterIn.DEFAULT, description = "",schema=@Schema()) @RequestParam(value="courseNumber", required=false)  Integer courseNumber,@Parameter(in = ParameterIn.DEFAULT, description = "",schema=@Schema()) @RequestParam(value="courseTitle", required=false)  String courseTitle) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Course>(objectMapper.readValue("{\n  \"courseTitle\" : \"Introduction to Mathematics\",\n  \"courseNumber\" : 101\n}", Course.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Course>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Course>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Course> coursePut(@NotNull @Parameter(in = ParameterIn.QUERY, description = "Course Number" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "courseNumber", required = true) Integer courseNumber,@Parameter(in = ParameterIn.DEFAULT, description = "",schema=@Schema()) @RequestParam(value="courseTitle", required=false)  String courseTitle) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Course>(objectMapper.readValue("{\n  \"courseTitle\" : \"Introduction to Mathematics\",\n  \"courseNumber\" : 101\n}", Course.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Course>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Course>(HttpStatus.NOT_IMPLEMENTED);
    }

}
