package jp.co.ana.cas.b18.connector.commandcryptic.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * MessageFunctionDetails1
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T19:01:00.408185400+05:30[Asia/Calcutta]")
public class MessageFunctionDetails1   {
  @JsonProperty("additionalMessageFunction")
  @Valid
  private List<String> additionalMessageFunction = null;

  @JsonProperty("businessFunction")
  private String businessFunction;

  @JsonProperty("messageFunction")
  private String messageFunction;

  public MessageFunctionDetails1 additionalMessageFunction(List<String> additionalMessageFunction) {
    this.additionalMessageFunction = additionalMessageFunction;
    return this;
  }

  public MessageFunctionDetails1 addAdditionalMessageFunctionItem(String additionalMessageFunctionItem) {
    if (this.additionalMessageFunction == null) {
      this.additionalMessageFunction = new ArrayList<>();
    }
    this.additionalMessageFunction.add(additionalMessageFunctionItem);
    return this;
  }

  /**
   * Get additionalMessageFunction
   * @return additionalMessageFunction
  */
  @ApiModelProperty(value = "")


  public List<String> getAdditionalMessageFunction() {
    return additionalMessageFunction;
  }

  public void setAdditionalMessageFunction(List<String> additionalMessageFunction) {
    this.additionalMessageFunction = additionalMessageFunction;
  }

  public MessageFunctionDetails1 businessFunction(String businessFunction) {
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

  public MessageFunctionDetails1 messageFunction(String messageFunction) {
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
    MessageFunctionDetails1 messageFunctionDetails1 = (MessageFunctionDetails1) o;
    return Objects.equals(this.additionalMessageFunction, messageFunctionDetails1.additionalMessageFunction) &&
        Objects.equals(this.businessFunction, messageFunctionDetails1.businessFunction) &&
        Objects.equals(this.messageFunction, messageFunctionDetails1.messageFunction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalMessageFunction, businessFunction, messageFunction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageFunctionDetails1 {\n");
    
    sb.append("    additionalMessageFunction: ").append(toIndentedString(additionalMessageFunction)).append("\n");
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

