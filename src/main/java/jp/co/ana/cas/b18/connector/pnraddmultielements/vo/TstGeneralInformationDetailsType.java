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
 * TstGeneralInformationDetailsType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class TstGeneralInformationDetailsType   {
  @JsonProperty("salesIndicator")
  private String salesIndicator;

  @JsonProperty("tstCreationDate")
  private String tstCreationDate;

  @JsonProperty("tstReferenceNumber")
  private String tstReferenceNumber;

  public TstGeneralInformationDetailsType salesIndicator(String salesIndicator) {
    this.salesIndicator = salesIndicator;
    return this;
  }

  /**
   * Get salesIndicator
   * @return salesIndicator
  */
  @ApiModelProperty(value = "")


  public String getSalesIndicator() {
    return salesIndicator;
  }

  public void setSalesIndicator(String salesIndicator) {
    this.salesIndicator = salesIndicator;
  }

  public TstGeneralInformationDetailsType tstCreationDate(String tstCreationDate) {
    this.tstCreationDate = tstCreationDate;
    return this;
  }

  /**
   * Get tstCreationDate
   * @return tstCreationDate
  */
  @ApiModelProperty(value = "")


  public String getTstCreationDate() {
    return tstCreationDate;
  }

  public void setTstCreationDate(String tstCreationDate) {
    this.tstCreationDate = tstCreationDate;
  }

  public TstGeneralInformationDetailsType tstReferenceNumber(String tstReferenceNumber) {
    this.tstReferenceNumber = tstReferenceNumber;
    return this;
  }

  /**
   * Get tstReferenceNumber
   * @return tstReferenceNumber
  */
  @ApiModelProperty(value = "")


  public String getTstReferenceNumber() {
    return tstReferenceNumber;
  }

  public void setTstReferenceNumber(String tstReferenceNumber) {
    this.tstReferenceNumber = tstReferenceNumber;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TstGeneralInformationDetailsType tstGeneralInformationDetailsType = (TstGeneralInformationDetailsType) o;
    return Objects.equals(this.salesIndicator, tstGeneralInformationDetailsType.salesIndicator) &&
        Objects.equals(this.tstCreationDate, tstGeneralInformationDetailsType.tstCreationDate) &&
        Objects.equals(this.tstReferenceNumber, tstGeneralInformationDetailsType.tstReferenceNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(salesIndicator, tstCreationDate, tstReferenceNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TstGeneralInformationDetailsType {\n");
    
    sb.append("    salesIndicator: ").append(toIndentedString(salesIndicator)).append("\n");
    sb.append("    tstCreationDate: ").append(toIndentedString(tstCreationDate)).append("\n");
    sb.append("    tstReferenceNumber: ").append(toIndentedString(tstReferenceNumber)).append("\n");
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

