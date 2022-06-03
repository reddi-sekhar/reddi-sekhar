package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.SpecificDataInformationTypeI;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.TariffInformationTypeU;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AnimalInfoGroup
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class AnimalInfoGroup   {
  @JsonProperty("animalInformation")
  private SpecificDataInformationTypeI animalInformation;

  @JsonProperty("animalRoutePrice")
  private TariffInformationTypeU animalRoutePrice;

  public AnimalInfoGroup animalInformation(SpecificDataInformationTypeI animalInformation) {
    this.animalInformation = animalInformation;
    return this;
  }

  /**
   * Get animalInformation
   * @return animalInformation
  */
  @ApiModelProperty(value = "")

  @Valid

  public SpecificDataInformationTypeI getAnimalInformation() {
    return animalInformation;
  }

  public void setAnimalInformation(SpecificDataInformationTypeI animalInformation) {
    this.animalInformation = animalInformation;
  }

  public AnimalInfoGroup animalRoutePrice(TariffInformationTypeU animalRoutePrice) {
    this.animalRoutePrice = animalRoutePrice;
    return this;
  }

  /**
   * Get animalRoutePrice
   * @return animalRoutePrice
  */
  @ApiModelProperty(value = "")

  @Valid

  public TariffInformationTypeU getAnimalRoutePrice() {
    return animalRoutePrice;
  }

  public void setAnimalRoutePrice(TariffInformationTypeU animalRoutePrice) {
    this.animalRoutePrice = animalRoutePrice;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnimalInfoGroup animalInfoGroup = (AnimalInfoGroup) o;
    return Objects.equals(this.animalInformation, animalInfoGroup.animalInformation) &&
        Objects.equals(this.animalRoutePrice, animalInfoGroup.animalRoutePrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(animalInformation, animalRoutePrice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnimalInfoGroup {\n");
    
    sb.append("    animalInformation: ").append(toIndentedString(animalInformation)).append("\n");
    sb.append("    animalRoutePrice: ").append(toIndentedString(animalRoutePrice)).append("\n");
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

