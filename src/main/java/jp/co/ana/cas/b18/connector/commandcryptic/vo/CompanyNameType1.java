package jp.co.ana.cas.b18.connector.commandcryptic.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CompanyNameType1
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T19:01:00.408185400+05:30[Asia/Calcutta]")
public class CompanyNameType1   {
  @JsonProperty("code")
  private String code;

  @JsonProperty("codeContext")
  private String codeContext;

  @JsonProperty("companyShortName")
  private String companyShortName;

  @JsonProperty("travelSector")
  private String travelSector;

  @JsonProperty("value")
  private String value;

  public CompanyNameType1 code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Get code
   * @return code
  */
  @ApiModelProperty(value = "")


  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public CompanyNameType1 codeContext(String codeContext) {
    this.codeContext = codeContext;
    return this;
  }

  /**
   * Get codeContext
   * @return codeContext
  */
  @ApiModelProperty(value = "")


  public String getCodeContext() {
    return codeContext;
  }

  public void setCodeContext(String codeContext) {
    this.codeContext = codeContext;
  }

  public CompanyNameType1 companyShortName(String companyShortName) {
    this.companyShortName = companyShortName;
    return this;
  }

  /**
   * Get companyShortName
   * @return companyShortName
  */
  @ApiModelProperty(value = "")


  public String getCompanyShortName() {
    return companyShortName;
  }

  public void setCompanyShortName(String companyShortName) {
    this.companyShortName = companyShortName;
  }

  public CompanyNameType1 travelSector(String travelSector) {
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

  public CompanyNameType1 value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
  */
  @ApiModelProperty(value = "")


  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompanyNameType1 companyNameType1 = (CompanyNameType1) o;
    return Objects.equals(this.code, companyNameType1.code) &&
        Objects.equals(this.codeContext, companyNameType1.codeContext) &&
        Objects.equals(this.companyShortName, companyNameType1.companyShortName) &&
        Objects.equals(this.travelSector, companyNameType1.travelSector) &&
        Objects.equals(this.value, companyNameType1.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, codeContext, companyShortName, travelSector, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompanyNameType1 {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    codeContext: ").append(toIndentedString(codeContext)).append("\n");
    sb.append("    companyShortName: ").append(toIndentedString(companyShortName)).append("\n");
    sb.append("    travelSector: ").append(toIndentedString(travelSector)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

