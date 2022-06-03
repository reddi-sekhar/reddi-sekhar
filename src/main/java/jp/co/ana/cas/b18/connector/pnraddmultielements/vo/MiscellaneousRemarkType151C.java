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
 * MiscellaneousRemarkType151C
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class MiscellaneousRemarkType151C   {
  @JsonProperty("category")
  private String category;

  @JsonProperty("freetext")
  private String freetext;

  @JsonProperty("providerType")
  private String providerType;

  @JsonProperty("type")
  private String type;

  public MiscellaneousRemarkType151C category(String category) {
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

  public MiscellaneousRemarkType151C freetext(String freetext) {
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

  public MiscellaneousRemarkType151C providerType(String providerType) {
    this.providerType = providerType;
    return this;
  }

  /**
   * Get providerType
   * @return providerType
  */
  @ApiModelProperty(value = "")


  public String getProviderType() {
    return providerType;
  }

  public void setProviderType(String providerType) {
    this.providerType = providerType;
  }

  public MiscellaneousRemarkType151C type(String type) {
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
    MiscellaneousRemarkType151C miscellaneousRemarkType151C = (MiscellaneousRemarkType151C) o;
    return Objects.equals(this.category, miscellaneousRemarkType151C.category) &&
        Objects.equals(this.freetext, miscellaneousRemarkType151C.freetext) &&
        Objects.equals(this.providerType, miscellaneousRemarkType151C.providerType) &&
        Objects.equals(this.type, miscellaneousRemarkType151C.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, freetext, providerType, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MiscellaneousRemarkType151C {\n");
    
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    freetext: ").append(toIndentedString(freetext)).append("\n");
    sb.append("    providerType: ").append(toIndentedString(providerType)).append("\n");
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

