package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.*;

/**
 * User
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-01T16:56:33.976Z")

@Entity
@Table(name = "user", uniqueConstraints = { @UniqueConstraint(columnNames = { "mkNumber", "userName" })})
public class User {

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	@JsonProperty("id")
	private Long id;
	
	@NotNull(message="Please enter firstname.")
	@JsonProperty("firstName")
	private String firstName = null;

	@NotNull(message="Please enter surName.")
	@JsonProperty("surName")
	private String surName = null;

	@NotNull(message="Please enter userName.")
	@JsonProperty("userName")
	private String userName = null;
	
	@NotNull(message="Please enter password.")
	@JsonProperty("password")
	private String password = null;

	@NotNull(message="Please enter mkNumber.")
	@JsonProperty("mkNumber")
	private String mkNumber = null;

	@NotNull(message="Please enter isFemale.")
	@JsonProperty("isFemale")
	private Boolean isFemale = false;

	@NotNull(message="Please enter isStudent.")
	@JsonProperty("isStudent")
	private Boolean isStudent = false;

	/*Default constructor necessary for hibernate*/
	public User() {}
	
	public User(String firstName, String surName, String userName, String password, String mkNumber, Boolean isFemale,
			Boolean isStudent) {
		setFirstName(firstName);
		setSurName(surName);
		setUserName(userName);
		setPassword(password);
		setMkNumber(mkNumber);
		setIsFemale(isFemale);
		setIsStudent(isStudent);
	}

	public User firstName(String firstName) {
		this.firstName = firstName;
		return this;
	}

	/**
	 * Get firstName
	 * 
	 * @return firstName
	 **/
	@ApiModelProperty(example = "Wolfgang", value = "")

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public User surName(String surName) {
		this.surName = surName;
		return this;
	}

	/**
	 * Get surName
	 * 
	 * @return surName
	 **/
	@ApiModelProperty(example = "Heindl", value = "")

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public User userName(String userName) {
		this.userName = userName;
		return this;
	}

	/**
	 * Get userName
	 * 
	 * @return userName
	 **/
	@ApiModelProperty(example = "Wolfi", value = "")

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public User mkNumber(String mkNumber) {
		this.mkNumber = mkNumber;
		return this;
	}
	
	/**
	 * Get mkNumber
	 * 
	 * @return mkNumber
	 **/
	@ApiModelProperty(example = "MyPassword", value = "")

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * Get mkNumber
	 * 
	 * @return mkNumber
	 **/
	@ApiModelProperty(example = "K12345678", value = "")

	public String getMkNumber() {
		return mkNumber;
	}

	public void setMkNumber(String mkNumber) {
		this.mkNumber = mkNumber;
	}

	public User isFemale(Boolean isFemale) {
		this.isFemale = isFemale;
		return this;
	}

	/**
	 * Get isFemale
	 * 
	 * @return isFemale
	 **/
	@ApiModelProperty(example = "false", value = "")

	public Boolean isIsFemale() {
		return isFemale;
	}

	public void setIsFemale(Boolean isFemale) {
		this.isFemale = isFemale;
	}

	public User isStudent(Boolean isStudent) {
		this.isStudent = isStudent;
		return this;
	}

	/**
	 * Get isStudent
	 * 
	 * @return isStudent
	 **/
	@ApiModelProperty(example = "false", value = "")

	public Boolean isIsStudent() {
		return isStudent;
	}

	public void setIsStudent(Boolean isStudent) {
		this.isStudent = isStudent;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		User user = (User) o;
		return Objects.equals(this.firstName, user.firstName) && Objects.equals(this.surName, user.surName)
				&& Objects.equals(this.userName, user.userName) && Objects.equals(this.password, user.password) 
				&& Objects.equals(this.mkNumber, user.mkNumber)
				&& Objects.equals(this.isFemale, user.isFemale) && Objects.equals(this.isStudent, user.isStudent);
	}

	@Override
	public int hashCode() {
		return Objects.hash(firstName, surName, userName, password, mkNumber, isFemale, isStudent);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class User {\n");

		sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
		sb.append("    surName: ").append(toIndentedString(surName)).append("\n");
		sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
		sb.append("    password: ").append(toIndentedString(password)).append("\n");
		sb.append("    mkNumber: ").append(toIndentedString(mkNumber)).append("\n");
		sb.append("    isFemale: ").append(toIndentedString(isFemale)).append("\n");
		sb.append("    isStudent: ").append(toIndentedString(isStudent)).append("\n");
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
