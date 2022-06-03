package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ReferencingDetailsType2780C;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SegmentGroupingInformationType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class SegmentGroupingInformationType   {
  @JsonProperty("groupingCode")
  private String groupingCode;

  @JsonProperty("marriageDetail")
  @Valid
  private List<ReferencingDetailsType2780C> marriageDetail = null;

  public SegmentGroupingInformationType groupingCode(String groupingCode) {
    this.groupingCode = groupingCode;
    return this;
  }

  /**
   * Get groupingCode
   * @return groupingCode
  */
  @ApiModelProperty(value = "")


  public String getGroupingCode() {
    return groupingCode;
  }

  public void setGroupingCode(String groupingCode) {
    this.groupingCode = groupingCode;
  }

  public SegmentGroupingInformationType marriageDetail(List<ReferencingDetailsType2780C> marriageDetail) {
    this.marriageDetail = marriageDetail;
    return this;
  }

  public SegmentGroupingInformationType addMarriageDetailItem(ReferencingDetailsType2780C marriageDetailItem) {
    if (this.marriageDetail == null) {
      this.marriageDetail = new ArrayList<>();
    }
    this.marriageDetail.add(marriageDetailItem);
    return this;
  }

  /**
   * Get marriageDetail
   * @return marriageDetail
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<ReferencingDetailsType2780C> getMarriageDetail() {
    return marriageDetail;
  }

  public void setMarriageDetail(List<ReferencingDetailsType2780C> marriageDetail) {
    this.marriageDetail = marriageDetail;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SegmentGroupingInformationType segmentGroupingInformationType = (SegmentGroupingInformationType) o;
    return Objects.equals(this.groupingCode, segmentGroupingInformationType.groupingCode) &&
        Objects.equals(this.marriageDetail, segmentGroupingInformationType.marriageDetail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupingCode, marriageDetail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SegmentGroupingInformationType {\n");
    
    sb.append("    groupingCode: ").append(toIndentedString(groupingCode)).append("\n");
    sb.append("    marriageDetail: ").append(toIndentedString(marriageDetail)).append("\n");
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

