package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Body
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-04-19T11:38:27.027Z")

public class Body   {
  @JsonProperty("content")
  private String content = null;

  @JsonProperty("receiverusersId")
  private Integer receiverusersId = null;

  @JsonProperty("offerId")
  private Integer offerId = null;

  public Body content(String content) {
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

  public Body receiverusersId(Integer receiverusersId) {
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

  public Body offerId(Integer offerId) {
    this.offerId = offerId;
    return this;
  }

  /**
   * Get offerId
   * @return offerId
  **/
  @ApiModelProperty(value = "")


  public Integer getOfferId() {
    return offerId;
  }

  public void setOfferId(Integer offerId) {
    this.offerId = offerId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Body body = (Body) o;
    return Objects.equals(this.content, body.content) &&
        Objects.equals(this.receiverusersId, body.receiverusersId) &&
        Objects.equals(this.offerId, body.offerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, receiverusersId, offerId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Body {\n");
    
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    receiverusersId: ").append(toIndentedString(receiverusersId)).append("\n");
    sb.append("    offerId: ").append(toIndentedString(offerId)).append("\n");
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

