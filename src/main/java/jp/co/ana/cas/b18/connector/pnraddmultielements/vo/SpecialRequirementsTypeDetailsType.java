package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SpecialRequirementsTypeDetailsType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class SpecialRequirementsTypeDetailsType   {
  @JsonProperty("actionCode")
  private String actionCode;

  @JsonProperty("airlineCode")
  private String airlineCode;

  @JsonProperty("boardPoint")
  private String boardPoint;

  @JsonProperty("numberInParty")
  private Long numberInParty;

  @JsonProperty("offPoint")
  private String offPoint;

  @JsonProperty("otherServiceType")
  private String otherServiceType;

  @JsonProperty("serviceFreeText")
  @Valid
  private List<String> serviceFreeText = null;

  @JsonProperty("serviceType")
  private String serviceType;

  @JsonProperty("ssrCode")
  private String ssrCode;

  public SpecialRequirementsTypeDetailsType actionCode(String actionCode) {
    this.actionCode = actionCode;
    return this;
  }

  /**
   * Get actionCode
   * @return actionCode
  */
  @ApiModelProperty(value = "")


  public String getActionCode() {
    return actionCode;
  }

  public void setActionCode(String actionCode) {
    this.actionCode = actionCode;
  }

  public SpecialRequirementsTypeDetailsType airlineCode(String airlineCode) {
    this.airlineCode = airlineCode;
    return this;
  }

  /**
   * Get airlineCode
   * @return airlineCode
  */
  @ApiModelProperty(value = "")


  public String getAirlineCode() {
    return airlineCode;
  }

  public void setAirlineCode(String airlineCode) {
    this.airlineCode = airlineCode;
  }

  public SpecialRequirementsTypeDetailsType boardPoint(String boardPoint) {
    this.boardPoint = boardPoint;
    return this;
  }

  /**
   * Get boardPoint
   * @return boardPoint
  */
  @ApiModelProperty(value = "")


  public String getBoardPoint() {
    return boardPoint;
  }

  public void setBoardPoint(String boardPoint) {
    this.boardPoint = boardPoint;
  }

  public SpecialRequirementsTypeDetailsType numberInParty(Long numberInParty) {
    this.numberInParty = numberInParty;
    return this;
  }

  /**
   * Get numberInParty
   * @return numberInParty
  */
  @ApiModelProperty(value = "")


  public Long getNumberInParty() {
    return numberInParty;
  }

  public void setNumberInParty(Long numberInParty) {
    this.numberInParty = numberInParty;
  }

  public SpecialRequirementsTypeDetailsType offPoint(String offPoint) {
    this.offPoint = offPoint;
    return this;
  }

  /**
   * Get offPoint
   * @return offPoint
  */
  @ApiModelProperty(value = "")


  public String getOffPoint() {
    return offPoint;
  }

  public void setOffPoint(String offPoint) {
    this.offPoint = offPoint;
  }

  public SpecialRequirementsTypeDetailsType otherServiceType(String otherServiceType) {
    this.otherServiceType = otherServiceType;
    return this;
  }

  /**
   * Get otherServiceType
   * @return otherServiceType
  */
  @ApiModelProperty(value = "")


  public String getOtherServiceType() {
    return otherServiceType;
  }

  public void setOtherServiceType(String otherServiceType) {
    this.otherServiceType = otherServiceType;
  }

  public SpecialRequirementsTypeDetailsType serviceFreeText(List<String> serviceFreeText) {
    this.serviceFreeText = serviceFreeText;
    return this;
  }

  public SpecialRequirementsTypeDetailsType addServiceFreeTextItem(String serviceFreeTextItem) {
    if (this.serviceFreeText == null) {
      this.serviceFreeText = new ArrayList<>();
    }
    this.serviceFreeText.add(serviceFreeTextItem);
    return this;
  }

  /**
   * Get serviceFreeText
   * @return serviceFreeText
  */
  @ApiModelProperty(value = "")


  public List<String> getServiceFreeText() {
    return serviceFreeText;
  }

  public void setServiceFreeText(List<String> serviceFreeText) {
    this.serviceFreeText = serviceFreeText;
  }

  public SpecialRequirementsTypeDetailsType serviceType(String serviceType) {
    this.serviceType = serviceType;
    return this;
  }

  /**
   * Get serviceType
   * @return serviceType
  */
  @ApiModelProperty(value = "")


  public String getServiceType() {
    return serviceType;
  }

  public void setServiceType(String serviceType) {
    this.serviceType = serviceType;
  }

  public SpecialRequirementsTypeDetailsType ssrCode(String ssrCode) {
    this.ssrCode = ssrCode;
    return this;
  }

  /**
   * Get ssrCode
   * @return ssrCode
  */
  @ApiModelProperty(value = "")


  public String getSsrCode() {
    return ssrCode;
  }

  public void setSsrCode(String ssrCode) {
    this.ssrCode = ssrCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpecialRequirementsTypeDetailsType specialRequirementsTypeDetailsType = (SpecialRequirementsTypeDetailsType) o;
    return Objects.equals(this.actionCode, specialRequirementsTypeDetailsType.actionCode) &&
        Objects.equals(this.airlineCode, specialRequirementsTypeDetailsType.airlineCode) &&
        Objects.equals(this.boardPoint, specialRequirementsTypeDetailsType.boardPoint) &&
        Objects.equals(this.numberInParty, specialRequirementsTypeDetailsType.numberInParty) &&
        Objects.equals(this.offPoint, specialRequirementsTypeDetailsType.offPoint) &&
        Objects.equals(this.otherServiceType, specialRequirementsTypeDetailsType.otherServiceType) &&
        Objects.equals(this.serviceFreeText, specialRequirementsTypeDetailsType.serviceFreeText) &&
        Objects.equals(this.serviceType, specialRequirementsTypeDetailsType.serviceType) &&
        Objects.equals(this.ssrCode, specialRequirementsTypeDetailsType.ssrCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionCode, airlineCode, boardPoint, numberInParty, offPoint, otherServiceType, serviceFreeText, serviceType, ssrCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpecialRequirementsTypeDetailsType {\n");
    
    sb.append("    actionCode: ").append(toIndentedString(actionCode)).append("\n");
    sb.append("    airlineCode: ").append(toIndentedString(airlineCode)).append("\n");
    sb.append("    boardPoint: ").append(toIndentedString(boardPoint)).append("\n");
    sb.append("    numberInParty: ").append(toIndentedString(numberInParty)).append("\n");
    sb.append("    offPoint: ").append(toIndentedString(offPoint)).append("\n");
    sb.append("    otherServiceType: ").append(toIndentedString(otherServiceType)).append("\n");
    sb.append("    serviceFreeText: ").append(toIndentedString(serviceFreeText)).append("\n");
    sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
    sb.append("    ssrCode: ").append(toIndentedString(ssrCode)).append("\n");
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

