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
 * CompanyInformationType19450S
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class CompanyInformationType19450S   {
  @JsonProperty("companyCode")
  private String companyCode;

  @JsonProperty("companyNumericCode")
  private Long companyNumericCode;

  public CompanyInformationType19450S companyCode(String companyCode) {
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

  public CompanyInformationType19450S companyNumericCode(Long companyNumericCode) {
    this.companyNumericCode = companyNumericCode;
    return this;
  }

  /**
   * Get companyNumericCode
   * @return companyNumericCode
  */
  @ApiModelProperty(value = "")


  public Long getCompanyNumericCode() {
    return companyNumericCode;
  }

  public void setCompanyNumericCode(Long companyNumericCode) {
    this.companyNumericCode = companyNumericCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompanyInformationType19450S companyInformationType19450S = (CompanyInformationType19450S) o;
    return Objects.equals(this.companyCode, companyInformationType19450S.companyCode) &&
        Objects.equals(this.companyNumericCode, companyInformationType19450S.companyNumericCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyCode, companyNumericCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompanyInformationType19450S {\n");
    
    sb.append("    companyCode: ").append(toIndentedString(companyCode)).append("\n");
    sb.append("    companyNumericCode: ").append(toIndentedString(companyNumericCode)).append("\n");
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

