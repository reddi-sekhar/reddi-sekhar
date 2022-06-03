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
 * RailSleeperDescriptionType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class RailSleeperDescriptionType   {
  @JsonProperty("berthDeck")
  private String berthDeck;

  @JsonProperty("cabinOccupancy")
  private String cabinOccupancy;

  @JsonProperty("cabinPosition")
  private String cabinPosition;

  @JsonProperty("cabinShareType")
  private String cabinShareType;

  public RailSleeperDescriptionType berthDeck(String berthDeck) {
    this.berthDeck = berthDeck;
    return this;
  }

  /**
   * Get berthDeck
   * @return berthDeck
  */
  @ApiModelProperty(value = "")


  public String getBerthDeck() {
    return berthDeck;
  }

  public void setBerthDeck(String berthDeck) {
    this.berthDeck = berthDeck;
  }

  public RailSleeperDescriptionType cabinOccupancy(String cabinOccupancy) {
    this.cabinOccupancy = cabinOccupancy;
    return this;
  }

  /**
   * Get cabinOccupancy
   * @return cabinOccupancy
  */
  @ApiModelProperty(value = "")


  public String getCabinOccupancy() {
    return cabinOccupancy;
  }

  public void setCabinOccupancy(String cabinOccupancy) {
    this.cabinOccupancy = cabinOccupancy;
  }

  public RailSleeperDescriptionType cabinPosition(String cabinPosition) {
    this.cabinPosition = cabinPosition;
    return this;
  }

  /**
   * Get cabinPosition
   * @return cabinPosition
  */
  @ApiModelProperty(value = "")


  public String getCabinPosition() {
    return cabinPosition;
  }

  public void setCabinPosition(String cabinPosition) {
    this.cabinPosition = cabinPosition;
  }

  public RailSleeperDescriptionType cabinShareType(String cabinShareType) {
    this.cabinShareType = cabinShareType;
    return this;
  }

  /**
   * Get cabinShareType
   * @return cabinShareType
  */
  @ApiModelProperty(value = "")


  public String getCabinShareType() {
    return cabinShareType;
  }

  public void setCabinShareType(String cabinShareType) {
    this.cabinShareType = cabinShareType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RailSleeperDescriptionType railSleeperDescriptionType = (RailSleeperDescriptionType) o;
    return Objects.equals(this.berthDeck, railSleeperDescriptionType.berthDeck) &&
        Objects.equals(this.cabinOccupancy, railSleeperDescriptionType.cabinOccupancy) &&
        Objects.equals(this.cabinPosition, railSleeperDescriptionType.cabinPosition) &&
        Objects.equals(this.cabinShareType, railSleeperDescriptionType.cabinShareType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(berthDeck, cabinOccupancy, cabinPosition, cabinShareType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RailSleeperDescriptionType {\n");
    
    sb.append("    berthDeck: ").append(toIndentedString(berthDeck)).append("\n");
    sb.append("    cabinOccupancy: ").append(toIndentedString(cabinOccupancy)).append("\n");
    sb.append("    cabinPosition: ").append(toIndentedString(cabinPosition)).append("\n");
    sb.append("    cabinShareType: ").append(toIndentedString(cabinShareType)).append("\n");
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

