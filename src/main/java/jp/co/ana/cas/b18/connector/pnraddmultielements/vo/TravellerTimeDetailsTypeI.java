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
 * TravellerTimeDetailsTypeI
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class TravellerTimeDetailsTypeI   {
  @JsonProperty("checkinTime")
  private String checkinTime;

  public TravellerTimeDetailsTypeI checkinTime(String checkinTime) {
    this.checkinTime = checkinTime;
    return this;
  }

  /**
   * Get checkinTime
   * @return checkinTime
  */
  @ApiModelProperty(value = "")


  public String getCheckinTime() {
    return checkinTime;
  }

  public void setCheckinTime(String checkinTime) {
    this.checkinTime = checkinTime;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TravellerTimeDetailsTypeI travellerTimeDetailsTypeI = (TravellerTimeDetailsTypeI) o;
    return Objects.equals(this.checkinTime, travellerTimeDetailsTypeI.checkinTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(checkinTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TravellerTimeDetailsTypeI {\n");
    
    sb.append("    checkinTime: ").append(toIndentedString(checkinTime)).append("\n");
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

