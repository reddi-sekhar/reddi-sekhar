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
 * DistributionChannelType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class DistributionChannelType   {
  @JsonProperty("accessType")
  private Long accessType;

  @JsonProperty("distributionChannelField")
  private Long distributionChannelField;

  @JsonProperty("subGroup")
  private Long subGroup;

  public DistributionChannelType accessType(Long accessType) {
    this.accessType = accessType;
    return this;
  }

  /**
   * Get accessType
   * @return accessType
  */
  @ApiModelProperty(value = "")


  public Long getAccessType() {
    return accessType;
  }

  public void setAccessType(Long accessType) {
    this.accessType = accessType;
  }

  public DistributionChannelType distributionChannelField(Long distributionChannelField) {
    this.distributionChannelField = distributionChannelField;
    return this;
  }

  /**
   * Get distributionChannelField
   * @return distributionChannelField
  */
  @ApiModelProperty(value = "")


  public Long getDistributionChannelField() {
    return distributionChannelField;
  }

  public void setDistributionChannelField(Long distributionChannelField) {
    this.distributionChannelField = distributionChannelField;
  }

  public DistributionChannelType subGroup(Long subGroup) {
    this.subGroup = subGroup;
    return this;
  }

  /**
   * Get subGroup
   * @return subGroup
  */
  @ApiModelProperty(value = "")


  public Long getSubGroup() {
    return subGroup;
  }

  public void setSubGroup(Long subGroup) {
    this.subGroup = subGroup;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DistributionChannelType distributionChannelType = (DistributionChannelType) o;
    return Objects.equals(this.accessType, distributionChannelType.accessType) &&
        Objects.equals(this.distributionChannelField, distributionChannelType.distributionChannelField) &&
        Objects.equals(this.subGroup, distributionChannelType.subGroup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessType, distributionChannelField, subGroup);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DistributionChannelType {\n");
    
    sb.append("    accessType: ").append(toIndentedString(accessType)).append("\n");
    sb.append("    distributionChannelField: ").append(toIndentedString(distributionChannelField)).append("\n");
    sb.append("    subGroup: ").append(toIndentedString(subGroup)).append("\n");
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

