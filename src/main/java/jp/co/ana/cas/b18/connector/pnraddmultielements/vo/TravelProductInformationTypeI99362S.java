package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.CompanyIdentificationTypeI148289C;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.LocationTypeI;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ProductDateTimeTypeI;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ProductIdentificationDetailsTypeI;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TravelProductInformationTypeI99362S
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class TravelProductInformationTypeI99362S   {
  @JsonProperty("boardPointDetails")
  private LocationTypeI boardPointDetails;

  @JsonProperty("companyDetails")
  private CompanyIdentificationTypeI148289C companyDetails;

  @JsonProperty("flightDate")
  private ProductDateTimeTypeI flightDate;

  @JsonProperty("flightIdentification")
  private ProductIdentificationDetailsTypeI flightIdentification;

  @JsonProperty("offpointDetails")
  private LocationTypeI offpointDetails;

  public TravelProductInformationTypeI99362S boardPointDetails(LocationTypeI boardPointDetails) {
    this.boardPointDetails = boardPointDetails;
    return this;
  }

  /**
   * Get boardPointDetails
   * @return boardPointDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public LocationTypeI getBoardPointDetails() {
    return boardPointDetails;
  }

  public void setBoardPointDetails(LocationTypeI boardPointDetails) {
    this.boardPointDetails = boardPointDetails;
  }

  public TravelProductInformationTypeI99362S companyDetails(CompanyIdentificationTypeI148289C companyDetails) {
    this.companyDetails = companyDetails;
    return this;
  }

  /**
   * Get companyDetails
   * @return companyDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public CompanyIdentificationTypeI148289C getCompanyDetails() {
    return companyDetails;
  }

  public void setCompanyDetails(CompanyIdentificationTypeI148289C companyDetails) {
    this.companyDetails = companyDetails;
  }

  public TravelProductInformationTypeI99362S flightDate(ProductDateTimeTypeI flightDate) {
    this.flightDate = flightDate;
    return this;
  }

  /**
   * Get flightDate
   * @return flightDate
  */
  @ApiModelProperty(value = "")

  @Valid

  public ProductDateTimeTypeI getFlightDate() {
    return flightDate;
  }

  public void setFlightDate(ProductDateTimeTypeI flightDate) {
    this.flightDate = flightDate;
  }

  public TravelProductInformationTypeI99362S flightIdentification(ProductIdentificationDetailsTypeI flightIdentification) {
    this.flightIdentification = flightIdentification;
    return this;
  }

  /**
   * Get flightIdentification
   * @return flightIdentification
  */
  @ApiModelProperty(value = "")

  @Valid

  public ProductIdentificationDetailsTypeI getFlightIdentification() {
    return flightIdentification;
  }

  public void setFlightIdentification(ProductIdentificationDetailsTypeI flightIdentification) {
    this.flightIdentification = flightIdentification;
  }

  public TravelProductInformationTypeI99362S offpointDetails(LocationTypeI offpointDetails) {
    this.offpointDetails = offpointDetails;
    return this;
  }

  /**
   * Get offpointDetails
   * @return offpointDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public LocationTypeI getOffpointDetails() {
    return offpointDetails;
  }

  public void setOffpointDetails(LocationTypeI offpointDetails) {
    this.offpointDetails = offpointDetails;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TravelProductInformationTypeI99362S travelProductInformationTypeI99362S = (TravelProductInformationTypeI99362S) o;
    return Objects.equals(this.boardPointDetails, travelProductInformationTypeI99362S.boardPointDetails) &&
        Objects.equals(this.companyDetails, travelProductInformationTypeI99362S.companyDetails) &&
        Objects.equals(this.flightDate, travelProductInformationTypeI99362S.flightDate) &&
        Objects.equals(this.flightIdentification, travelProductInformationTypeI99362S.flightIdentification) &&
        Objects.equals(this.offpointDetails, travelProductInformationTypeI99362S.offpointDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(boardPointDetails, companyDetails, flightDate, flightIdentification, offpointDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TravelProductInformationTypeI99362S {\n");
    
    sb.append("    boardPointDetails: ").append(toIndentedString(boardPointDetails)).append("\n");
    sb.append("    companyDetails: ").append(toIndentedString(companyDetails)).append("\n");
    sb.append("    flightDate: ").append(toIndentedString(flightDate)).append("\n");
    sb.append("    flightIdentification: ").append(toIndentedString(flightIdentification)).append("\n");
    sb.append("    offpointDetails: ").append(toIndentedString(offpointDetails)).append("\n");
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

