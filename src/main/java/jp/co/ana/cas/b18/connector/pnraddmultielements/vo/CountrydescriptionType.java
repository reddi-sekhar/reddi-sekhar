package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CountrydescriptionType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class CountrydescriptionType   {
  @JsonProperty("countryCode")
  @Valid
  private List<String> countryCode = null;

  @JsonProperty("geographicalZone")
  private String geographicalZone;

  public CountrydescriptionType countryCode(List<String> countryCode) {
    this.countryCode = countryCode;
    return this;
  }

  public CountrydescriptionType addCountryCodeItem(String countryCodeItem) {
    if (this.countryCode == null) {
      this.countryCode = new ArrayList<>();
    }
    this.countryCode.add(countryCodeItem);
    return this;
  }

  /**
   * Get countryCode
   * @return countryCode
  */
  @ApiModelProperty(value = "")


  public List<String> getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(List<String> countryCode) {
    this.countryCode = countryCode;
  }

  public CountrydescriptionType geographicalZone(String geographicalZone) {
    this.geographicalZone = geographicalZone;
    return this;
  }

  /**
   * Get geographicalZone
   * @return geographicalZone
  */
  @ApiModelProperty(value = "")


  public String getGeographicalZone() {
    return geographicalZone;
  }

  public void setGeographicalZone(String geographicalZone) {
    this.geographicalZone = geographicalZone;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CountrydescriptionType countrydescriptionType = (CountrydescriptionType) o;
    return Objects.equals(this.countryCode, countrydescriptionType.countryCode) &&
        Objects.equals(this.geographicalZone, countrydescriptionType.geographicalZone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(countryCode, geographicalZone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CountrydescriptionType {\n");
    
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    geographicalZone: ").append(toIndentedString(geographicalZone)).append("\n");
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

