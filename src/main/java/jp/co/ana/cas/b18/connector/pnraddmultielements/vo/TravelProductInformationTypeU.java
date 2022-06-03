package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.LocationTypeU;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ProductDateAndTimeTypeU;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TravelProductInformationTypeU
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class TravelProductInformationTypeU   {
  @JsonProperty("boardPortDetails")
  @Valid
  private List<LocationTypeU> boardPortDetails = null;

  @JsonProperty("itineraryDateTimeInfo")
  private ProductDateAndTimeTypeU itineraryDateTimeInfo;

  @JsonProperty("lineNumber")
  private String lineNumber;

  public TravelProductInformationTypeU boardPortDetails(List<LocationTypeU> boardPortDetails) {
    this.boardPortDetails = boardPortDetails;
    return this;
  }

  public TravelProductInformationTypeU addBoardPortDetailsItem(LocationTypeU boardPortDetailsItem) {
    if (this.boardPortDetails == null) {
      this.boardPortDetails = new ArrayList<>();
    }
    this.boardPortDetails.add(boardPortDetailsItem);
    return this;
  }

  /**
   * Get boardPortDetails
   * @return boardPortDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<LocationTypeU> getBoardPortDetails() {
    return boardPortDetails;
  }

  public void setBoardPortDetails(List<LocationTypeU> boardPortDetails) {
    this.boardPortDetails = boardPortDetails;
  }

  public TravelProductInformationTypeU itineraryDateTimeInfo(ProductDateAndTimeTypeU itineraryDateTimeInfo) {
    this.itineraryDateTimeInfo = itineraryDateTimeInfo;
    return this;
  }

  /**
   * Get itineraryDateTimeInfo
   * @return itineraryDateTimeInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public ProductDateAndTimeTypeU getItineraryDateTimeInfo() {
    return itineraryDateTimeInfo;
  }

  public void setItineraryDateTimeInfo(ProductDateAndTimeTypeU itineraryDateTimeInfo) {
    this.itineraryDateTimeInfo = itineraryDateTimeInfo;
  }

  public TravelProductInformationTypeU lineNumber(String lineNumber) {
    this.lineNumber = lineNumber;
    return this;
  }

  /**
   * Get lineNumber
   * @return lineNumber
  */
  @ApiModelProperty(value = "")


  public String getLineNumber() {
    return lineNumber;
  }

  public void setLineNumber(String lineNumber) {
    this.lineNumber = lineNumber;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TravelProductInformationTypeU travelProductInformationTypeU = (TravelProductInformationTypeU) o;
    return Objects.equals(this.boardPortDetails, travelProductInformationTypeU.boardPortDetails) &&
        Objects.equals(this.itineraryDateTimeInfo, travelProductInformationTypeU.itineraryDateTimeInfo) &&
        Objects.equals(this.lineNumber, travelProductInformationTypeU.lineNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(boardPortDetails, itineraryDateTimeInfo, lineNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TravelProductInformationTypeU {\n");
    
    sb.append("    boardPortDetails: ").append(toIndentedString(boardPortDetails)).append("\n");
    sb.append("    itineraryDateTimeInfo: ").append(toIndentedString(itineraryDateTimeInfo)).append("\n");
    sb.append("    lineNumber: ").append(toIndentedString(lineNumber)).append("\n");
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

