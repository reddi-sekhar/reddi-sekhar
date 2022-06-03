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
 * SeatReferenceInformationType1
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class SeatReferenceInformationType1   {
  @JsonProperty("coachNumber")
  private String coachNumber;

  @JsonProperty("deckNumber")
  private String deckNumber;

  @JsonProperty("seatNumber")
  private String seatNumber;

  public SeatReferenceInformationType1 coachNumber(String coachNumber) {
    this.coachNumber = coachNumber;
    return this;
  }

  /**
   * Get coachNumber
   * @return coachNumber
  */
  @ApiModelProperty(value = "")


  public String getCoachNumber() {
    return coachNumber;
  }

  public void setCoachNumber(String coachNumber) {
    this.coachNumber = coachNumber;
  }

  public SeatReferenceInformationType1 deckNumber(String deckNumber) {
    this.deckNumber = deckNumber;
    return this;
  }

  /**
   * Get deckNumber
   * @return deckNumber
  */
  @ApiModelProperty(value = "")


  public String getDeckNumber() {
    return deckNumber;
  }

  public void setDeckNumber(String deckNumber) {
    this.deckNumber = deckNumber;
  }

  public SeatReferenceInformationType1 seatNumber(String seatNumber) {
    this.seatNumber = seatNumber;
    return this;
  }

  /**
   * Get seatNumber
   * @return seatNumber
  */
  @ApiModelProperty(value = "")


  public String getSeatNumber() {
    return seatNumber;
  }

  public void setSeatNumber(String seatNumber) {
    this.seatNumber = seatNumber;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SeatReferenceInformationType1 seatReferenceInformationType1 = (SeatReferenceInformationType1) o;
    return Objects.equals(this.coachNumber, seatReferenceInformationType1.coachNumber) &&
        Objects.equals(this.deckNumber, seatReferenceInformationType1.deckNumber) &&
        Objects.equals(this.seatNumber, seatReferenceInformationType1.seatNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(coachNumber, deckNumber, seatNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SeatReferenceInformationType1 {\n");
    
    sb.append("    coachNumber: ").append(toIndentedString(coachNumber)).append("\n");
    sb.append("    deckNumber: ").append(toIndentedString(deckNumber)).append("\n");
    sb.append("    seatNumber: ").append(toIndentedString(seatNumber)).append("\n");
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

