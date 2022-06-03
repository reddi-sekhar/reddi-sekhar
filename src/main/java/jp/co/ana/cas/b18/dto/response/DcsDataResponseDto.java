package jp.co.ana.cas.b18.dto.response;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.dto.response.LegSectionResponseDto;
import jp.co.ana.cas.b18.dto.response.SegmentSectionResponseDto;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DcsDataResponseDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class DcsDataResponseDto   {
  @JsonProperty("segmentSection")
  @Valid
  private List<SegmentSectionResponseDto> segmentSection = null;

  @JsonProperty("legSection")
  @Valid
  private List<LegSectionResponseDto> legSection = null;

  public DcsDataResponseDto segmentSection(List<SegmentSectionResponseDto> segmentSection) {
    this.segmentSection = segmentSection;
    return this;
  }

  public DcsDataResponseDto addSegmentSectionItem(SegmentSectionResponseDto segmentSectionItem) {
    if (this.segmentSection == null) {
      this.segmentSection = new ArrayList<>();
    }
    this.segmentSection.add(segmentSectionItem);
    return this;
  }

  /**
   * Get segmentSection
   * @return segmentSection
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<SegmentSectionResponseDto> getSegmentSection() {
    return segmentSection;
  }

  public void setSegmentSection(List<SegmentSectionResponseDto> segmentSection) {
    this.segmentSection = segmentSection;
  }

  public DcsDataResponseDto legSection(List<LegSectionResponseDto> legSection) {
    this.legSection = legSection;
    return this;
  }

  public DcsDataResponseDto addLegSectionItem(LegSectionResponseDto legSectionItem) {
    if (this.legSection == null) {
      this.legSection = new ArrayList<>();
    }
    this.legSection.add(legSectionItem);
    return this;
  }

  /**
   * Get legSection
   * @return legSection
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<LegSectionResponseDto> getLegSection() {
    return legSection;
  }

  public void setLegSection(List<LegSectionResponseDto> legSection) {
    this.legSection = legSection;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DcsDataResponseDto dcsDataResponseDto = (DcsDataResponseDto) o;
    return Objects.equals(this.segmentSection, dcsDataResponseDto.segmentSection) &&
        Objects.equals(this.legSection, dcsDataResponseDto.legSection);
  }

  @Override
  public int hashCode() {
    return Objects.hash(segmentSection, legSection);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DcsDataResponseDto {\n");
    
    sb.append("    segmentSection: ").append(toIndentedString(segmentSection)).append("\n");
    sb.append("    legSection: ").append(toIndentedString(legSection)).append("\n");
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

