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
 * StructuredRemarkResponseDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class StructuredRemarkResponseDto   {
  @JsonProperty("type")
  private String type;

  @JsonProperty("category")
  private String category;

  @JsonProperty("freetext")
  private String freetext;

  public StructuredRemarkResponseDto type(String type) {
    this.type = type;
    return this;
  }

  /**
   * RIF for invoice remark
   * @return type
  */
  @ApiModelProperty(value = "RIF for invoice remark")

@Size(min=1,max=3) 
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public StructuredRemarkResponseDto category(String category) {
    this.category = category;
    return this;
  }

  /**
   * Category of the remark
   * @return category
  */
  @ApiModelProperty(value = "Category of the remark")

@Size(min=1,max=1) 
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public StructuredRemarkResponseDto freetext(String freetext) {
    this.freetext = freetext;
    return this;
  }

  /**
   * Free text of the remarks.
   * @return freetext
  */
  @ApiModelProperty(value = "Free text of the remarks.")

@Size(min=1,max=127) 
  public String getFreetext() {
    return freetext;
  }

  public void setFreetext(String freetext) {
    this.freetext = freetext;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StructuredRemarkResponseDto structuredRemarkResponseDto = (StructuredRemarkResponseDto) o;
    return Objects.equals(this.type, structuredRemarkResponseDto.type) &&
        Objects.equals(this.category, structuredRemarkResponseDto.category) &&
        Objects.equals(this.freetext, structuredRemarkResponseDto.freetext);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, category, freetext);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StructuredRemarkResponseDto {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    freetext: ").append(toIndentedString(freetext)).append("\n");
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

