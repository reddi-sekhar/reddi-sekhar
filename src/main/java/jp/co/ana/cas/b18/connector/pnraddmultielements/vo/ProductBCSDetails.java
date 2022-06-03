package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.SystemDetailsInfoType25482S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.UserIdentificationType25447S;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ProductBCSDetails
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class ProductBCSDetails   {
  @JsonProperty("agentIdentification")
  private UserIdentificationType25447S agentIdentification;

  @JsonProperty("distributionChannelData")
  private SystemDetailsInfoType25482S distributionChannelData;

  public ProductBCSDetails agentIdentification(UserIdentificationType25447S agentIdentification) {
    this.agentIdentification = agentIdentification;
    return this;
  }

  /**
   * Get agentIdentification
   * @return agentIdentification
  */
  @ApiModelProperty(value = "")

  @Valid

  public UserIdentificationType25447S getAgentIdentification() {
    return agentIdentification;
  }

  public void setAgentIdentification(UserIdentificationType25447S agentIdentification) {
    this.agentIdentification = agentIdentification;
  }

  public ProductBCSDetails distributionChannelData(SystemDetailsInfoType25482S distributionChannelData) {
    this.distributionChannelData = distributionChannelData;
    return this;
  }

  /**
   * Get distributionChannelData
   * @return distributionChannelData
  */
  @ApiModelProperty(value = "")

  @Valid

  public SystemDetailsInfoType25482S getDistributionChannelData() {
    return distributionChannelData;
  }

  public void setDistributionChannelData(SystemDetailsInfoType25482S distributionChannelData) {
    this.distributionChannelData = distributionChannelData;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductBCSDetails productBCSDetails = (ProductBCSDetails) o;
    return Objects.equals(this.agentIdentification, productBCSDetails.agentIdentification) &&
        Objects.equals(this.distributionChannelData, productBCSDetails.distributionChannelData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentIdentification, distributionChannelData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductBCSDetails {\n");
    
    sb.append("    agentIdentification: ").append(toIndentedString(agentIdentification)).append("\n");
    sb.append("    distributionChannelData: ").append(toIndentedString(distributionChannelData)).append("\n");
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

