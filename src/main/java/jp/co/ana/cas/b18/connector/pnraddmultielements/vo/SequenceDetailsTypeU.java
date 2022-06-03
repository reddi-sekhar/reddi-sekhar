package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.SequenceInformationTypeU24073C;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SequenceDetailsTypeU
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class SequenceDetailsTypeU   {
  @JsonProperty("actionRequest")
  private String actionRequest;

  @JsonProperty("sequenceDetails")
  private SequenceInformationTypeU24073C sequenceDetails;

  public SequenceDetailsTypeU actionRequest(String actionRequest) {
    this.actionRequest = actionRequest;
    return this;
  }

  /**
   * Get actionRequest
   * @return actionRequest
  */
  @ApiModelProperty(value = "")


  public String getActionRequest() {
    return actionRequest;
  }

  public void setActionRequest(String actionRequest) {
    this.actionRequest = actionRequest;
  }

  public SequenceDetailsTypeU sequenceDetails(SequenceInformationTypeU24073C sequenceDetails) {
    this.sequenceDetails = sequenceDetails;
    return this;
  }

  /**
   * Get sequenceDetails
   * @return sequenceDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public SequenceInformationTypeU24073C getSequenceDetails() {
    return sequenceDetails;
  }

  public void setSequenceDetails(SequenceInformationTypeU24073C sequenceDetails) {
    this.sequenceDetails = sequenceDetails;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SequenceDetailsTypeU sequenceDetailsTypeU = (SequenceDetailsTypeU) o;
    return Objects.equals(this.actionRequest, sequenceDetailsTypeU.actionRequest) &&
        Objects.equals(this.sequenceDetails, sequenceDetailsTypeU.sequenceDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionRequest, sequenceDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SequenceDetailsTypeU {\n");
    
    sb.append("    actionRequest: ").append(toIndentedString(actionRequest)).append("\n");
    sb.append("    sequenceDetails: ").append(toIndentedString(sequenceDetails)).append("\n");
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

