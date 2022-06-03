package jp.co.ana.cas.b18.connector.commandcryptic.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * MessageFunctionDetails
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T19:01:00.408185400+05:30[Asia/Calcutta]")
public class MessageFunctionDetails   {
  @JsonProperty("businessFunction")
  private String businessFunction;

  @JsonProperty("messageFunction")
  private String messageFunction;

  public MessageFunctionDetails businessFunction(String businessFunction) {
    this.businessFunction = businessFunction;
    return this;
  }

  /**
   * Get businessFunction
   * @return businessFunction
  */
  @ApiModelProperty(value = "")


  public String getBusinessFunction() {
    return businessFunction;
  }

  public void setBusinessFunction(String businessFunction) {
    this.businessFunction = businessFunction;
  }

  public MessageFunctionDetails messageFunction(String messageFunction) {
    this.messageFunction = messageFunction;
    return this;
  }

  /**
   * Get messageFunction
   * @return messageFunction
  */
  @ApiModelProperty(value = "")


  public String getMessageFunction() {
    return messageFunction;
  }

  public void setMessageFunction(String messageFunction) {
    this.messageFunction = messageFunction;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageFunctionDetails messageFunctionDetails = (MessageFunctionDetails) o;
    return Objects.equals(this.businessFunction, messageFunctionDetails.businessFunction) &&
        Objects.equals(this.messageFunction, messageFunctionDetails.messageFunction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(businessFunction, messageFunction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageFunctionDetails {\n");
    
    sb.append("    businessFunction: ").append(toIndentedString(businessFunction)).append("\n");
    sb.append("    messageFunction: ").append(toIndentedString(messageFunction)).append("\n");
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

