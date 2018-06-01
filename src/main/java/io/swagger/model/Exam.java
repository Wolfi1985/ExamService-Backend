package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Exam
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-01T16:56:33.976Z")

public class Exam   {
  @JsonProperty("examId")
  private String examId = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("shortType")
  private String shortType = null;

  @JsonProperty("semester")
  private String semester = null;

  @JsonProperty("maxParticipants")
  private Integer maxParticipants = null;

  @JsonProperty("enrollments")
  private Integer enrollments = null;

  @JsonProperty("enrollmentStart")
  private OffsetDateTime enrollmentStart = null;

  @JsonProperty("enrollmentEnd")
  private OffsetDateTime enrollmentEnd = null;

  @JsonProperty("examDate")
  private OffsetDateTime examDate = null;

  @JsonProperty("examStart")
  private OffsetDateTime examStart = null;

  @JsonProperty("examEnd")
  private OffsetDateTime examEnd = null;

  public Exam examId(String examId) {
    this.examId = examId;
    return this;
  }

   /**
   * Get examId
   * @return examId
  **/
  @ApiModelProperty(example = "259.028", value = "")


  public String getExamId() {
    return examId;
  }

  public void setExamId(String examId) {
    this.examId = examId;
  }

  public Exam title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @ApiModelProperty(example = "Service Engineering", value = "")


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Exam type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(example = "Vorlesung", value = "")


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Exam shortType(String shortType) {
    this.shortType = shortType;
    return this;
  }

   /**
   * Get shortType
   * @return shortType
  **/
  @ApiModelProperty(example = "VL", value = "")


  public String getShortType() {
    return shortType;
  }

  public void setShortType(String shortType) {
    this.shortType = shortType;
  }

  public Exam semester(String semester) {
    this.semester = semester;
    return this;
  }

   /**
   * Get semester
   * @return semester
  **/
  @ApiModelProperty(example = "2018", value = "")


  public String getSemester() {
    return semester;
  }

  public void setSemester(String semester) {
    this.semester = semester;
  }

  public Exam maxParticipants(Integer maxParticipants) {
    this.maxParticipants = maxParticipants;
    return this;
  }

   /**
   * Get maxParticipants
   * @return maxParticipants
  **/
  @ApiModelProperty(example = "100", value = "")


  public Integer getMaxParticipants() {
    return maxParticipants;
  }

  public void setMaxParticipants(Integer maxParticipants) {
    this.maxParticipants = maxParticipants;
  }

  public Exam enrollments(Integer enrollments) {
    this.enrollments = enrollments;
    return this;
  }

   /**
   * Get enrollments
   * @return enrollments
  **/
  @ApiModelProperty(example = "8", value = "")


  public Integer getEnrollments() {
    return enrollments;
  }

  public void setEnrollments(Integer enrollments) {
    this.enrollments = enrollments;
  }

  public Exam enrollmentStart(OffsetDateTime enrollmentStart) {
    this.enrollmentStart = enrollmentStart;
    return this;
  }

   /**
   * Get enrollmentStart
   * @return enrollmentStart
  **/
  @ApiModelProperty(example = "20.05.2018", value = "")

  @Valid

  public OffsetDateTime getEnrollmentStart() {
    return enrollmentStart;
  }

  public void setEnrollmentStart(OffsetDateTime enrollmentStart) {
    this.enrollmentStart = enrollmentStart;
  }

  public Exam enrollmentEnd(OffsetDateTime enrollmentEnd) {
    this.enrollmentEnd = enrollmentEnd;
    return this;
  }

   /**
   * Get enrollmentEnd
   * @return enrollmentEnd
  **/
  @ApiModelProperty(example = "15.06.2018", value = "")

  @Valid

  public OffsetDateTime getEnrollmentEnd() {
    return enrollmentEnd;
  }

  public void setEnrollmentEnd(OffsetDateTime enrollmentEnd) {
    this.enrollmentEnd = enrollmentEnd;
  }

  public Exam examDate(OffsetDateTime examDate) {
    this.examDate = examDate;
    return this;
  }

   /**
   * Get examDate
   * @return examDate
  **/
  @ApiModelProperty(example = "18.06.2018", value = "")

  @Valid

  public OffsetDateTime getExamDate() {
    return examDate;
  }

  public void setExamDate(OffsetDateTime examDate) {
    this.examDate = examDate;
  }

  public Exam examStart(OffsetDateTime examStart) {
    this.examStart = examStart;
    return this;
  }

   /**
   * Get examStart
   * @return examStart
  **/
  @ApiModelProperty(example = "15:00", value = "")

  @Valid

  public OffsetDateTime getExamStart() {
    return examStart;
  }

  public void setExamStart(OffsetDateTime examStart) {
    this.examStart = examStart;
  }

  public Exam examEnd(OffsetDateTime examEnd) {
    this.examEnd = examEnd;
    return this;
  }

   /**
   * Get examEnd
   * @return examEnd
  **/
  @ApiModelProperty(example = "16:00", value = "")

  @Valid

  public OffsetDateTime getExamEnd() {
    return examEnd;
  }

  public void setExamEnd(OffsetDateTime examEnd) {
    this.examEnd = examEnd;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Exam exam = (Exam) o;
    return Objects.equals(this.examId, exam.examId) &&
        Objects.equals(this.title, exam.title) &&
        Objects.equals(this.type, exam.type) &&
        Objects.equals(this.shortType, exam.shortType) &&
        Objects.equals(this.semester, exam.semester) &&
        Objects.equals(this.maxParticipants, exam.maxParticipants) &&
        Objects.equals(this.enrollments, exam.enrollments) &&
        Objects.equals(this.enrollmentStart, exam.enrollmentStart) &&
        Objects.equals(this.enrollmentEnd, exam.enrollmentEnd) &&
        Objects.equals(this.examDate, exam.examDate) &&
        Objects.equals(this.examStart, exam.examStart) &&
        Objects.equals(this.examEnd, exam.examEnd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(examId, title, type, shortType, semester, maxParticipants, enrollments, enrollmentStart, enrollmentEnd, examDate, examStart, examEnd);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Exam {\n");
    
    sb.append("    examId: ").append(toIndentedString(examId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    shortType: ").append(toIndentedString(shortType)).append("\n");
    sb.append("    semester: ").append(toIndentedString(semester)).append("\n");
    sb.append("    maxParticipants: ").append(toIndentedString(maxParticipants)).append("\n");
    sb.append("    enrollments: ").append(toIndentedString(enrollments)).append("\n");
    sb.append("    enrollmentStart: ").append(toIndentedString(enrollmentStart)).append("\n");
    sb.append("    enrollmentEnd: ").append(toIndentedString(enrollmentEnd)).append("\n");
    sb.append("    examDate: ").append(toIndentedString(examDate)).append("\n");
    sb.append("    examStart: ").append(toIndentedString(examStart)).append("\n");
    sb.append("    examEnd: ").append(toIndentedString(examEnd)).append("\n");
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

