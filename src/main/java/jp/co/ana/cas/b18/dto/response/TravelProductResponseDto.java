package jp.co.ana.cas.b18.dto.response;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.dto.response.BoardpointDetailResponseDto;
import jp.co.ana.cas.b18.dto.response.CompanyDetailResponseDto;
import jp.co.ana.cas.b18.dto.response.OffpointDetailResponseDto;
import jp.co.ana.cas.b18.dto.response.ProductDetailsResponseDto;
import jp.co.ana.cas.b18.dto.response.ProductResponseDto;
import jp.co.ana.cas.b18.dto.response.TypeDetailResponseDto;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TravelProductResponseDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class TravelProductResponseDto   {
  @JsonProperty("product")
  private ProductResponseDto product;

  @JsonProperty("boardpointDetail")
  private BoardpointDetailResponseDto boardpointDetail;

  @JsonProperty("offpointDetail")
  private OffpointDetailResponseDto offpointDetail;

  @JsonProperty("companyDetail")
  private CompanyDetailResponseDto companyDetail;

  @JsonProperty("productDetails")
  private ProductDetailsResponseDto productDetails;

  @JsonProperty("typeDetail")
  private TypeDetailResponseDto typeDetail;

  @JsonProperty("processingIndicator")
  private String processingIndicator;

  public TravelProductResponseDto product(ProductResponseDto product) {
    this.product = product;
    return this;
  }

  /**
   * Get product
   * @return product
  */
  @ApiModelProperty(value = "")

  @Valid

  public ProductResponseDto getProduct() {
    return product;
  }

  public void setProduct(ProductResponseDto product) {
    this.product = product;
  }

  public TravelProductResponseDto boardpointDetail(BoardpointDetailResponseDto boardpointDetail) {
    this.boardpointDetail = boardpointDetail;
    return this;
  }

  /**
   * Get boardpointDetail
   * @return boardpointDetail
  */
  @ApiModelProperty(value = "")

  @Valid

  public BoardpointDetailResponseDto getBoardpointDetail() {
    return boardpointDetail;
  }

  public void setBoardpointDetail(BoardpointDetailResponseDto boardpointDetail) {
    this.boardpointDetail = boardpointDetail;
  }

  public TravelProductResponseDto offpointDetail(OffpointDetailResponseDto offpointDetail) {
    this.offpointDetail = offpointDetail;
    return this;
  }

  /**
   * Get offpointDetail
   * @return offpointDetail
  */
  @ApiModelProperty(value = "")

  @Valid

  public OffpointDetailResponseDto getOffpointDetail() {
    return offpointDetail;
  }

  public void setOffpointDetail(OffpointDetailResponseDto offpointDetail) {
    this.offpointDetail = offpointDetail;
  }

  public TravelProductResponseDto companyDetail(CompanyDetailResponseDto companyDetail) {
    this.companyDetail = companyDetail;
    return this;
  }

  /**
   * Get companyDetail
   * @return companyDetail
  */
  @ApiModelProperty(value = "")

  @Valid

  public CompanyDetailResponseDto getCompanyDetail() {
    return companyDetail;
  }

  public void setCompanyDetail(CompanyDetailResponseDto companyDetail) {
    this.companyDetail = companyDetail;
  }

  public TravelProductResponseDto productDetails(ProductDetailsResponseDto productDetails) {
    this.productDetails = productDetails;
    return this;
  }

  /**
   * Get productDetails
   * @return productDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public ProductDetailsResponseDto getProductDetails() {
    return productDetails;
  }

  public void setProductDetails(ProductDetailsResponseDto productDetails) {
    this.productDetails = productDetails;
  }

  public TravelProductResponseDto typeDetail(TypeDetailResponseDto typeDetail) {
    this.typeDetail = typeDetail;
    return this;
  }

  /**
   * Get typeDetail
   * @return typeDetail
  */
  @ApiModelProperty(value = "")

  @Valid

  public TypeDetailResponseDto getTypeDetail() {
    return typeDetail;
  }

  public void setTypeDetail(TypeDetailResponseDto typeDetail) {
    this.typeDetail = typeDetail;
  }

  public TravelProductResponseDto processingIndicator(String processingIndicator) {
    this.processingIndicator = processingIndicator;
    return this;
  }

  /**
   * AIR segment : to indicate an Informational Air segment.
   * @return processingIndicator
  */
  @ApiModelProperty(value = "AIR segment : to indicate an Informational Air segment.")

@Size(min=1,max=3) 
  public String getProcessingIndicator() {
    return processingIndicator;
  }

  public void setProcessingIndicator(String processingIndicator) {
    this.processingIndicator = processingIndicator;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TravelProductResponseDto travelProductResponseDto = (TravelProductResponseDto) o;
    return Objects.equals(this.product, travelProductResponseDto.product) &&
        Objects.equals(this.boardpointDetail, travelProductResponseDto.boardpointDetail) &&
        Objects.equals(this.offpointDetail, travelProductResponseDto.offpointDetail) &&
        Objects.equals(this.companyDetail, travelProductResponseDto.companyDetail) &&
        Objects.equals(this.productDetails, travelProductResponseDto.productDetails) &&
        Objects.equals(this.typeDetail, travelProductResponseDto.typeDetail) &&
        Objects.equals(this.processingIndicator, travelProductResponseDto.processingIndicator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(product, boardpointDetail, offpointDetail, companyDetail, productDetails, typeDetail, processingIndicator);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TravelProductResponseDto {\n");
    
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    boardpointDetail: ").append(toIndentedString(boardpointDetail)).append("\n");
    sb.append("    offpointDetail: ").append(toIndentedString(offpointDetail)).append("\n");
    sb.append("    companyDetail: ").append(toIndentedString(companyDetail)).append("\n");
    sb.append("    productDetails: ").append(toIndentedString(productDetails)).append("\n");
    sb.append("    typeDetail: ").append(toIndentedString(typeDetail)).append("\n");
    sb.append("    processingIndicator: ").append(toIndentedString(processingIndicator)).append("\n");
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

