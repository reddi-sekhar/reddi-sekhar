package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.InteractiveFreeTextTypeI99363S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.TravelProductInformationTypeI99362S;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * LegInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class LegInfo   {
  @JsonProperty("interactiveFreeText")
  @Valid
  private List<InteractiveFreeTextTypeI99363S> interactiveFreeText = null;

  @JsonProperty("legTravelProduct")
  private TravelProductInformationTypeI99362S legTravelProduct;

  @JsonProperty("markerLegInfo")
  private Object markerLegInfo;

  public LegInfo interactiveFreeText(List<InteractiveFreeTextTypeI99363S> interactiveFreeText) {
    this.interactiveFreeText = interactiveFreeText;
    return this;
  }

  public LegInfo addInteractiveFreeTextItem(InteractiveFreeTextTypeI99363S interactiveFreeTextItem) {
    if (this.interactiveFreeText == null) {
      this.interactiveFreeText = new ArrayList<>();
    }
    this.interactiveFreeText.add(interactiveFreeTextItem);
    return this;
  }

  /**
   * Get interactiveFreeText
   * @return interactiveFreeText
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<InteractiveFreeTextTypeI99363S> getInteractiveFreeText() {
    return interactiveFreeText;
  }

  public void setInteractiveFreeText(List<InteractiveFreeTextTypeI99363S> interactiveFreeText) {
    this.interactiveFreeText = interactiveFreeText;
  }

  public LegInfo legTravelProduct(TravelProductInformationTypeI99362S legTravelProduct) {
    this.legTravelProduct = legTravelProduct;
    return this;
  }

  /**
   * Get legTravelProduct
   * @return legTravelProduct
  */
  @ApiModelProperty(value = "")

  @Valid

  public TravelProductInformationTypeI99362S getLegTravelProduct() {
    return legTravelProduct;
  }

  public void setLegTravelProduct(TravelProductInformationTypeI99362S legTravelProduct) {
    this.legTravelProduct = legTravelProduct;
  }

  public LegInfo markerLegInfo(Object markerLegInfo) {
    this.markerLegInfo = markerLegInfo;
    return this;
  }

  /**
   * Get markerLegInfo
   * @return markerLegInfo
  */
  @ApiModelProperty(value = "")


  public Object getMarkerLegInfo() {
    return markerLegInfo;
  }

  public void setMarkerLegInfo(Object markerLegInfo) {
    this.markerLegInfo = markerLegInfo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LegInfo legInfo = (LegInfo) o;
    return Objects.equals(this.interactiveFreeText, legInfo.interactiveFreeText) &&
        Objects.equals(this.legTravelProduct, legInfo.legTravelProduct) &&
        Objects.equals(this.markerLegInfo, legInfo.markerLegInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interactiveFreeText, legTravelProduct, markerLegInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LegInfo {\n");
    
    sb.append("    interactiveFreeText: ").append(toIndentedString(interactiveFreeText)).append("\n");
    sb.append("    legTravelProduct: ").append(toIndentedString(legTravelProduct)).append("\n");
    sb.append("    markerLegInfo: ").append(toIndentedString(markerLegInfo)).append("\n");
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

