package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.validation.Valid;
import javax.validation.constraints.*;
import javax.persistence.Id;
/**
 * Doctor
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-04-19T11:38:27.027Z")


@Table(name = "doctors")
@JsonRootName("Doctor")
@Entity
public class Doctor   {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("Doctorname")
  private String Doctorname = null;

  @JsonProperty("firstName")
  private String firstName = null;

  @JsonProperty("lastName")
  private String lastName = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("password")
  private String password = null;

  @JsonProperty("phone")
  private String phone = null;

  @JsonProperty("avatarUrl")
  private String avatarUrl = null;

  @JsonProperty("Doctorvotes")
  private Integer Doctorvotes = null;

  public Doctor id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Doctor Doctorname(String Doctorname) {
    this.Doctorname = Doctorname;
    return this;
  }


  @ApiModelProperty(value = "")


  public String getDoctorname() {
    return Doctorname;
  }

  public void setDoctorname(String Doctorname) {
    this.Doctorname = Doctorname;
  }

  public Doctor firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Get firstName
   * @return firstName
  **/
  @ApiModelProperty(value = "")


  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public Doctor lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Get lastName
   * @return lastName
  **/
  @ApiModelProperty(value = "")


  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Doctor email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(value = "")


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Doctor password(String password) {
    this.password = password;
    return this;
  }

  /**
   * Get password
   * @return password
  **/
  @ApiModelProperty(value = "")


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public Doctor phone(String phone) {
    this.phone = phone;
    return this;
  }

  /**
   * Get phone
   * @return phone
  **/
  @ApiModelProperty(value = "")


  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public Doctor avatarUrl(String avatarUrl) {
    this.avatarUrl = avatarUrl;
    return this;
  }

  /**
   * Get avatarUrl
   * @return avatarUrl
  **/
  @ApiModelProperty(value = "")


  public String getAvatarUrl() {
    return avatarUrl;
  }

  public void setAvatarUrl(String avatarUrl) {
    this.avatarUrl = avatarUrl;
  }

  public Doctor Doctorvotes(Integer Doctorvotes) {
    this.Doctorvotes = Doctorvotes;
    return this;
  }

  /**
   * Doctor Number of votes
   * @return Doctorvotes
  **/
  @ApiModelProperty(value = "Doctor Number of votes")


  public Integer getDoctorvotes() {
    return Doctorvotes;
  }

  public void setDoctorvotes(Integer Doctorvotes) {
    this.Doctorvotes = Doctorvotes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Doctor doctor = (Doctor) o;
    return Objects.equals(this.id, doctor.id) &&
        Objects.equals(this.Doctorname, doctor.Doctorname) &&
        Objects.equals(this.firstName, doctor.firstName) &&
        Objects.equals(this.lastName, doctor.lastName) &&
        Objects.equals(this.email, doctor.email) &&
        Objects.equals(this.password, doctor.password) &&
        Objects.equals(this.phone, doctor.phone) &&
        Objects.equals(this.avatarUrl, doctor.avatarUrl) &&
        Objects.equals(this.Doctorvotes, doctor.Doctorvotes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, Doctorname, firstName, lastName, email, password, phone, avatarUrl, Doctorvotes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Doctor {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    Doctorname: ").append(toIndentedString(Doctorname)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    avatarUrl: ").append(toIndentedString(avatarUrl)).append("\n");
    sb.append("    Doctorvotes: ").append(toIndentedString(Doctorvotes)).append("\n");
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

