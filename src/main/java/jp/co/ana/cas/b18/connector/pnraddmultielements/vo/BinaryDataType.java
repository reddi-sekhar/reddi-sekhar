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
 * BinaryDataType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class BinaryDataType   {
  @JsonProperty("binaryData")
  private String binaryData;

  @JsonProperty("dataLength")
  private Long dataLength;

  @JsonProperty("dataType")
  private String dataType;

  public BinaryDataType binaryData(String binaryData) {
    this.binaryData = binaryData;
    return this;
  }

  /**
   * Get binaryData
   * @return binaryData
  */
  @ApiModelProperty(value = "")


  public String getBinaryData() {
    return binaryData;
  }

  public void setBinaryData(String binaryData) {
    this.binaryData = binaryData;
  }

  public BinaryDataType dataLength(Long dataLength) {
    this.dataLength = dataLength;
    return this;
  }

  /**
   * Get dataLength
   * @return dataLength
  */
  @ApiModelProperty(value = "")


  public Long getDataLength() {
    return dataLength;
  }

  public void setDataLength(Long dataLength) {
    this.dataLength = dataLength;
  }

  public BinaryDataType dataType(String dataType) {
    this.dataType = dataType;
    return this;
  }

  /**
   * Get dataType
   * @return dataType
  */
  @ApiModelProperty(value = "")


  public String getDataType() {
    return dataType;
  }

  public void setDataType(String dataType) {
    this.dataType = dataType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BinaryDataType binaryDataType = (BinaryDataType) o;
    return Objects.equals(this.binaryData, binaryDataType.binaryData) &&
        Objects.equals(this.dataLength, binaryDataType.dataLength) &&
        Objects.equals(this.dataType, binaryDataType.dataType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(binaryData, dataLength, dataType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BinaryDataType {\n");
    
    sb.append("    binaryData: ").append(toIndentedString(binaryData)).append("\n");
    sb.append("    dataLength: ").append(toIndentedString(dataLength)).append("\n");
    sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
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

