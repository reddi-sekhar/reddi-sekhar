package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.CabinClassDesignationType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CabinDetailsType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class CabinDetailsType   {
  @JsonProperty("cabinDetails")
  private CabinClassDesignationType cabinDetails;

  public CabinDetailsType cabinDetails(CabinClassDesignationType cabinDetails) {
    this.cabinDetails = cabinDetails;
    return this;
  }

  /**
   * Get cabinDetails
   * @return cabinDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public CabinClassDesignationType getCabinDetails() {
    return cabinDetails;
  }

  public void setCabinDetails(CabinClassDesignationType cabinDetails) {
    this.cabinDetails = cabinDetails;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CabinDetailsType cabinDetailsType = (CabinDetailsType) o;
    return Objects.equals(this.cabinDetails, cabinDetailsType.cabinDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cabinDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CabinDetailsType {\n");
    
    sb.append("    cabinDetails: ").append(toIndentedString(cabinDetails)).append("\n");
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

