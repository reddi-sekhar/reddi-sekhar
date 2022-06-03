package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.CompanyIdentificationTypeI2785C;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.LocationTypeI2784C;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ProductDateTimeTypeI270056C;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ProductIdentificationDetailsTypeI2786C;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ProductTypeDetailsTypeI2787C;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TravelProductInformationTypeI193102S
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class TravelProductInformationTypeI193102S   {
  @JsonProperty("boardpointDetail")
  private LocationTypeI2784C boardpointDetail;

  @JsonProperty("companyDetail")
  private CompanyIdentificationTypeI2785C companyDetail;

  @JsonProperty("offpointDetail")
  private LocationTypeI2784C offpointDetail;

  @JsonProperty("processingIndicator")
  private String processingIndicator;

  @JsonProperty("product")
  private ProductDateTimeTypeI270056C product;

  @JsonProperty("productDetails")
  private ProductIdentificationDetailsTypeI2786C productDetails;

  @JsonProperty("typeDetail")
  private ProductTypeDetailsTypeI2787C typeDetail;

  public TravelProductInformationTypeI193102S boardpointDetail(LocationTypeI2784C boardpointDetail) {
    this.boardpointDetail = boardpointDetail;
    return this;
  }

  /**
   * Get boardpointDetail
   * @return boardpointDetail
  */
  @ApiModelProperty(value = "")

  @Valid

  public LocationTypeI2784C getBoardpointDetail() {
    return boardpointDetail;
  }

  public void setBoardpointDetail(LocationTypeI2784C boardpointDetail) {
    this.boardpointDetail = boardpointDetail;
  }

  public TravelProductInformationTypeI193102S companyDetail(CompanyIdentificationTypeI2785C companyDetail) {
    this.companyDetail = companyDetail;
    return this;
  }

  /**
   * Get companyDetail
   * @return companyDetail
  */
  @ApiModelProperty(value = "")

  @Valid

  public CompanyIdentificationTypeI2785C getCompanyDetail() {
    return companyDetail;
  }

  public void setCompanyDetail(CompanyIdentificationTypeI2785C companyDetail) {
    this.companyDetail = companyDetail;
  }

  public TravelProductInformationTypeI193102S offpointDetail(LocationTypeI2784C offpointDetail) {
    this.offpointDetail = offpointDetail;
    return this;
  }

  /**
   * Get offpointDetail
   * @return offpointDetail
  */
  @ApiModelProperty(value = "")

  @Valid

  public LocationTypeI2784C getOffpointDetail() {
    return offpointDetail;
  }

  public void setOffpointDetail(LocationTypeI2784C offpointDetail) {
    this.offpointDetail = offpointDetail;
  }

  public TravelProductInformationTypeI193102S processingIndicator(String processingIndicator) {
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

  public TravelProductInformationTypeI193102S product(ProductDateTimeTypeI270056C product) {
    this.product = product;
    return this;
  }

  /**
   * Get product
   * @return product
  */
  @ApiModelProperty(value = "")

  @Valid

  public ProductDateTimeTypeI270056C getProduct() {
    return product;
  }

  public void setProduct(ProductDateTimeTypeI270056C product) {
    this.product = product;
  }

  public TravelProductInformationTypeI193102S productDetails(ProductIdentificationDetailsTypeI2786C productDetails) {
    this.productDetails = productDetails;
    return this;
  }

  /**
   * Get productDetails
   * @return productDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public ProductIdentificationDetailsTypeI2786C getProductDetails() {
    return productDetails;
  }

  public void setProductDetails(ProductIdentificationDetailsTypeI2786C productDetails) {
    this.productDetails = productDetails;
  }

  public TravelProductInformationTypeI193102S typeDetail(ProductTypeDetailsTypeI2787C typeDetail) {
    this.typeDetail = typeDetail;
    return this;
  }

  /**
   * Get typeDetail
   * @return typeDetail
  */
  @ApiModelProperty(value = "")

  @Valid

  public ProductTypeDetailsTypeI2787C getTypeDetail() {
    return typeDetail;
  }

  public void setTypeDetail(ProductTypeDetailsTypeI2787C typeDetail) {
    this.typeDetail = typeDetail;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TravelProductInformationTypeI193102S travelProductInformationTypeI193102S = (TravelProductInformationTypeI193102S) o;
    return Objects.equals(this.boardpointDetail, travelProductInformationTypeI193102S.boardpointDetail) &&
        Objects.equals(this.companyDetail, travelProductInformationTypeI193102S.companyDetail) &&
        Objects.equals(this.offpointDetail, travelProductInformationTypeI193102S.offpointDetail) &&
        Objects.equals(this.processingIndicator, travelProductInformationTypeI193102S.processingIndicator) &&
        Objects.equals(this.product, travelProductInformationTypeI193102S.product) &&
        Objects.equals(this.productDetails, travelProductInformationTypeI193102S.productDetails) &&
        Objects.equals(this.typeDetail, travelProductInformationTypeI193102S.typeDetail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(boardpointDetail, companyDetail, offpointDetail, processingIndicator, product, productDetails, typeDetail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TravelProductInformationTypeI193102S {\n");
    
    sb.append("    boardpointDetail: ").append(toIndentedString(boardpointDetail)).append("\n");
    sb.append("    companyDetail: ").append(toIndentedString(companyDetail)).append("\n");
    sb.append("    offpointDetail: ").append(toIndentedString(offpointDetail)).append("\n");
    sb.append("    processingIndicator: ").append(toIndentedString(processingIndicator)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    productDetails: ").append(toIndentedString(productDetails)).append("\n");
    sb.append("    typeDetail: ").append(toIndentedString(typeDetail)).append("\n");
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

