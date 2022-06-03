package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.QuotaRelatedInformationType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.SpecialRequirementsDataDetailsType272905C;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.SpecialRequirementsTypeDetailsType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SpecialRequirementsDetailsType195223S
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class SpecialRequirementsDetailsType195223S   {
  @JsonProperty("quotaInfo")
  private QuotaRelatedInformationType quotaInfo;

  @JsonProperty("seatDetails")
  private SpecialRequirementsDataDetailsType272905C seatDetails;

  @JsonProperty("specialRequirementsInfo")
  private SpecialRequirementsTypeDetailsType specialRequirementsInfo;

  public SpecialRequirementsDetailsType195223S quotaInfo(QuotaRelatedInformationType quotaInfo) {
    this.quotaInfo = quotaInfo;
    return this;
  }

  /**
   * Get quotaInfo
   * @return quotaInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public QuotaRelatedInformationType getQuotaInfo() {
    return quotaInfo;
  }

  public void setQuotaInfo(QuotaRelatedInformationType quotaInfo) {
    this.quotaInfo = quotaInfo;
  }

  public SpecialRequirementsDetailsType195223S seatDetails(SpecialRequirementsDataDetailsType272905C seatDetails) {
    this.seatDetails = seatDetails;
    return this;
  }

  /**
   * Get seatDetails
   * @return seatDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public SpecialRequirementsDataDetailsType272905C getSeatDetails() {
    return seatDetails;
  }

  public void setSeatDetails(SpecialRequirementsDataDetailsType272905C seatDetails) {
    this.seatDetails = seatDetails;
  }

  public SpecialRequirementsDetailsType195223S specialRequirementsInfo(SpecialRequirementsTypeDetailsType specialRequirementsInfo) {
    this.specialRequirementsInfo = specialRequirementsInfo;
    return this;
  }

  /**
   * Get specialRequirementsInfo
   * @return specialRequirementsInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public SpecialRequirementsTypeDetailsType getSpecialRequirementsInfo() {
    return specialRequirementsInfo;
  }

  public void setSpecialRequirementsInfo(SpecialRequirementsTypeDetailsType specialRequirementsInfo) {
    this.specialRequirementsInfo = specialRequirementsInfo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpecialRequirementsDetailsType195223S specialRequirementsDetailsType195223S = (SpecialRequirementsDetailsType195223S) o;
    return Objects.equals(this.quotaInfo, specialRequirementsDetailsType195223S.quotaInfo) &&
        Objects.equals(this.seatDetails, specialRequirementsDetailsType195223S.seatDetails) &&
        Objects.equals(this.specialRequirementsInfo, specialRequirementsDetailsType195223S.specialRequirementsInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quotaInfo, seatDetails, specialRequirementsInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpecialRequirementsDetailsType195223S {\n");
    
    sb.append("    quotaInfo: ").append(toIndentedString(quotaInfo)).append("\n");
    sb.append("    seatDetails: ").append(toIndentedString(seatDetails)).append("\n");
    sb.append("    specialRequirementsInfo: ").append(toIndentedString(specialRequirementsInfo)).append("\n");
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

