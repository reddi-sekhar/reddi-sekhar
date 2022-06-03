package jp.co.ana.cas.b18.dto.response;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.dto.response.DcsLegInfoResponseDto;
import jp.co.ana.cas.b18.dto.response.ElementManagementStructDataResponseDto;
import jp.co.ana.cas.b18.dto.response.ReferenceForStructDataElementResponseDto;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * LegSectionResponseDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class LegSectionResponseDto   {
  @JsonProperty("elementManagementStructData")
  private ElementManagementStructDataResponseDto elementManagementStructData;

  @JsonProperty("referenceForStructDataElement")
  private ReferenceForStructDataElementResponseDto referenceForStructDataElement;

  @JsonProperty("dcsLegInfo")
  private DcsLegInfoResponseDto dcsLegInfo;

  public LegSectionResponseDto elementManagementStructData(ElementManagementStructDataResponseDto elementManagementStructData) {
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

  public LegSectionResponseDto referenceForStructDataElement(ReferenceForStructDataElementResponseDto referenceForStructDataElement) {
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

  public LegSectionResponseDto dcsLegInfo(DcsLegInfoResponseDto dcsLegInfo) {
    this.dcsLegInfo = dcsLegInfo;
    return this;
  }

  /**
   * Get dcsLegInfo
   * @return dcsLegInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public DcsLegInfoResponseDto getDcsLegInfo() {
    return dcsLegInfo;
  }

  public void setDcsLegInfo(DcsLegInfoResponseDto dcsLegInfo) {
    this.dcsLegInfo = dcsLegInfo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LegSectionResponseDto legSectionResponseDto = (LegSectionResponseDto) o;
    return Objects.equals(this.elementManagementStructData, legSectionResponseDto.elementManagementStructData) &&
        Objects.equals(this.referenceForStructDataElement, legSectionResponseDto.referenceForStructDataElement) &&
        Objects.equals(this.dcsLegInfo, legSectionResponseDto.dcsLegInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(elementManagementStructData, referenceForStructDataElement, dcsLegInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LegSectionResponseDto {\n");
    
    sb.append("    elementManagementStructData: ").append(toIndentedString(elementManagementStructData)).append("\n");
    sb.append("    referenceForStructDataElement: ").append(toIndentedString(referenceForStructDataElement)).append("\n");
    sb.append("    dcsLegInfo: ").append(toIndentedString(dcsLegInfo)).append("\n");
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

