package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.SequenceInformationTypeU;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SequenceDetailsTypeU94494S
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class SequenceDetailsTypeU94494S   {
  @JsonProperty("sequenceDetails")
  private SequenceInformationTypeU sequenceDetails;

  public SequenceDetailsTypeU94494S sequenceDetails(SequenceInformationTypeU sequenceDetails) {
    this.sequenceDetails = sequenceDetails;
    return this;
  }

  /**
   * Get sequenceDetails
   * @return sequenceDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public SequenceInformationTypeU getSequenceDetails() {
    return sequenceDetails;
  }

  public void setSequenceDetails(SequenceInformationTypeU sequenceDetails) {
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
    SequenceDetailsTypeU94494S sequenceDetailsTypeU94494S = (SequenceDetailsTypeU94494S) o;
    return Objects.equals(this.sequenceDetails, sequenceDetailsTypeU94494S.sequenceDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sequenceDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SequenceDetailsTypeU94494S {\n");
    
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

