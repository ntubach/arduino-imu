/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.46).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Student;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.CookieValue;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-10-21T05:33:59.859835563Z[GMT]")
@Validated
public interface StudentApi {

    @Operation(summary = "", description = "Obtain a list of all students' information", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "A list of students", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = Student.class)))) })
    @RequestMapping(value = "/student/all",
        produces = { "application/json", "application/xml" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Student>> studentAllGet(@Min(1) @Max(1000) @Parameter(in = ParameterIn.QUERY, description = "Maximum size of student list to return" ,schema=@Schema(allowableValues={ "1", "1000" }, minimum="1", maximum="1000"
)) @Valid @RequestParam(value = "bodyLimit", required = false) Integer bodyLimit, @Min(1) @Max(20) @Parameter(in = ParameterIn.QUERY, description = "Maximum number of pages to return" ,schema=@Schema(allowableValues={ "1", "20" }, minimum="1", maximum="20"
)) @Valid @RequestParam(value = "pageLimit", required = false) Integer pageLimit);


    @Operation(summary = "Delete Student", description = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Successful response"),
        
        @ApiResponse(responseCode = "404", description = "Student not found") })
    @RequestMapping(value = "/student",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> studentDelete(@NotNull @Parameter(in = ParameterIn.QUERY, description = "Student ID" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "id", required = true) Integer id);


    @Operation(summary = "Get Student by ID", description = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Successful response", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Student.class))),
        
        @ApiResponse(responseCode = "404", description = "Student not found") })
    @RequestMapping(value = "/student",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Student> studentGet(@NotNull @Parameter(in = ParameterIn.QUERY, description = "Student ID" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "id", required = true) Integer id);


    @Operation(summary = "", description = "Obtain a specific student's information based on 'id'", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Successfully retrieved student", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = Student.class)))) })
    @RequestMapping(value = "/student/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Student>> studentIdGet(@Parameter(in = ParameterIn.PATH, description = "The ID of the student", required=true, schema=@Schema()) @PathVariable("id") Integer id);


    @Operation(summary = "Add Student", description = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Successful response", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Student.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad request") })
    @RequestMapping(value = "/student",
        produces = { "application/json" }, 
        consumes = { "application/x-www-form-urlencoded" }, 
        method = RequestMethod.POST)
    ResponseEntity<Student> studentPost(@Parameter(in = ParameterIn.DEFAULT, description = "",schema=@Schema()) @RequestParam(value="firstName", required=false)  String firstName, @Parameter(in = ParameterIn.DEFAULT, description = "",schema=@Schema()) @RequestParam(value="lastName", required=false)  String lastName, @Parameter(in = ParameterIn.DEFAULT, description = "",schema=@Schema()) @RequestParam(value="dateOfBirth", required=false)  String dateOfBirth, @Parameter(in = ParameterIn.DEFAULT, description = "",schema=@Schema()) @RequestParam(value="email", required=false)  String email);


    @Operation(summary = "Update Student", description = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Successful response", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Student.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad request") })
    @RequestMapping(value = "/student",
        produces = { "application/json" }, 
        consumes = { "application/x-www-form-urlencoded" }, 
        method = RequestMethod.PUT)
    ResponseEntity<Student> studentPut(@NotNull @Parameter(in = ParameterIn.QUERY, description = "Student ID" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "id", required = true) Integer id, @Parameter(in = ParameterIn.DEFAULT, description = "",schema=@Schema()) @RequestParam(value="firstName", required=false)  String firstName, @Parameter(in = ParameterIn.DEFAULT, description = "",schema=@Schema()) @RequestParam(value="lastName", required=false)  String lastName, @Parameter(in = ParameterIn.DEFAULT, description = "",schema=@Schema()) @RequestParam(value="dateOfBirth", required=false)  String dateOfBirth, @Parameter(in = ParameterIn.DEFAULT, description = "",schema=@Schema()) @RequestParam(value="email", required=false)  String email);

}

