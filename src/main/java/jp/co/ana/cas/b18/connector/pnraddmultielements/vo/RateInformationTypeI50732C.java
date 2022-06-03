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
 * RateInformationTypeI50732C
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class RateInformationTypeI50732C   {
  @JsonProperty("fareGroup")
  private String fareGroup;

  public RateInformationTypeI50732C fareGroup(String fareGroup) {
    this.fareGroup = fareGroup;
    return this;
  }

  /**
   * Get fareGroup
   * @return fareGroup
  */
  @ApiModelProperty(value = "")


  public String getFareGroup() {
    return fareGroup;
  }

  public void setFareGroup(String fareGroup) {
    this.fareGroup = fareGroup;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RateInformationTypeI50732C rateInformationTypeI50732C = (RateInformationTypeI50732C) o;
    return Objects.equals(this.fareGroup, rateInformationTypeI50732C.fareGroup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fareGroup);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RateInformationTypeI50732C {\n");
    
    sb.append("    fareGroup: ").append(toIndentedString(fareGroup)).append("\n");
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

