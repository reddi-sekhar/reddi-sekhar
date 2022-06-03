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
 * OriginatorIdentificationDetailsTypeI170735C
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class OriginatorIdentificationDetailsTypeI170735C   {
  @JsonProperty("inHouseIdentification1")
  private String inHouseIdentification1;

  @JsonProperty("inHouseIdentification2")
  private Long inHouseIdentification2;

  @JsonProperty("originatorId")
  private Long originatorId;

  public OriginatorIdentificationDetailsTypeI170735C inHouseIdentification1(String inHouseIdentification1) {
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

  public OriginatorIdentificationDetailsTypeI170735C inHouseIdentification2(Long inHouseIdentification2) {
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

  public OriginatorIdentificationDetailsTypeI170735C originatorId(Long originatorId) {
    this.originatorId = originatorId;
    return this;
  }

  /**
   * Get originatorId
   * @return originatorId
  */
  @ApiModelProperty(value = "")


  public Long getOriginatorId() {
    return originatorId;
  }

  public void setOriginatorId(Long originatorId) {
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
    OriginatorIdentificationDetailsTypeI170735C originatorIdentificationDetailsTypeI170735C = (OriginatorIdentificationDetailsTypeI170735C) o;
    return Objects.equals(this.inHouseIdentification1, originatorIdentificationDetailsTypeI170735C.inHouseIdentification1) &&
        Objects.equals(this.inHouseIdentification2, originatorIdentificationDetailsTypeI170735C.inHouseIdentification2) &&
        Objects.equals(this.originatorId, originatorIdentificationDetailsTypeI170735C.originatorId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inHouseIdentification1, inHouseIdentification2, originatorId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OriginatorIdentificationDetailsTypeI170735C {\n");
    
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

