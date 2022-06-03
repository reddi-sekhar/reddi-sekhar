package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.FormatedTourCodeType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.FreeFormatTourCodeType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.NetRemitTourCodeType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TourCodeType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class TourCodeType   {
  @JsonProperty("formatedTour")
  private FormatedTourCodeType formatedTour;

  @JsonProperty("freeFormatTour")
  private FreeFormatTourCodeType freeFormatTour;

  @JsonProperty("netRemit")
  private NetRemitTourCodeType netRemit;

  @JsonProperty("passengerType")
  private String passengerType;

  public TourCodeType formatedTour(FormatedTourCodeType formatedTour) {
    this.formatedTour = formatedTour;
    return this;
  }

  /**
   * Get formatedTour
   * @return formatedTour
  */
  @ApiModelProperty(value = "")

  @Valid

  public FormatedTourCodeType getFormatedTour() {
    return formatedTour;
  }

  public void setFormatedTour(FormatedTourCodeType formatedTour) {
    this.formatedTour = formatedTour;
  }

  public TourCodeType freeFormatTour(FreeFormatTourCodeType freeFormatTour) {
    this.freeFormatTour = freeFormatTour;
    return this;
  }

  /**
   * Get freeFormatTour
   * @return freeFormatTour
  */
  @ApiModelProperty(value = "")

  @Valid

  public FreeFormatTourCodeType getFreeFormatTour() {
    return freeFormatTour;
  }

  public void setFreeFormatTour(FreeFormatTourCodeType freeFormatTour) {
    this.freeFormatTour = freeFormatTour;
  }

  public TourCodeType netRemit(NetRemitTourCodeType netRemit) {
    this.netRemit = netRemit;
    return this;
  }

  /**
   * Get netRemit
   * @return netRemit
  */
  @ApiModelProperty(value = "")

  @Valid

  public NetRemitTourCodeType getNetRemit() {
    return netRemit;
  }

  public void setNetRemit(NetRemitTourCodeType netRemit) {
    this.netRemit = netRemit;
  }

  public TourCodeType passengerType(String passengerType) {
    this.passengerType = passengerType;
    return this;
  }

  /**
   * Get passengerType
   * @return passengerType
  */
  @ApiModelProperty(value = "")


  public String getPassengerType() {
    return passengerType;
  }

  public void setPassengerType(String passengerType) {
    this.passengerType = passengerType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TourCodeType tourCodeType = (TourCodeType) o;
    return Objects.equals(this.formatedTour, tourCodeType.formatedTour) &&
        Objects.equals(this.freeFormatTour, tourCodeType.freeFormatTour) &&
        Objects.equals(this.netRemit, tourCodeType.netRemit) &&
        Objects.equals(this.passengerType, tourCodeType.passengerType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(formatedTour, freeFormatTour, netRemit, passengerType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TourCodeType {\n");
    
    sb.append("    formatedTour: ").append(toIndentedString(formatedTour)).append("\n");
    sb.append("    freeFormatTour: ").append(toIndentedString(freeFormatTour)).append("\n");
    sb.append("    netRemit: ").append(toIndentedString(netRemit)).append("\n");
    sb.append("    passengerType: ").append(toIndentedString(passengerType)).append("\n");
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

