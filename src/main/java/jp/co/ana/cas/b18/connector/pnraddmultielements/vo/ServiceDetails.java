package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.AccomodationDetails;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ProductBCSDetails;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.QuantityType25433S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.TransportationDetails;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.TravelProductInformationTypeU25428S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.VehiculeDetails;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ServiceDetails
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class ServiceDetails   {
  @JsonProperty("accomodationDetails")
  @Valid
  private List<AccomodationDetails> accomodationDetails = null;

  @JsonProperty("productBCSDetails")
  private ProductBCSDetails productBCSDetails;

  @JsonProperty("serviceDurationInfo")
  private QuantityType25433S serviceDurationInfo;

  @JsonProperty("serviceInfo")
  private TravelProductInformationTypeU25428S serviceInfo;

  @JsonProperty("transportationDetails")
  @Valid
  private List<TransportationDetails> transportationDetails = null;

  @JsonProperty("vehiculeDetails")
  private VehiculeDetails vehiculeDetails;

  public ServiceDetails accomodationDetails(List<AccomodationDetails> accomodationDetails) {
    this.accomodationDetails = accomodationDetails;
    return this;
  }

  public ServiceDetails addAccomodationDetailsItem(AccomodationDetails accomodationDetailsItem) {
    if (this.accomodationDetails == null) {
      this.accomodationDetails = new ArrayList<>();
    }
    this.accomodationDetails.add(accomodationDetailsItem);
    return this;
  }

  /**
   * Get accomodationDetails
   * @return accomodationDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<AccomodationDetails> getAccomodationDetails() {
    return accomodationDetails;
  }

  public void setAccomodationDetails(List<AccomodationDetails> accomodationDetails) {
    this.accomodationDetails = accomodationDetails;
  }

  public ServiceDetails productBCSDetails(ProductBCSDetails productBCSDetails) {
    this.productBCSDetails = productBCSDetails;
    return this;
  }

  /**
   * Get productBCSDetails
   * @return productBCSDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public ProductBCSDetails getProductBCSDetails() {
    return productBCSDetails;
  }

  public void setProductBCSDetails(ProductBCSDetails productBCSDetails) {
    this.productBCSDetails = productBCSDetails;
  }

  public ServiceDetails serviceDurationInfo(QuantityType25433S serviceDurationInfo) {
    this.serviceDurationInfo = serviceDurationInfo;
    return this;
  }

  /**
   * Get serviceDurationInfo
   * @return serviceDurationInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public QuantityType25433S getServiceDurationInfo() {
    return serviceDurationInfo;
  }

  public void setServiceDurationInfo(QuantityType25433S serviceDurationInfo) {
    this.serviceDurationInfo = serviceDurationInfo;
  }

  public ServiceDetails serviceInfo(TravelProductInformationTypeU25428S serviceInfo) {
    this.serviceInfo = serviceInfo;
    return this;
  }

  /**
   * Get serviceInfo
   * @return serviceInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public TravelProductInformationTypeU25428S getServiceInfo() {
    return serviceInfo;
  }

  public void setServiceInfo(TravelProductInformationTypeU25428S serviceInfo) {
    this.serviceInfo = serviceInfo;
  }

  public ServiceDetails transportationDetails(List<TransportationDetails> transportationDetails) {
    this.transportationDetails = transportationDetails;
    return this;
  }

  public ServiceDetails addTransportationDetailsItem(TransportationDetails transportationDetailsItem) {
    if (this.transportationDetails == null) {
      this.transportationDetails = new ArrayList<>();
    }
    this.transportationDetails.add(transportationDetailsItem);
    return this;
  }

  /**
   * Get transportationDetails
   * @return transportationDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<TransportationDetails> getTransportationDetails() {
    return transportationDetails;
  }

  public void setTransportationDetails(List<TransportationDetails> transportationDetails) {
    this.transportationDetails = transportationDetails;
  }

  public ServiceDetails vehiculeDetails(VehiculeDetails vehiculeDetails) {
    this.vehiculeDetails = vehiculeDetails;
    return this;
  }

  /**
   * Get vehiculeDetails
   * @return vehiculeDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public VehiculeDetails getVehiculeDetails() {
    return vehiculeDetails;
  }

  public void setVehiculeDetails(VehiculeDetails vehiculeDetails) {
    this.vehiculeDetails = vehiculeDetails;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceDetails serviceDetails = (ServiceDetails) o;
    return Objects.equals(this.accomodationDetails, serviceDetails.accomodationDetails) &&
        Objects.equals(this.productBCSDetails, serviceDetails.productBCSDetails) &&
        Objects.equals(this.serviceDurationInfo, serviceDetails.serviceDurationInfo) &&
        Objects.equals(this.serviceInfo, serviceDetails.serviceInfo) &&
        Objects.equals(this.transportationDetails, serviceDetails.transportationDetails) &&
        Objects.equals(this.vehiculeDetails, serviceDetails.vehiculeDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accomodationDetails, productBCSDetails, serviceDurationInfo, serviceInfo, transportationDetails, vehiculeDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceDetails {\n");
    
    sb.append("    accomodationDetails: ").append(toIndentedString(accomodationDetails)).append("\n");
    sb.append("    productBCSDetails: ").append(toIndentedString(productBCSDetails)).append("\n");
    sb.append("    serviceDurationInfo: ").append(toIndentedString(serviceDurationInfo)).append("\n");
    sb.append("    serviceInfo: ").append(toIndentedString(serviceInfo)).append("\n");
    sb.append("    transportationDetails: ").append(toIndentedString(transportationDetails)).append("\n");
    sb.append("    vehiculeDetails: ").append(toIndentedString(vehiculeDetails)).append("\n");
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

