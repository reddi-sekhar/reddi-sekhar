package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.CompanyIdentificationTypeI1;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.LocationTypeI1;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ProductDateTimeTypeI1;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ProductIdentificationDetailsTypeI1;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ProductTypeDetailsType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TravelProductInformationType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class TravelProductInformationType   {
  @JsonProperty("boardpointDetail")
  private LocationTypeI1 boardpointDetail;

  @JsonProperty("company")
  private CompanyIdentificationTypeI1 company;

  @JsonProperty("flightTypeDetails")
  private ProductTypeDetailsType flightTypeDetails;

  @JsonProperty("offpointDetail")
  private LocationTypeI1 offpointDetail;

  @JsonProperty("processingIndicator")
  private String processingIndicator;

  @JsonProperty("product")
  private ProductDateTimeTypeI1 product;

  @JsonProperty("productDetails")
  private ProductIdentificationDetailsTypeI1 productDetails;

  public TravelProductInformationType boardpointDetail(LocationTypeI1 boardpointDetail) {
    this.boardpointDetail = boardpointDetail;
    return this;
  }

  /**
   * Get boardpointDetail
   * @return boardpointDetail
  */
  @ApiModelProperty(value = "")

  @Valid

  public LocationTypeI1 getBoardpointDetail() {
    return boardpointDetail;
  }

  public void setBoardpointDetail(LocationTypeI1 boardpointDetail) {
    this.boardpointDetail = boardpointDetail;
  }

  public TravelProductInformationType company(CompanyIdentificationTypeI1 company) {
    this.company = company;
    return this;
  }

  /**
   * Get company
   * @return company
  */
  @ApiModelProperty(value = "")

  @Valid

  public CompanyIdentificationTypeI1 getCompany() {
    return company;
  }

  public void setCompany(CompanyIdentificationTypeI1 company) {
    this.company = company;
  }

  public TravelProductInformationType flightTypeDetails(ProductTypeDetailsType flightTypeDetails) {
    this.flightTypeDetails = flightTypeDetails;
    return this;
  }

  /**
   * Get flightTypeDetails
   * @return flightTypeDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public ProductTypeDetailsType getFlightTypeDetails() {
    return flightTypeDetails;
  }

  public void setFlightTypeDetails(ProductTypeDetailsType flightTypeDetails) {
    this.flightTypeDetails = flightTypeDetails;
  }

  public TravelProductInformationType offpointDetail(LocationTypeI1 offpointDetail) {
    this.offpointDetail = offpointDetail;
    return this;
  }

  /**
   * Get offpointDetail
   * @return offpointDetail
  */
  @ApiModelProperty(value = "")

  @Valid

  public LocationTypeI1 getOffpointDetail() {
    return offpointDetail;
  }

  public void setOffpointDetail(LocationTypeI1 offpointDetail) {
    this.offpointDetail = offpointDetail;
  }

  public TravelProductInformationType processingIndicator(String processingIndicator) {
    this.processingIndicator = processingIndicator;
    return this;
  }

  /**
   * Get processingIndicator
   * @return processingIndicator
  */
  @ApiModelProperty(value = "")


  public String getProcessingIndicator() {
    return processingIndicator;
  }

  public void setProcessingIndicator(String processingIndicator) {
    this.processingIndicator = processingIndicator;
  }

  public TravelProductInformationType product(ProductDateTimeTypeI1 product) {
    this.product = product;
    return this;
  }

  /**
   * Get product
   * @return product
  */
  @ApiModelProperty(value = "")

  @Valid

  public ProductDateTimeTypeI1 getProduct() {
    return product;
  }

  public void setProduct(ProductDateTimeTypeI1 product) {
    this.product = product;
  }

  public TravelProductInformationType productDetails(ProductIdentificationDetailsTypeI1 productDetails) {
    this.productDetails = productDetails;
    return this;
  }

  /**
   * Get productDetails
   * @return productDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public ProductIdentificationDetailsTypeI1 getProductDetails() {
    return productDetails;
  }

  public void setProductDetails(ProductIdentificationDetailsTypeI1 productDetails) {
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
    TravelProductInformationType travelProductInformationType = (TravelProductInformationType) o;
    return Objects.equals(this.boardpointDetail, travelProductInformationType.boardpointDetail) &&
        Objects.equals(this.company, travelProductInformationType.company) &&
        Objects.equals(this.flightTypeDetails, travelProductInformationType.flightTypeDetails) &&
        Objects.equals(this.offpointDetail, travelProductInformationType.offpointDetail) &&
        Objects.equals(this.processingIndicator, travelProductInformationType.processingIndicator) &&
        Objects.equals(this.product, travelProductInformationType.product) &&
        Objects.equals(this.productDetails, travelProductInformationType.productDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(boardpointDetail, company, flightTypeDetails, offpointDetail, processingIndicator, product, productDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TravelProductInformationType {\n");
    
    sb.append("    boardpointDetail: ").append(toIndentedString(boardpointDetail)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    flightTypeDetails: ").append(toIndentedString(flightTypeDetails)).append("\n");
    sb.append("    offpointDetail: ").append(toIndentedString(offpointDetail)).append("\n");
    sb.append("    processingIndicator: ").append(toIndentedString(processingIndicator)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
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

