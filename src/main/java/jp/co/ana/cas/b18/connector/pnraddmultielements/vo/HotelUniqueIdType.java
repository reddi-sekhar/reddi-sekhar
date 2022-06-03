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
 * HotelUniqueIdType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class HotelUniqueIdType   {
  @JsonProperty("chainCode")
  private String chainCode;

  @JsonProperty("cityCode")
  private String cityCode;

  @JsonProperty("hotelCode")
  private String hotelCode;

  public HotelUniqueIdType chainCode(String chainCode) {
    this.chainCode = chainCode;
    return this;
  }

  /**
   * Get chainCode
   * @return chainCode
  */
  @ApiModelProperty(value = "")


  public String getChainCode() {
    return chainCode;
  }

  public void setChainCode(String chainCode) {
    this.chainCode = chainCode;
  }

  public HotelUniqueIdType cityCode(String cityCode) {
    this.cityCode = cityCode;
    return this;
  }

  /**
   * Get cityCode
   * @return cityCode
  */
  @ApiModelProperty(value = "")


  public String getCityCode() {
    return cityCode;
  }

  public void setCityCode(String cityCode) {
    this.cityCode = cityCode;
  }

  public HotelUniqueIdType hotelCode(String hotelCode) {
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
    HotelUniqueIdType hotelUniqueIdType = (HotelUniqueIdType) o;
    return Objects.equals(this.chainCode, hotelUniqueIdType.chainCode) &&
        Objects.equals(this.cityCode, hotelUniqueIdType.cityCode) &&
        Objects.equals(this.hotelCode, hotelUniqueIdType.hotelCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chainCode, cityCode, hotelCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HotelUniqueIdType {\n");
    
    sb.append("    chainCode: ").append(toIndentedString(chainCode)).append("\n");
    sb.append("    cityCode: ").append(toIndentedString(cityCode)).append("\n");
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

