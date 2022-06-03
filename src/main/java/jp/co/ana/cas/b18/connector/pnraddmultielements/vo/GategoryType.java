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
 * GategoryType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class GategoryType   {
  @JsonProperty("categoryName")
  private String categoryName;

  @JsonProperty("categoryNum1")
  private Long categoryNum1;

  public GategoryType categoryName(String categoryName) {
    this.categoryName = categoryName;
    return this;
  }

  /**
   * Get categoryName
   * @return categoryName
  */
  @ApiModelProperty(value = "")


  public String getCategoryName() {
    return categoryName;
  }

  public void setCategoryName(String categoryName) {
    this.categoryName = categoryName;
  }

  public GategoryType categoryNum1(Long categoryNum1) {
    this.categoryNum1 = categoryNum1;
    return this;
  }

  /**
   * Get categoryNum1
   * @return categoryNum1
  */
  @ApiModelProperty(value = "")


  public Long getCategoryNum1() {
    return categoryNum1;
  }

  public void setCategoryNum1(Long categoryNum1) {
    this.categoryNum1 = categoryNum1;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GategoryType gategoryType = (GategoryType) o;
    return Objects.equals(this.categoryName, gategoryType.categoryName) &&
        Objects.equals(this.categoryNum1, gategoryType.categoryNum1);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categoryName, categoryNum1);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GategoryType {\n");
    
    sb.append("    categoryName: ").append(toIndentedString(categoryName)).append("\n");
    sb.append("    categoryNum1: ").append(toIndentedString(categoryNum1)).append("\n");
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

