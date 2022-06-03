package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.IndividualSecurityType1;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.SecurityInformationType1;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * IndividualPnrSecurityInformationType1
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class IndividualPnrSecurityInformationType1   {
  @JsonProperty("indicator")
  private String indicator;

  @JsonProperty("security")
  @Valid
  private List<IndividualSecurityType1> security = null;

  @JsonProperty("securityInfo")
  private SecurityInformationType1 securityInfo;

  public IndividualPnrSecurityInformationType1 indicator(String indicator) {
    this.indicator = indicator;
    return this;
  }

  /**
   * Get indicator
   * @return indicator
  */
  @ApiModelProperty(value = "")


  public String getIndicator() {
    return indicator;
  }

  public void setIndicator(String indicator) {
    this.indicator = indicator;
  }

  public IndividualPnrSecurityInformationType1 security(List<IndividualSecurityType1> security) {
    this.security = security;
    return this;
  }

  public IndividualPnrSecurityInformationType1 addSecurityItem(IndividualSecurityType1 securityItem) {
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

  public List<IndividualSecurityType1> getSecurity() {
    return security;
  }

  public void setSecurity(List<IndividualSecurityType1> security) {
    this.security = security;
  }

  public IndividualPnrSecurityInformationType1 securityInfo(SecurityInformationType1 securityInfo) {
    this.securityInfo = securityInfo;
    return this;
  }

  /**
   * Get securityInfo
   * @return securityInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public SecurityInformationType1 getSecurityInfo() {
    return securityInfo;
  }

  public void setSecurityInfo(SecurityInformationType1 securityInfo) {
    this.securityInfo = securityInfo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IndividualPnrSecurityInformationType1 individualPnrSecurityInformationType1 = (IndividualPnrSecurityInformationType1) o;
    return Objects.equals(this.indicator, individualPnrSecurityInformationType1.indicator) &&
        Objects.equals(this.security, individualPnrSecurityInformationType1.security) &&
        Objects.equals(this.securityInfo, individualPnrSecurityInformationType1.securityInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(indicator, security, securityInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IndividualPnrSecurityInformationType1 {\n");
    
    sb.append("    indicator: ").append(toIndentedString(indicator)).append("\n");
    sb.append("    security: ").append(toIndentedString(security)).append("\n");
    sb.append("    securityInfo: ").append(toIndentedString(securityInfo)).append("\n");
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

