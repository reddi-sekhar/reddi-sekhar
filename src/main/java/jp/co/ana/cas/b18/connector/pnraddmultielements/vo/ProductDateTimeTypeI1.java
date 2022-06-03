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
 * ProductDateTimeTypeI1
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class ProductDateTimeTypeI1   {
  @JsonProperty("arrDate")
  private String arrDate;

  @JsonProperty("arrTime")
  private String arrTime;

  @JsonProperty("depDate")
  private String depDate;

  @JsonProperty("depTime")
  private String depTime;

  public ProductDateTimeTypeI1 arrDate(String arrDate) {
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

  public ProductDateTimeTypeI1 arrTime(String arrTime) {
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

  public ProductDateTimeTypeI1 depDate(String depDate) {
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

  public ProductDateTimeTypeI1 depTime(String depTime) {
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
    ProductDateTimeTypeI1 productDateTimeTypeI1 = (ProductDateTimeTypeI1) o;
    return Objects.equals(this.arrDate, productDateTimeTypeI1.arrDate) &&
        Objects.equals(this.arrTime, productDateTimeTypeI1.arrTime) &&
        Objects.equals(this.depDate, productDateTimeTypeI1.depDate) &&
        Objects.equals(this.depTime, productDateTimeTypeI1.depTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(arrDate, arrTime, depDate, depTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductDateTimeTypeI1 {\n");
    
    sb.append("    arrDate: ").append(toIndentedString(arrDate)).append("\n");
    sb.append("    arrTime: ").append(toIndentedString(arrTime)).append("\n");
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

