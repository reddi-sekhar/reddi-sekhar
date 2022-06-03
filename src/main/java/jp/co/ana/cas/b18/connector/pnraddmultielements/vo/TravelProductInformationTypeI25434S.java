package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.CompanyIdentificationTypeI46335C;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ProductDateTimeTypeI46338C;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ProductIdentificationDetailsTypeI46336C;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ProductTypeDetailsTypeI46337C;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TravelProductInformationTypeI25434S
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class TravelProductInformationTypeI25434S   {
  @JsonProperty("companyDetails")
  private CompanyIdentificationTypeI46335C companyDetails;

  @JsonProperty("flightDate")
  private ProductDateTimeTypeI46338C flightDate;

  @JsonProperty("flightIdentification")
  private ProductIdentificationDetailsTypeI46336C flightIdentification;

  @JsonProperty("flightTypeDetails")
  private ProductTypeDetailsTypeI46337C flightTypeDetails;

  public TravelProductInformationTypeI25434S companyDetails(CompanyIdentificationTypeI46335C companyDetails) {
    this.companyDetails = companyDetails;
    return this;
  }

  /**
   * Get companyDetails
   * @return companyDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public CompanyIdentificationTypeI46335C getCompanyDetails() {
    return companyDetails;
  }

  public void setCompanyDetails(CompanyIdentificationTypeI46335C companyDetails) {
    this.companyDetails = companyDetails;
  }

  public TravelProductInformationTypeI25434S flightDate(ProductDateTimeTypeI46338C flightDate) {
    this.flightDate = flightDate;
    return this;
  }

  /**
   * Get flightDate
   * @return flightDate
  */
  @ApiModelProperty(value = "")

  @Valid

  public ProductDateTimeTypeI46338C getFlightDate() {
    return flightDate;
  }

  public void setFlightDate(ProductDateTimeTypeI46338C flightDate) {
    this.flightDate = flightDate;
  }

  public TravelProductInformationTypeI25434S flightIdentification(ProductIdentificationDetailsTypeI46336C flightIdentification) {
    this.flightIdentification = flightIdentification;
    return this;
  }

  /**
   * Get flightIdentification
   * @return flightIdentification
  */
  @ApiModelProperty(value = "")

  @Valid

  public ProductIdentificationDetailsTypeI46336C getFlightIdentification() {
    return flightIdentification;
  }

  public void setFlightIdentification(ProductIdentificationDetailsTypeI46336C flightIdentification) {
    this.flightIdentification = flightIdentification;
  }

  public TravelProductInformationTypeI25434S flightTypeDetails(ProductTypeDetailsTypeI46337C flightTypeDetails) {
    this.flightTypeDetails = flightTypeDetails;
    return this;
  }

  /**
   * Get flightTypeDetails
   * @return flightTypeDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public ProductTypeDetailsTypeI46337C getFlightTypeDetails() {
    return flightTypeDetails;
  }

  public void setFlightTypeDetails(ProductTypeDetailsTypeI46337C flightTypeDetails) {
    this.flightTypeDetails = flightTypeDetails;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TravelProductInformationTypeI25434S travelProductInformationTypeI25434S = (TravelProductInformationTypeI25434S) o;
    return Objects.equals(this.companyDetails, travelProductInformationTypeI25434S.companyDetails) &&
        Objects.equals(this.flightDate, travelProductInformationTypeI25434S.flightDate) &&
        Objects.equals(this.flightIdentification, travelProductInformationTypeI25434S.flightIdentification) &&
        Objects.equals(this.flightTypeDetails, travelProductInformationTypeI25434S.flightTypeDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyDetails, flightDate, flightIdentification, flightTypeDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TravelProductInformationTypeI25434S {\n");
    
    sb.append("    companyDetails: ").append(toIndentedString(companyDetails)).append("\n");
    sb.append("    flightDate: ").append(toIndentedString(flightDate)).append("\n");
    sb.append("    flightIdentification: ").append(toIndentedString(flightIdentification)).append("\n");
    sb.append("    flightTypeDetails: ").append(toIndentedString(flightTypeDetails)).append("\n");
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

