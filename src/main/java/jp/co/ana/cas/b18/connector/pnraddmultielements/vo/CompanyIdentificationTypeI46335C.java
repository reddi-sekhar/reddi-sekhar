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
 * CompanyIdentificationTypeI46335C
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class CompanyIdentificationTypeI46335C   {
  @JsonProperty("marketingCompany")
  private String marketingCompany;

  public CompanyIdentificationTypeI46335C marketingCompany(String marketingCompany) {
    this.marketingCompany = marketingCompany;
    return this;
  }

  /**
   * Get marketingCompany
   * @return marketingCompany
  */
  @ApiModelProperty(value = "")


  public String getMarketingCompany() {
    return marketingCompany;
  }

  public void setMarketingCompany(String marketingCompany) {
    this.marketingCompany = marketingCompany;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompanyIdentificationTypeI46335C companyIdentificationTypeI46335C = (CompanyIdentificationTypeI46335C) o;
    return Objects.equals(this.marketingCompany, companyIdentificationTypeI46335C.marketingCompany);
  }

  @Override
  public int hashCode() {
    return Objects.hash(marketingCompany);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompanyIdentificationTypeI46335C {\n");
    
    sb.append("    marketingCompany: ").append(toIndentedString(marketingCompany)).append("\n");
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

