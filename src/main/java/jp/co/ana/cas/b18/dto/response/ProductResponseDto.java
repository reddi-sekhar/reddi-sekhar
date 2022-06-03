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
 * ProductResponseDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class ProductResponseDto   {
  @JsonProperty("depDate")
  private String depDate;

  @JsonProperty("depTime")
  private String depTime;

  @JsonProperty("arrDate")
  private String arrDate;

  @JsonProperty("arrTime")
  private String arrTime;

  public ProductResponseDto depDate(String depDate) {
    this.depDate = depDate;
    return this;
  }

  /**
   * Departure Date
   * @return depDate
  */
  @ApiModelProperty(value = "Departure Date")

@Pattern(regexp="(0[1-9]|[1-2][0-9]|3[0-1])(0[1-9]|1[0-2])[0-9]{2}") 
  public String getDepDate() {
    return depDate;
  }

  public void setDepDate(String depDate) {
    this.depDate = depDate;
  }

  public ProductResponseDto depTime(String depTime) {
    this.depTime = depTime;
    return this;
  }

  /**
   * Departure Time
   * @return depTime
  */
  @ApiModelProperty(value = "Departure Time")

@Pattern(regexp="([0-1][0-9]|2[0-3])[0-5][0-9]") 
  public String getDepTime() {
    return depTime;
  }

  public void setDepTime(String depTime) {
    this.depTime = depTime;
  }

  public ProductResponseDto arrDate(String arrDate) {
    this.arrDate = arrDate;
    return this;
  }

  /**
   * Arrival Date
   * @return arrDate
  */
  @ApiModelProperty(value = "Arrival Date")

@Pattern(regexp="(0[1-9]|[1-2][0-9]|3[0-1])(0[1-9]|1[0-2])[0-9]{2}") 
  public String getArrDate() {
    return arrDate;
  }

  public void setArrDate(String arrDate) {
    this.arrDate = arrDate;
  }

  public ProductResponseDto arrTime(String arrTime) {
    this.arrTime = arrTime;
    return this;
  }

  /**
   * Arrival Time
   * @return arrTime
  */
  @ApiModelProperty(value = "Arrival Time")

@Pattern(regexp="([0-9][0-9][0-5][0-9])") 
  public String getArrTime() {
    return arrTime;
  }

  public void setArrTime(String arrTime) {
    this.arrTime = arrTime;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductResponseDto productResponseDto = (ProductResponseDto) o;
    return Objects.equals(this.depDate, productResponseDto.depDate) &&
        Objects.equals(this.depTime, productResponseDto.depTime) &&
        Objects.equals(this.arrDate, productResponseDto.arrDate) &&
        Objects.equals(this.arrTime, productResponseDto.arrTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(depDate, depTime, arrDate, arrTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductResponseDto {\n");
    
    sb.append("    depDate: ").append(toIndentedString(depDate)).append("\n");
    sb.append("    depTime: ").append(toIndentedString(depTime)).append("\n");
    sb.append("    arrDate: ").append(toIndentedString(arrDate)).append("\n");
    sb.append("    arrTime: ").append(toIndentedString(arrTime)).append("\n");
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

