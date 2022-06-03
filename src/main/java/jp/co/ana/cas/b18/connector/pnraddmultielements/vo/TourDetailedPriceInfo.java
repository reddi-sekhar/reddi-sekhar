package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ReferenceInfoType25422S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.TariffInformationTypeU25419S;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TourDetailedPriceInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class TourDetailedPriceInfo   {
  @JsonProperty("markerSpecificRead")
  private Object markerSpecificRead;

  @JsonProperty("productId")
  private ReferenceInfoType25422S productId;

  @JsonProperty("productPrice")
  private TariffInformationTypeU25419S productPrice;

  public TourDetailedPriceInfo markerSpecificRead(Object markerSpecificRead) {
    this.markerSpecificRead = markerSpecificRead;
    return this;
  }

  /**
   * Get markerSpecificRead
   * @return markerSpecificRead
  */
  @ApiModelProperty(value = "")


  public Object getMarkerSpecificRead() {
    return markerSpecificRead;
  }

  public void setMarkerSpecificRead(Object markerSpecificRead) {
    this.markerSpecificRead = markerSpecificRead;
  }

  public TourDetailedPriceInfo productId(ReferenceInfoType25422S productId) {
    this.productId = productId;
    return this;
  }

  /**
   * Get productId
   * @return productId
  */
  @ApiModelProperty(value = "")

  @Valid

  public ReferenceInfoType25422S getProductId() {
    return productId;
  }

  public void setProductId(ReferenceInfoType25422S productId) {
    this.productId = productId;
  }

  public TourDetailedPriceInfo productPrice(TariffInformationTypeU25419S productPrice) {
    this.productPrice = productPrice;
    return this;
  }

  /**
   * Get productPrice
   * @return productPrice
  */
  @ApiModelProperty(value = "")

  @Valid

  public TariffInformationTypeU25419S getProductPrice() {
    return productPrice;
  }

  public void setProductPrice(TariffInformationTypeU25419S productPrice) {
    this.productPrice = productPrice;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TourDetailedPriceInfo tourDetailedPriceInfo = (TourDetailedPriceInfo) o;
    return Objects.equals(this.markerSpecificRead, tourDetailedPriceInfo.markerSpecificRead) &&
        Objects.equals(this.productId, tourDetailedPriceInfo.productId) &&
        Objects.equals(this.productPrice, tourDetailedPriceInfo.productPrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(markerSpecificRead, productId, productPrice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TourDetailedPriceInfo {\n");
    
    sb.append("    markerSpecificRead: ").append(toIndentedString(markerSpecificRead)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    productPrice: ").append(toIndentedString(productPrice)).append("\n");
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

