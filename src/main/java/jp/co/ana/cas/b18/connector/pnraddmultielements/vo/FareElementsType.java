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
 * FareElementsType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class FareElementsType   {
  @JsonProperty("freetextLong")
  private String freetextLong;

  @JsonProperty("generalIndicator")
  private String generalIndicator;

  @JsonProperty("officeId")
  @Valid
  private List<String> officeId = null;

  @JsonProperty("passengerType")
  private String passengerType;

  public FareElementsType freetextLong(String freetextLong) {
    this.freetextLong = freetextLong;
    return this;
  }

  /**
   * Get freetextLong
   * @return freetextLong
  */
  @ApiModelProperty(value = "")


  public String getFreetextLong() {
    return freetextLong;
  }

  public void setFreetextLong(String freetextLong) {
    this.freetextLong = freetextLong;
  }

  public FareElementsType generalIndicator(String generalIndicator) {
    this.generalIndicator = generalIndicator;
    return this;
  }

  /**
   * Get generalIndicator
   * @return generalIndicator
  */
  @ApiModelProperty(value = "")


  public String getGeneralIndicator() {
    return generalIndicator;
  }

  public void setGeneralIndicator(String generalIndicator) {
    this.generalIndicator = generalIndicator;
  }

  public FareElementsType officeId(List<String> officeId) {
    this.officeId = officeId;
    return this;
  }

  public FareElementsType addOfficeIdItem(String officeIdItem) {
    if (this.officeId == null) {
      this.officeId = new ArrayList<>();
    }
    this.officeId.add(officeIdItem);
    return this;
  }

  /**
   * Get officeId
   * @return officeId
  */
  @ApiModelProperty(value = "")


  public List<String> getOfficeId() {
    return officeId;
  }

  public void setOfficeId(List<String> officeId) {
    this.officeId = officeId;
  }

  public FareElementsType passengerType(String passengerType) {
    this.passengerType = passengerType;
    return this;
  }

  /**
   * Get passengerType
   * @return passengerType
  */
  @ApiModelProperty(value = "")


  public String getPassengerType() {
    return passengerType;
  }

  public void setPassengerType(String passengerType) {
    this.passengerType = passengerType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FareElementsType fareElementsType = (FareElementsType) o;
    return Objects.equals(this.freetextLong, fareElementsType.freetextLong) &&
        Objects.equals(this.generalIndicator, fareElementsType.generalIndicator) &&
        Objects.equals(this.officeId, fareElementsType.officeId) &&
        Objects.equals(this.passengerType, fareElementsType.passengerType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(freetextLong, generalIndicator, officeId, passengerType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FareElementsType {\n");
    
    sb.append("    freetextLong: ").append(toIndentedString(freetextLong)).append("\n");
    sb.append("    generalIndicator: ").append(toIndentedString(generalIndicator)).append("\n");
    sb.append("    officeId: ").append(toIndentedString(officeId)).append("\n");
    sb.append("    passengerType: ").append(toIndentedString(passengerType)).append("\n");
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

