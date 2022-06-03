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
 * OriginatorIdentificationDetailsType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class OriginatorIdentificationDetailsType   {
  @JsonProperty("inHouseIdentification1")
  private String inHouseIdentification1;

  @JsonProperty("inHouseIdentification2")
  private Long inHouseIdentification2;

  @JsonProperty("originatorId")
  private String originatorId;

  public OriginatorIdentificationDetailsType inHouseIdentification1(String inHouseIdentification1) {
    this.inHouseIdentification1 = inHouseIdentification1;
    return this;
  }

  /**
   * Get inHouseIdentification1
   * @return inHouseIdentification1
  */
  @ApiModelProperty(value = "")


  public String getInHouseIdentification1() {
    return inHouseIdentification1;
  }

  public void setInHouseIdentification1(String inHouseIdentification1) {
    this.inHouseIdentification1 = inHouseIdentification1;
  }

  public OriginatorIdentificationDetailsType inHouseIdentification2(Long inHouseIdentification2) {
    this.inHouseIdentification2 = inHouseIdentification2;
    return this;
  }

  /**
   * Get inHouseIdentification2
   * @return inHouseIdentification2
  */
  @ApiModelProperty(value = "")


  public Long getInHouseIdentification2() {
    return inHouseIdentification2;
  }

  public void setInHouseIdentification2(Long inHouseIdentification2) {
    this.inHouseIdentification2 = inHouseIdentification2;
  }

  public OriginatorIdentificationDetailsType originatorId(String originatorId) {
    this.originatorId = originatorId;
    return this;
  }

  /**
   * Get originatorId
   * @return originatorId
  */
  @ApiModelProperty(value = "")


  public String getOriginatorId() {
    return originatorId;
  }

  public void setOriginatorId(String originatorId) {
    this.originatorId = originatorId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OriginatorIdentificationDetailsType originatorIdentificationDetailsType = (OriginatorIdentificationDetailsType) o;
    return Objects.equals(this.inHouseIdentification1, originatorIdentificationDetailsType.inHouseIdentification1) &&
        Objects.equals(this.inHouseIdentification2, originatorIdentificationDetailsType.inHouseIdentification2) &&
        Objects.equals(this.originatorId, originatorIdentificationDetailsType.originatorId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inHouseIdentification1, inHouseIdentification2, originatorId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OriginatorIdentificationDetailsType {\n");
    
    sb.append("    inHouseIdentification1: ").append(toIndentedString(inHouseIdentification1)).append("\n");
    sb.append("    inHouseIdentification2: ").append(toIndentedString(inHouseIdentification2)).append("\n");
    sb.append("    originatorId: ").append(toIndentedString(originatorId)).append("\n");
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

