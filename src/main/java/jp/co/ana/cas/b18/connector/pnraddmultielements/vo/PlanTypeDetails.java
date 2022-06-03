package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.InsuranceProviderAndProductsType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.MonetaryInformationTypeI;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PlanTypeDetails
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class PlanTypeDetails   {
  @JsonProperty("planType")
  private InsuranceProviderAndProductsType planType;

  @JsonProperty("travelValue")
  private MonetaryInformationTypeI travelValue;

  public PlanTypeDetails planType(InsuranceProviderAndProductsType planType) {
    this.planType = planType;
    return this;
  }

  /**
   * Get planType
   * @return planType
  */
  @ApiModelProperty(value = "")

  @Valid

  public InsuranceProviderAndProductsType getPlanType() {
    return planType;
  }

  public void setPlanType(InsuranceProviderAndProductsType planType) {
    this.planType = planType;
  }

  public PlanTypeDetails travelValue(MonetaryInformationTypeI travelValue) {
    this.travelValue = travelValue;
    return this;
  }

  /**
   * Get travelValue
   * @return travelValue
  */
  @ApiModelProperty(value = "")

  @Valid

  public MonetaryInformationTypeI getTravelValue() {
    return travelValue;
  }

  public void setTravelValue(MonetaryInformationTypeI travelValue) {
    this.travelValue = travelValue;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlanTypeDetails planTypeDetails = (PlanTypeDetails) o;
    return Objects.equals(this.planType, planTypeDetails.planType) &&
        Objects.equals(this.travelValue, planTypeDetails.travelValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(planType, travelValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlanTypeDetails {\n");
    
    sb.append("    planType: ").append(toIndentedString(planType)).append("\n");
    sb.append("    travelValue: ").append(toIndentedString(travelValue)).append("\n");
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

