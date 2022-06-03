package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.MarketSpecificDataDetailsType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ReferencingDetailsTypeI1;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * MarketSpecificDataType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class MarketSpecificDataType   {
  @JsonProperty("extFOP")
  @Valid
  private List<ReferencingDetailsTypeI1> extFOP = null;

  @JsonProperty("fopSequenceNumber")
  private Long fopSequenceNumber;

  @JsonProperty("newFopsDetails")
  private MarketSpecificDataDetailsType newFopsDetails;

  @JsonProperty("passengerType")
  private String passengerType;

  public MarketSpecificDataType extFOP(List<ReferencingDetailsTypeI1> extFOP) {
    this.extFOP = extFOP;
    return this;
  }

  public MarketSpecificDataType addExtFOPItem(ReferencingDetailsTypeI1 extFOPItem) {
    if (this.extFOP == null) {
      this.extFOP = new ArrayList<>();
    }
    this.extFOP.add(extFOPItem);
    return this;
  }

  /**
   * Get extFOP
   * @return extFOP
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<ReferencingDetailsTypeI1> getExtFOP() {
    return extFOP;
  }

  public void setExtFOP(List<ReferencingDetailsTypeI1> extFOP) {
    this.extFOP = extFOP;
  }

  public MarketSpecificDataType fopSequenceNumber(Long fopSequenceNumber) {
    this.fopSequenceNumber = fopSequenceNumber;
    return this;
  }

  /**
   * Get fopSequenceNumber
   * @return fopSequenceNumber
  */
  @ApiModelProperty(value = "")


  public Long getFopSequenceNumber() {
    return fopSequenceNumber;
  }

  public void setFopSequenceNumber(Long fopSequenceNumber) {
    this.fopSequenceNumber = fopSequenceNumber;
  }

  public MarketSpecificDataType newFopsDetails(MarketSpecificDataDetailsType newFopsDetails) {
    this.newFopsDetails = newFopsDetails;
    return this;
  }

  /**
   * Get newFopsDetails
   * @return newFopsDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public MarketSpecificDataDetailsType getNewFopsDetails() {
    return newFopsDetails;
  }

  public void setNewFopsDetails(MarketSpecificDataDetailsType newFopsDetails) {
    this.newFopsDetails = newFopsDetails;
  }

  public MarketSpecificDataType passengerType(String passengerType) {
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
    MarketSpecificDataType marketSpecificDataType = (MarketSpecificDataType) o;
    return Objects.equals(this.extFOP, marketSpecificDataType.extFOP) &&
        Objects.equals(this.fopSequenceNumber, marketSpecificDataType.fopSequenceNumber) &&
        Objects.equals(this.newFopsDetails, marketSpecificDataType.newFopsDetails) &&
        Objects.equals(this.passengerType, marketSpecificDataType.passengerType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extFOP, fopSequenceNumber, newFopsDetails, passengerType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MarketSpecificDataType {\n");
    
    sb.append("    extFOP: ").append(toIndentedString(extFOP)).append("\n");
    sb.append("    fopSequenceNumber: ").append(toIndentedString(fopSequenceNumber)).append("\n");
    sb.append("    newFopsDetails: ").append(toIndentedString(newFopsDetails)).append("\n");
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

