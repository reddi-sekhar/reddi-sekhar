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
 * ProductDateTimeTypeI270056C
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class ProductDateTimeTypeI270056C   {
  @JsonProperty("arrDate")
  private String arrDate;

  @JsonProperty("arrTime")
  private String arrTime;

  @JsonProperty("dayChangeIndicator")
  private Long dayChangeIndicator;

  @JsonProperty("depDate")
  private String depDate;

  @JsonProperty("depTime")
  private String depTime;

  public ProductDateTimeTypeI270056C arrDate(String arrDate) {
    this.arrDate = arrDate;
    return this;
  }

  /**
   * Get arrDate
   * @return arrDate
  */
  @ApiModelProperty(value = "")


  public String getArrDate() {
    return arrDate;
  }

  public void setArrDate(String arrDate) {
    this.arrDate = arrDate;
  }

  public ProductDateTimeTypeI270056C arrTime(String arrTime) {
    this.arrTime = arrTime;
    return this;
  }

  /**
   * Get arrTime
   * @return arrTime
  */
  @ApiModelProperty(value = "")


  public String getArrTime() {
    return arrTime;
  }

  public void setArrTime(String arrTime) {
    this.arrTime = arrTime;
  }

  public ProductDateTimeTypeI270056C dayChangeIndicator(Long dayChangeIndicator) {
    this.dayChangeIndicator = dayChangeIndicator;
    return this;
  }

  /**
   * Get dayChangeIndicator
   * @return dayChangeIndicator
  */
  @ApiModelProperty(value = "")


  public Long getDayChangeIndicator() {
    return dayChangeIndicator;
  }

  public void setDayChangeIndicator(Long dayChangeIndicator) {
    this.dayChangeIndicator = dayChangeIndicator;
  }

  public ProductDateTimeTypeI270056C depDate(String depDate) {
    this.depDate = depDate;
    return this;
  }

  /**
   * Get depDate
   * @return depDate
  */
  @ApiModelProperty(value = "")


  public String getDepDate() {
    return depDate;
  }

  public void setDepDate(String depDate) {
    this.depDate = depDate;
  }

  public ProductDateTimeTypeI270056C depTime(String depTime) {
    this.depTime = depTime;
    return this;
  }

  /**
   * Get depTime
   * @return depTime
  */
  @ApiModelProperty(value = "")


  public String getDepTime() {
    return depTime;
  }

  public void setDepTime(String depTime) {
    this.depTime = depTime;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductDateTimeTypeI270056C productDateTimeTypeI270056C = (ProductDateTimeTypeI270056C) o;
    return Objects.equals(this.arrDate, productDateTimeTypeI270056C.arrDate) &&
        Objects.equals(this.arrTime, productDateTimeTypeI270056C.arrTime) &&
        Objects.equals(this.dayChangeIndicator, productDateTimeTypeI270056C.dayChangeIndicator) &&
        Objects.equals(this.depDate, productDateTimeTypeI270056C.depDate) &&
        Objects.equals(this.depTime, productDateTimeTypeI270056C.depTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(arrDate, arrTime, dayChangeIndicator, depDate, depTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductDateTimeTypeI270056C {\n");
    
    sb.append("    arrDate: ").append(toIndentedString(arrDate)).append("\n");
    sb.append("    arrTime: ").append(toIndentedString(arrTime)).append("\n");
    sb.append("    dayChangeIndicator: ").append(toIndentedString(dayChangeIndicator)).append("\n");
    sb.append("    depDate: ").append(toIndentedString(depDate)).append("\n");
    sb.append("    depTime: ").append(toIndentedString(depTime)).append("\n");
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

