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
 * DateRangeType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class DateRangeType   {
  @JsonProperty("dateRangeNum")
  private Long dateRangeNum;

  public DateRangeType dateRangeNum(Long dateRangeNum) {
    this.dateRangeNum = dateRangeNum;
    return this;
  }

  /**
   * Get dateRangeNum
   * @return dateRangeNum
  */
  @ApiModelProperty(value = "")


  public Long getDateRangeNum() {
    return dateRangeNum;
  }

  public void setDateRangeNum(Long dateRangeNum) {
    this.dateRangeNum = dateRangeNum;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DateRangeType dateRangeType = (DateRangeType) o;
    return Objects.equals(this.dateRangeNum, dateRangeType.dateRangeNum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateRangeNum);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DateRangeType {\n");
    
    sb.append("    dateRangeNum: ").append(toIndentedString(dateRangeNum)).append("\n");
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

