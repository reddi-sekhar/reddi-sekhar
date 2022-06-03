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
 * FrequentTravelerResponseDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class FrequentTravelerResponseDto   {
  @JsonProperty("company")
  private String company;

  @JsonProperty("membershipNumber")
  private String membershipNumber;

  public FrequentTravelerResponseDto company(String company) {
    this.company = company;
    return this;
  }

  /**
   * Airline Code
   * @return company
  */
  @ApiModelProperty(value = "Airline Code")

@Size(min=2,max=3) 
  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  public FrequentTravelerResponseDto membershipNumber(String membershipNumber) {
    this.membershipNumber = membershipNumber;
    return this;
  }

  /**
   * Frequent Traveller Number
   * @return membershipNumber
  */
  @ApiModelProperty(value = "Frequent Traveller Number")

@Size(min=1,max=27) 
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
    FrequentTravelerResponseDto frequentTravelerResponseDto = (FrequentTravelerResponseDto) o;
    return Objects.equals(this.company, frequentTravelerResponseDto.company) &&
        Objects.equals(this.membershipNumber, frequentTravelerResponseDto.membershipNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(company, membershipNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FrequentTravelerResponseDto {\n");
    
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

