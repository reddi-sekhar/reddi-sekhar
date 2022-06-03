package jp.co.ana.cas.b18.connector.commandcryptic.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.commandcryptic.vo.MessageFunctionDetails1;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * MessageAction
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T19:01:00.408185400+05:30[Asia/Calcutta]")
public class MessageAction   {
  @JsonProperty("messageFunctionDetails")
  private MessageFunctionDetails1 messageFunctionDetails;

  @JsonProperty("responseType")
  private String responseType;

  public MessageAction messageFunctionDetails(MessageFunctionDetails1 messageFunctionDetails) {
    this.messageFunctionDetails = messageFunctionDetails;
    return this;
  }

  /**
   * Get messageFunctionDetails
   * @return messageFunctionDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public MessageFunctionDetails1 getMessageFunctionDetails() {
    return messageFunctionDetails;
  }

  public void setMessageFunctionDetails(MessageFunctionDetails1 messageFunctionDetails) {
    this.messageFunctionDetails = messageFunctionDetails;
  }

  public MessageAction responseType(String responseType) {
    this.responseType = responseType;
    return this;
  }

  /**
   * Get responseType
   * @return responseType
  */
  @ApiModelProperty(value = "")


  public String getResponseType() {
    return responseType;
  }

  public void setResponseType(String responseType) {
    this.responseType = responseType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageAction messageAction = (MessageAction) o;
    return Objects.equals(this.messageFunctionDetails, messageAction.messageFunctionDetails) &&
        Objects.equals(this.responseType, messageAction.responseType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messageFunctionDetails, responseType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageAction {\n");
    
    sb.append("    messageFunctionDetails: ").append(toIndentedString(messageFunctionDetails)).append("\n");
    sb.append("    responseType: ").append(toIndentedString(responseType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

