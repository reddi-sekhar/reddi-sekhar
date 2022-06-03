package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.CompanyIdentificationTypeU;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.LocationTypeU46324C;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ProductDateAndTimeTypeU46325C;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ProductIdentificationDetailsTypeU46327C;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TravelProductInformationTypeU25428S
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class TravelProductInformationTypeU25428S   {
  @JsonProperty("companyInformation")
  private CompanyIdentificationTypeU companyInformation;

  @JsonProperty("dateTimeInformation")
  private ProductDateAndTimeTypeU46325C dateTimeInformation;

  @JsonProperty("locationInformation")
  @Valid
  private List<LocationTypeU46324C> locationInformation = null;

  @JsonProperty("productDetails")
  private ProductIdentificationDetailsTypeU46327C productDetails;

  public TravelProductInformationTypeU25428S companyInformation(CompanyIdentificationTypeU companyInformation) {
    this.companyInformation = companyInformation;
    return this;
  }

  /**
   * Get companyInformation
   * @return companyInformation
  */
  @ApiModelProperty(value = "")

  @Valid

  public CompanyIdentificationTypeU getCompanyInformation() {
    return companyInformation;
  }

  public void setCompanyInformation(CompanyIdentificationTypeU companyInformation) {
    this.companyInformation = companyInformation;
  }

  public TravelProductInformationTypeU25428S dateTimeInformation(ProductDateAndTimeTypeU46325C dateTimeInformation) {
    this.dateTimeInformation = dateTimeInformation;
    return this;
  }

  /**
   * Get dateTimeInformation
   * @return dateTimeInformation
  */
  @ApiModelProperty(value = "")

  @Valid

  public ProductDateAndTimeTypeU46325C getDateTimeInformation() {
    return dateTimeInformation;
  }

  public void setDateTimeInformation(ProductDateAndTimeTypeU46325C dateTimeInformation) {
    this.dateTimeInformation = dateTimeInformation;
  }

  public TravelProductInformationTypeU25428S locationInformation(List<LocationTypeU46324C> locationInformation) {
    this.locationInformation = locationInformation;
    return this;
  }

  public TravelProductInformationTypeU25428S addLocationInformationItem(LocationTypeU46324C locationInformationItem) {
    if (this.locationInformation == null) {
      this.locationInformation = new ArrayList<>();
    }
    this.locationInformation.add(locationInformationItem);
    return this;
  }

  /**
   * Get locationInformation
   * @return locationInformation
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<LocationTypeU46324C> getLocationInformation() {
    return locationInformation;
  }

  public void setLocationInformation(List<LocationTypeU46324C> locationInformation) {
    this.locationInformation = locationInformation;
  }

  public TravelProductInformationTypeU25428S productDetails(ProductIdentificationDetailsTypeU46327C productDetails) {
    this.productDetails = productDetails;
    return this;
  }

  /**
   * Get productDetails
   * @return productDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public ProductIdentificationDetailsTypeU46327C getProductDetails() {
    return productDetails;
  }

  public void setProductDetails(ProductIdentificationDetailsTypeU46327C productDetails) {
    this.productDetails = productDetails;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TravelProductInformationTypeU25428S travelProductInformationTypeU25428S = (TravelProductInformationTypeU25428S) o;
    return Objects.equals(this.companyInformation, travelProductInformationTypeU25428S.companyInformation) &&
        Objects.equals(this.dateTimeInformation, travelProductInformationTypeU25428S.dateTimeInformation) &&
        Objects.equals(this.locationInformation, travelProductInformationTypeU25428S.locationInformation) &&
        Objects.equals(this.productDetails, travelProductInformationTypeU25428S.productDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyInformation, dateTimeInformation, locationInformation, productDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TravelProductInformationTypeU25428S {\n");
    
    sb.append("    companyInformation: ").append(toIndentedString(companyInformation)).append("\n");
    sb.append("    dateTimeInformation: ").append(toIndentedString(dateTimeInformation)).append("\n");
    sb.append("    locationInformation: ").append(toIndentedString(locationInformation)).append("\n");
    sb.append("    productDetails: ").append(toIndentedString(productDetails)).append("\n");
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

