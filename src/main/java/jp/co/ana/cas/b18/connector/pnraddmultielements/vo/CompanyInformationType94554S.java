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
 * CompanyInformationType94554S
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class CompanyInformationType94554S   {
  @JsonProperty("companyCode")
  private String companyCode;

  @JsonProperty("companyNumericCode")
  private String companyNumericCode;

  public CompanyInformationType94554S companyCode(String companyCode) {
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

  public CompanyInformationType94554S companyNumericCode(String companyNumericCode) {
    this.companyNumericCode = companyNumericCode;
    return this;
  }

  /**
   * Get companyNumericCode
   * @return companyNumericCode
  */
  @ApiModelProperty(value = "")


  public String getCompanyNumericCode() {
    return companyNumericCode;
  }

  public void setCompanyNumericCode(String companyNumericCode) {
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
    CompanyInformationType94554S companyInformationType94554S = (CompanyInformationType94554S) o;
    return Objects.equals(this.companyCode, companyInformationType94554S.companyCode) &&
        Objects.equals(this.companyNumericCode, companyInformationType94554S.companyNumericCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyCode, companyNumericCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompanyInformationType94554S {\n");
    
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

