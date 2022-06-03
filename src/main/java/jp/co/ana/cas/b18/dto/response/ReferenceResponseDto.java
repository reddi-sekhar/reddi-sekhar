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
 * ReferenceResponseDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class ReferenceResponseDto   {
  @JsonProperty("number")
  private Long number;

  @JsonProperty("qualifier")
  private String qualifier;

  public ReferenceResponseDto number(Long number) {
    this.number = number;
    return this;
  }

  /**
   * Number attributed by the Server to reference the shopping basket item.
   * @return number
  */
  @ApiModelProperty(example = "2", value = "Number attributed by the Server to reference the shopping basket item.")


  public Long getNumber() {
    return number;
  }

  public void setNumber(Long number) {
    this.number = number;
  }

  public ReferenceResponseDto qualifier(String qualifier) {
    this.qualifier = qualifier;
    return this;
  }

  /**
   * Number attributed by the Server to reference the shopping basket item.
   * @return qualifier
  */
  @ApiModelProperty(value = "Number attributed by the Server to reference the shopping basket item.")

@Size(min=1,max=3) 
  public String getQualifier() {
    return qualifier;
  }

  public void setQualifier(String qualifier) {
    this.qualifier = qualifier;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReferenceResponseDto referenceResponseDto = (ReferenceResponseDto) o;
    return Objects.equals(this.number, referenceResponseDto.number) &&
        Objects.equals(this.qualifier, referenceResponseDto.qualifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(number, qualifier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReferenceResponseDto {\n");
    
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    qualifier: ").append(toIndentedString(qualifier)).append("\n");
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

