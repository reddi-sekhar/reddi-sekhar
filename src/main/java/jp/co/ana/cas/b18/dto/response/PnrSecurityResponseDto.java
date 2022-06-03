package jp.co.ana.cas.b18.dto.response;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.dto.response.SecurityInfoResponseDto;
import jp.co.ana.cas.b18.dto.response.SecurityResponseDto;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PnrSecurityResponseDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class PnrSecurityResponseDto   {
  @JsonProperty("indicator")
  private String indicator;

  @JsonProperty("securityInfo")
  private SecurityInfoResponseDto securityInfo;

  @JsonProperty("security")
  @Valid
  private List<SecurityResponseDto> security = null;

  public PnrSecurityResponseDto indicator(String indicator) {
    this.indicator = indicator;
    return this;
  }

  /**
   * Code as in the display
   * @return indicator
  */
  @ApiModelProperty(value = "Code as in the display")

@Size(min=1,max=1) 
  public String getIndicator() {
    return indicator;
  }

  public void setIndicator(String indicator) {
    this.indicator = indicator;
  }

  public PnrSecurityResponseDto securityInfo(SecurityInfoResponseDto securityInfo) {
    this.securityInfo = securityInfo;
    return this;
  }

  /**
   * Get securityInfo
   * @return securityInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public SecurityInfoResponseDto getSecurityInfo() {
    return securityInfo;
  }

  public void setSecurityInfo(SecurityInfoResponseDto securityInfo) {
    this.securityInfo = securityInfo;
  }

  public PnrSecurityResponseDto security(List<SecurityResponseDto> security) {
    this.security = security;
    return this;
  }

  public PnrSecurityResponseDto addSecurityItem(SecurityResponseDto securityItem) {
    if (this.security == null) {
      this.security = new ArrayList<>();
    }
    this.security.add(securityItem);
    return this;
  }

  /**
   * Get security
   * @return security
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<SecurityResponseDto> getSecurity() {
    return security;
  }

  public void setSecurity(List<SecurityResponseDto> security) {
    this.security = security;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PnrSecurityResponseDto pnrSecurityResponseDto = (PnrSecurityResponseDto) o;
    return Objects.equals(this.indicator, pnrSecurityResponseDto.indicator) &&
        Objects.equals(this.securityInfo, pnrSecurityResponseDto.securityInfo) &&
        Objects.equals(this.security, pnrSecurityResponseDto.security);
  }

  @Override
  public int hashCode() {
    return Objects.hash(indicator, securityInfo, security);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PnrSecurityResponseDto {\n");
    
    sb.append("    indicator: ").append(toIndentedString(indicator)).append("\n");
    sb.append("    securityInfo: ").append(toIndentedString(securityInfo)).append("\n");
    sb.append("    security: ").append(toIndentedString(security)).append("\n");
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

