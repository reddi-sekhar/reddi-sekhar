package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.FareCategoryCodesTypeI;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FareQualifierDetailsTypeI
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class FareQualifierDetailsTypeI   {
  @JsonProperty("fareCategories")
  private FareCategoryCodesTypeI fareCategories;

  public FareQualifierDetailsTypeI fareCategories(FareCategoryCodesTypeI fareCategories) {
    this.fareCategories = fareCategories;
    return this;
  }

  /**
   * Get fareCategories
   * @return fareCategories
  */
  @ApiModelProperty(value = "")

  @Valid

  public FareCategoryCodesTypeI getFareCategories() {
    return fareCategories;
  }

  public void setFareCategories(FareCategoryCodesTypeI fareCategories) {
    this.fareCategories = fareCategories;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FareQualifierDetailsTypeI fareQualifierDetailsTypeI = (FareQualifierDetailsTypeI) o;
    return Objects.equals(this.fareCategories, fareQualifierDetailsTypeI.fareCategories);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fareCategories);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FareQualifierDetailsTypeI {\n");
    
    sb.append("    fareCategories: ").append(toIndentedString(fareCategories)).append("\n");
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

