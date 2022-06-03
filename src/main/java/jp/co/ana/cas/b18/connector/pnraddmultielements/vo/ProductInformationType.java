package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ProductDetailsType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ProductInformationType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class ProductInformationType   {
  @JsonProperty("bookingClassDetails")
  private ProductDetailsType bookingClassDetails;

  public ProductInformationType bookingClassDetails(ProductDetailsType bookingClassDetails) {
    this.bookingClassDetails = bookingClassDetails;
    return this;
  }

  /**
   * Get bookingClassDetails
   * @return bookingClassDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public ProductDetailsType getBookingClassDetails() {
    return bookingClassDetails;
  }

  public void setBookingClassDetails(ProductDetailsType bookingClassDetails) {
    this.bookingClassDetails = bookingClassDetails;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductInformationType productInformationType = (ProductInformationType) o;
    return Objects.equals(this.bookingClassDetails, productInformationType.bookingClassDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bookingClassDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductInformationType {\n");
    
    sb.append("    bookingClassDetails: ").append(toIndentedString(bookingClassDetails)).append("\n");
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

