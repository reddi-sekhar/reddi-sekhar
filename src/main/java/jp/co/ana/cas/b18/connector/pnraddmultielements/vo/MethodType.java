package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.DistributionMethodDetails;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * MethodType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class MethodType   {
  @JsonProperty("distributionMethodDetails")
  private DistributionMethodDetails distributionMethodDetails;

  public MethodType distributionMethodDetails(DistributionMethodDetails distributionMethodDetails) {
    this.distributionMethodDetails = distributionMethodDetails;
    return this;
  }

  /**
   * Get distributionMethodDetails
   * @return distributionMethodDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public DistributionMethodDetails getDistributionMethodDetails() {
    return distributionMethodDetails;
  }

  public void setDistributionMethodDetails(DistributionMethodDetails distributionMethodDetails) {
    this.distributionMethodDetails = distributionMethodDetails;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MethodType methodType = (MethodType) o;
    return Objects.equals(this.distributionMethodDetails, methodType.distributionMethodDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(distributionMethodDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MethodType {\n");
    
    sb.append("    distributionMethodDetails: ").append(toIndentedString(distributionMethodDetails)).append("\n");
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

