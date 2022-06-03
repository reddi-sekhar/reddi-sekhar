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
 * MiscellaneousRemarkType210666C
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class MiscellaneousRemarkType210666C   {
  @JsonProperty("category")
  private String category;

  @JsonProperty("encoding")
  private String encoding;

  @JsonProperty("freetext")
  private String freetext;

  @JsonProperty("status")
  private String status;

  @JsonProperty("type")
  private String type;

  public MiscellaneousRemarkType210666C category(String category) {
    this.category = category;
    return this;
  }

  /**
   * Get category
   * @return category
  */
  @ApiModelProperty(value = "")


  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public MiscellaneousRemarkType210666C encoding(String encoding) {
    this.encoding = encoding;
    return this;
  }

  /**
   * Get encoding
   * @return encoding
  */
  @ApiModelProperty(value = "")


  public String getEncoding() {
    return encoding;
  }

  public void setEncoding(String encoding) {
    this.encoding = encoding;
  }

  public MiscellaneousRemarkType210666C freetext(String freetext) {
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

  public MiscellaneousRemarkType210666C status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @ApiModelProperty(value = "")


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public MiscellaneousRemarkType210666C type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  @ApiModelProperty(value = "")


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MiscellaneousRemarkType210666C miscellaneousRemarkType210666C = (MiscellaneousRemarkType210666C) o;
    return Objects.equals(this.category, miscellaneousRemarkType210666C.category) &&
        Objects.equals(this.encoding, miscellaneousRemarkType210666C.encoding) &&
        Objects.equals(this.freetext, miscellaneousRemarkType210666C.freetext) &&
        Objects.equals(this.status, miscellaneousRemarkType210666C.status) &&
        Objects.equals(this.type, miscellaneousRemarkType210666C.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, encoding, freetext, status, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MiscellaneousRemarkType210666C {\n");
    
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    encoding: ").append(toIndentedString(encoding)).append("\n");
    sb.append("    freetext: ").append(toIndentedString(freetext)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

