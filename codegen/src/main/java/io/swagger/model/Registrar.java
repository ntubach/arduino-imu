package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Registrar
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-10-21T05:34:25.338932692Z[GMT]")


public class Registrar   {
  @JsonProperty("courseNumber")
  private Integer courseNumber = null;

  @JsonProperty("studentIdList")
  @Valid
  private List<Integer> studentIdList = null;

  public Registrar courseNumber(Integer courseNumber) {
    this.courseNumber = courseNumber;
    return this;
  }

  /**
   * Get courseNumber
   * @return courseNumber
   **/
  @Schema(description = "")
  
    public Integer getCourseNumber() {
    return courseNumber;
  }

  public void setCourseNumber(Integer courseNumber) {
    this.courseNumber = courseNumber;
  }

  public Registrar studentIdList(List<Integer> studentIdList) {
    this.studentIdList = studentIdList;
    return this;
  }

  public Registrar addStudentIdListItem(Integer studentIdListItem) {
    if (this.studentIdList == null) {
      this.studentIdList = new ArrayList<Integer>();
    }
    this.studentIdList.add(studentIdListItem);
    return this;
  }

  /**
   * Get studentIdList
   * @return studentIdList
   **/
  @Schema(description = "")
  
    public List<Integer> getStudentIdList() {
    return studentIdList;
  }

  public void setStudentIdList(List<Integer> studentIdList) {
    this.studentIdList = studentIdList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Registrar registrar = (Registrar) o;
    return Objects.equals(this.courseNumber, registrar.courseNumber) &&
        Objects.equals(this.studentIdList, registrar.studentIdList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(courseNumber, studentIdList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Registrar {\n");
    
    sb.append("    courseNumber: ").append(toIndentedString(courseNumber)).append("\n");
    sb.append("    studentIdList: ").append(toIndentedString(studentIdList)).append("\n");
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
