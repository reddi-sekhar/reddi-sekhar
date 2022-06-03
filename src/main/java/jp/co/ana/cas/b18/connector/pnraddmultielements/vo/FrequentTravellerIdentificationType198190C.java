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
 * FrequentTravellerIdentificationType198190C
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class FrequentTravellerIdentificationType198190C   {
  @JsonProperty("company")
  private String company;

  @JsonProperty("membershipNumber")
  private String membershipNumber;

  public FrequentTravellerIdentificationType198190C company(String company) {
    this.company = company;
    return this;
  }

  /**
   * Get company
   * @return company
  */
  @ApiModelProperty(value = "")


  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  public FrequentTravellerIdentificationType198190C membershipNumber(String membershipNumber) {
    this.membershipNumber = membershipNumber;
    return this;
  }

  /**
   * Get membershipNumber
   * @return membershipNumber
  */
  @ApiModelProperty(value = "")


  public String getMembershipNumber() {
    return membershipNumber;
  }

  public void setMembershipNumber(String membershipNumber) {
    this.membershipNumber = membershipNumber;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FrequentTravellerIdentificationType198190C frequentTravellerIdentificationType198190C = (FrequentTravellerIdentificationType198190C) o;
    return Objects.equals(this.company, frequentTravellerIdentificationType198190C.company) &&
        Objects.equals(this.membershipNumber, frequentTravellerIdentificationType198190C.membershipNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(company, membershipNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FrequentTravellerIdentificationType198190C {\n");
    
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    membershipNumber: ").append(toIndentedString(membershipNumber)).append("\n");
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

