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
 * PnrHistoryDataType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class PnrHistoryDataType   {
  @JsonProperty("currentRecord")
  private Long currentRecord;

  @JsonProperty("elementData")
  private String elementData;

  @JsonProperty("elementType")
  private String elementType;

  @JsonProperty("previousRecord")
  private Long previousRecord;

  public PnrHistoryDataType currentRecord(Long currentRecord) {
    this.currentRecord = currentRecord;
    return this;
  }

  /**
   * Get currentRecord
   * @return currentRecord
  */
  @ApiModelProperty(value = "")


  public Long getCurrentRecord() {
    return currentRecord;
  }

  public void setCurrentRecord(Long currentRecord) {
    this.currentRecord = currentRecord;
  }

  public PnrHistoryDataType elementData(String elementData) {
    this.elementData = elementData;
    return this;
  }

  /**
   * Get elementData
   * @return elementData
  */
  @ApiModelProperty(value = "")


  public String getElementData() {
    return elementData;
  }

  public void setElementData(String elementData) {
    this.elementData = elementData;
  }

  public PnrHistoryDataType elementType(String elementType) {
    this.elementType = elementType;
    return this;
  }

  /**
   * Get elementType
   * @return elementType
  */
  @ApiModelProperty(value = "")


  public String getElementType() {
    return elementType;
  }

  public void setElementType(String elementType) {
    this.elementType = elementType;
  }

  public PnrHistoryDataType previousRecord(Long previousRecord) {
    this.previousRecord = previousRecord;
    return this;
  }

  /**
   * Get previousRecord
   * @return previousRecord
  */
  @ApiModelProperty(value = "")


  public Long getPreviousRecord() {
    return previousRecord;
  }

  public void setPreviousRecord(Long previousRecord) {
    this.previousRecord = previousRecord;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PnrHistoryDataType pnrHistoryDataType = (PnrHistoryDataType) o;
    return Objects.equals(this.currentRecord, pnrHistoryDataType.currentRecord) &&
        Objects.equals(this.elementData, pnrHistoryDataType.elementData) &&
        Objects.equals(this.elementType, pnrHistoryDataType.elementType) &&
        Objects.equals(this.previousRecord, pnrHistoryDataType.previousRecord);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentRecord, elementData, elementType, previousRecord);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PnrHistoryDataType {\n");
    
    sb.append("    currentRecord: ").append(toIndentedString(currentRecord)).append("\n");
    sb.append("    elementData: ").append(toIndentedString(elementData)).append("\n");
    sb.append("    elementType: ").append(toIndentedString(elementType)).append("\n");
    sb.append("    previousRecord: ").append(toIndentedString(previousRecord)).append("\n");
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

