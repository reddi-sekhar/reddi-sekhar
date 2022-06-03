package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.FreeTextInformationType9865S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.SequenceDetailsTypeU;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * GroupOfFareElements
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class GroupOfFareElements   {
  @JsonProperty("fareElementData")
  private FreeTextInformationType9865S fareElementData;

  @JsonProperty("sequenceNumber")
  private SequenceDetailsTypeU sequenceNumber;

  public GroupOfFareElements fareElementData(FreeTextInformationType9865S fareElementData) {
    this.fareElementData = fareElementData;
    return this;
  }

  /**
   * Get fareElementData
   * @return fareElementData
  */
  @ApiModelProperty(value = "")

  @Valid

  public FreeTextInformationType9865S getFareElementData() {
    return fareElementData;
  }

  public void setFareElementData(FreeTextInformationType9865S fareElementData) {
    this.fareElementData = fareElementData;
  }

  public GroupOfFareElements sequenceNumber(SequenceDetailsTypeU sequenceNumber) {
    this.sequenceNumber = sequenceNumber;
    return this;
  }

  /**
   * Get sequenceNumber
   * @return sequenceNumber
  */
  @ApiModelProperty(value = "")

  @Valid

  public SequenceDetailsTypeU getSequenceNumber() {
    return sequenceNumber;
  }

  public void setSequenceNumber(SequenceDetailsTypeU sequenceNumber) {
    this.sequenceNumber = sequenceNumber;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupOfFareElements groupOfFareElements = (GroupOfFareElements) o;
    return Objects.equals(this.fareElementData, groupOfFareElements.fareElementData) &&
        Objects.equals(this.sequenceNumber, groupOfFareElements.sequenceNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fareElementData, sequenceNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupOfFareElements {\n");
    
    sb.append("    fareElementData: ").append(toIndentedString(fareElementData)).append("\n");
    sb.append("    sequenceNumber: ").append(toIndentedString(sequenceNumber)).append("\n");
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

