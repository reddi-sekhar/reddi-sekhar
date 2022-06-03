package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ElementManagementSegmentType83559S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.PackageDescriptionType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * MethodOfDelivery
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class MethodOfDelivery   {
  @JsonProperty("deliveryDetails")
  private PackageDescriptionType deliveryDetails;

  @JsonProperty("elementManagement")
  private ElementManagementSegmentType83559S elementManagement;

  public MethodOfDelivery deliveryDetails(PackageDescriptionType deliveryDetails) {
    this.deliveryDetails = deliveryDetails;
    return this;
  }

  /**
   * Get deliveryDetails
   * @return deliveryDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public PackageDescriptionType getDeliveryDetails() {
    return deliveryDetails;
  }

  public void setDeliveryDetails(PackageDescriptionType deliveryDetails) {
    this.deliveryDetails = deliveryDetails;
  }

  public MethodOfDelivery elementManagement(ElementManagementSegmentType83559S elementManagement) {
    this.elementManagement = elementManagement;
    return this;
  }

  /**
   * Get elementManagement
   * @return elementManagement
  */
  @ApiModelProperty(value = "")

  @Valid

  public ElementManagementSegmentType83559S getElementManagement() {
    return elementManagement;
  }

  public void setElementManagement(ElementManagementSegmentType83559S elementManagement) {
    this.elementManagement = elementManagement;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MethodOfDelivery methodOfDelivery = (MethodOfDelivery) o;
    return Objects.equals(this.deliveryDetails, methodOfDelivery.deliveryDetails) &&
        Objects.equals(this.elementManagement, methodOfDelivery.elementManagement);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deliveryDetails, elementManagement);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MethodOfDelivery {\n");
    
    sb.append("    deliveryDetails: ").append(toIndentedString(deliveryDetails)).append("\n");
    sb.append("    elementManagement: ").append(toIndentedString(elementManagement)).append("\n");
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

