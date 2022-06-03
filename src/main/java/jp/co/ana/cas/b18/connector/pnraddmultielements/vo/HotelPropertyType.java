package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.HotelUniqueIdType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * HotelPropertyType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class HotelPropertyType   {
  @JsonProperty("fireSafetyIndicator")
  private String fireSafetyIndicator;

  @JsonProperty("hotelName")
  private String hotelName;

  @JsonProperty("hotelReference")
  private HotelUniqueIdType hotelReference;

  public HotelPropertyType fireSafetyIndicator(String fireSafetyIndicator) {
    this.fireSafetyIndicator = fireSafetyIndicator;
    return this;
  }

  /**
   * Get fireSafetyIndicator
   * @return fireSafetyIndicator
  */
  @ApiModelProperty(value = "")


  public String getFireSafetyIndicator() {
    return fireSafetyIndicator;
  }

  public void setFireSafetyIndicator(String fireSafetyIndicator) {
    this.fireSafetyIndicator = fireSafetyIndicator;
  }

  public HotelPropertyType hotelName(String hotelName) {
    this.hotelName = hotelName;
    return this;
  }

  /**
   * Get hotelName
   * @return hotelName
  */
  @ApiModelProperty(value = "")


  public String getHotelName() {
    return hotelName;
  }

  public void setHotelName(String hotelName) {
    this.hotelName = hotelName;
  }

  public HotelPropertyType hotelReference(HotelUniqueIdType hotelReference) {
    this.hotelReference = hotelReference;
    return this;
  }

  /**
   * Get hotelReference
   * @return hotelReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public HotelUniqueIdType getHotelReference() {
    return hotelReference;
  }

  public void setHotelReference(HotelUniqueIdType hotelReference) {
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
    HotelPropertyType hotelPropertyType = (HotelPropertyType) o;
    return Objects.equals(this.fireSafetyIndicator, hotelPropertyType.fireSafetyIndicator) &&
        Objects.equals(this.hotelName, hotelPropertyType.hotelName) &&
        Objects.equals(this.hotelReference, hotelPropertyType.hotelReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fireSafetyIndicator, hotelName, hotelReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HotelPropertyType {\n");
    
    sb.append("    fireSafetyIndicator: ").append(toIndentedString(fireSafetyIndicator)).append("\n");
    sb.append("    hotelName: ").append(toIndentedString(hotelName)).append("\n");
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

