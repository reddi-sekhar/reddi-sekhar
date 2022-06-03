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
 * RateInformationDetailsType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class RateInformationDetailsType   {
  @JsonProperty("ratePlan")
  private String ratePlan;

  public RateInformationDetailsType ratePlan(String ratePlan) {
    this.ratePlan = ratePlan;
    return this;
  }

  /**
   * Get ratePlan
   * @return ratePlan
  */
  @ApiModelProperty(value = "")


  public String getRatePlan() {
    return ratePlan;
  }

  public void setRatePlan(String ratePlan) {
    this.ratePlan = ratePlan;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RateInformationDetailsType rateInformationDetailsType = (RateInformationDetailsType) o;
    return Objects.equals(this.ratePlan, rateInformationDetailsType.ratePlan);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ratePlan);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RateInformationDetailsType {\n");
    
    sb.append("    ratePlan: ").append(toIndentedString(ratePlan)).append("\n");
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

