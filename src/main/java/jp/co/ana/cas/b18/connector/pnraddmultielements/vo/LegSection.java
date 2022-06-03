package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.DcsLegInfo;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ElementManagementSegmentType127983S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ReferenceInfoType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * LegSection
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class LegSection   {
  @JsonProperty("dcsLegInfo")
  private DcsLegInfo dcsLegInfo;

  @JsonProperty("elementManagementStructData")
  private ElementManagementSegmentType127983S elementManagementStructData;

  @JsonProperty("referenceForStructDataElement")
  private ReferenceInfoType referenceForStructDataElement;

  public LegSection dcsLegInfo(DcsLegInfo dcsLegInfo) {
    this.dcsLegInfo = dcsLegInfo;
    return this;
  }

  /**
   * Get dcsLegInfo
   * @return dcsLegInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public DcsLegInfo getDcsLegInfo() {
    return dcsLegInfo;
  }

  public void setDcsLegInfo(DcsLegInfo dcsLegInfo) {
    this.dcsLegInfo = dcsLegInfo;
  }

  public LegSection elementManagementStructData(ElementManagementSegmentType127983S elementManagementStructData) {
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

  public LegSection referenceForStructDataElement(ReferenceInfoType referenceForStructDataElement) {
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
    LegSection legSection = (LegSection) o;
    return Objects.equals(this.dcsLegInfo, legSection.dcsLegInfo) &&
        Objects.equals(this.elementManagementStructData, legSection.elementManagementStructData) &&
        Objects.equals(this.referenceForStructDataElement, legSection.referenceForStructDataElement);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dcsLegInfo, elementManagementStructData, referenceForStructDataElement);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LegSection {\n");
    
    sb.append("    dcsLegInfo: ").append(toIndentedString(dcsLegInfo)).append("\n");
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

