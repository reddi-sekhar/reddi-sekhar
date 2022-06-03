package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.PointOfSaleInformationType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.StructuredDateTimeInformationType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.SystemDetailsInfoType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.TicketAgentInfoType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.UserIdentificationType132824S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.UserPreferencesType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * POSGroupType150634G
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class POSGroupType150634G   {
  @JsonProperty("agentId")
  private TicketAgentInfoType agentId;

  @JsonProperty("pointOfSaleDate")
  private StructuredDateTimeInformationType pointOfSaleDate;

  @JsonProperty("pointOfSaleInformationType")
  private PointOfSaleInformationType pointOfSaleInformationType;

  @JsonProperty("sbrPreferences")
  private UserPreferencesType sbrPreferences;

  @JsonProperty("sbrSystemDetails")
  private SystemDetailsInfoType sbrSystemDetails;

  @JsonProperty("sbrUserIdentification")
  private UserIdentificationType132824S sbrUserIdentification;

  public POSGroupType150634G agentId(TicketAgentInfoType agentId) {
    this.agentId = agentId;
    return this;
  }

  /**
   * Get agentId
   * @return agentId
  */
  @ApiModelProperty(value = "")

  @Valid

  public TicketAgentInfoType getAgentId() {
    return agentId;
  }

  public void setAgentId(TicketAgentInfoType agentId) {
    this.agentId = agentId;
  }

  public POSGroupType150634G pointOfSaleDate(StructuredDateTimeInformationType pointOfSaleDate) {
    this.pointOfSaleDate = pointOfSaleDate;
    return this;
  }

  /**
   * Get pointOfSaleDate
   * @return pointOfSaleDate
  */
  @ApiModelProperty(value = "")

  @Valid

  public StructuredDateTimeInformationType getPointOfSaleDate() {
    return pointOfSaleDate;
  }

  public void setPointOfSaleDate(StructuredDateTimeInformationType pointOfSaleDate) {
    this.pointOfSaleDate = pointOfSaleDate;
  }

  public POSGroupType150634G pointOfSaleInformationType(PointOfSaleInformationType pointOfSaleInformationType) {
    this.pointOfSaleInformationType = pointOfSaleInformationType;
    return this;
  }

  /**
   * Get pointOfSaleInformationType
   * @return pointOfSaleInformationType
  */
  @ApiModelProperty(value = "")

  @Valid

  public PointOfSaleInformationType getPointOfSaleInformationType() {
    return pointOfSaleInformationType;
  }

  public void setPointOfSaleInformationType(PointOfSaleInformationType pointOfSaleInformationType) {
    this.pointOfSaleInformationType = pointOfSaleInformationType;
  }

  public POSGroupType150634G sbrPreferences(UserPreferencesType sbrPreferences) {
    this.sbrPreferences = sbrPreferences;
    return this;
  }

  /**
   * Get sbrPreferences
   * @return sbrPreferences
  */
  @ApiModelProperty(value = "")

  @Valid

  public UserPreferencesType getSbrPreferences() {
    return sbrPreferences;
  }

  public void setSbrPreferences(UserPreferencesType sbrPreferences) {
    this.sbrPreferences = sbrPreferences;
  }

  public POSGroupType150634G sbrSystemDetails(SystemDetailsInfoType sbrSystemDetails) {
    this.sbrSystemDetails = sbrSystemDetails;
    return this;
  }

  /**
   * Get sbrSystemDetails
   * @return sbrSystemDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public SystemDetailsInfoType getSbrSystemDetails() {
    return sbrSystemDetails;
  }

  public void setSbrSystemDetails(SystemDetailsInfoType sbrSystemDetails) {
    this.sbrSystemDetails = sbrSystemDetails;
  }

  public POSGroupType150634G sbrUserIdentification(UserIdentificationType132824S sbrUserIdentification) {
    this.sbrUserIdentification = sbrUserIdentification;
    return this;
  }

  /**
   * Get sbrUserIdentification
   * @return sbrUserIdentification
  */
  @ApiModelProperty(value = "")

  @Valid

  public UserIdentificationType132824S getSbrUserIdentification() {
    return sbrUserIdentification;
  }

  public void setSbrUserIdentification(UserIdentificationType132824S sbrUserIdentification) {
    this.sbrUserIdentification = sbrUserIdentification;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    POSGroupType150634G poSGroupType150634G = (POSGroupType150634G) o;
    return Objects.equals(this.agentId, poSGroupType150634G.agentId) &&
        Objects.equals(this.pointOfSaleDate, poSGroupType150634G.pointOfSaleDate) &&
        Objects.equals(this.pointOfSaleInformationType, poSGroupType150634G.pointOfSaleInformationType) &&
        Objects.equals(this.sbrPreferences, poSGroupType150634G.sbrPreferences) &&
        Objects.equals(this.sbrSystemDetails, poSGroupType150634G.sbrSystemDetails) &&
        Objects.equals(this.sbrUserIdentification, poSGroupType150634G.sbrUserIdentification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentId, pointOfSaleDate, pointOfSaleInformationType, sbrPreferences, sbrSystemDetails, sbrUserIdentification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class POSGroupType150634G {\n");
    
    sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
    sb.append("    pointOfSaleDate: ").append(toIndentedString(pointOfSaleDate)).append("\n");
    sb.append("    pointOfSaleInformationType: ").append(toIndentedString(pointOfSaleInformationType)).append("\n");
    sb.append("    sbrPreferences: ").append(toIndentedString(sbrPreferences)).append("\n");
    sb.append("    sbrSystemDetails: ").append(toIndentedString(sbrSystemDetails)).append("\n");
    sb.append("    sbrUserIdentification: ").append(toIndentedString(sbrUserIdentification)).append("\n");
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

