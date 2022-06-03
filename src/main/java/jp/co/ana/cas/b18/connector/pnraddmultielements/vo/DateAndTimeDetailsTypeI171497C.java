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
 * DateAndTimeDetailsTypeI171497C
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class DateAndTimeDetailsTypeI171497C   {
  @JsonProperty("firstDate")
  private String firstDate;

  @JsonProperty("locationIdentification")
  private String locationIdentification;

  @JsonProperty("movementType")
  private String movementType;

  public DateAndTimeDetailsTypeI171497C firstDate(String firstDate) {
    this.firstDate = firstDate;
    return this;
  }

  /**
   * Get firstDate
   * @return firstDate
  */
  @ApiModelProperty(value = "")


  public String getFirstDate() {
    return firstDate;
  }

  public void setFirstDate(String firstDate) {
    this.firstDate = firstDate;
  }

  public DateAndTimeDetailsTypeI171497C locationIdentification(String locationIdentification) {
    this.locationIdentification = locationIdentification;
    return this;
  }

  /**
   * Get locationIdentification
   * @return locationIdentification
  */
  @ApiModelProperty(value = "")


  public String getLocationIdentification() {
    return locationIdentification;
  }

  public void setLocationIdentification(String locationIdentification) {
    this.locationIdentification = locationIdentification;
  }

  public DateAndTimeDetailsTypeI171497C movementType(String movementType) {
    this.movementType = movementType;
    return this;
  }

  /**
   * Get movementType
   * @return movementType
  */
  @ApiModelProperty(value = "")


  public String getMovementType() {
    return movementType;
  }

  public void setMovementType(String movementType) {
    this.movementType = movementType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DateAndTimeDetailsTypeI171497C dateAndTimeDetailsTypeI171497C = (DateAndTimeDetailsTypeI171497C) o;
    return Objects.equals(this.firstDate, dateAndTimeDetailsTypeI171497C.firstDate) &&
        Objects.equals(this.locationIdentification, dateAndTimeDetailsTypeI171497C.locationIdentification) &&
        Objects.equals(this.movementType, dateAndTimeDetailsTypeI171497C.movementType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstDate, locationIdentification, movementType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DateAndTimeDetailsTypeI171497C {\n");
    
    sb.append("    firstDate: ").append(toIndentedString(firstDate)).append("\n");
    sb.append("    locationIdentification: ").append(toIndentedString(locationIdentification)).append("\n");
    sb.append("    movementType: ").append(toIndentedString(movementType)).append("\n");
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

