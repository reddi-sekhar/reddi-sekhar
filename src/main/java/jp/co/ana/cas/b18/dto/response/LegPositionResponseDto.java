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
 * LegPositionResponseDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class LegPositionResponseDto   {
  @JsonProperty("itemNumber")
  private Long itemNumber;

  public LegPositionResponseDto itemNumber(Long itemNumber) {
    this.itemNumber = itemNumber;
    return this;
  }

  /**
   * The sequence number indentifying the position of a leg in a booking
   * @return itemNumber
  */
  @ApiModelProperty(example = "1", value = "The sequence number indentifying the position of a leg in a booking")


  public Long getItemNumber() {
    return itemNumber;
  }

  public void setItemNumber(Long itemNumber) {
    this.itemNumber = itemNumber;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LegPositionResponseDto legPositionResponseDto = (LegPositionResponseDto) o;
    return Objects.equals(this.itemNumber, legPositionResponseDto.itemNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LegPositionResponseDto {\n");
    
    sb.append("    itemNumber: ").append(toIndentedString(itemNumber)).append("\n");
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

