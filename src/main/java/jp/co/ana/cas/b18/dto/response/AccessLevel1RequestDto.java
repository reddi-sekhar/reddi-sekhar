package jp.co.ana.cas.b18.dto.response;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.dto.response.ExtendedSecurityDetails1RequestDto;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AccessLevel1RequestDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class AccessLevel1RequestDto   {
  @JsonProperty("securityDetails")
  @Valid
  private List<ExtendedSecurityDetails1RequestDto> securityDetails = null;

  public AccessLevel1RequestDto securityDetails(List<ExtendedSecurityDetails1RequestDto> securityDetails) {
    this.securityDetails = securityDetails;
    return this;
  }

  public AccessLevel1RequestDto addSecurityDetailsItem(ExtendedSecurityDetails1RequestDto securityDetailsItem) {
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

  public List<ExtendedSecurityDetails1RequestDto> getSecurityDetails() {
    return securityDetails;
  }

  public void setSecurityDetails(List<ExtendedSecurityDetails1RequestDto> securityDetails) {
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
    AccessLevel1RequestDto accessLevel1RequestDto = (AccessLevel1RequestDto) o;
    return Objects.equals(this.securityDetails, accessLevel1RequestDto.securityDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(securityDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessLevel1RequestDto {\n");
    
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

