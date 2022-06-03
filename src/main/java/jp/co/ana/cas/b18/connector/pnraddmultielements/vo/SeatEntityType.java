package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.RailSeatPreferencesType1;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.RailSeatReferenceInformationType1;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.SeatRequestType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SeatEntityType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class SeatEntityType   {
  @JsonProperty("railSeatPreferences")
  private RailSeatPreferencesType1 railSeatPreferences;

  @JsonProperty("railSeatReferenceInformation")
  @Valid
  private List<RailSeatReferenceInformationType1> railSeatReferenceInformation = null;

  @JsonProperty("seatRequest")
  private SeatRequestType seatRequest;

  public SeatEntityType railSeatPreferences(RailSeatPreferencesType1 railSeatPreferences) {
    this.railSeatPreferences = railSeatPreferences;
    return this;
  }

  /**
   * Get railSeatPreferences
   * @return railSeatPreferences
  */
  @ApiModelProperty(value = "")

  @Valid

  public RailSeatPreferencesType1 getRailSeatPreferences() {
    return railSeatPreferences;
  }

  public void setRailSeatPreferences(RailSeatPreferencesType1 railSeatPreferences) {
    this.railSeatPreferences = railSeatPreferences;
  }

  public SeatEntityType railSeatReferenceInformation(List<RailSeatReferenceInformationType1> railSeatReferenceInformation) {
    this.railSeatReferenceInformation = railSeatReferenceInformation;
    return this;
  }

  public SeatEntityType addRailSeatReferenceInformationItem(RailSeatReferenceInformationType1 railSeatReferenceInformationItem) {
    if (this.railSeatReferenceInformation == null) {
      this.railSeatReferenceInformation = new ArrayList<>();
    }
    this.railSeatReferenceInformation.add(railSeatReferenceInformationItem);
    return this;
  }

  /**
   * Get railSeatReferenceInformation
   * @return railSeatReferenceInformation
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<RailSeatReferenceInformationType1> getRailSeatReferenceInformation() {
    return railSeatReferenceInformation;
  }

  public void setRailSeatReferenceInformation(List<RailSeatReferenceInformationType1> railSeatReferenceInformation) {
    this.railSeatReferenceInformation = railSeatReferenceInformation;
  }

  public SeatEntityType seatRequest(SeatRequestType seatRequest) {
    this.seatRequest = seatRequest;
    return this;
  }

  /**
   * Get seatRequest
   * @return seatRequest
  */
  @ApiModelProperty(value = "")

  @Valid

  public SeatRequestType getSeatRequest() {
    return seatRequest;
  }

  public void setSeatRequest(SeatRequestType seatRequest) {
    this.seatRequest = seatRequest;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SeatEntityType seatEntityType = (SeatEntityType) o;
    return Objects.equals(this.railSeatPreferences, seatEntityType.railSeatPreferences) &&
        Objects.equals(this.railSeatReferenceInformation, seatEntityType.railSeatReferenceInformation) &&
        Objects.equals(this.seatRequest, seatEntityType.seatRequest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(railSeatPreferences, railSeatReferenceInformation, seatRequest);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SeatEntityType {\n");
    
    sb.append("    railSeatPreferences: ").append(toIndentedString(railSeatPreferences)).append("\n");
    sb.append("    railSeatReferenceInformation: ").append(toIndentedString(railSeatReferenceInformation)).append("\n");
    sb.append("    seatRequest: ").append(toIndentedString(seatRequest)).append("\n");
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

