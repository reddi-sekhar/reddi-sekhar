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
 * CompanyIdentificationTypeI222513C
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class CompanyIdentificationTypeI222513C   {
  @JsonProperty("otherCompany")
  private String otherCompany;

  public CompanyIdentificationTypeI222513C otherCompany(String otherCompany) {
    this.otherCompany = otherCompany;
    return this;
  }

  /**
   * Get otherCompany
   * @return otherCompany
  */
  @ApiModelProperty(value = "")


  public String getOtherCompany() {
    return otherCompany;
  }

  public void setOtherCompany(String otherCompany) {
    this.otherCompany = otherCompany;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompanyIdentificationTypeI222513C companyIdentificationTypeI222513C = (CompanyIdentificationTypeI222513C) o;
    return Objects.equals(this.otherCompany, companyIdentificationTypeI222513C.otherCompany);
  }

  @Override
  public int hashCode() {
    return Objects.hash(otherCompany);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompanyIdentificationTypeI222513C {\n");
    
    sb.append("    otherCompany: ").append(toIndentedString(otherCompany)).append("\n");
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

