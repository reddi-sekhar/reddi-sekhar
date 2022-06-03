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
 * FrequencyDetailsTypeU
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class FrequencyDetailsTypeU   {
  @JsonProperty("instalmentsDatrDateFormat")
  private String instalmentsDatrDateFormat;

  @JsonProperty("instalmentsFrequency")
  private String instalmentsFrequency;

  @JsonProperty("instalmentsNumber")
  private Long instalmentsNumber;

  @JsonProperty("instalmentsStartDate")
  private String instalmentsStartDate;

  public FrequencyDetailsTypeU instalmentsDatrDateFormat(String instalmentsDatrDateFormat) {
    this.instalmentsDatrDateFormat = instalmentsDatrDateFormat;
    return this;
  }

  /**
   * Get instalmentsDatrDateFormat
   * @return instalmentsDatrDateFormat
  */
  @ApiModelProperty(value = "")


  public String getInstalmentsDatrDateFormat() {
    return instalmentsDatrDateFormat;
  }

  public void setInstalmentsDatrDateFormat(String instalmentsDatrDateFormat) {
    this.instalmentsDatrDateFormat = instalmentsDatrDateFormat;
  }

  public FrequencyDetailsTypeU instalmentsFrequency(String instalmentsFrequency) {
    this.instalmentsFrequency = instalmentsFrequency;
    return this;
  }

  /**
   * Get instalmentsFrequency
   * @return instalmentsFrequency
  */
  @ApiModelProperty(value = "")


  public String getInstalmentsFrequency() {
    return instalmentsFrequency;
  }

  public void setInstalmentsFrequency(String instalmentsFrequency) {
    this.instalmentsFrequency = instalmentsFrequency;
  }

  public FrequencyDetailsTypeU instalmentsNumber(Long instalmentsNumber) {
    this.instalmentsNumber = instalmentsNumber;
    return this;
  }

  /**
   * Get instalmentsNumber
   * @return instalmentsNumber
  */
  @ApiModelProperty(value = "")


  public Long getInstalmentsNumber() {
    return instalmentsNumber;
  }

  public void setInstalmentsNumber(Long instalmentsNumber) {
    this.instalmentsNumber = instalmentsNumber;
  }

  public FrequencyDetailsTypeU instalmentsStartDate(String instalmentsStartDate) {
    this.instalmentsStartDate = instalmentsStartDate;
    return this;
  }

  /**
   * Get instalmentsStartDate
   * @return instalmentsStartDate
  */
  @ApiModelProperty(value = "")


  public String getInstalmentsStartDate() {
    return instalmentsStartDate;
  }

  public void setInstalmentsStartDate(String instalmentsStartDate) {
    this.instalmentsStartDate = instalmentsStartDate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FrequencyDetailsTypeU frequencyDetailsTypeU = (FrequencyDetailsTypeU) o;
    return Objects.equals(this.instalmentsDatrDateFormat, frequencyDetailsTypeU.instalmentsDatrDateFormat) &&
        Objects.equals(this.instalmentsFrequency, frequencyDetailsTypeU.instalmentsFrequency) &&
        Objects.equals(this.instalmentsNumber, frequencyDetailsTypeU.instalmentsNumber) &&
        Objects.equals(this.instalmentsStartDate, frequencyDetailsTypeU.instalmentsStartDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instalmentsDatrDateFormat, instalmentsFrequency, instalmentsNumber, instalmentsStartDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FrequencyDetailsTypeU {\n");
    
    sb.append("    instalmentsDatrDateFormat: ").append(toIndentedString(instalmentsDatrDateFormat)).append("\n");
    sb.append("    instalmentsFrequency: ").append(toIndentedString(instalmentsFrequency)).append("\n");
    sb.append("    instalmentsNumber: ").append(toIndentedString(instalmentsNumber)).append("\n");
    sb.append("    instalmentsStartDate: ").append(toIndentedString(instalmentsStartDate)).append("\n");
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

