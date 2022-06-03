package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ExtendedSecurityDetailsType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ExtendedOwnershipSecurityDetailsType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class ExtendedOwnershipSecurityDetailsType   {
  @JsonProperty("securityDetails")
  private ExtendedSecurityDetailsType securityDetails;

  public ExtendedOwnershipSecurityDetailsType securityDetails(ExtendedSecurityDetailsType securityDetails) {
    this.securityDetails = securityDetails;
    return this;
  }

  /**
   * Get securityDetails
   * @return securityDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public ExtendedSecurityDetailsType getSecurityDetails() {
    return securityDetails;
  }

  public void setSecurityDetails(ExtendedSecurityDetailsType securityDetails) {
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
    ExtendedOwnershipSecurityDetailsType extendedOwnershipSecurityDetailsType = (ExtendedOwnershipSecurityDetailsType) o;
    return Objects.equals(this.securityDetails, extendedOwnershipSecurityDetailsType.securityDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(securityDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExtendedOwnershipSecurityDetailsType {\n");
    
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

