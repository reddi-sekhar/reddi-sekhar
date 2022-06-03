package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.FormOfPaymentInformationType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TicketingFormOfPaymentType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class TicketingFormOfPaymentType   {
  @JsonProperty("fopDetails")
  @Valid
  private List<FormOfPaymentInformationType> fopDetails = null;

  public TicketingFormOfPaymentType fopDetails(List<FormOfPaymentInformationType> fopDetails) {
    this.fopDetails = fopDetails;
    return this;
  }

  public TicketingFormOfPaymentType addFopDetailsItem(FormOfPaymentInformationType fopDetailsItem) {
    if (this.fopDetails == null) {
      this.fopDetails = new ArrayList<>();
    }
    this.fopDetails.add(fopDetailsItem);
    return this;
  }

  /**
   * Get fopDetails
   * @return fopDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<FormOfPaymentInformationType> getFopDetails() {
    return fopDetails;
  }

  public void setFopDetails(List<FormOfPaymentInformationType> fopDetails) {
    this.fopDetails = fopDetails;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TicketingFormOfPaymentType ticketingFormOfPaymentType = (TicketingFormOfPaymentType) o;
    return Objects.equals(this.fopDetails, ticketingFormOfPaymentType.fopDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fopDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TicketingFormOfPaymentType {\n");
    
    sb.append("    fopDetails: ").append(toIndentedString(fopDetails)).append("\n");
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

