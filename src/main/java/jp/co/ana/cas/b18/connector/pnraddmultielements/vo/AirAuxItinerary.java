package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.LongFreeTextType1;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.MessageActionDetailsTypeI;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.RelatedProductInformationTypeI1;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ReservationControlInformationTypeI1;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.SelectionDetailsTypeI1;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.TravelProductInformationType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AirAuxItinerary
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class AirAuxItinerary   {
  @JsonProperty("freetextItinerary")
  private LongFreeTextType1 freetextItinerary;

  @JsonProperty("messageAction")
  private MessageActionDetailsTypeI messageAction;

  @JsonProperty("relatedProduct")
  private RelatedProductInformationTypeI1 relatedProduct;

  @JsonProperty("reservationInfoSell")
  private ReservationControlInformationTypeI1 reservationInfoSell;

  @JsonProperty("selectionDetailsAir")
  private SelectionDetailsTypeI1 selectionDetailsAir;

  @JsonProperty("travelProduct")
  private TravelProductInformationType travelProduct;

  public AirAuxItinerary freetextItinerary(LongFreeTextType1 freetextItinerary) {
    this.freetextItinerary = freetextItinerary;
    return this;
  }

  /**
   * Get freetextItinerary
   * @return freetextItinerary
  */
  @ApiModelProperty(value = "")

  @Valid

  public LongFreeTextType1 getFreetextItinerary() {
    return freetextItinerary;
  }

  public void setFreetextItinerary(LongFreeTextType1 freetextItinerary) {
    this.freetextItinerary = freetextItinerary;
  }

  public AirAuxItinerary messageAction(MessageActionDetailsTypeI messageAction) {
    this.messageAction = messageAction;
    return this;
  }

  /**
   * Get messageAction
   * @return messageAction
  */
  @ApiModelProperty(value = "")

  @Valid

  public MessageActionDetailsTypeI getMessageAction() {
    return messageAction;
  }

  public void setMessageAction(MessageActionDetailsTypeI messageAction) {
    this.messageAction = messageAction;
  }

  public AirAuxItinerary relatedProduct(RelatedProductInformationTypeI1 relatedProduct) {
    this.relatedProduct = relatedProduct;
    return this;
  }

  /**
   * Get relatedProduct
   * @return relatedProduct
  */
  @ApiModelProperty(value = "")

  @Valid

  public RelatedProductInformationTypeI1 getRelatedProduct() {
    return relatedProduct;
  }

  public void setRelatedProduct(RelatedProductInformationTypeI1 relatedProduct) {
    this.relatedProduct = relatedProduct;
  }

  public AirAuxItinerary reservationInfoSell(ReservationControlInformationTypeI1 reservationInfoSell) {
    this.reservationInfoSell = reservationInfoSell;
    return this;
  }

  /**
   * Get reservationInfoSell
   * @return reservationInfoSell
  */
  @ApiModelProperty(value = "")

  @Valid

  public ReservationControlInformationTypeI1 getReservationInfoSell() {
    return reservationInfoSell;
  }

  public void setReservationInfoSell(ReservationControlInformationTypeI1 reservationInfoSell) {
    this.reservationInfoSell = reservationInfoSell;
  }

  public AirAuxItinerary selectionDetailsAir(SelectionDetailsTypeI1 selectionDetailsAir) {
    this.selectionDetailsAir = selectionDetailsAir;
    return this;
  }

  /**
   * Get selectionDetailsAir
   * @return selectionDetailsAir
  */
  @ApiModelProperty(value = "")

  @Valid

  public SelectionDetailsTypeI1 getSelectionDetailsAir() {
    return selectionDetailsAir;
  }

  public void setSelectionDetailsAir(SelectionDetailsTypeI1 selectionDetailsAir) {
    this.selectionDetailsAir = selectionDetailsAir;
  }

  public AirAuxItinerary travelProduct(TravelProductInformationType travelProduct) {
    this.travelProduct = travelProduct;
    return this;
  }

  /**
   * Get travelProduct
   * @return travelProduct
  */
  @ApiModelProperty(value = "")

  @Valid

  public TravelProductInformationType getTravelProduct() {
    return travelProduct;
  }

  public void setTravelProduct(TravelProductInformationType travelProduct) {
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
    AirAuxItinerary airAuxItinerary = (AirAuxItinerary) o;
    return Objects.equals(this.freetextItinerary, airAuxItinerary.freetextItinerary) &&
        Objects.equals(this.messageAction, airAuxItinerary.messageAction) &&
        Objects.equals(this.relatedProduct, airAuxItinerary.relatedProduct) &&
        Objects.equals(this.reservationInfoSell, airAuxItinerary.reservationInfoSell) &&
        Objects.equals(this.selectionDetailsAir, airAuxItinerary.selectionDetailsAir) &&
        Objects.equals(this.travelProduct, airAuxItinerary.travelProduct);
  }

  @Override
  public int hashCode() {
    return Objects.hash(freetextItinerary, messageAction, relatedProduct, reservationInfoSell, selectionDetailsAir, travelProduct);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AirAuxItinerary {\n");
    
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

