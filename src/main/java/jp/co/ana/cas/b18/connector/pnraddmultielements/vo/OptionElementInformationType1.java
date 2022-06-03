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
 * OptionElementInformationType1
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class OptionElementInformationType1   {
  @JsonProperty("category")
  private Long category;

  @JsonProperty("date")
  private String date;

  @JsonProperty("freetext")
  private String freetext;

  @JsonProperty("officeId")
  private String officeId;

  @JsonProperty("queue")
  private Long queue;

  public OptionElementInformationType1 category(Long category) {
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

  public OptionElementInformationType1 date(String date) {
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

  public OptionElementInformationType1 freetext(String freetext) {
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

  public OptionElementInformationType1 officeId(String officeId) {
    this.officeId = officeId;
    return this;
  }

  /**
   * Get officeId
   * @return officeId
  */
  @ApiModelProperty(value = "")


  public String getOfficeId() {
    return officeId;
  }

  public void setOfficeId(String officeId) {
    this.officeId = officeId;
  }

  public OptionElementInformationType1 queue(Long queue) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OptionElementInformationType1 optionElementInformationType1 = (OptionElementInformationType1) o;
    return Objects.equals(this.category, optionElementInformationType1.category) &&
        Objects.equals(this.date, optionElementInformationType1.date) &&
        Objects.equals(this.freetext, optionElementInformationType1.freetext) &&
        Objects.equals(this.officeId, optionElementInformationType1.officeId) &&
        Objects.equals(this.queue, optionElementInformationType1.queue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, date, freetext, officeId, queue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptionElementInformationType1 {\n");
    
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    freetext: ").append(toIndentedString(freetext)).append("\n");
    sb.append("    officeId: ").append(toIndentedString(officeId)).append("\n");
    sb.append("    queue: ").append(toIndentedString(queue)).append("\n");
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

