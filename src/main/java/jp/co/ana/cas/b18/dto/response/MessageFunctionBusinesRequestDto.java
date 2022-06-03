package jp.co.ana.cas.b18.dto.response;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * MessageFunctionBusinesRequestDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class MessageFunctionBusinesRequestDto   {
  @JsonProperty("function")
  private String function;

  public MessageFunctionBusinesRequestDto function(String function) {
    this.function = function;
    return this;
  }

  /**
   * Message Function
   * @return function
  */
  @ApiModelProperty(required = true, value = "Message Function")
  @NotNull

@Size(min=1,max=3) 
  public String getFunction() {
    return function;
  }

  public void setFunction(String function) {
    this.function = function;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageFunctionBusinesRequestDto messageFunctionBusinesRequestDto = (MessageFunctionBusinesRequestDto) o;
    return Objects.equals(this.function, messageFunctionBusinesRequestDto.function);
  }

  @Override
  public int hashCode() {
    return Objects.hash(function);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageFunctionBusinesRequestDto {\n");
    
    sb.append("    function: ").append(toIndentedString(function)).append("\n");
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

