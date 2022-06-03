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
 * FareCategoryCodesTypeI
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class FareCategoryCodesTypeI   {
  @JsonProperty("fareType")
  private String fareType;

  public FareCategoryCodesTypeI fareType(String fareType) {
    this.fareType = fareType;
    return this;
  }

  /**
   * Get fareType
   * @return fareType
  */
  @ApiModelProperty(value = "")


  public String getFareType() {
    return fareType;
  }

  public void setFareType(String fareType) {
    this.fareType = fareType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FareCategoryCodesTypeI fareCategoryCodesTypeI = (FareCategoryCodesTypeI) o;
    return Objects.equals(this.fareType, fareCategoryCodesTypeI.fareType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fareType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FareCategoryCodesTypeI {\n");
    
    sb.append("    fareType: ").append(toIndentedString(fareType)).append("\n");
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

