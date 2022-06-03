package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ExtendedSecurityDetailsType1;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ExtendedOwnershipSecurityDetailsType1
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class ExtendedOwnershipSecurityDetailsType1   {
  @JsonProperty("securityDetails")
  @Valid
  private List<ExtendedSecurityDetailsType1> securityDetails = null;

  public ExtendedOwnershipSecurityDetailsType1 securityDetails(List<ExtendedSecurityDetailsType1> securityDetails) {
    this.securityDetails = securityDetails;
    return this;
  }

  public ExtendedOwnershipSecurityDetailsType1 addSecurityDetailsItem(ExtendedSecurityDetailsType1 securityDetailsItem) {
    if (this.securityDetails == null) {
      this.securityDetails = new ArrayList<>();
    }
    this.securityDetails.add(securityDetailsItem);
    return this;
  }

  /**
   * Get securityDetails
   * @return securityDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<ExtendedSecurityDetailsType1> getSecurityDetails() {
    return securityDetails;
  }

  public void setSecurityDetails(List<ExtendedSecurityDetailsType1> securityDetails) {
    this.securityDetails = securityDetails;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExtendedOwnershipSecurityDetailsType1 extendedOwnershipSecurityDetailsType1 = (ExtendedOwnershipSecurityDetailsType1) o;
    return Objects.equals(this.securityDetails, extendedOwnershipSecurityDetailsType1.securityDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(securityDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExtendedOwnershipSecurityDetailsType1 {\n");
    
    sb.append("    securityDetails: ").append(toIndentedString(securityDetails)).append("\n");
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

