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
 * PnrHistoryDataType27157S
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class PnrHistoryDataType27157S   {
  @JsonProperty("currentRecord")
  private Long currentRecord;

  public PnrHistoryDataType27157S currentRecord(Long currentRecord) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PnrHistoryDataType27157S pnrHistoryDataType27157S = (PnrHistoryDataType27157S) o;
    return Objects.equals(this.currentRecord, pnrHistoryDataType27157S.currentRecord);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentRecord);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PnrHistoryDataType27157S {\n");
    
    sb.append("    currentRecord: ").append(toIndentedString(currentRecord)).append("\n");
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

