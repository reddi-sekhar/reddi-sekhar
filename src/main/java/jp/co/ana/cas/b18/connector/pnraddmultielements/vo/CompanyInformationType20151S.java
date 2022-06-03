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
 * CompanyInformationType20151S
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class CompanyInformationType20151S   {
  @JsonProperty("companyCode")
  private String companyCode;

  @JsonProperty("companyName")
  private String companyName;

  @JsonProperty("travelSector")
  private String travelSector;

  public CompanyInformationType20151S companyCode(String companyCode) {
    this.companyCode = companyCode;
    return this;
  }

  /**
   * Get companyCode
   * @return companyCode
  */
  @ApiModelProperty(value = "")


  public String getCompanyCode() {
    return companyCode;
  }

  public void setCompanyCode(String companyCode) {
    this.companyCode = companyCode;
  }

  public CompanyInformationType20151S companyName(String companyName) {
    this.companyName = companyName;
    return this;
  }

  /**
   * Get companyName
   * @return companyName
  */
  @ApiModelProperty(value = "")


  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public CompanyInformationType20151S travelSector(String travelSector) {
    this.travelSector = travelSector;
    return this;
  }

  /**
   * Get travelSector
   * @return travelSector
  */
  @ApiModelProperty(value = "")


  public String getTravelSector() {
    return travelSector;
  }

  public void setTravelSector(String travelSector) {
    this.travelSector = travelSector;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompanyInformationType20151S companyInformationType20151S = (CompanyInformationType20151S) o;
    return Objects.equals(this.companyCode, companyInformationType20151S.companyCode) &&
        Objects.equals(this.companyName, companyInformationType20151S.companyName) &&
        Objects.equals(this.travelSector, companyInformationType20151S.travelSector);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyCode, companyName, travelSector);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompanyInformationType20151S {\n");
    
    sb.append("    companyCode: ").append(toIndentedString(companyCode)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    travelSector: ").append(toIndentedString(travelSector)).append("\n");
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

