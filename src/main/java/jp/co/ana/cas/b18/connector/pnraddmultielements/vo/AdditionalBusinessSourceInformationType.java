package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.OriginatorIdentificationDetailsTypeI198179C;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AdditionalBusinessSourceInformationType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class AdditionalBusinessSourceInformationType   {
  @JsonProperty("originatorDetails")
  private OriginatorIdentificationDetailsTypeI198179C originatorDetails;

  public AdditionalBusinessSourceInformationType originatorDetails(OriginatorIdentificationDetailsTypeI198179C originatorDetails) {
    this.originatorDetails = originatorDetails;
    return this;
  }

  /**
   * Get originatorDetails
   * @return originatorDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public OriginatorIdentificationDetailsTypeI198179C getOriginatorDetails() {
    return originatorDetails;
  }

  public void setOriginatorDetails(OriginatorIdentificationDetailsTypeI198179C originatorDetails) {
    this.originatorDetails = originatorDetails;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdditionalBusinessSourceInformationType additionalBusinessSourceInformationType = (AdditionalBusinessSourceInformationType) o;
    return Objects.equals(this.originatorDetails, additionalBusinessSourceInformationType.originatorDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(originatorDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdditionalBusinessSourceInformationType {\n");
    
    sb.append("    originatorDetails: ").append(toIndentedString(originatorDetails)).append("\n");
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

