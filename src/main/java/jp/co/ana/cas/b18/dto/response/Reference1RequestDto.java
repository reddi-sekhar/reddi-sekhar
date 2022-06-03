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
 * Reference1RequestDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class Reference1RequestDto   {
  @JsonProperty("number")
  private String number;

  @JsonProperty("qualifier")
  private String qualifier;

  public Reference1RequestDto number(String number) {
    this.number = number;
    return this;
  }

  /**
   * refers to a PNR segment/element
   * @return number
  */
  @ApiModelProperty(required = true, value = "refers to a PNR segment/element")
  @NotNull

@Size(min=1,max=5) 
  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public Reference1RequestDto qualifier(String qualifier) {
    this.qualifier = qualifier;
    return this;
  }

  /**
   * Qualifier
   * @return qualifier
  */
  @ApiModelProperty(required = true, value = "Qualifier")
  @NotNull

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
    Reference1RequestDto reference1RequestDto = (Reference1RequestDto) o;
    return Objects.equals(this.number, reference1RequestDto.number) &&
        Objects.equals(this.qualifier, reference1RequestDto.qualifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(number, qualifier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Reference1RequestDto {\n");
    
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

