package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.DcsSegmentInfo;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ElementManagementSegmentType127983S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ReferenceInfoType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SegmentSection
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class SegmentSection   {
  @JsonProperty("dcsSegmentInfo")
  private DcsSegmentInfo dcsSegmentInfo;

  @JsonProperty("elementManagementStructData")
  private ElementManagementSegmentType127983S elementManagementStructData;

  @JsonProperty("referenceForStructDataElement")
  private ReferenceInfoType referenceForStructDataElement;

  public SegmentSection dcsSegmentInfo(DcsSegmentInfo dcsSegmentInfo) {
    this.dcsSegmentInfo = dcsSegmentInfo;
    return this;
  }

  /**
   * Get dcsSegmentInfo
   * @return dcsSegmentInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public DcsSegmentInfo getDcsSegmentInfo() {
    return dcsSegmentInfo;
  }

  public void setDcsSegmentInfo(DcsSegmentInfo dcsSegmentInfo) {
    this.dcsSegmentInfo = dcsSegmentInfo;
  }

  public SegmentSection elementManagementStructData(ElementManagementSegmentType127983S elementManagementStructData) {
    this.elementManagementStructData = elementManagementStructData;
    return this;
  }

  /**
   * Get elementManagementStructData
   * @return elementManagementStructData
  */
  @ApiModelProperty(value = "")

  @Valid

  public ElementManagementSegmentType127983S getElementManagementStructData() {
    return elementManagementStructData;
  }

  public void setElementManagementStructData(ElementManagementSegmentType127983S elementManagementStructData) {
    this.elementManagementStructData = elementManagementStructData;
  }

  public SegmentSection referenceForStructDataElement(ReferenceInfoType referenceForStructDataElement) {
    this.referenceForStructDataElement = referenceForStructDataElement;
    return this;
  }

  /**
   * Get referenceForStructDataElement
   * @return referenceForStructDataElement
  */
  @ApiModelProperty(value = "")

  @Valid

  public ReferenceInfoType getReferenceForStructDataElement() {
    return referenceForStructDataElement;
  }

  public void setReferenceForStructDataElement(ReferenceInfoType referenceForStructDataElement) {
    this.referenceForStructDataElement = referenceForStructDataElement;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SegmentSection segmentSection = (SegmentSection) o;
    return Objects.equals(this.dcsSegmentInfo, segmentSection.dcsSegmentInfo) &&
        Objects.equals(this.elementManagementStructData, segmentSection.elementManagementStructData) &&
        Objects.equals(this.referenceForStructDataElement, segmentSection.referenceForStructDataElement);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dcsSegmentInfo, elementManagementStructData, referenceForStructDataElement);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SegmentSection {\n");
    
    sb.append("    dcsSegmentInfo: ").append(toIndentedString(dcsSegmentInfo)).append("\n");
    sb.append("    elementManagementStructData: ").append(toIndentedString(elementManagementStructData)).append("\n");
    sb.append("    referenceForStructDataElement: ").append(toIndentedString(referenceForStructDataElement)).append("\n");
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

