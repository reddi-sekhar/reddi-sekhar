package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.FarePrintOverrideDetailsType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FarePrintOverrideType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class FarePrintOverrideType   {
  @JsonProperty("override")
  private FarePrintOverrideDetailsType override;

  @JsonProperty("passengerType")
  private String passengerType;

  public FarePrintOverrideType override(FarePrintOverrideDetailsType override) {
    this.override = override;
    return this;
  }

  /**
   * Get override
   * @return override
  */
  @ApiModelProperty(value = "")

  @Valid

  public FarePrintOverrideDetailsType getOverride() {
    return override;
  }

  public void setOverride(FarePrintOverrideDetailsType override) {
    this.override = override;
  }

  public FarePrintOverrideType passengerType(String passengerType) {
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
    FarePrintOverrideType farePrintOverrideType = (FarePrintOverrideType) o;
    return Objects.equals(this.override, farePrintOverrideType.override) &&
        Objects.equals(this.passengerType, farePrintOverrideType.passengerType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(override, passengerType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FarePrintOverrideType {\n");
    
    sb.append("    override: ").append(toIndentedString(override)).append("\n");
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

