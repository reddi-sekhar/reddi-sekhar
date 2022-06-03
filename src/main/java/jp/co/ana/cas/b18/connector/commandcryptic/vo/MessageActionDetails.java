package jp.co.ana.cas.b18.connector.commandcryptic.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.commandcryptic.vo.MessageFunctionDetails;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * MessageActionDetails
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T19:01:00.408185400+05:30[Asia/Calcutta]")
public class MessageActionDetails   {
  @JsonProperty("messageFunctionDetails")
  private MessageFunctionDetails messageFunctionDetails;

  @JsonProperty("responseType")
  private String responseType;

  public MessageActionDetails messageFunctionDetails(MessageFunctionDetails messageFunctionDetails) {
    this.messageFunctionDetails = messageFunctionDetails;
    return this;
  }

  /**
   * Get messageFunctionDetails
   * @return messageFunctionDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public MessageFunctionDetails getMessageFunctionDetails() {
    return messageFunctionDetails;
  }

  public void setMessageFunctionDetails(MessageFunctionDetails messageFunctionDetails) {
    this.messageFunctionDetails = messageFunctionDetails;
  }

  public MessageActionDetails responseType(String responseType) {
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
    MessageActionDetails messageActionDetails = (MessageActionDetails) o;
    return Objects.equals(this.messageFunctionDetails, messageActionDetails.messageFunctionDetails) &&
        Objects.equals(this.responseType, messageActionDetails.responseType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messageFunctionDetails, responseType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageActionDetails {\n");
    
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

