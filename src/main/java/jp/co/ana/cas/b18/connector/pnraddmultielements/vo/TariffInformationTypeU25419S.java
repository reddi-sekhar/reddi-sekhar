package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.AssociatedChargesInformationTypeU;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.TariffInformationDetailsTypeU46314C;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TariffInformationTypeU25419S
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class TariffInformationTypeU25419S   {
  @JsonProperty("associatedChargesInformation")
  private AssociatedChargesInformationTypeU associatedChargesInformation;

  @JsonProperty("tariffInformation")
  @Valid
  private List<TariffInformationDetailsTypeU46314C> tariffInformation = null;

  public TariffInformationTypeU25419S associatedChargesInformation(AssociatedChargesInformationTypeU associatedChargesInformation) {
    this.associatedChargesInformation = associatedChargesInformation;
    return this;
  }

  /**
   * Get associatedChargesInformation
   * @return associatedChargesInformation
  */
  @ApiModelProperty(value = "")

  @Valid

  public AssociatedChargesInformationTypeU getAssociatedChargesInformation() {
    return associatedChargesInformation;
  }

  public void setAssociatedChargesInformation(AssociatedChargesInformationTypeU associatedChargesInformation) {
    this.associatedChargesInformation = associatedChargesInformation;
  }

  public TariffInformationTypeU25419S tariffInformation(List<TariffInformationDetailsTypeU46314C> tariffInformation) {
    this.tariffInformation = tariffInformation;
    return this;
  }

  public TariffInformationTypeU25419S addTariffInformationItem(TariffInformationDetailsTypeU46314C tariffInformationItem) {
    if (this.tariffInformation == null) {
      this.tariffInformation = new ArrayList<>();
    }
    this.tariffInformation.add(tariffInformationItem);
    return this;
  }

  /**
   * Get tariffInformation
   * @return tariffInformation
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<TariffInformationDetailsTypeU46314C> getTariffInformation() {
    return tariffInformation;
  }

  public void setTariffInformation(List<TariffInformationDetailsTypeU46314C> tariffInformation) {
    this.tariffInformation = tariffInformation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TariffInformationTypeU25419S tariffInformationTypeU25419S = (TariffInformationTypeU25419S) o;
    return Objects.equals(this.associatedChargesInformation, tariffInformationTypeU25419S.associatedChargesInformation) &&
        Objects.equals(this.tariffInformation, tariffInformationTypeU25419S.tariffInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(associatedChargesInformation, tariffInformation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TariffInformationTypeU25419S {\n");
    
    sb.append("    associatedChargesInformation: ").append(toIndentedString(associatedChargesInformation)).append("\n");
    sb.append("    tariffInformation: ").append(toIndentedString(tariffInformation)).append("\n");
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

