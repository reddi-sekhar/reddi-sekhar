package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ProductDetailsTypeI;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ProductInformationTypeI76271S
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class ProductInformationTypeI76271S   {
  @JsonProperty("bookingClassDetails")
  @Valid
  private List<ProductDetailsTypeI> bookingClassDetails = null;

  public ProductInformationTypeI76271S bookingClassDetails(List<ProductDetailsTypeI> bookingClassDetails) {
    this.bookingClassDetails = bookingClassDetails;
    return this;
  }

  public ProductInformationTypeI76271S addBookingClassDetailsItem(ProductDetailsTypeI bookingClassDetailsItem) {
    if (this.bookingClassDetails == null) {
      this.bookingClassDetails = new ArrayList<>();
    }
    this.bookingClassDetails.add(bookingClassDetailsItem);
    return this;
  }

  /**
   * Get bookingClassDetails
   * @return bookingClassDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<ProductDetailsTypeI> getBookingClassDetails() {
    return bookingClassDetails;
  }

  public void setBookingClassDetails(List<ProductDetailsTypeI> bookingClassDetails) {
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
    ProductInformationTypeI76271S productInformationTypeI76271S = (ProductInformationTypeI76271S) o;
    return Objects.equals(this.bookingClassDetails, productInformationTypeI76271S.bookingClassDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bookingClassDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductInformationTypeI76271S {\n");
    
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

