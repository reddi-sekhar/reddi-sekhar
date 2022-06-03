package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.InternalIDDetailsType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TicketAgentInfoType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class TicketAgentInfoType   {
  @JsonProperty("companyIdNumber")
  private String companyIdNumber;

  @JsonProperty("internalIdDetails")
  @Valid
  private List<InternalIDDetailsType> internalIdDetails = null;

  public TicketAgentInfoType companyIdNumber(String companyIdNumber) {
    this.companyIdNumber = companyIdNumber;
    return this;
  }

  /**
   * Get companyIdNumber
   * @return companyIdNumber
  */
  @ApiModelProperty(value = "")


  public String getCompanyIdNumber() {
    return companyIdNumber;
  }

  public void setCompanyIdNumber(String companyIdNumber) {
    this.companyIdNumber = companyIdNumber;
  }

  public TicketAgentInfoType internalIdDetails(List<InternalIDDetailsType> internalIdDetails) {
    this.internalIdDetails = internalIdDetails;
    return this;
  }

  public TicketAgentInfoType addInternalIdDetailsItem(InternalIDDetailsType internalIdDetailsItem) {
    if (this.internalIdDetails == null) {
      this.internalIdDetails = new ArrayList<>();
    }
    this.internalIdDetails.add(internalIdDetailsItem);
    return this;
  }

  /**
   * Get internalIdDetails
   * @return internalIdDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<InternalIDDetailsType> getInternalIdDetails() {
    return internalIdDetails;
  }

  public void setInternalIdDetails(List<InternalIDDetailsType> internalIdDetails) {
    this.internalIdDetails = internalIdDetails;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TicketAgentInfoType ticketAgentInfoType = (TicketAgentInfoType) o;
    return Objects.equals(this.companyIdNumber, ticketAgentInfoType.companyIdNumber) &&
        Objects.equals(this.internalIdDetails, ticketAgentInfoType.internalIdDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyIdNumber, internalIdDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TicketAgentInfoType {\n");
    
    sb.append("    companyIdNumber: ").append(toIndentedString(companyIdNumber)).append("\n");
    sb.append("    internalIdDetails: ").append(toIndentedString(internalIdDetails)).append("\n");
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

