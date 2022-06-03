package jp.co.ana.cas.b18.dto.response;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CompanyDetailsResponseDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class CompanyDetailsResponseDto   {
  @JsonProperty("operatingCompany")
  private String operatingCompany;

  public CompanyDetailsResponseDto operatingCompany(String operatingCompany) {
    this.operatingCompany = operatingCompany;
    return this;
  }

  /**
   * Operating company details
   * @return operatingCompany
  */
  @ApiModelProperty(value = "Operating company details")

@Size(min=1,max=3) 
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
    CompanyDetailsResponseDto companyDetailsResponseDto = (CompanyDetailsResponseDto) o;
    return Objects.equals(this.operatingCompany, companyDetailsResponseDto.operatingCompany);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operatingCompany);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompanyDetailsResponseDto {\n");
    
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

