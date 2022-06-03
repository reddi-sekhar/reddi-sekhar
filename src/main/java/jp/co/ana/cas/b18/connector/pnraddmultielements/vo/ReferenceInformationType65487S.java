package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ReferencingDetailsTypeI;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ReferenceInformationType65487S
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class ReferenceInformationType65487S   {
  @JsonProperty("passengerReference")
  private ReferencingDetailsTypeI passengerReference;

  public ReferenceInformationType65487S passengerReference(ReferencingDetailsTypeI passengerReference) {
    this.passengerReference = passengerReference;
    return this;
  }

  /**
   * Get passengerReference
   * @return passengerReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public ReferencingDetailsTypeI getPassengerReference() {
    return passengerReference;
  }

  public void setPassengerReference(ReferencingDetailsTypeI passengerReference) {
    this.passengerReference = passengerReference;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReferenceInformationType65487S referenceInformationType65487S = (ReferenceInformationType65487S) o;
    return Objects.equals(this.passengerReference, referenceInformationType65487S.passengerReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(passengerReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReferenceInformationType65487S {\n");
    
    sb.append("    passengerReference: ").append(toIndentedString(passengerReference)).append("\n");
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

