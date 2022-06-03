package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.HotelUniqueIdType47769C;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * HotelPropertyType26378S
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class HotelPropertyType26378S   {
  @JsonProperty("hotelReference")
  private HotelUniqueIdType47769C hotelReference;

  public HotelPropertyType26378S hotelReference(HotelUniqueIdType47769C hotelReference) {
    this.hotelReference = hotelReference;
    return this;
  }

  /**
   * Get hotelReference
   * @return hotelReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public HotelUniqueIdType47769C getHotelReference() {
    return hotelReference;
  }

  public void setHotelReference(HotelUniqueIdType47769C hotelReference) {
    this.hotelReference = hotelReference;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HotelPropertyType26378S hotelPropertyType26378S = (HotelPropertyType26378S) o;
    return Objects.equals(this.hotelReference, hotelPropertyType26378S.hotelReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hotelReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HotelPropertyType26378S {\n");
    
    sb.append("    hotelReference: ").append(toIndentedString(hotelReference)).append("\n");
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

