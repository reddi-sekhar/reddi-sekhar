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
 * OriginIdentificationResponseDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class OriginIdentificationResponseDto   {
  @JsonProperty("inHouseIdentification1")
  private String inHouseIdentification1;

  public OriginIdentificationResponseDto inHouseIdentification1(String inHouseIdentification1) {
    this.inHouseIdentification1 = inHouseIdentification1;
    return this;
  }

  /**
   * Office ID of the PNR owner.
   * @return inHouseIdentification1
  */
  @ApiModelProperty(example = "TYONH0111", value = "Office ID of the PNR owner.")

@Size(min=1,max=9) 
  public String getInHouseIdentification1() {
    return inHouseIdentification1;
  }

  public void setInHouseIdentification1(String inHouseIdentification1) {
    this.inHouseIdentification1 = inHouseIdentification1;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OriginIdentificationResponseDto originIdentificationResponseDto = (OriginIdentificationResponseDto) o;
    return Objects.equals(this.inHouseIdentification1, originIdentificationResponseDto.inHouseIdentification1);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inHouseIdentification1);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OriginIdentificationResponseDto {\n");
    
    sb.append("    inHouseIdentification1: ").append(toIndentedString(inHouseIdentification1)).append("\n");
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

