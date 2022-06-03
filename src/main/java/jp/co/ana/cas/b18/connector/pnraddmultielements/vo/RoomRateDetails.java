package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ChildrenGroupType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.HotelRoomType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.RuleInformationTypeU;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.TariffInformationTypeI;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RoomRateDetails
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class RoomRateDetails   {
  @JsonProperty("children")
  @Valid
  private List<ChildrenGroupType> children = null;

  @JsonProperty("rateCodeIndicator")
  private RuleInformationTypeU rateCodeIndicator;

  @JsonProperty("roomInformation")
  private HotelRoomType roomInformation;

  @JsonProperty("tariffDetails")
  private TariffInformationTypeI tariffDetails;

  public RoomRateDetails children(List<ChildrenGroupType> children) {
    this.children = children;
    return this;
  }

  public RoomRateDetails addChildrenItem(ChildrenGroupType childrenItem) {
    if (this.children == null) {
      this.children = new ArrayList<>();
    }
    this.children.add(childrenItem);
    return this;
  }

  /**
   * Get children
   * @return children
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<ChildrenGroupType> getChildren() {
    return children;
  }

  public void setChildren(List<ChildrenGroupType> children) {
    this.children = children;
  }

  public RoomRateDetails rateCodeIndicator(RuleInformationTypeU rateCodeIndicator) {
    this.rateCodeIndicator = rateCodeIndicator;
    return this;
  }

  /**
   * Get rateCodeIndicator
   * @return rateCodeIndicator
  */
  @ApiModelProperty(value = "")

  @Valid

  public RuleInformationTypeU getRateCodeIndicator() {
    return rateCodeIndicator;
  }

  public void setRateCodeIndicator(RuleInformationTypeU rateCodeIndicator) {
    this.rateCodeIndicator = rateCodeIndicator;
  }

  public RoomRateDetails roomInformation(HotelRoomType roomInformation) {
    this.roomInformation = roomInformation;
    return this;
  }

  /**
   * Get roomInformation
   * @return roomInformation
  */
  @ApiModelProperty(value = "")

  @Valid

  public HotelRoomType getRoomInformation() {
    return roomInformation;
  }

  public void setRoomInformation(HotelRoomType roomInformation) {
    this.roomInformation = roomInformation;
  }

  public RoomRateDetails tariffDetails(TariffInformationTypeI tariffDetails) {
    this.tariffDetails = tariffDetails;
    return this;
  }

  /**
   * Get tariffDetails
   * @return tariffDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public TariffInformationTypeI getTariffDetails() {
    return tariffDetails;
  }

  public void setTariffDetails(TariffInformationTypeI tariffDetails) {
    this.tariffDetails = tariffDetails;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoomRateDetails roomRateDetails = (RoomRateDetails) o;
    return Objects.equals(this.children, roomRateDetails.children) &&
        Objects.equals(this.rateCodeIndicator, roomRateDetails.rateCodeIndicator) &&
        Objects.equals(this.roomInformation, roomRateDetails.roomInformation) &&
        Objects.equals(this.tariffDetails, roomRateDetails.tariffDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(children, rateCodeIndicator, roomInformation, tariffDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoomRateDetails {\n");
    
    sb.append("    children: ").append(toIndentedString(children)).append("\n");
    sb.append("    rateCodeIndicator: ").append(toIndentedString(rateCodeIndicator)).append("\n");
    sb.append("    roomInformation: ").append(toIndentedString(roomInformation)).append("\n");
    sb.append("    tariffDetails: ").append(toIndentedString(tariffDetails)).append("\n");
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

