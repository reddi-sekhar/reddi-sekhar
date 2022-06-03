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
 * CompanyIdentificationTypeI148289C
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class CompanyIdentificationTypeI148289C   {
  @JsonProperty("operatingCompany")
  private String operatingCompany;

  public CompanyIdentificationTypeI148289C operatingCompany(String operatingCompany) {
    this.operatingCompany = operatingCompany;
    return this;
  }

  /**
   * Get operatingCompany
   * @return operatingCompany
  */
  @ApiModelProperty(value = "")


  public String getOperatingCompany() {
    return operatingCompany;
  }

  public void setOperatingCompany(String operatingCompany) {
    this.operatingCompany = operatingCompany;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompanyIdentificationTypeI148289C companyIdentificationTypeI148289C = (CompanyIdentificationTypeI148289C) o;
    return Objects.equals(this.operatingCompany, companyIdentificationTypeI148289C.operatingCompany);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operatingCompany);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompanyIdentificationTypeI148289C {\n");
    
    sb.append("    operatingCompany: ").append(toIndentedString(operatingCompany)).append("\n");
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

