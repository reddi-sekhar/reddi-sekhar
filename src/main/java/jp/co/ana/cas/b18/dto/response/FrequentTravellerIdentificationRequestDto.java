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
 * FrequentTravellerIdentificationRequestDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class FrequentTravellerIdentificationRequestDto   {
  @JsonProperty("companyId")
  private String companyId;

  @JsonProperty("membershipNumber")
  private String membershipNumber;

  public FrequentTravellerIdentificationRequestDto companyId(String companyId) {
    this.companyId = companyId;
    return this;
  }

  /**
   * Airline Code
   * @return companyId
  */
  @ApiModelProperty(required = true, value = "Airline Code")
  @NotNull

@Size(min=2,max=3) 
  public String getCompanyId() {
    return companyId;
  }

  public void setCompanyId(String companyId) {
    this.companyId = companyId;
  }

  public FrequentTravellerIdentificationRequestDto membershipNumber(String membershipNumber) {
    this.membershipNumber = membershipNumber;
    return this;
  }

  /**
   * Frequent Traveller Number
   * @return membershipNumber
  */
  @ApiModelProperty(required = true, value = "Frequent Traveller Number")
  @NotNull

@Size(min=1,max=25) 
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
    FrequentTravellerIdentificationRequestDto frequentTravellerIdentificationRequestDto = (FrequentTravellerIdentificationRequestDto) o;
    return Objects.equals(this.companyId, frequentTravellerIdentificationRequestDto.companyId) &&
        Objects.equals(this.membershipNumber, frequentTravellerIdentificationRequestDto.membershipNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyId, membershipNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FrequentTravellerIdentificationRequestDto {\n");
    
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
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

