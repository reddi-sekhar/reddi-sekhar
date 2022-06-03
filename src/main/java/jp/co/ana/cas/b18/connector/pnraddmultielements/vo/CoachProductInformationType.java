package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ReferencingDetailsTypeI36941C;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CoachProductInformationType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class CoachProductInformationType   {
  @JsonProperty("coachDetails")
  private ReferencingDetailsTypeI36941C coachDetails;

  @JsonProperty("equipmentCode")
  private String equipmentCode;

  public CoachProductInformationType coachDetails(ReferencingDetailsTypeI36941C coachDetails) {
    this.coachDetails = coachDetails;
    return this;
  }

  /**
   * Get coachDetails
   * @return coachDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public ReferencingDetailsTypeI36941C getCoachDetails() {
    return coachDetails;
  }

  public void setCoachDetails(ReferencingDetailsTypeI36941C coachDetails) {
    this.coachDetails = coachDetails;
  }

  public CoachProductInformationType equipmentCode(String equipmentCode) {
    this.equipmentCode = equipmentCode;
    return this;
  }

  /**
   * Get equipmentCode
   * @return equipmentCode
  */
  @ApiModelProperty(value = "")


  public String getEquipmentCode() {
    return equipmentCode;
  }

  public void setEquipmentCode(String equipmentCode) {
    this.equipmentCode = equipmentCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoachProductInformationType coachProductInformationType = (CoachProductInformationType) o;
    return Objects.equals(this.coachDetails, coachProductInformationType.coachDetails) &&
        Objects.equals(this.equipmentCode, coachProductInformationType.equipmentCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(coachDetails, equipmentCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoachProductInformationType {\n");
    
    sb.append("    coachDetails: ").append(toIndentedString(coachDetails)).append("\n");
    sb.append("    equipmentCode: ").append(toIndentedString(equipmentCode)).append("\n");
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

