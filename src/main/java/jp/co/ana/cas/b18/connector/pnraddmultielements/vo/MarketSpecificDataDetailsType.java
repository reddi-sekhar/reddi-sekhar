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
 * MarketSpecificDataDetailsType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class MarketSpecificDataDetailsType   {
  @JsonProperty("chdData")
  private String chdData;

  @JsonProperty("cvData")
  private String cvData;

  @JsonProperty("delegationCode")
  private String delegationCode;

  @JsonProperty("gwtData")
  private String gwtData;

  @JsonProperty("iataNumber")
  private Long iataNumber;

  @JsonProperty("mcoCouponNumber")
  private String mcoCouponNumber;

  @JsonProperty("mcoDateOfIssue")
  private String mcoDateOfIssue;

  @JsonProperty("mcoDocNumber")
  private String mcoDocNumber;

  @JsonProperty("mcoIataNumber")
  private Long mcoIataNumber;

  @JsonProperty("mcoPlaceOfIssue")
  private String mcoPlaceOfIssue;

  @JsonProperty("onoData")
  private String onoData;

  @JsonProperty("printedFreeflow")
  private String printedFreeflow;

  @JsonProperty("reportedFreeflow")
  private String reportedFreeflow;

  public MarketSpecificDataDetailsType chdData(String chdData) {
    this.chdData = chdData;
    return this;
  }

  /**
   * Get chdData
   * @return chdData
  */
  @ApiModelProperty(value = "")


  public String getChdData() {
    return chdData;
  }

  public void setChdData(String chdData) {
    this.chdData = chdData;
  }

  public MarketSpecificDataDetailsType cvData(String cvData) {
    this.cvData = cvData;
    return this;
  }

  /**
   * Get cvData
   * @return cvData
  */
  @ApiModelProperty(value = "")


  public String getCvData() {
    return cvData;
  }

  public void setCvData(String cvData) {
    this.cvData = cvData;
  }

  public MarketSpecificDataDetailsType delegationCode(String delegationCode) {
    this.delegationCode = delegationCode;
    return this;
  }

  /**
   * Get delegationCode
   * @return delegationCode
  */
  @ApiModelProperty(value = "")


  public String getDelegationCode() {
    return delegationCode;
  }

  public void setDelegationCode(String delegationCode) {
    this.delegationCode = delegationCode;
  }

  public MarketSpecificDataDetailsType gwtData(String gwtData) {
    this.gwtData = gwtData;
    return this;
  }

  /**
   * Get gwtData
   * @return gwtData
  */
  @ApiModelProperty(value = "")


  public String getGwtData() {
    return gwtData;
  }

  public void setGwtData(String gwtData) {
    this.gwtData = gwtData;
  }

  public MarketSpecificDataDetailsType iataNumber(Long iataNumber) {
    this.iataNumber = iataNumber;
    return this;
  }

  /**
   * Get iataNumber
   * @return iataNumber
  */
  @ApiModelProperty(value = "")


  public Long getIataNumber() {
    return iataNumber;
  }

  public void setIataNumber(Long iataNumber) {
    this.iataNumber = iataNumber;
  }

  public MarketSpecificDataDetailsType mcoCouponNumber(String mcoCouponNumber) {
    this.mcoCouponNumber = mcoCouponNumber;
    return this;
  }

  /**
   * Get mcoCouponNumber
   * @return mcoCouponNumber
  */
  @ApiModelProperty(value = "")


  public String getMcoCouponNumber() {
    return mcoCouponNumber;
  }

  public void setMcoCouponNumber(String mcoCouponNumber) {
    this.mcoCouponNumber = mcoCouponNumber;
  }

  public MarketSpecificDataDetailsType mcoDateOfIssue(String mcoDateOfIssue) {
    this.mcoDateOfIssue = mcoDateOfIssue;
    return this;
  }

  /**
   * Get mcoDateOfIssue
   * @return mcoDateOfIssue
  */
  @ApiModelProperty(value = "")


  public String getMcoDateOfIssue() {
    return mcoDateOfIssue;
  }

  public void setMcoDateOfIssue(String mcoDateOfIssue) {
    this.mcoDateOfIssue = mcoDateOfIssue;
  }

  public MarketSpecificDataDetailsType mcoDocNumber(String mcoDocNumber) {
    this.mcoDocNumber = mcoDocNumber;
    return this;
  }

  /**
   * Get mcoDocNumber
   * @return mcoDocNumber
  */
  @ApiModelProperty(value = "")


  public String getMcoDocNumber() {
    return mcoDocNumber;
  }

  public void setMcoDocNumber(String mcoDocNumber) {
    this.mcoDocNumber = mcoDocNumber;
  }

  public MarketSpecificDataDetailsType mcoIataNumber(Long mcoIataNumber) {
    this.mcoIataNumber = mcoIataNumber;
    return this;
  }

  /**
   * Get mcoIataNumber
   * @return mcoIataNumber
  */
  @ApiModelProperty(value = "")


  public Long getMcoIataNumber() {
    return mcoIataNumber;
  }

  public void setMcoIataNumber(Long mcoIataNumber) {
    this.mcoIataNumber = mcoIataNumber;
  }

  public MarketSpecificDataDetailsType mcoPlaceOfIssue(String mcoPlaceOfIssue) {
    this.mcoPlaceOfIssue = mcoPlaceOfIssue;
    return this;
  }

  /**
   * Get mcoPlaceOfIssue
   * @return mcoPlaceOfIssue
  */
  @ApiModelProperty(value = "")


  public String getMcoPlaceOfIssue() {
    return mcoPlaceOfIssue;
  }

  public void setMcoPlaceOfIssue(String mcoPlaceOfIssue) {
    this.mcoPlaceOfIssue = mcoPlaceOfIssue;
  }

  public MarketSpecificDataDetailsType onoData(String onoData) {
    this.onoData = onoData;
    return this;
  }

  /**
   * Get onoData
   * @return onoData
  */
  @ApiModelProperty(value = "")


  public String getOnoData() {
    return onoData;
  }

  public void setOnoData(String onoData) {
    this.onoData = onoData;
  }

  public MarketSpecificDataDetailsType printedFreeflow(String printedFreeflow) {
    this.printedFreeflow = printedFreeflow;
    return this;
  }

  /**
   * Get printedFreeflow
   * @return printedFreeflow
  */
  @ApiModelProperty(value = "")


  public String getPrintedFreeflow() {
    return printedFreeflow;
  }

  public void setPrintedFreeflow(String printedFreeflow) {
    this.printedFreeflow = printedFreeflow;
  }

  public MarketSpecificDataDetailsType reportedFreeflow(String reportedFreeflow) {
    this.reportedFreeflow = reportedFreeflow;
    return this;
  }

  /**
   * Get reportedFreeflow
   * @return reportedFreeflow
  */
  @ApiModelProperty(value = "")


  public String getReportedFreeflow() {
    return reportedFreeflow;
  }

  public void setReportedFreeflow(String reportedFreeflow) {
    this.reportedFreeflow = reportedFreeflow;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MarketSpecificDataDetailsType marketSpecificDataDetailsType = (MarketSpecificDataDetailsType) o;
    return Objects.equals(this.chdData, marketSpecificDataDetailsType.chdData) &&
        Objects.equals(this.cvData, marketSpecificDataDetailsType.cvData) &&
        Objects.equals(this.delegationCode, marketSpecificDataDetailsType.delegationCode) &&
        Objects.equals(this.gwtData, marketSpecificDataDetailsType.gwtData) &&
        Objects.equals(this.iataNumber, marketSpecificDataDetailsType.iataNumber) &&
        Objects.equals(this.mcoCouponNumber, marketSpecificDataDetailsType.mcoCouponNumber) &&
        Objects.equals(this.mcoDateOfIssue, marketSpecificDataDetailsType.mcoDateOfIssue) &&
        Objects.equals(this.mcoDocNumber, marketSpecificDataDetailsType.mcoDocNumber) &&
        Objects.equals(this.mcoIataNumber, marketSpecificDataDetailsType.mcoIataNumber) &&
        Objects.equals(this.mcoPlaceOfIssue, marketSpecificDataDetailsType.mcoPlaceOfIssue) &&
        Objects.equals(this.onoData, marketSpecificDataDetailsType.onoData) &&
        Objects.equals(this.printedFreeflow, marketSpecificDataDetailsType.printedFreeflow) &&
        Objects.equals(this.reportedFreeflow, marketSpecificDataDetailsType.reportedFreeflow);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chdData, cvData, delegationCode, gwtData, iataNumber, mcoCouponNumber, mcoDateOfIssue, mcoDocNumber, mcoIataNumber, mcoPlaceOfIssue, onoData, printedFreeflow, reportedFreeflow);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MarketSpecificDataDetailsType {\n");
    
    sb.append("    chdData: ").append(toIndentedString(chdData)).append("\n");
    sb.append("    cvData: ").append(toIndentedString(cvData)).append("\n");
    sb.append("    delegationCode: ").append(toIndentedString(delegationCode)).append("\n");
    sb.append("    gwtData: ").append(toIndentedString(gwtData)).append("\n");
    sb.append("    iataNumber: ").append(toIndentedString(iataNumber)).append("\n");
    sb.append("    mcoCouponNumber: ").append(toIndentedString(mcoCouponNumber)).append("\n");
    sb.append("    mcoDateOfIssue: ").append(toIndentedString(mcoDateOfIssue)).append("\n");
    sb.append("    mcoDocNumber: ").append(toIndentedString(mcoDocNumber)).append("\n");
    sb.append("    mcoIataNumber: ").append(toIndentedString(mcoIataNumber)).append("\n");
    sb.append("    mcoPlaceOfIssue: ").append(toIndentedString(mcoPlaceOfIssue)).append("\n");
    sb.append("    onoData: ").append(toIndentedString(onoData)).append("\n");
    sb.append("    printedFreeflow: ").append(toIndentedString(printedFreeflow)).append("\n");
    sb.append("    reportedFreeflow: ").append(toIndentedString(reportedFreeflow)).append("\n");
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

