/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.46).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Course;
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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-10-21T05:34:25.338932692Z[GMT]")
@Validated
public interface CourseApi {

    @Operation(summary = "", description = "Obtain a list of all specific courses' information", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "A list of courses", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = Course.class)))) })
    @RequestMapping(value = "/course/all",
        produces = { "application/json", "application/xml" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Course>> courseAllGet(@Min(1) @Max(1000) @Parameter(in = ParameterIn.QUERY, description = "Maximum size of course list to return" ,schema=@Schema(allowableValues={ "1", "1000" }, minimum="1", maximum="1000"
)) @Valid @RequestParam(value = "bodyLimit", required = false) Integer bodyLimit, @Min(1) @Max(20) @Parameter(in = ParameterIn.QUERY, description = "Maximum number of pages to return" ,schema=@Schema(allowableValues={ "1", "20" }, minimum="1", maximum="20"
)) @Valid @RequestParam(value = "pageLimit", required = false) Integer pageLimit);


    @Operation(summary = "Delete Course", description = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Course successfully deleted"),
        
        @ApiResponse(responseCode = "404", description = "Course not found") })
    @RequestMapping(value = "/course",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> courseDelete(@NotNull @Parameter(in = ParameterIn.QUERY, description = "Course Number" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "courseNumber", required = true) Integer courseNumber);


    @Operation(summary = "Get Course by Course Number", description = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Successful response", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Course.class))),
        
        @ApiResponse(responseCode = "404", description = "Course not found") })
    @RequestMapping(value = "/course",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Course> courseGet(@NotNull @Parameter(in = ParameterIn.QUERY, description = "Course Number" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "courseNumber", required = true) Integer courseNumber);


    @Operation(summary = "Add new Course", description = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Added new course successfully", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Course.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad request") })
    @RequestMapping(value = "/course",
        produces = { "application/json" }, 
        consumes = { "application/x-www-form-urlencoded" }, 
        method = RequestMethod.POST)
    ResponseEntity<Course> coursePost(@Parameter(in = ParameterIn.DEFAULT, description = "",schema=@Schema()) @RequestParam(value="courseNumber", required=false)  Integer courseNumber, @Parameter(in = ParameterIn.DEFAULT, description = "",schema=@Schema()) @RequestParam(value="courseTitle", required=false)  String courseTitle);


    @Operation(summary = "Update Course", description = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Updated Course successfully", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Course.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad request") })
    @RequestMapping(value = "/course",
        produces = { "application/json" }, 
        consumes = { "application/x-www-form-urlencoded" }, 
        method = RequestMethod.PUT)
    ResponseEntity<Course> coursePut(@NotNull @Parameter(in = ParameterIn.QUERY, description = "Course Number" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "courseNumber", required = true) Integer courseNumber, @Parameter(in = ParameterIn.DEFAULT, description = "",schema=@Schema()) @RequestParam(value="courseTitle", required=false)  String courseTitle);

}

