package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.IndividualSecurityType3194C;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.SecurityInformationType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * IndividualPnrSecurityInformationType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class IndividualPnrSecurityInformationType   {
  @JsonProperty("indicator")
  private String indicator;

  @JsonProperty("security")
  @Valid
  private List<IndividualSecurityType3194C> security = null;

  @JsonProperty("securityInfo")
  private SecurityInformationType securityInfo;

  public IndividualPnrSecurityInformationType indicator(String indicator) {
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

  public IndividualPnrSecurityInformationType security(List<IndividualSecurityType3194C> security) {
    this.security = security;
    return this;
  }

  public IndividualPnrSecurityInformationType addSecurityItem(IndividualSecurityType3194C securityItem) {
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

  public List<IndividualSecurityType3194C> getSecurity() {
    return security;
  }

  public void setSecurity(List<IndividualSecurityType3194C> security) {
    this.security = security;
  }

  public IndividualPnrSecurityInformationType securityInfo(SecurityInformationType securityInfo) {
    this.securityInfo = securityInfo;
    return this;
  }

  /**
   * Get securityInfo
   * @return securityInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public SecurityInformationType getSecurityInfo() {
    return securityInfo;
  }

  public void setSecurityInfo(SecurityInformationType securityInfo) {
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
    IndividualPnrSecurityInformationType individualPnrSecurityInformationType = (IndividualPnrSecurityInformationType) o;
    return Objects.equals(this.indicator, individualPnrSecurityInformationType.indicator) &&
        Objects.equals(this.security, individualPnrSecurityInformationType.security) &&
        Objects.equals(this.securityInfo, individualPnrSecurityInformationType.securityInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(indicator, security, securityInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IndividualPnrSecurityInformationType {\n");
    
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

