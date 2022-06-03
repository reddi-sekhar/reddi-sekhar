package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.LocationIdentificationTypeS;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TerminalTimeInformationTypeS
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class TerminalTimeInformationTypeS   {
  @JsonProperty("locationDetails")
  private LocationIdentificationTypeS locationDetails;

  public TerminalTimeInformationTypeS locationDetails(LocationIdentificationTypeS locationDetails) {
    this.locationDetails = locationDetails;
    return this;
  }

  /**
   * Get locationDetails
   * @return locationDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public LocationIdentificationTypeS getLocationDetails() {
    return locationDetails;
  }

  public void setLocationDetails(LocationIdentificationTypeS locationDetails) {
    this.locationDetails = locationDetails;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TerminalTimeInformationTypeS terminalTimeInformationTypeS = (TerminalTimeInformationTypeS) o;
    return Objects.equals(this.locationDetails, terminalTimeInformationTypeS.locationDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locationDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TerminalTimeInformationTypeS {\n");
    
    sb.append("    locationDetails: ").append(toIndentedString(locationDetails)).append("\n");
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

