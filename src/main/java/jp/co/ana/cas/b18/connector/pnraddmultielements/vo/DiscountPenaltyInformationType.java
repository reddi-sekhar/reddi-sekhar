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
 * DiscountPenaltyInformationType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class DiscountPenaltyInformationType   {
  @JsonProperty("fareQualifier")
  private String fareQualifier;

  public DiscountPenaltyInformationType fareQualifier(String fareQualifier) {
    this.fareQualifier = fareQualifier;
    return this;
  }

  /**
   * Get fareQualifier
   * @return fareQualifier
  */
  @ApiModelProperty(value = "")


  public String getFareQualifier() {
    return fareQualifier;
  }

  public void setFareQualifier(String fareQualifier) {
    this.fareQualifier = fareQualifier;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DiscountPenaltyInformationType discountPenaltyInformationType = (DiscountPenaltyInformationType) o;
    return Objects.equals(this.fareQualifier, discountPenaltyInformationType.fareQualifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fareQualifier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DiscountPenaltyInformationType {\n");
    
    sb.append("    fareQualifier: ").append(toIndentedString(fareQualifier)).append("\n");
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

