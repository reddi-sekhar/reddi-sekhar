package jp.co.ana.cas.b18.dto.response;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.dto.response.CompanyIdentification1RequestDto;
import jp.co.ana.cas.b18.dto.response.LocationTypeI1RequestDto;
import jp.co.ana.cas.b18.dto.response.ProductDateTime1RequestDto;
import jp.co.ana.cas.b18.dto.response.ProductDetails1RequestDto;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TravelProductRequestDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class TravelProductRequestDto   {
  @JsonProperty("boardpointDetail")
  private LocationTypeI1RequestDto boardpointDetail;

  @JsonProperty("company")
  private CompanyIdentification1RequestDto company;

  @JsonProperty("offpointDetail")
  private LocationTypeI1RequestDto offpointDetail;

  @JsonProperty("product")
  private ProductDateTime1RequestDto product;

  @JsonProperty("productDetails")
  private ProductDetails1RequestDto productDetails;

  public TravelProductRequestDto boardpointDetail(LocationTypeI1RequestDto boardpointDetail) {
    this.boardpointDetail = boardpointDetail;
    return this;
  }

  /**
   * Get boardpointDetail
   * @return boardpointDetail
  */
  @ApiModelProperty(value = "")

  @Valid

  public LocationTypeI1RequestDto getBoardpointDetail() {
    return boardpointDetail;
  }

  public void setBoardpointDetail(LocationTypeI1RequestDto boardpointDetail) {
    this.boardpointDetail = boardpointDetail;
  }

  public TravelProductRequestDto company(CompanyIdentification1RequestDto company) {
    this.company = company;
    return this;
  }

  /**
   * Get company
   * @return company
  */
  @ApiModelProperty(value = "")

  @Valid

  public CompanyIdentification1RequestDto getCompany() {
    return company;
  }

  public void setCompany(CompanyIdentification1RequestDto company) {
    this.company = company;
  }

  public TravelProductRequestDto offpointDetail(LocationTypeI1RequestDto offpointDetail) {
    this.offpointDetail = offpointDetail;
    return this;
  }

  /**
   * Get offpointDetail
   * @return offpointDetail
  */
  @ApiModelProperty(value = "")

  @Valid

  public LocationTypeI1RequestDto getOffpointDetail() {
    return offpointDetail;
  }

  public void setOffpointDetail(LocationTypeI1RequestDto offpointDetail) {
    this.offpointDetail = offpointDetail;
  }

  public TravelProductRequestDto product(ProductDateTime1RequestDto product) {
    this.product = product;
    return this;
  }

  /**
   * Get product
   * @return product
  */
  @ApiModelProperty(value = "")

  @Valid

  public ProductDateTime1RequestDto getProduct() {
    return product;
  }

  public void setProduct(ProductDateTime1RequestDto product) {
    this.product = product;
  }

  public TravelProductRequestDto productDetails(ProductDetails1RequestDto productDetails) {
    this.productDetails = productDetails;
    return this;
  }

  /**
   * Get productDetails
   * @return productDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public ProductDetails1RequestDto getProductDetails() {
    return productDetails;
  }

  public void setProductDetails(ProductDetails1RequestDto productDetails) {
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
    TravelProductRequestDto travelProductRequestDto = (TravelProductRequestDto) o;
    return Objects.equals(this.boardpointDetail, travelProductRequestDto.boardpointDetail) &&
        Objects.equals(this.company, travelProductRequestDto.company) &&
        Objects.equals(this.offpointDetail, travelProductRequestDto.offpointDetail) &&
        Objects.equals(this.product, travelProductRequestDto.product) &&
        Objects.equals(this.productDetails, travelProductRequestDto.productDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(boardpointDetail, company, offpointDetail, product, productDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TravelProductRequestDto {\n");
    
    sb.append("    boardpointDetail: ").append(toIndentedString(boardpointDetail)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    offpointDetail: ").append(toIndentedString(offpointDetail)).append("\n");
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

