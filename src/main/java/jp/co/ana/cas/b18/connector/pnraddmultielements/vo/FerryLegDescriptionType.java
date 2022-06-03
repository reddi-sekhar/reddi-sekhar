package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.AnimalInfoGroup;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.PriceInfoGroup;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ReferenceInformationTypeI25132S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ServiceInfoGroup;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ShipIdentificationType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.StructuredDateTimeInformationType21109S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.TravelProductInformationTypeU;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.VehicleInfoGroup;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FerryLegDescriptionType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class FerryLegDescriptionType   {
  @JsonProperty("animalInfoGroup")
  @Valid
  private List<AnimalInfoGroup> animalInfoGroup = null;

  @JsonProperty("passengerAssociation")
  private ReferenceInformationTypeI25132S passengerAssociation;

  @JsonProperty("priceInfoGroup")
  @Valid
  private List<PriceInfoGroup> priceInfoGroup = null;

  @JsonProperty("sailingDetails")
  private TravelProductInformationTypeU sailingDetails;

  @JsonProperty("sailingLegCheckInInformation")
  private StructuredDateTimeInformationType21109S sailingLegCheckInInformation;

  @JsonProperty("serviceInfoGroup")
  @Valid
  private List<ServiceInfoGroup> serviceInfoGroup = null;

  @JsonProperty("shipDescription")
  private ShipIdentificationType shipDescription;

  @JsonProperty("vehicleInfoGroup")
  @Valid
  private List<VehicleInfoGroup> vehicleInfoGroup = null;

  public FerryLegDescriptionType animalInfoGroup(List<AnimalInfoGroup> animalInfoGroup) {
    this.animalInfoGroup = animalInfoGroup;
    return this;
  }

  public FerryLegDescriptionType addAnimalInfoGroupItem(AnimalInfoGroup animalInfoGroupItem) {
    if (this.animalInfoGroup == null) {
      this.animalInfoGroup = new ArrayList<>();
    }
    this.animalInfoGroup.add(animalInfoGroupItem);
    return this;
  }

  /**
   * Get animalInfoGroup
   * @return animalInfoGroup
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<AnimalInfoGroup> getAnimalInfoGroup() {
    return animalInfoGroup;
  }

  public void setAnimalInfoGroup(List<AnimalInfoGroup> animalInfoGroup) {
    this.animalInfoGroup = animalInfoGroup;
  }

  public FerryLegDescriptionType passengerAssociation(ReferenceInformationTypeI25132S passengerAssociation) {
    this.passengerAssociation = passengerAssociation;
    return this;
  }

  /**
   * Get passengerAssociation
   * @return passengerAssociation
  */
  @ApiModelProperty(value = "")

  @Valid

  public ReferenceInformationTypeI25132S getPassengerAssociation() {
    return passengerAssociation;
  }

  public void setPassengerAssociation(ReferenceInformationTypeI25132S passengerAssociation) {
    this.passengerAssociation = passengerAssociation;
  }

  public FerryLegDescriptionType priceInfoGroup(List<PriceInfoGroup> priceInfoGroup) {
    this.priceInfoGroup = priceInfoGroup;
    return this;
  }

  public FerryLegDescriptionType addPriceInfoGroupItem(PriceInfoGroup priceInfoGroupItem) {
    if (this.priceInfoGroup == null) {
      this.priceInfoGroup = new ArrayList<>();
    }
    this.priceInfoGroup.add(priceInfoGroupItem);
    return this;
  }

  /**
   * Get priceInfoGroup
   * @return priceInfoGroup
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<PriceInfoGroup> getPriceInfoGroup() {
    return priceInfoGroup;
  }

  public void setPriceInfoGroup(List<PriceInfoGroup> priceInfoGroup) {
    this.priceInfoGroup = priceInfoGroup;
  }

  public FerryLegDescriptionType sailingDetails(TravelProductInformationTypeU sailingDetails) {
    this.sailingDetails = sailingDetails;
    return this;
  }

  /**
   * Get sailingDetails
   * @return sailingDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public TravelProductInformationTypeU getSailingDetails() {
    return sailingDetails;
  }

  public void setSailingDetails(TravelProductInformationTypeU sailingDetails) {
    this.sailingDetails = sailingDetails;
  }

  public FerryLegDescriptionType sailingLegCheckInInformation(StructuredDateTimeInformationType21109S sailingLegCheckInInformation) {
    this.sailingLegCheckInInformation = sailingLegCheckInInformation;
    return this;
  }

  /**
   * Get sailingLegCheckInInformation
   * @return sailingLegCheckInInformation
  */
  @ApiModelProperty(value = "")

  @Valid

  public StructuredDateTimeInformationType21109S getSailingLegCheckInInformation() {
    return sailingLegCheckInInformation;
  }

  public void setSailingLegCheckInInformation(StructuredDateTimeInformationType21109S sailingLegCheckInInformation) {
    this.sailingLegCheckInInformation = sailingLegCheckInInformation;
  }

  public FerryLegDescriptionType serviceInfoGroup(List<ServiceInfoGroup> serviceInfoGroup) {
    this.serviceInfoGroup = serviceInfoGroup;
    return this;
  }

  public FerryLegDescriptionType addServiceInfoGroupItem(ServiceInfoGroup serviceInfoGroupItem) {
    if (this.serviceInfoGroup == null) {
      this.serviceInfoGroup = new ArrayList<>();
    }
    this.serviceInfoGroup.add(serviceInfoGroupItem);
    return this;
  }

  /**
   * Get serviceInfoGroup
   * @return serviceInfoGroup
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<ServiceInfoGroup> getServiceInfoGroup() {
    return serviceInfoGroup;
  }

  public void setServiceInfoGroup(List<ServiceInfoGroup> serviceInfoGroup) {
    this.serviceInfoGroup = serviceInfoGroup;
  }

  public FerryLegDescriptionType shipDescription(ShipIdentificationType shipDescription) {
    this.shipDescription = shipDescription;
    return this;
  }

  /**
   * Get shipDescription
   * @return shipDescription
  */
  @ApiModelProperty(value = "")

  @Valid

  public ShipIdentificationType getShipDescription() {
    return shipDescription;
  }

  public void setShipDescription(ShipIdentificationType shipDescription) {
    this.shipDescription = shipDescription;
  }

  public FerryLegDescriptionType vehicleInfoGroup(List<VehicleInfoGroup> vehicleInfoGroup) {
    this.vehicleInfoGroup = vehicleInfoGroup;
    return this;
  }

  public FerryLegDescriptionType addVehicleInfoGroupItem(VehicleInfoGroup vehicleInfoGroupItem) {
    if (this.vehicleInfoGroup == null) {
      this.vehicleInfoGroup = new ArrayList<>();
    }
    this.vehicleInfoGroup.add(vehicleInfoGroupItem);
    return this;
  }

  /**
   * Get vehicleInfoGroup
   * @return vehicleInfoGroup
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<VehicleInfoGroup> getVehicleInfoGroup() {
    return vehicleInfoGroup;
  }

  public void setVehicleInfoGroup(List<VehicleInfoGroup> vehicleInfoGroup) {
    this.vehicleInfoGroup = vehicleInfoGroup;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FerryLegDescriptionType ferryLegDescriptionType = (FerryLegDescriptionType) o;
    return Objects.equals(this.animalInfoGroup, ferryLegDescriptionType.animalInfoGroup) &&
        Objects.equals(this.passengerAssociation, ferryLegDescriptionType.passengerAssociation) &&
        Objects.equals(this.priceInfoGroup, ferryLegDescriptionType.priceInfoGroup) &&
        Objects.equals(this.sailingDetails, ferryLegDescriptionType.sailingDetails) &&
        Objects.equals(this.sailingLegCheckInInformation, ferryLegDescriptionType.sailingLegCheckInInformation) &&
        Objects.equals(this.serviceInfoGroup, ferryLegDescriptionType.serviceInfoGroup) &&
        Objects.equals(this.shipDescription, ferryLegDescriptionType.shipDescription) &&
        Objects.equals(this.vehicleInfoGroup, ferryLegDescriptionType.vehicleInfoGroup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(animalInfoGroup, passengerAssociation, priceInfoGroup, sailingDetails, sailingLegCheckInInformation, serviceInfoGroup, shipDescription, vehicleInfoGroup);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FerryLegDescriptionType {\n");
    
    sb.append("    animalInfoGroup: ").append(toIndentedString(animalInfoGroup)).append("\n");
    sb.append("    passengerAssociation: ").append(toIndentedString(passengerAssociation)).append("\n");
    sb.append("    priceInfoGroup: ").append(toIndentedString(priceInfoGroup)).append("\n");
    sb.append("    sailingDetails: ").append(toIndentedString(sailingDetails)).append("\n");
    sb.append("    sailingLegCheckInInformation: ").append(toIndentedString(sailingLegCheckInInformation)).append("\n");
    sb.append("    serviceInfoGroup: ").append(toIndentedString(serviceInfoGroup)).append("\n");
    sb.append("    shipDescription: ").append(toIndentedString(shipDescription)).append("\n");
    sb.append("    vehicleInfoGroup: ").append(toIndentedString(vehicleInfoGroup)).append("\n");
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

