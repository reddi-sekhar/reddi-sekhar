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
 * AdditionalProductTypeI
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class AdditionalProductTypeI   {
  @JsonProperty("duration")
  private String duration;

  @JsonProperty("equipment")
  private String equipment;

  @JsonProperty("numOfStops")
  private Long numOfStops;

  @JsonProperty("weekDay")
  private Long weekDay;

  public AdditionalProductTypeI duration(String duration) {
    this.duration = duration;
    return this;
  }

  /**
   * Get duration
   * @return duration
  */
  @ApiModelProperty(value = "")


  public String getDuration() {
    return duration;
  }

  public void setDuration(String duration) {
    this.duration = duration;
  }

  public AdditionalProductTypeI equipment(String equipment) {
    this.equipment = equipment;
    return this;
  }

  /**
   * Get equipment
   * @return equipment
  */
  @ApiModelProperty(value = "")


  public String getEquipment() {
    return equipment;
  }

  public void setEquipment(String equipment) {
    this.equipment = equipment;
  }

  public AdditionalProductTypeI numOfStops(Long numOfStops) {
    this.numOfStops = numOfStops;
    return this;
  }

  /**
   * Get numOfStops
   * @return numOfStops
  */
  @ApiModelProperty(value = "")


  public Long getNumOfStops() {
    return numOfStops;
  }

  public void setNumOfStops(Long numOfStops) {
    this.numOfStops = numOfStops;
  }

  public AdditionalProductTypeI weekDay(Long weekDay) {
    this.weekDay = weekDay;
    return this;
  }

  /**
   * Get weekDay
   * @return weekDay
  */
  @ApiModelProperty(value = "")


  public Long getWeekDay() {
    return weekDay;
  }

  public void setWeekDay(Long weekDay) {
    this.weekDay = weekDay;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdditionalProductTypeI additionalProductTypeI = (AdditionalProductTypeI) o;
    return Objects.equals(this.duration, additionalProductTypeI.duration) &&
        Objects.equals(this.equipment, additionalProductTypeI.equipment) &&
        Objects.equals(this.numOfStops, additionalProductTypeI.numOfStops) &&
        Objects.equals(this.weekDay, additionalProductTypeI.weekDay);
  }

  @Override
  public int hashCode() {
    return Objects.hash(duration, equipment, numOfStops, weekDay);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdditionalProductTypeI {\n");
    
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    equipment: ").append(toIndentedString(equipment)).append("\n");
    sb.append("    numOfStops: ").append(toIndentedString(numOfStops)).append("\n");
    sb.append("    weekDay: ").append(toIndentedString(weekDay)).append("\n");
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

