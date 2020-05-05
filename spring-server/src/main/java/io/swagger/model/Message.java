package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Message
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-04-19T11:38:27.027Z")

@Entity
@Table(name = "messages")
@JsonRootName("Message")

public class Message   {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("content")
  private String content = null;

  @JsonProperty("senderusersId")
  private Integer senderusersId = null;

  @JsonProperty("receiverusersId")
  private Integer receiverusersId = null;

  public Message id(Integer id) {
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

  public Message content(String content) {
    this.content = content;
    return this;
  }

  /**
   * Get content
   * @return content
  **/
  @ApiModelProperty(value = "")


  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public Message senderusersId(Integer senderusersId) {
    this.senderusersId = senderusersId;
    return this;
  }

  /**
   * Get senderusersId
   * @return senderusersId
  **/
  @ApiModelProperty(value = "")


  public Integer getSenderusersId() {
    return senderusersId;
  }

  public void setSenderusersId(Integer senderusersId) {
    this.senderusersId = senderusersId;
  }

  public Message receiverusersId(Integer receiverusersId) {
    this.receiverusersId = receiverusersId;
    return this;
  }

  /**
   * Get receiverusersId
   * @return receiverusersId
  **/
  @ApiModelProperty(value = "")


  public Integer getReceiverusersId() {
    return receiverusersId;
  }

  public void setReceiverusersId(Integer receiverusersId) {
    this.receiverusersId = receiverusersId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Message message = (Message) o;
    return Objects.equals(this.id, message.id) &&
        Objects.equals(this.content, message.content) &&
        Objects.equals(this.senderusersId, message.senderusersId) &&
        Objects.equals(this.receiverusersId, message.receiverusersId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, content, senderusersId, receiverusersId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Message {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    senderusersId: ").append(toIndentedString(senderusersId)).append("\n");
    sb.append("    receiverusersId: ").append(toIndentedString(receiverusersId)).append("\n");
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

