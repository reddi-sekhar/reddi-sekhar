package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.FareBasisCodesLineType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.FareDataType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.LongFreeTextType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ReferenceInfoType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.SelectionDetailsTypeI201122S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.TstGeneralInformationType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TstData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class TstData   {
  @JsonProperty("fareBasisInfo")
  private FareBasisCodesLineType fareBasisInfo;

  @JsonProperty("fareData")
  private FareDataType fareData;

  @JsonProperty("referenceForTstData")
  private ReferenceInfoType referenceForTstData;

  @JsonProperty("segmentAssociation")
  private SelectionDetailsTypeI201122S segmentAssociation;

  @JsonProperty("tstFreetext")
  @Valid
  private List<LongFreeTextType> tstFreetext = null;

  @JsonProperty("tstGeneralInformation")
  private TstGeneralInformationType tstGeneralInformation;

  public TstData fareBasisInfo(FareBasisCodesLineType fareBasisInfo) {
    this.fareBasisInfo = fareBasisInfo;
    return this;
  }

  /**
   * Get fareBasisInfo
   * @return fareBasisInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public FareBasisCodesLineType getFareBasisInfo() {
    return fareBasisInfo;
  }

  public void setFareBasisInfo(FareBasisCodesLineType fareBasisInfo) {
    this.fareBasisInfo = fareBasisInfo;
  }

  public TstData fareData(FareDataType fareData) {
    this.fareData = fareData;
    return this;
  }

  /**
   * Get fareData
   * @return fareData
  */
  @ApiModelProperty(value = "")

  @Valid

  public FareDataType getFareData() {
    return fareData;
  }

  public void setFareData(FareDataType fareData) {
    this.fareData = fareData;
  }

  public TstData referenceForTstData(ReferenceInfoType referenceForTstData) {
    this.referenceForTstData = referenceForTstData;
    return this;
  }

  /**
   * Get referenceForTstData
   * @return referenceForTstData
  */
  @ApiModelProperty(value = "")

  @Valid

  public ReferenceInfoType getReferenceForTstData() {
    return referenceForTstData;
  }

  public void setReferenceForTstData(ReferenceInfoType referenceForTstData) {
    this.referenceForTstData = referenceForTstData;
  }

  public TstData segmentAssociation(SelectionDetailsTypeI201122S segmentAssociation) {
    this.segmentAssociation = segmentAssociation;
    return this;
  }

  /**
   * Get segmentAssociation
   * @return segmentAssociation
  */
  @ApiModelProperty(value = "")

  @Valid

  public SelectionDetailsTypeI201122S getSegmentAssociation() {
    return segmentAssociation;
  }

  public void setSegmentAssociation(SelectionDetailsTypeI201122S segmentAssociation) {
    this.segmentAssociation = segmentAssociation;
  }

  public TstData tstFreetext(List<LongFreeTextType> tstFreetext) {
    this.tstFreetext = tstFreetext;
    return this;
  }

  public TstData addTstFreetextItem(LongFreeTextType tstFreetextItem) {
    if (this.tstFreetext == null) {
      this.tstFreetext = new ArrayList<>();
    }
    this.tstFreetext.add(tstFreetextItem);
    return this;
  }

  /**
   * Get tstFreetext
   * @return tstFreetext
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<LongFreeTextType> getTstFreetext() {
    return tstFreetext;
  }

  public void setTstFreetext(List<LongFreeTextType> tstFreetext) {
    this.tstFreetext = tstFreetext;
  }

  public TstData tstGeneralInformation(TstGeneralInformationType tstGeneralInformation) {
    this.tstGeneralInformation = tstGeneralInformation;
    return this;
  }

  /**
   * Get tstGeneralInformation
   * @return tstGeneralInformation
  */
  @ApiModelProperty(value = "")

  @Valid

  public TstGeneralInformationType getTstGeneralInformation() {
    return tstGeneralInformation;
  }

  public void setTstGeneralInformation(TstGeneralInformationType tstGeneralInformation) {
    this.tstGeneralInformation = tstGeneralInformation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TstData tstData = (TstData) o;
    return Objects.equals(this.fareBasisInfo, tstData.fareBasisInfo) &&
        Objects.equals(this.fareData, tstData.fareData) &&
        Objects.equals(this.referenceForTstData, tstData.referenceForTstData) &&
        Objects.equals(this.segmentAssociation, tstData.segmentAssociation) &&
        Objects.equals(this.tstFreetext, tstData.tstFreetext) &&
        Objects.equals(this.tstGeneralInformation, tstData.tstGeneralInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fareBasisInfo, fareData, referenceForTstData, segmentAssociation, tstFreetext, tstGeneralInformation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TstData {\n");
    
    sb.append("    fareBasisInfo: ").append(toIndentedString(fareBasisInfo)).append("\n");
    sb.append("    fareData: ").append(toIndentedString(fareData)).append("\n");
    sb.append("    referenceForTstData: ").append(toIndentedString(referenceForTstData)).append("\n");
    sb.append("    segmentAssociation: ").append(toIndentedString(segmentAssociation)).append("\n");
    sb.append("    tstFreetext: ").append(toIndentedString(tstFreetext)).append("\n");
    sb.append("    tstGeneralInformation: ").append(toIndentedString(tstGeneralInformation)).append("\n");
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

