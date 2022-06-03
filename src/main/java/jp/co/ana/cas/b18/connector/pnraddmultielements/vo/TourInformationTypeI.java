package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.TourDetailsTypeI198183C;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TourInformationTypeI
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class TourInformationTypeI   {
  @JsonProperty("tourInformationDetails")
  private TourDetailsTypeI198183C tourInformationDetails;

  public TourInformationTypeI tourInformationDetails(TourDetailsTypeI198183C tourInformationDetails) {
    this.tourInformationDetails = tourInformationDetails;
    return this;
  }

  /**
   * Get tourInformationDetails
   * @return tourInformationDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public TourDetailsTypeI198183C getTourInformationDetails() {
    return tourInformationDetails;
  }

  public void setTourInformationDetails(TourDetailsTypeI198183C tourInformationDetails) {
    this.tourInformationDetails = tourInformationDetails;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TourInformationTypeI tourInformationTypeI = (TourInformationTypeI) o;
    return Objects.equals(this.tourInformationDetails, tourInformationTypeI.tourInformationDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tourInformationDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TourInformationTypeI {\n");
    
    sb.append("    tourInformationDetails: ").append(toIndentedString(tourInformationDetails)).append("\n");
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

