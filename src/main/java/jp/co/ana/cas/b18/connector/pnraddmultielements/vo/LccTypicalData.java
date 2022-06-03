package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ItemReferencesAndVersionsType6550S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.TariffInformationTypeI28460S;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * LccTypicalData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class LccTypicalData   {
  @JsonProperty("lccConnectionData")
  private ItemReferencesAndVersionsType6550S lccConnectionData;

  @JsonProperty("lccFareData")
  private TariffInformationTypeI28460S lccFareData;

  public LccTypicalData lccConnectionData(ItemReferencesAndVersionsType6550S lccConnectionData) {
    this.lccConnectionData = lccConnectionData;
    return this;
  }

  /**
   * Get lccConnectionData
   * @return lccConnectionData
  */
  @ApiModelProperty(value = "")

  @Valid

  public ItemReferencesAndVersionsType6550S getLccConnectionData() {
    return lccConnectionData;
  }

  public void setLccConnectionData(ItemReferencesAndVersionsType6550S lccConnectionData) {
    this.lccConnectionData = lccConnectionData;
  }

  public LccTypicalData lccFareData(TariffInformationTypeI28460S lccFareData) {
    this.lccFareData = lccFareData;
    return this;
  }

  /**
   * Get lccFareData
   * @return lccFareData
  */
  @ApiModelProperty(value = "")

  @Valid

  public TariffInformationTypeI28460S getLccFareData() {
    return lccFareData;
  }

  public void setLccFareData(TariffInformationTypeI28460S lccFareData) {
    this.lccFareData = lccFareData;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LccTypicalData lccTypicalData = (LccTypicalData) o;
    return Objects.equals(this.lccConnectionData, lccTypicalData.lccConnectionData) &&
        Objects.equals(this.lccFareData, lccTypicalData.lccFareData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lccConnectionData, lccFareData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LccTypicalData {\n");
    
    sb.append("    lccConnectionData: ").append(toIndentedString(lccConnectionData)).append("\n");
    sb.append("    lccFareData: ").append(toIndentedString(lccFareData)).append("\n");
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

