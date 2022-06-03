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
 * RegradeCabinResponseDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class RegradeCabinResponseDto   {
  @JsonProperty("cabinCode")
  private String cabinCode;

  public RegradeCabinResponseDto cabinCode(String cabinCode) {
    this.cabinCode = cabinCode;
    return this;
  }

  /**
   * Cabin class designator
   * @return cabinCode
  */
  @ApiModelProperty(example = "Y", value = "Cabin class designator")

@Size(min=1,max=1) 
  public String getCabinCode() {
    return cabinCode;
  }

  public void setCabinCode(String cabinCode) {
    this.cabinCode = cabinCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegradeCabinResponseDto regradeCabinResponseDto = (RegradeCabinResponseDto) o;
    return Objects.equals(this.cabinCode, regradeCabinResponseDto.cabinCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cabinCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegradeCabinResponseDto {\n");
    
    sb.append("    cabinCode: ").append(toIndentedString(cabinCode)).append("\n");
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

