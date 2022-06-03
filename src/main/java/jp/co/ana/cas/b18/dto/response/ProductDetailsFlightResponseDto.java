package jp.co.ana.cas.b18.dto.response;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ProductDetailsFlightResponseDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class ProductDetailsFlightResponseDto   {
  @JsonProperty("equipment")
  private String equipment;

  @JsonProperty("numOfStops")
  private Long numOfStops;

  @JsonProperty("weekDay")
  private Long weekDay;

  public ProductDetailsFlightResponseDto equipment(String equipment) {
    this.equipment = equipment;
    return this;
  }

  /**
   *  Flight details equipment
   * @return equipment
  */
  @ApiModelProperty(example = "789", value = " Flight details equipment")

@Size(min=1,max=3) 
  public String getEquipment() {
    return equipment;
  }

  public void setEquipment(String equipment) {
    this.equipment = equipment;
  }

  public ProductDetailsFlightResponseDto numOfStops(Long numOfStops) {
    this.numOfStops = numOfStops;
    return this;
  }

  /**
   * Number of Stops
   * @return numOfStops
  */
  @ApiModelProperty(example = "0", value = "Number of Stops")


  public Long getNumOfStops() {
    return numOfStops;
  }

  public void setNumOfStops(Long numOfStops) {
    this.numOfStops = numOfStops;
  }

  public ProductDetailsFlightResponseDto weekDay(Long weekDay) {
    this.weekDay = weekDay;
    return this;
  }

  /**
   * Week day
   * @return weekDay
  */
  @ApiModelProperty(example = "3", value = "Week day")


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
    ProductDetailsFlightResponseDto productDetailsFlightResponseDto = (ProductDetailsFlightResponseDto) o;
    return Objects.equals(this.equipment, productDetailsFlightResponseDto.equipment) &&
        Objects.equals(this.numOfStops, productDetailsFlightResponseDto.numOfStops) &&
        Objects.equals(this.weekDay, productDetailsFlightResponseDto.weekDay);
  }

  @Override
  public int hashCode() {
    return Objects.hash(equipment, numOfStops, weekDay);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductDetailsFlightResponseDto {\n");
    
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

