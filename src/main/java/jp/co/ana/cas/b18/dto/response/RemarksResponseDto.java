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
 * RemarksResponseDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class RemarksResponseDto   {
  @JsonProperty("type")
  private String type;

  @JsonProperty("category")
  private String category;

  @JsonProperty("freetext")
  private String freetext;

  @JsonProperty("providerType")
  private String providerType;

  public RemarksResponseDto type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Remark type
   * @return type
  */
  @ApiModelProperty(value = "Remark type")

@Size(min=1,max=3) 
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public RemarksResponseDto category(String category) {
    this.category = category;
    return this;
  }

  /**
   * Category number
   * @return category
  */
  @ApiModelProperty(value = "Category number")

@Size(min=1,max=2) 
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public RemarksResponseDto freetext(String freetext) {
    this.freetext = freetext;
    return this;
  }

  /**
   * Free text and message sequence numbers of the remarks.
   * @return freetext
  */
  @ApiModelProperty(value = "Free text and message sequence numbers of the remarks.")

@Size(min=1,max=127) 
  public String getFreetext() {
    return freetext;
  }

  public void setFreetext(String freetext) {
    this.freetext = freetext;
  }

  public RemarksResponseDto providerType(String providerType) {
    this.providerType = providerType;
    return this;
  }

  /**
   * Provider Type
   * @return providerType
  */
  @ApiModelProperty(value = "Provider Type")

@Size(min=1,max=3) 
  public String getProviderType() {
    return providerType;
  }

  public void setProviderType(String providerType) {
    this.providerType = providerType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RemarksResponseDto remarksResponseDto = (RemarksResponseDto) o;
    return Objects.equals(this.type, remarksResponseDto.type) &&
        Objects.equals(this.category, remarksResponseDto.category) &&
        Objects.equals(this.freetext, remarksResponseDto.freetext) &&
        Objects.equals(this.providerType, remarksResponseDto.providerType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, category, freetext, providerType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemarksResponseDto {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    freetext: ").append(toIndentedString(freetext)).append("\n");
    sb.append("    providerType: ").append(toIndentedString(providerType)).append("\n");
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

