package jp.co.ana.cas.b18.dto.response;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.dto.response.MessageFunctionBusinesRequestDto;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * MessageActionRequestDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class MessageActionRequestDto   {
  @JsonProperty("business")
  private MessageFunctionBusinesRequestDto business;

  public MessageActionRequestDto business(MessageFunctionBusinesRequestDto business) {
    this.business = business;
    return this;
  }

  /**
   * Get business
   * @return business
  */
  @ApiModelProperty(value = "")

  @Valid

  public MessageFunctionBusinesRequestDto getBusiness() {
    return business;
  }

  public void setBusiness(MessageFunctionBusinesRequestDto business) {
    this.business = business;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageActionRequestDto messageActionRequestDto = (MessageActionRequestDto) o;
    return Objects.equals(this.business, messageActionRequestDto.business);
  }

  @Override
  public int hashCode() {
    return Objects.hash(business);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageActionRequestDto {\n");
    
    sb.append("    business: ").append(toIndentedString(business)).append("\n");
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

