package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TravelerPerpaxDetailsType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class TravelerPerpaxDetailsType   {
  @JsonProperty("perpaxMask")
  private String perpaxMask;

  @JsonProperty("perpaxMaskIndicator")
  private String perpaxMaskIndicator;

  public TravelerPerpaxDetailsType perpaxMask(String perpaxMask) {
    this.perpaxMask = perpaxMask;
    return this;
  }

  /**
   * Get perpaxMask
   * @return perpaxMask
  */
  @ApiModelProperty(value = "")


  public String getPerpaxMask() {
    return perpaxMask;
  }

  public void setPerpaxMask(String perpaxMask) {
    this.perpaxMask = perpaxMask;
  }

  public TravelerPerpaxDetailsType perpaxMaskIndicator(String perpaxMaskIndicator) {
    this.perpaxMaskIndicator = perpaxMaskIndicator;
    return this;
  }

  /**
   * Get perpaxMaskIndicator
   * @return perpaxMaskIndicator
  */
  @ApiModelProperty(value = "")


  public String getPerpaxMaskIndicator() {
    return perpaxMaskIndicator;
  }

  public void setPerpaxMaskIndicator(String perpaxMaskIndicator) {
    this.perpaxMaskIndicator = perpaxMaskIndicator;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TravelerPerpaxDetailsType travelerPerpaxDetailsType = (TravelerPerpaxDetailsType) o;
    return Objects.equals(this.perpaxMask, travelerPerpaxDetailsType.perpaxMask) &&
        Objects.equals(this.perpaxMaskIndicator, travelerPerpaxDetailsType.perpaxMaskIndicator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(perpaxMask, perpaxMaskIndicator);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TravelerPerpaxDetailsType {\n");
    
    sb.append("    perpaxMask: ").append(toIndentedString(perpaxMask)).append("\n");
    sb.append("    perpaxMaskIndicator: ").append(toIndentedString(perpaxMaskIndicator)).append("\n");
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

