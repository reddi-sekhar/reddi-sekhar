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
 * PricingTicketingDetailsType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class PricingTicketingDetailsType   {
  @JsonProperty("idNumber")
  private String idNumber;

  public PricingTicketingDetailsType idNumber(String idNumber) {
    this.idNumber = idNumber;
    return this;
  }

  /**
   * Get idNumber
   * @return idNumber
  */
  @ApiModelProperty(value = "")


  public String getIdNumber() {
    return idNumber;
  }

  public void setIdNumber(String idNumber) {
    this.idNumber = idNumber;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PricingTicketingDetailsType pricingTicketingDetailsType = (PricingTicketingDetailsType) o;
    return Objects.equals(this.idNumber, pricingTicketingDetailsType.idNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PricingTicketingDetailsType {\n");
    
    sb.append("    idNumber: ").append(toIndentedString(idNumber)).append("\n");
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

