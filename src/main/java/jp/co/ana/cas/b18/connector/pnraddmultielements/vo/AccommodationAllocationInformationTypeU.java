package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.AccommodationAllocationInformationDetailsTypeU;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AccommodationAllocationInformationTypeU
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class AccommodationAllocationInformationTypeU   {
  @JsonProperty("accommAllocation")
  private AccommodationAllocationInformationDetailsTypeU accommAllocation;

  public AccommodationAllocationInformationTypeU accommAllocation(AccommodationAllocationInformationDetailsTypeU accommAllocation) {
    this.accommAllocation = accommAllocation;
    return this;
  }

  /**
   * Get accommAllocation
   * @return accommAllocation
  */
  @ApiModelProperty(value = "")

  @Valid

  public AccommodationAllocationInformationDetailsTypeU getAccommAllocation() {
    return accommAllocation;
  }

  public void setAccommAllocation(AccommodationAllocationInformationDetailsTypeU accommAllocation) {
    this.accommAllocation = accommAllocation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccommodationAllocationInformationTypeU accommodationAllocationInformationTypeU = (AccommodationAllocationInformationTypeU) o;
    return Objects.equals(this.accommAllocation, accommodationAllocationInformationTypeU.accommAllocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accommAllocation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccommodationAllocationInformationTypeU {\n");
    
    sb.append("    accommAllocation: ").append(toIndentedString(accommAllocation)).append("\n");
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

