package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CourseBody
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-10-21T05:34:25.338932692Z[GMT]")


public class CourseBody   {
  @JsonProperty("courseTitle")
  private String courseTitle = null;

  public CourseBody courseTitle(String courseTitle) {
    this.courseTitle = courseTitle;
    return this;
  }

  /**
   * Get courseTitle
   * @return courseTitle
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getCourseTitle() {
    return courseTitle;
  }

  public void setCourseTitle(String courseTitle) {
    this.courseTitle = courseTitle;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CourseBody courseBody = (CourseBody) o;
    return Objects.equals(this.courseTitle, courseBody.courseTitle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(courseTitle);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CourseBody {\n");
    
    sb.append("    courseTitle: ").append(toIndentedString(courseTitle)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
