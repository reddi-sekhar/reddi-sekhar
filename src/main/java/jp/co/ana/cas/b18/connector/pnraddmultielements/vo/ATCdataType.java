package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.MonetaryInformationTypeI79012S;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ATCdataType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class ATCdataType   {
  @JsonProperty("atcTotalAdditionalCollection")
  private MonetaryInformationTypeI79012S atcTotalAdditionalCollection;

  @JsonProperty("otherAtcFares")
  @Valid
  private List<MonetaryInformationTypeI79012S> otherAtcFares = null;

  public ATCdataType atcTotalAdditionalCollection(MonetaryInformationTypeI79012S atcTotalAdditionalCollection) {
    this.atcTotalAdditionalCollection = atcTotalAdditionalCollection;
    return this;
  }

  /**
   * Get atcTotalAdditionalCollection
   * @return atcTotalAdditionalCollection
  */
  @ApiModelProperty(value = "")

  @Valid

  public MonetaryInformationTypeI79012S getAtcTotalAdditionalCollection() {
    return atcTotalAdditionalCollection;
  }

  public void setAtcTotalAdditionalCollection(MonetaryInformationTypeI79012S atcTotalAdditionalCollection) {
    this.atcTotalAdditionalCollection = atcTotalAdditionalCollection;
  }

  public ATCdataType otherAtcFares(List<MonetaryInformationTypeI79012S> otherAtcFares) {
    this.otherAtcFares = otherAtcFares;
    return this;
  }

  public ATCdataType addOtherAtcFaresItem(MonetaryInformationTypeI79012S otherAtcFaresItem) {
    if (this.otherAtcFares == null) {
      this.otherAtcFares = new ArrayList<>();
    }
    this.otherAtcFares.add(otherAtcFaresItem);
    return this;
  }

  /**
   * Get otherAtcFares
   * @return otherAtcFares
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<MonetaryInformationTypeI79012S> getOtherAtcFares() {
    return otherAtcFares;
  }

  public void setOtherAtcFares(List<MonetaryInformationTypeI79012S> otherAtcFares) {
    this.otherAtcFares = otherAtcFares;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ATCdataType atCdataType = (ATCdataType) o;
    return Objects.equals(this.atcTotalAdditionalCollection, atCdataType.atcTotalAdditionalCollection) &&
        Objects.equals(this.otherAtcFares, atCdataType.otherAtcFares);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atcTotalAdditionalCollection, otherAtcFares);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ATCdataType {\n");
    
    sb.append("    atcTotalAdditionalCollection: ").append(toIndentedString(atcTotalAdditionalCollection)).append("\n");
    sb.append("    otherAtcFares: ").append(toIndentedString(otherAtcFares)).append("\n");
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

