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
 * FrequentTravellerIdentificationTypeU
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class FrequentTravellerIdentificationTypeU   {
  @JsonProperty("companyId")
  private String companyId;

  @JsonProperty("membershipNumber")
  private String membershipNumber;

  public FrequentTravellerIdentificationTypeU companyId(String companyId) {
    this.companyId = companyId;
    return this;
  }

  /**
   * Get companyId
   * @return companyId
  */
  @ApiModelProperty(value = "")


  public String getCompanyId() {
    return companyId;
  }

  public void setCompanyId(String companyId) {
    this.companyId = companyId;
  }

  public FrequentTravellerIdentificationTypeU membershipNumber(String membershipNumber) {
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
    FrequentTravellerIdentificationTypeU frequentTravellerIdentificationTypeU = (FrequentTravellerIdentificationTypeU) o;
    return Objects.equals(this.companyId, frequentTravellerIdentificationTypeU.companyId) &&
        Objects.equals(this.membershipNumber, frequentTravellerIdentificationTypeU.membershipNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyId, membershipNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FrequentTravellerIdentificationTypeU {\n");
    
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

