package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.CountrydescriptionType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InsuranceProviderAndProductsType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class InsuranceProviderAndProductsType   {
  @JsonProperty("countryInfo")
  private CountrydescriptionType countryInfo;

  @JsonProperty("tourOperator")
  private String tourOperator;

  @JsonProperty("tripType")
  private String tripType;

  public InsuranceProviderAndProductsType countryInfo(CountrydescriptionType countryInfo) {
    this.countryInfo = countryInfo;
    return this;
  }

  /**
   * Get countryInfo
   * @return countryInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public CountrydescriptionType getCountryInfo() {
    return countryInfo;
  }

  public void setCountryInfo(CountrydescriptionType countryInfo) {
    this.countryInfo = countryInfo;
  }

  public InsuranceProviderAndProductsType tourOperator(String tourOperator) {
    this.tourOperator = tourOperator;
    return this;
  }

  /**
   * Get tourOperator
   * @return tourOperator
  */
  @ApiModelProperty(value = "")


  public String getTourOperator() {
    return tourOperator;
  }

  public void setTourOperator(String tourOperator) {
    this.tourOperator = tourOperator;
  }

  public InsuranceProviderAndProductsType tripType(String tripType) {
    this.tripType = tripType;
    return this;
  }

  /**
   * Get tripType
   * @return tripType
  */
  @ApiModelProperty(value = "")


  public String getTripType() {
    return tripType;
  }

  public void setTripType(String tripType) {
    this.tripType = tripType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InsuranceProviderAndProductsType insuranceProviderAndProductsType = (InsuranceProviderAndProductsType) o;
    return Objects.equals(this.countryInfo, insuranceProviderAndProductsType.countryInfo) &&
        Objects.equals(this.tourOperator, insuranceProviderAndProductsType.tourOperator) &&
        Objects.equals(this.tripType, insuranceProviderAndProductsType.tripType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(countryInfo, tourOperator, tripType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InsuranceProviderAndProductsType {\n");
    
    sb.append("    countryInfo: ").append(toIndentedString(countryInfo)).append("\n");
    sb.append("    tourOperator: ").append(toIndentedString(tourOperator)).append("\n");
    sb.append("    tripType: ").append(toIndentedString(tripType)).append("\n");
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

