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
 * OptionElementInfoResponseDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class OptionElementInfoResponseDto   {
  @JsonProperty("date")
  private String date;

  @JsonProperty("queue")
  private Long queue;

  @JsonProperty("freetext")
  private String freetext;

  @JsonProperty("mainOffice")
  private String mainOffice;

  @JsonProperty("category")
  private Long category;

  @JsonProperty("time")
  private String time;

  public OptionElementInfoResponseDto date(String date) {
    this.date = date;
    return this;
  }

  /**
   * Date
   * @return date
  */
  @ApiModelProperty(example = "150322", value = "Date")

@Pattern(regexp="(0[1-9]|[1-2][0-9]|3[0-1])(0[1-9]|1[0-2])[0-9]{2}") 
  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public OptionElementInfoResponseDto queue(Long queue) {
    this.queue = queue;
    return this;
  }

  /**
   * Queue number
   * @return queue
  */
  @ApiModelProperty(example = "1", value = "Queue number")


  public Long getQueue() {
    return queue;
  }

  public void setQueue(Long queue) {
    this.queue = queue;
  }

  public OptionElementInfoResponseDto freetext(String freetext) {
    this.freetext = freetext;
    return this;
  }

  /**
   * free text information.
   * @return freetext
  */
  @ApiModelProperty(example = "NH REQUIRES TICKET ON OR BEFORE 18MAR:2359 TYO TIME ZONE", value = "free text information.")

@Size(min=1,max=61) 
  public String getFreetext() {
    return freetext;
  }

  public void setFreetext(String freetext) {
    this.freetext = freetext;
  }

  public OptionElementInfoResponseDto mainOffice(String mainOffice) {
    this.mainOffice = mainOffice;
    return this;
  }

  /**
   * Option element office id
   * @return mainOffice
  */
  @ApiModelProperty(value = "Option element office id")

@Size(min=1,max=9) 
  public String getMainOffice() {
    return mainOffice;
  }

  public void setMainOffice(String mainOffice) {
    this.mainOffice = mainOffice;
  }

  public OptionElementInfoResponseDto category(Long category) {
    this.category = category;
    return this;
  }

  /**
   * Category number
   * @return category
  */
  @ApiModelProperty(value = "Category number")


  public Long getCategory() {
    return category;
  }

  public void setCategory(Long category) {
    this.category = category;
  }

  public OptionElementInfoResponseDto time(String time) {
    this.time = time;
    return this;
  }

  /**
   * queuing or cancellation time
   * @return time
  */
  @ApiModelProperty(value = "queuing or cancellation time")

@Pattern(regexp="([0-1][0-9]|2[0-3])[0-5][0-9]") 
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
    OptionElementInfoResponseDto optionElementInfoResponseDto = (OptionElementInfoResponseDto) o;
    return Objects.equals(this.date, optionElementInfoResponseDto.date) &&
        Objects.equals(this.queue, optionElementInfoResponseDto.queue) &&
        Objects.equals(this.freetext, optionElementInfoResponseDto.freetext) &&
        Objects.equals(this.mainOffice, optionElementInfoResponseDto.mainOffice) &&
        Objects.equals(this.category, optionElementInfoResponseDto.category) &&
        Objects.equals(this.time, optionElementInfoResponseDto.time);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, queue, freetext, mainOffice, category, time);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptionElementInfoResponseDto {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    queue: ").append(toIndentedString(queue)).append("\n");
    sb.append("    freetext: ").append(toIndentedString(freetext)).append("\n");
    sb.append("    mainOffice: ").append(toIndentedString(mainOffice)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
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

