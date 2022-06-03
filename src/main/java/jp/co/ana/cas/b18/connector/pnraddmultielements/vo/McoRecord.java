package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.FreeTextInformationType9865S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.GroupOfFareElements;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.MiscellaneousChargeOrderType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * McoRecord
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class McoRecord   {
  @JsonProperty("groupOfFareElements")
  @Valid
  private List<GroupOfFareElements> groupOfFareElements = null;

  @JsonProperty("mcoInformation")
  private FreeTextInformationType9865S mcoInformation;

  @JsonProperty("mcoType")
  private MiscellaneousChargeOrderType mcoType;

  public McoRecord groupOfFareElements(List<GroupOfFareElements> groupOfFareElements) {
    this.groupOfFareElements = groupOfFareElements;
    return this;
  }

  public McoRecord addGroupOfFareElementsItem(GroupOfFareElements groupOfFareElementsItem) {
    if (this.groupOfFareElements == null) {
      this.groupOfFareElements = new ArrayList<>();
    }
    this.groupOfFareElements.add(groupOfFareElementsItem);
    return this;
  }

  /**
   * Get groupOfFareElements
   * @return groupOfFareElements
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<GroupOfFareElements> getGroupOfFareElements() {
    return groupOfFareElements;
  }

  public void setGroupOfFareElements(List<GroupOfFareElements> groupOfFareElements) {
    this.groupOfFareElements = groupOfFareElements;
  }

  public McoRecord mcoInformation(FreeTextInformationType9865S mcoInformation) {
    this.mcoInformation = mcoInformation;
    return this;
  }

  /**
   * Get mcoInformation
   * @return mcoInformation
  */
  @ApiModelProperty(value = "")

  @Valid

  public FreeTextInformationType9865S getMcoInformation() {
    return mcoInformation;
  }

  public void setMcoInformation(FreeTextInformationType9865S mcoInformation) {
    this.mcoInformation = mcoInformation;
  }

  public McoRecord mcoType(MiscellaneousChargeOrderType mcoType) {
    this.mcoType = mcoType;
    return this;
  }

  /**
   * Get mcoType
   * @return mcoType
  */
  @ApiModelProperty(value = "")

  @Valid

  public MiscellaneousChargeOrderType getMcoType() {
    return mcoType;
  }

  public void setMcoType(MiscellaneousChargeOrderType mcoType) {
    this.mcoType = mcoType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    McoRecord mcoRecord = (McoRecord) o;
    return Objects.equals(this.groupOfFareElements, mcoRecord.groupOfFareElements) &&
        Objects.equals(this.mcoInformation, mcoRecord.mcoInformation) &&
        Objects.equals(this.mcoType, mcoRecord.mcoType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupOfFareElements, mcoInformation, mcoType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class McoRecord {\n");
    
    sb.append("    groupOfFareElements: ").append(toIndentedString(groupOfFareElements)).append("\n");
    sb.append("    mcoInformation: ").append(toIndentedString(mcoInformation)).append("\n");
    sb.append("    mcoType: ").append(toIndentedString(mcoType)).append("\n");
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

