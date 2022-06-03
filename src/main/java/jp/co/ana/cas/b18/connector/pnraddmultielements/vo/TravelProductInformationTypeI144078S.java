package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.LocationTypeI208252C;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TravelProductInformationTypeI144078S
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class TravelProductInformationTypeI144078S   {
  @JsonProperty("boardPointDetails")
  private LocationTypeI208252C boardPointDetails;

  @JsonProperty("offpointDetails")
  private LocationTypeI208252C offpointDetails;

  public TravelProductInformationTypeI144078S boardPointDetails(LocationTypeI208252C boardPointDetails) {
    this.boardPointDetails = boardPointDetails;
    return this;
  }

  /**
   * Get boardPointDetails
   * @return boardPointDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public LocationTypeI208252C getBoardPointDetails() {
    return boardPointDetails;
  }

  public void setBoardPointDetails(LocationTypeI208252C boardPointDetails) {
    this.boardPointDetails = boardPointDetails;
  }

  public TravelProductInformationTypeI144078S offpointDetails(LocationTypeI208252C offpointDetails) {
    this.offpointDetails = offpointDetails;
    return this;
  }

  /**
   * Get offpointDetails
   * @return offpointDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public LocationTypeI208252C getOffpointDetails() {
    return offpointDetails;
  }

  public void setOffpointDetails(LocationTypeI208252C offpointDetails) {
    this.offpointDetails = offpointDetails;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TravelProductInformationTypeI144078S travelProductInformationTypeI144078S = (TravelProductInformationTypeI144078S) o;
    return Objects.equals(this.boardPointDetails, travelProductInformationTypeI144078S.boardPointDetails) &&
        Objects.equals(this.offpointDetails, travelProductInformationTypeI144078S.offpointDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(boardPointDetails, offpointDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TravelProductInformationTypeI144078S {\n");
    
    sb.append("    boardPointDetails: ").append(toIndentedString(boardPointDetails)).append("\n");
    sb.append("    offpointDetails: ").append(toIndentedString(offpointDetails)).append("\n");
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

