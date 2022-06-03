package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.SeatRequierementsDataType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.SeatRequierementsType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SeatRequestType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class SeatRequestType   {
  @JsonProperty("seat")
  private SeatRequierementsType seat;

  @JsonProperty("special")
  @Valid
  private List<SeatRequierementsDataType> special = null;

  public SeatRequestType seat(SeatRequierementsType seat) {
    this.seat = seat;
    return this;
  }

  /**
   * Get seat
   * @return seat
  */
  @ApiModelProperty(value = "")

  @Valid

  public SeatRequierementsType getSeat() {
    return seat;
  }

  public void setSeat(SeatRequierementsType seat) {
    this.seat = seat;
  }

  public SeatRequestType special(List<SeatRequierementsDataType> special) {
    this.special = special;
    return this;
  }

  public SeatRequestType addSpecialItem(SeatRequierementsDataType specialItem) {
    if (this.special == null) {
      this.special = new ArrayList<>();
    }
    this.special.add(specialItem);
    return this;
  }

  /**
   * Get special
   * @return special
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<SeatRequierementsDataType> getSpecial() {
    return special;
  }

  public void setSpecial(List<SeatRequierementsDataType> special) {
    this.special = special;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SeatRequestType seatRequestType = (SeatRequestType) o;
    return Objects.equals(this.seat, seatRequestType.seat) &&
        Objects.equals(this.special, seatRequestType.special);
  }

  @Override
  public int hashCode() {
    return Objects.hash(seat, special);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SeatRequestType {\n");
    
    sb.append("    seat: ").append(toIndentedString(seat)).append("\n");
    sb.append("    special: ").append(toIndentedString(special)).append("\n");
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

