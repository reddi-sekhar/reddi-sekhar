package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.AttributeTypeU;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.NumberOfUnitsType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.TariffInformationTypeU;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ServiceInfoGroup
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class ServiceInfoGroup   {
  @JsonProperty("numberOfServices")
  private NumberOfUnitsType numberOfServices;

  @JsonProperty("serviceInformation")
  private AttributeTypeU serviceInformation;

  @JsonProperty("serviceRoutePrice")
  private TariffInformationTypeU serviceRoutePrice;

  public ServiceInfoGroup numberOfServices(NumberOfUnitsType numberOfServices) {
    this.numberOfServices = numberOfServices;
    return this;
  }

  /**
   * Get numberOfServices
   * @return numberOfServices
  */
  @ApiModelProperty(value = "")

  @Valid

  public NumberOfUnitsType getNumberOfServices() {
    return numberOfServices;
  }

  public void setNumberOfServices(NumberOfUnitsType numberOfServices) {
    this.numberOfServices = numberOfServices;
  }

  public ServiceInfoGroup serviceInformation(AttributeTypeU serviceInformation) {
    this.serviceInformation = serviceInformation;
    return this;
  }

  /**
   * Get serviceInformation
   * @return serviceInformation
  */
  @ApiModelProperty(value = "")

  @Valid

  public AttributeTypeU getServiceInformation() {
    return serviceInformation;
  }

  public void setServiceInformation(AttributeTypeU serviceInformation) {
    this.serviceInformation = serviceInformation;
  }

  public ServiceInfoGroup serviceRoutePrice(TariffInformationTypeU serviceRoutePrice) {
    this.serviceRoutePrice = serviceRoutePrice;
    return this;
  }

  /**
   * Get serviceRoutePrice
   * @return serviceRoutePrice
  */
  @ApiModelProperty(value = "")

  @Valid

  public TariffInformationTypeU getServiceRoutePrice() {
    return serviceRoutePrice;
  }

  public void setServiceRoutePrice(TariffInformationTypeU serviceRoutePrice) {
    this.serviceRoutePrice = serviceRoutePrice;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceInfoGroup serviceInfoGroup = (ServiceInfoGroup) o;
    return Objects.equals(this.numberOfServices, serviceInfoGroup.numberOfServices) &&
        Objects.equals(this.serviceInformation, serviceInfoGroup.serviceInformation) &&
        Objects.equals(this.serviceRoutePrice, serviceInfoGroup.serviceRoutePrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numberOfServices, serviceInformation, serviceRoutePrice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceInfoGroup {\n");
    
    sb.append("    numberOfServices: ").append(toIndentedString(numberOfServices)).append("\n");
    sb.append("    serviceInformation: ").append(toIndentedString(serviceInformation)).append("\n");
    sb.append("    serviceRoutePrice: ").append(toIndentedString(serviceRoutePrice)).append("\n");
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

