package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.LegSection;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.SegmentSection;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DcsData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class DcsData   {
  @JsonProperty("legSection")
  @Valid
  private List<LegSection> legSection = null;

  @JsonProperty("markerLeg")
  private Object markerLeg;

  @JsonProperty("markerPax")
  private Object markerPax;

  @JsonProperty("markerSegment")
  private Object markerSegment;

  @JsonProperty("segmentSection")
  @Valid
  private List<SegmentSection> segmentSection = null;

  public DcsData legSection(List<LegSection> legSection) {
    this.legSection = legSection;
    return this;
  }

  public DcsData addLegSectionItem(LegSection legSectionItem) {
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

  public List<LegSection> getLegSection() {
    return legSection;
  }

  public void setLegSection(List<LegSection> legSection) {
    this.legSection = legSection;
  }

  public DcsData markerLeg(Object markerLeg) {
    this.markerLeg = markerLeg;
    return this;
  }

  /**
   * Get markerLeg
   * @return markerLeg
  */
  @ApiModelProperty(value = "")


  public Object getMarkerLeg() {
    return markerLeg;
  }

  public void setMarkerLeg(Object markerLeg) {
    this.markerLeg = markerLeg;
  }

  public DcsData markerPax(Object markerPax) {
    this.markerPax = markerPax;
    return this;
  }

  /**
   * Get markerPax
   * @return markerPax
  */
  @ApiModelProperty(value = "")


  public Object getMarkerPax() {
    return markerPax;
  }

  public void setMarkerPax(Object markerPax) {
    this.markerPax = markerPax;
  }

  public DcsData markerSegment(Object markerSegment) {
    this.markerSegment = markerSegment;
    return this;
  }

  /**
   * Get markerSegment
   * @return markerSegment
  */
  @ApiModelProperty(value = "")


  public Object getMarkerSegment() {
    return markerSegment;
  }

  public void setMarkerSegment(Object markerSegment) {
    this.markerSegment = markerSegment;
  }

  public DcsData segmentSection(List<SegmentSection> segmentSection) {
    this.segmentSection = segmentSection;
    return this;
  }

  public DcsData addSegmentSectionItem(SegmentSection segmentSectionItem) {
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

  public List<SegmentSection> getSegmentSection() {
    return segmentSection;
  }

  public void setSegmentSection(List<SegmentSection> segmentSection) {
    this.segmentSection = segmentSection;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DcsData dcsData = (DcsData) o;
    return Objects.equals(this.legSection, dcsData.legSection) &&
        Objects.equals(this.markerLeg, dcsData.markerLeg) &&
        Objects.equals(this.markerPax, dcsData.markerPax) &&
        Objects.equals(this.markerSegment, dcsData.markerSegment) &&
        Objects.equals(this.segmentSection, dcsData.segmentSection);
  }

  @Override
  public int hashCode() {
    return Objects.hash(legSection, markerLeg, markerPax, markerSegment, segmentSection);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DcsData {\n");
    
    sb.append("    legSection: ").append(toIndentedString(legSection)).append("\n");
    sb.append("    markerLeg: ").append(toIndentedString(markerLeg)).append("\n");
    sb.append("    markerPax: ").append(toIndentedString(markerPax)).append("\n");
    sb.append("    markerSegment: ").append(toIndentedString(markerSegment)).append("\n");
    sb.append("    segmentSection: ").append(toIndentedString(segmentSection)).append("\n");
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

