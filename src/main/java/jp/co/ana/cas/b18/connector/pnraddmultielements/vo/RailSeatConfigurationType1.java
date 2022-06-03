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
 * RailSeatConfigurationType1
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class RailSeatConfigurationType1   {
  @JsonProperty("coachType")
  private String coachType;

  @JsonProperty("seatDeck")
  private String seatDeck;

  @JsonProperty("seatDirection")
  private String seatDirection;

  @JsonProperty("seatEquipment")
  private String seatEquipment;

  @JsonProperty("seatPosition")
  private String seatPosition;

  @JsonProperty("seatSpace")
  private String seatSpace;

  @JsonProperty("specialPassengerType")
  @Valid
  private List<String> specialPassengerType = null;

  public RailSeatConfigurationType1 coachType(String coachType) {
    this.coachType = coachType;
    return this;
  }

  /**
   * Get coachType
   * @return coachType
  */
  @ApiModelProperty(value = "")


  public String getCoachType() {
    return coachType;
  }

  public void setCoachType(String coachType) {
    this.coachType = coachType;
  }

  public RailSeatConfigurationType1 seatDeck(String seatDeck) {
    this.seatDeck = seatDeck;
    return this;
  }

  /**
   * Get seatDeck
   * @return seatDeck
  */
  @ApiModelProperty(value = "")


  public String getSeatDeck() {
    return seatDeck;
  }

  public void setSeatDeck(String seatDeck) {
    this.seatDeck = seatDeck;
  }

  public RailSeatConfigurationType1 seatDirection(String seatDirection) {
    this.seatDirection = seatDirection;
    return this;
  }

  /**
   * Get seatDirection
   * @return seatDirection
  */
  @ApiModelProperty(value = "")


  public String getSeatDirection() {
    return seatDirection;
  }

  public void setSeatDirection(String seatDirection) {
    this.seatDirection = seatDirection;
  }

  public RailSeatConfigurationType1 seatEquipment(String seatEquipment) {
    this.seatEquipment = seatEquipment;
    return this;
  }

  /**
   * Get seatEquipment
   * @return seatEquipment
  */
  @ApiModelProperty(value = "")


  public String getSeatEquipment() {
    return seatEquipment;
  }

  public void setSeatEquipment(String seatEquipment) {
    this.seatEquipment = seatEquipment;
  }

  public RailSeatConfigurationType1 seatPosition(String seatPosition) {
    this.seatPosition = seatPosition;
    return this;
  }

  /**
   * Get seatPosition
   * @return seatPosition
  */
  @ApiModelProperty(value = "")


  public String getSeatPosition() {
    return seatPosition;
  }

  public void setSeatPosition(String seatPosition) {
    this.seatPosition = seatPosition;
  }

  public RailSeatConfigurationType1 seatSpace(String seatSpace) {
    this.seatSpace = seatSpace;
    return this;
  }

  /**
   * Get seatSpace
   * @return seatSpace
  */
  @ApiModelProperty(value = "")


  public String getSeatSpace() {
    return seatSpace;
  }

  public void setSeatSpace(String seatSpace) {
    this.seatSpace = seatSpace;
  }

  public RailSeatConfigurationType1 specialPassengerType(List<String> specialPassengerType) {
    this.specialPassengerType = specialPassengerType;
    return this;
  }

  public RailSeatConfigurationType1 addSpecialPassengerTypeItem(String specialPassengerTypeItem) {
    if (this.specialPassengerType == null) {
      this.specialPassengerType = new ArrayList<>();
    }
    this.specialPassengerType.add(specialPassengerTypeItem);
    return this;
  }

  /**
   * Get specialPassengerType
   * @return specialPassengerType
  */
  @ApiModelProperty(value = "")


  public List<String> getSpecialPassengerType() {
    return specialPassengerType;
  }

  public void setSpecialPassengerType(List<String> specialPassengerType) {
    this.specialPassengerType = specialPassengerType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RailSeatConfigurationType1 railSeatConfigurationType1 = (RailSeatConfigurationType1) o;
    return Objects.equals(this.coachType, railSeatConfigurationType1.coachType) &&
        Objects.equals(this.seatDeck, railSeatConfigurationType1.seatDeck) &&
        Objects.equals(this.seatDirection, railSeatConfigurationType1.seatDirection) &&
        Objects.equals(this.seatEquipment, railSeatConfigurationType1.seatEquipment) &&
        Objects.equals(this.seatPosition, railSeatConfigurationType1.seatPosition) &&
        Objects.equals(this.seatSpace, railSeatConfigurationType1.seatSpace) &&
        Objects.equals(this.specialPassengerType, railSeatConfigurationType1.specialPassengerType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(coachType, seatDeck, seatDirection, seatEquipment, seatPosition, seatSpace, specialPassengerType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RailSeatConfigurationType1 {\n");
    
    sb.append("    coachType: ").append(toIndentedString(coachType)).append("\n");
    sb.append("    seatDeck: ").append(toIndentedString(seatDeck)).append("\n");
    sb.append("    seatDirection: ").append(toIndentedString(seatDirection)).append("\n");
    sb.append("    seatEquipment: ").append(toIndentedString(seatEquipment)).append("\n");
    sb.append("    seatPosition: ").append(toIndentedString(seatPosition)).append("\n");
    sb.append("    seatSpace: ").append(toIndentedString(seatSpace)).append("\n");
    sb.append("    specialPassengerType: ").append(toIndentedString(specialPassengerType)).append("\n");
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

