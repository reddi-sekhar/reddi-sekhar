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
 * TravelItineraryInformationTypeI33275S
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class TravelItineraryInformationTypeI33275S   {
  @JsonProperty("movementType")
  private String movementType;

  public TravelItineraryInformationTypeI33275S movementType(String movementType) {
    this.movementType = movementType;
    return this;
  }

  /**
   * Get movementType
   * @return movementType
  */
  @ApiModelProperty(value = "")


  public String getMovementType() {
    return movementType;
  }

  public void setMovementType(String movementType) {
    this.movementType = movementType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TravelItineraryInformationTypeI33275S travelItineraryInformationTypeI33275S = (TravelItineraryInformationTypeI33275S) o;
    return Objects.equals(this.movementType, travelItineraryInformationTypeI33275S.movementType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(movementType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TravelItineraryInformationTypeI33275S {\n");
    
    sb.append("    movementType: ").append(toIndentedString(movementType)).append("\n");
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

