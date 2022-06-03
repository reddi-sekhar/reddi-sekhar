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
 * OptionElementInformationType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class OptionElementInformationType   {
  @JsonProperty("category")
  private Long category;

  @JsonProperty("date")
  private String date;

  @JsonProperty("freetext")
  private String freetext;

  @JsonProperty("mainOffice")
  private String mainOffice;

  @JsonProperty("queue")
  private Long queue;

  @JsonProperty("time")
  private String time;

  public OptionElementInformationType category(Long category) {
    this.category = category;
    return this;
  }

  /**
   * Get category
   * @return category
  */
  @ApiModelProperty(value = "")


  public Long getCategory() {
    return category;
  }

  public void setCategory(Long category) {
    this.category = category;
  }

  public OptionElementInformationType date(String date) {
    this.date = date;
    return this;
  }

  /**
   * Get date
   * @return date
  */
  @ApiModelProperty(value = "")


  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public OptionElementInformationType freetext(String freetext) {
    this.freetext = freetext;
    return this;
  }

  /**
   * Get freetext
   * @return freetext
  */
  @ApiModelProperty(value = "")


  public String getFreetext() {
    return freetext;
  }

  public void setFreetext(String freetext) {
    this.freetext = freetext;
  }

  public OptionElementInformationType mainOffice(String mainOffice) {
    this.mainOffice = mainOffice;
    return this;
  }

  /**
   * Get mainOffice
   * @return mainOffice
  */
  @ApiModelProperty(value = "")


  public String getMainOffice() {
    return mainOffice;
  }

  public void setMainOffice(String mainOffice) {
    this.mainOffice = mainOffice;
  }

  public OptionElementInformationType queue(Long queue) {
    this.queue = queue;
    return this;
  }

  /**
   * Get queue
   * @return queue
  */
  @ApiModelProperty(value = "")


  public Long getQueue() {
    return queue;
  }

  public void setQueue(Long queue) {
    this.queue = queue;
  }

  public OptionElementInformationType time(String time) {
    this.time = time;
    return this;
  }

  /**
   * Get time
   * @return time
  */
  @ApiModelProperty(value = "")


  public String getTime() {
    return time;
  }

  public void setTime(String time) {
    this.time = time;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OptionElementInformationType optionElementInformationType = (OptionElementInformationType) o;
    return Objects.equals(this.category, optionElementInformationType.category) &&
        Objects.equals(this.date, optionElementInformationType.date) &&
        Objects.equals(this.freetext, optionElementInformationType.freetext) &&
        Objects.equals(this.mainOffice, optionElementInformationType.mainOffice) &&
        Objects.equals(this.queue, optionElementInformationType.queue) &&
        Objects.equals(this.time, optionElementInformationType.time);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, date, freetext, mainOffice, queue, time);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptionElementInformationType {\n");
    
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    freetext: ").append(toIndentedString(freetext)).append("\n");
    sb.append("    mainOffice: ").append(toIndentedString(mainOffice)).append("\n");
    sb.append("    queue: ").append(toIndentedString(queue)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
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

