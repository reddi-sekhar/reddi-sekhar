package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.BinaryDataType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ReferenceInfoType94524S;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TdsBlobData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class TdsBlobData   {
  @JsonProperty("tdsBlbData")
  private BinaryDataType tdsBlbData;

  @JsonProperty("tdsBlbIdentifier")
  private ReferenceInfoType94524S tdsBlbIdentifier;

  public TdsBlobData tdsBlbData(BinaryDataType tdsBlbData) {
    this.tdsBlbData = tdsBlbData;
    return this;
  }

  /**
   * Get tdsBlbData
   * @return tdsBlbData
  */
  @ApiModelProperty(value = "")

  @Valid

  public BinaryDataType getTdsBlbData() {
    return tdsBlbData;
  }

  public void setTdsBlbData(BinaryDataType tdsBlbData) {
    this.tdsBlbData = tdsBlbData;
  }

  public TdsBlobData tdsBlbIdentifier(ReferenceInfoType94524S tdsBlbIdentifier) {
    this.tdsBlbIdentifier = tdsBlbIdentifier;
    return this;
  }

  /**
   * Get tdsBlbIdentifier
   * @return tdsBlbIdentifier
  */
  @ApiModelProperty(value = "")

  @Valid

  public ReferenceInfoType94524S getTdsBlbIdentifier() {
    return tdsBlbIdentifier;
  }

  public void setTdsBlbIdentifier(ReferenceInfoType94524S tdsBlbIdentifier) {
    this.tdsBlbIdentifier = tdsBlbIdentifier;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TdsBlobData tdsBlobData = (TdsBlobData) o;
    return Objects.equals(this.tdsBlbData, tdsBlobData.tdsBlbData) &&
        Objects.equals(this.tdsBlbIdentifier, tdsBlobData.tdsBlbIdentifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tdsBlbData, tdsBlbIdentifier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TdsBlobData {\n");
    
    sb.append("    tdsBlbData: ").append(toIndentedString(tdsBlbData)).append("\n");
    sb.append("    tdsBlbIdentifier: ").append(toIndentedString(tdsBlbIdentifier)).append("\n");
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

