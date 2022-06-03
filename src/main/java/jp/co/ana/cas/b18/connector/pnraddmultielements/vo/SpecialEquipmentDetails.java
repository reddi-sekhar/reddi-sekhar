package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.FreeTextInformationType136715S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.RangePeriod;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.TariffInformationTypeI136714S;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SpecialEquipmentDetails
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class SpecialEquipmentDetails   {
  @JsonProperty("additionalInfo")
  private FreeTextInformationType136715S additionalInfo;

  @JsonProperty("dummy2")
  private Object dummy2;

  @JsonProperty("rangePeriod")
  @Valid
  private List<RangePeriod> rangePeriod = null;

  @JsonProperty("specialEquipmentTariff")
  @Valid
  private List<TariffInformationTypeI136714S> specialEquipmentTariff = null;

  public SpecialEquipmentDetails additionalInfo(FreeTextInformationType136715S additionalInfo) {
    this.additionalInfo = additionalInfo;
    return this;
  }

  /**
   * Get additionalInfo
   * @return additionalInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public FreeTextInformationType136715S getAdditionalInfo() {
    return additionalInfo;
  }

  public void setAdditionalInfo(FreeTextInformationType136715S additionalInfo) {
    this.additionalInfo = additionalInfo;
  }

  public SpecialEquipmentDetails dummy2(Object dummy2) {
    this.dummy2 = dummy2;
    return this;
  }

  /**
   * Get dummy2
   * @return dummy2
  */
  @ApiModelProperty(value = "")


  public Object getDummy2() {
    return dummy2;
  }

  public void setDummy2(Object dummy2) {
    this.dummy2 = dummy2;
  }

  public SpecialEquipmentDetails rangePeriod(List<RangePeriod> rangePeriod) {
    this.rangePeriod = rangePeriod;
    return this;
  }

  public SpecialEquipmentDetails addRangePeriodItem(RangePeriod rangePeriodItem) {
    if (this.rangePeriod == null) {
      this.rangePeriod = new ArrayList<>();
    }
    this.rangePeriod.add(rangePeriodItem);
    return this;
  }

  /**
   * Get rangePeriod
   * @return rangePeriod
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<RangePeriod> getRangePeriod() {
    return rangePeriod;
  }

  public void setRangePeriod(List<RangePeriod> rangePeriod) {
    this.rangePeriod = rangePeriod;
  }

  public SpecialEquipmentDetails specialEquipmentTariff(List<TariffInformationTypeI136714S> specialEquipmentTariff) {
    this.specialEquipmentTariff = specialEquipmentTariff;
    return this;
  }

  public SpecialEquipmentDetails addSpecialEquipmentTariffItem(TariffInformationTypeI136714S specialEquipmentTariffItem) {
    if (this.specialEquipmentTariff == null) {
      this.specialEquipmentTariff = new ArrayList<>();
    }
    this.specialEquipmentTariff.add(specialEquipmentTariffItem);
    return this;
  }

  /**
   * Get specialEquipmentTariff
   * @return specialEquipmentTariff
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<TariffInformationTypeI136714S> getSpecialEquipmentTariff() {
    return specialEquipmentTariff;
  }

  public void setSpecialEquipmentTariff(List<TariffInformationTypeI136714S> specialEquipmentTariff) {
    this.specialEquipmentTariff = specialEquipmentTariff;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpecialEquipmentDetails specialEquipmentDetails = (SpecialEquipmentDetails) o;
    return Objects.equals(this.additionalInfo, specialEquipmentDetails.additionalInfo) &&
        Objects.equals(this.dummy2, specialEquipmentDetails.dummy2) &&
        Objects.equals(this.rangePeriod, specialEquipmentDetails.rangePeriod) &&
        Objects.equals(this.specialEquipmentTariff, specialEquipmentDetails.specialEquipmentTariff);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalInfo, dummy2, rangePeriod, specialEquipmentTariff);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpecialEquipmentDetails {\n");
    
    sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
    sb.append("    dummy2: ").append(toIndentedString(dummy2)).append("\n");
    sb.append("    rangePeriod: ").append(toIndentedString(rangePeriod)).append("\n");
    sb.append("    specialEquipmentTariff: ").append(toIndentedString(specialEquipmentTariff)).append("\n");
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

