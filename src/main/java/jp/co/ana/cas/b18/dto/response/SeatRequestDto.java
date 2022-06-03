package jp.co.ana.cas.b18.dto.response;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.dto.response.SpecialSeatRequestDto;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SeatRequestDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class SeatRequestDto   {
  @JsonProperty("special")
  @Valid
  private List<SpecialSeatRequestDto> special = null;

  public SeatRequestDto special(List<SpecialSeatRequestDto> special) {
    this.special = special;
    return this;
  }

  public SeatRequestDto addSpecialItem(SpecialSeatRequestDto specialItem) {
    if (this.special == null) {
      this.special = new ArrayList<>();
    }
    this.special.add(specialItem);
    return this;
  }

  /**
   * Get special
   * @return special
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<SpecialSeatRequestDto> getSpecial() {
    return special;
  }

  public void setSpecial(List<SpecialSeatRequestDto> special) {
    this.special = special;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SeatRequestDto seatRequestDto = (SeatRequestDto) o;
    return Objects.equals(this.special, seatRequestDto.special);
  }

  @Override
  public int hashCode() {
    return Objects.hash(special);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SeatRequestDto {\n");
    
    sb.append("    special: ").append(toIndentedString(special)).append("\n");
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

