package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * HotelUniqueIdType47769C
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class HotelUniqueIdType47769C   {
  @JsonProperty("hotelCode")
  private String hotelCode;

  public HotelUniqueIdType47769C hotelCode(String hotelCode) {
    this.hotelCode = hotelCode;
    return this;
  }

  /**
   * Get hotelCode
   * @return hotelCode
  */
  @ApiModelProperty(value = "")


  public String getHotelCode() {
    return hotelCode;
  }

  public void setHotelCode(String hotelCode) {
    this.hotelCode = hotelCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HotelUniqueIdType47769C hotelUniqueIdType47769C = (HotelUniqueIdType47769C) o;
    return Objects.equals(this.hotelCode, hotelUniqueIdType47769C.hotelCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hotelCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HotelUniqueIdType47769C {\n");
    
    sb.append("    hotelCode: ").append(toIndentedString(hotelCode)).append("\n");
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

