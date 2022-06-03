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
 * CompanyInformationType26258S
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class CompanyInformationType26258S   {
  @JsonProperty("companyCode")
  private String companyCode;

  @JsonProperty("companyCodeContext")
  private String companyCodeContext;

  @JsonProperty("companyName")
  private String companyName;

  @JsonProperty("travelSector")
  private String travelSector;

  public CompanyInformationType26258S companyCode(String companyCode) {
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

  public CompanyInformationType26258S companyCodeContext(String companyCodeContext) {
    this.companyCodeContext = companyCodeContext;
    return this;
  }

  /**
   * Get companyCodeContext
   * @return companyCodeContext
  */
  @ApiModelProperty(value = "")


  public String getCompanyCodeContext() {
    return companyCodeContext;
  }

  public void setCompanyCodeContext(String companyCodeContext) {
    this.companyCodeContext = companyCodeContext;
  }

  public CompanyInformationType26258S companyName(String companyName) {
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

  public CompanyInformationType26258S travelSector(String travelSector) {
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
    CompanyInformationType26258S companyInformationType26258S = (CompanyInformationType26258S) o;
    return Objects.equals(this.companyCode, companyInformationType26258S.companyCode) &&
        Objects.equals(this.companyCodeContext, companyInformationType26258S.companyCodeContext) &&
        Objects.equals(this.companyName, companyInformationType26258S.companyName) &&
        Objects.equals(this.travelSector, companyInformationType26258S.travelSector);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyCode, companyCodeContext, companyName, travelSector);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompanyInformationType26258S {\n");
    
    sb.append("    companyCode: ").append(toIndentedString(companyCode)).append("\n");
    sb.append("    companyCodeContext: ").append(toIndentedString(companyCodeContext)).append("\n");
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

