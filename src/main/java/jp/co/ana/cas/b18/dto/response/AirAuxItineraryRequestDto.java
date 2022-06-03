package jp.co.ana.cas.b18.dto.response;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.dto.response.FreetextItinerary1RequestDto;
import jp.co.ana.cas.b18.dto.response.MessageActionRequestDto;
import jp.co.ana.cas.b18.dto.response.RelatedProduct1RequestDto;
import jp.co.ana.cas.b18.dto.response.ReservationInfoSell1RequestDto;
import jp.co.ana.cas.b18.dto.response.SelectionDetailsAir1RequestDto;
import jp.co.ana.cas.b18.dto.response.TravelProductRequestDto;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AirAuxItineraryRequestDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class AirAuxItineraryRequestDto   {
  @JsonProperty("freetextItinerary")
  private FreetextItinerary1RequestDto freetextItinerary;

  @JsonProperty("messageAction")
  private MessageActionRequestDto messageAction;

  @JsonProperty("relatedProduct")
  private RelatedProduct1RequestDto relatedProduct;

  @JsonProperty("reservationInfoSell")
  private ReservationInfoSell1RequestDto reservationInfoSell;

  @JsonProperty("selectionDetailsAir")
  private SelectionDetailsAir1RequestDto selectionDetailsAir;

  @JsonProperty("travelProduct")
  private TravelProductRequestDto travelProduct;

  public AirAuxItineraryRequestDto freetextItinerary(FreetextItinerary1RequestDto freetextItinerary) {
    this.freetextItinerary = freetextItinerary;
    return this;
  }

  /**
   * Get freetextItinerary
   * @return freetextItinerary
  */
  @ApiModelProperty(value = "")

  @Valid

  public FreetextItinerary1RequestDto getFreetextItinerary() {
    return freetextItinerary;
  }

  public void setFreetextItinerary(FreetextItinerary1RequestDto freetextItinerary) {
    this.freetextItinerary = freetextItinerary;
  }

  public AirAuxItineraryRequestDto messageAction(MessageActionRequestDto messageAction) {
    this.messageAction = messageAction;
    return this;
  }

  /**
   * Get messageAction
   * @return messageAction
  */
  @ApiModelProperty(value = "")

  @Valid

  public MessageActionRequestDto getMessageAction() {
    return messageAction;
  }

  public void setMessageAction(MessageActionRequestDto messageAction) {
    this.messageAction = messageAction;
  }

  public AirAuxItineraryRequestDto relatedProduct(RelatedProduct1RequestDto relatedProduct) {
    this.relatedProduct = relatedProduct;
    return this;
  }

  /**
   * Get relatedProduct
   * @return relatedProduct
  */
  @ApiModelProperty(value = "")

  @Valid

  public RelatedProduct1RequestDto getRelatedProduct() {
    return relatedProduct;
  }

  public void setRelatedProduct(RelatedProduct1RequestDto relatedProduct) {
    this.relatedProduct = relatedProduct;
  }

  public AirAuxItineraryRequestDto reservationInfoSell(ReservationInfoSell1RequestDto reservationInfoSell) {
    this.reservationInfoSell = reservationInfoSell;
    return this;
  }

  /**
   * Get reservationInfoSell
   * @return reservationInfoSell
  */
  @ApiModelProperty(value = "")

  @Valid

  public ReservationInfoSell1RequestDto getReservationInfoSell() {
    return reservationInfoSell;
  }

  public void setReservationInfoSell(ReservationInfoSell1RequestDto reservationInfoSell) {
    this.reservationInfoSell = reservationInfoSell;
  }

  public AirAuxItineraryRequestDto selectionDetailsAir(SelectionDetailsAir1RequestDto selectionDetailsAir) {
    this.selectionDetailsAir = selectionDetailsAir;
    return this;
  }

  /**
   * Get selectionDetailsAir
   * @return selectionDetailsAir
  */
  @ApiModelProperty(value = "")

  @Valid

  public SelectionDetailsAir1RequestDto getSelectionDetailsAir() {
    return selectionDetailsAir;
  }

  public void setSelectionDetailsAir(SelectionDetailsAir1RequestDto selectionDetailsAir) {
    this.selectionDetailsAir = selectionDetailsAir;
  }

  public AirAuxItineraryRequestDto travelProduct(TravelProductRequestDto travelProduct) {
    this.travelProduct = travelProduct;
    return this;
  }

  /**
   * Get travelProduct
   * @return travelProduct
  */
  @ApiModelProperty(value = "")

  @Valid

  public TravelProductRequestDto getTravelProduct() {
    return travelProduct;
  }

  public void setTravelProduct(TravelProductRequestDto travelProduct) {
    this.travelProduct = travelProduct;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AirAuxItineraryRequestDto airAuxItineraryRequestDto = (AirAuxItineraryRequestDto) o;
    return Objects.equals(this.freetextItinerary, airAuxItineraryRequestDto.freetextItinerary) &&
        Objects.equals(this.messageAction, airAuxItineraryRequestDto.messageAction) &&
        Objects.equals(this.relatedProduct, airAuxItineraryRequestDto.relatedProduct) &&
        Objects.equals(this.reservationInfoSell, airAuxItineraryRequestDto.reservationInfoSell) &&
        Objects.equals(this.selectionDetailsAir, airAuxItineraryRequestDto.selectionDetailsAir) &&
        Objects.equals(this.travelProduct, airAuxItineraryRequestDto.travelProduct);
  }

  @Override
  public int hashCode() {
    return Objects.hash(freetextItinerary, messageAction, relatedProduct, reservationInfoSell, selectionDetailsAir, travelProduct);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AirAuxItineraryRequestDto {\n");
    
    sb.append("    freetextItinerary: ").append(toIndentedString(freetextItinerary)).append("\n");
    sb.append("    messageAction: ").append(toIndentedString(messageAction)).append("\n");
    sb.append("    relatedProduct: ").append(toIndentedString(relatedProduct)).append("\n");
    sb.append("    reservationInfoSell: ").append(toIndentedString(reservationInfoSell)).append("\n");
    sb.append("    selectionDetailsAir: ").append(toIndentedString(selectionDetailsAir)).append("\n");
    sb.append("    travelProduct: ").append(toIndentedString(travelProduct)).append("\n");
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

