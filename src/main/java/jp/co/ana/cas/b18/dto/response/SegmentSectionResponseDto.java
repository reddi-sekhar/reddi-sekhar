package jp.co.ana.cas.b18.dto.response;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.dto.response.DcsSegmentInfoResponseDto;
import jp.co.ana.cas.b18.dto.response.ElementManagementStructDataResponseDto;
import jp.co.ana.cas.b18.dto.response.ReferenceForStructDataElementResponseDto;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SegmentSectionResponseDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class SegmentSectionResponseDto   {
  @JsonProperty("elementManagementStructData")
  private ElementManagementStructDataResponseDto elementManagementStructData;

  @JsonProperty("referenceForStructDataElement")
  private ReferenceForStructDataElementResponseDto referenceForStructDataElement;

  @JsonProperty("dcsSegmentInfo")
  private DcsSegmentInfoResponseDto dcsSegmentInfo;

  public SegmentSectionResponseDto elementManagementStructData(ElementManagementStructDataResponseDto elementManagementStructData) {
    this.elementManagementStructData = elementManagementStructData;
    return this;
  }

  /**
   * Get elementManagementStructData
   * @return elementManagementStructData
  */
  @ApiModelProperty(value = "")

  @Valid

  public ElementManagementStructDataResponseDto getElementManagementStructData() {
    return elementManagementStructData;
  }

  public void setElementManagementStructData(ElementManagementStructDataResponseDto elementManagementStructData) {
    this.elementManagementStructData = elementManagementStructData;
  }

  public SegmentSectionResponseDto referenceForStructDataElement(ReferenceForStructDataElementResponseDto referenceForStructDataElement) {
    this.referenceForStructDataElement = referenceForStructDataElement;
    return this;
  }

  /**
   * Get referenceForStructDataElement
   * @return referenceForStructDataElement
  */
  @ApiModelProperty(value = "")

  @Valid

  public ReferenceForStructDataElementResponseDto getReferenceForStructDataElement() {
    return referenceForStructDataElement;
  }

  public void setReferenceForStructDataElement(ReferenceForStructDataElementResponseDto referenceForStructDataElement) {
    this.referenceForStructDataElement = referenceForStructDataElement;
  }

  public SegmentSectionResponseDto dcsSegmentInfo(DcsSegmentInfoResponseDto dcsSegmentInfo) {
    this.dcsSegmentInfo = dcsSegmentInfo;
    return this;
  }

  /**
   * Get dcsSegmentInfo
   * @return dcsSegmentInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public DcsSegmentInfoResponseDto getDcsSegmentInfo() {
    return dcsSegmentInfo;
  }

  public void setDcsSegmentInfo(DcsSegmentInfoResponseDto dcsSegmentInfo) {
    this.dcsSegmentInfo = dcsSegmentInfo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SegmentSectionResponseDto segmentSectionResponseDto = (SegmentSectionResponseDto) o;
    return Objects.equals(this.elementManagementStructData, segmentSectionResponseDto.elementManagementStructData) &&
        Objects.equals(this.referenceForStructDataElement, segmentSectionResponseDto.referenceForStructDataElement) &&
        Objects.equals(this.dcsSegmentInfo, segmentSectionResponseDto.dcsSegmentInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(elementManagementStructData, referenceForStructDataElement, dcsSegmentInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SegmentSectionResponseDto {\n");
    
    sb.append("    elementManagementStructData: ").append(toIndentedString(elementManagementStructData)).append("\n");
    sb.append("    referenceForStructDataElement: ").append(toIndentedString(referenceForStructDataElement)).append("\n");
    sb.append("    dcsSegmentInfo: ").append(toIndentedString(dcsSegmentInfo)).append("\n");
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

