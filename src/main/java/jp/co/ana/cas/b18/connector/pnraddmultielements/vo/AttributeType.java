package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.AttributeInformationTypeU198185C;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AttributeType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class AttributeType   {
  @JsonProperty("criteriaDetails")
  @Valid
  private List<AttributeInformationTypeU198185C> criteriaDetails = null;

  @JsonProperty("criteriaSetType")
  private String criteriaSetType;

  public AttributeType criteriaDetails(List<AttributeInformationTypeU198185C> criteriaDetails) {
    this.criteriaDetails = criteriaDetails;
    return this;
  }

  public AttributeType addCriteriaDetailsItem(AttributeInformationTypeU198185C criteriaDetailsItem) {
    if (this.criteriaDetails == null) {
      this.criteriaDetails = new ArrayList<>();
    }
    this.criteriaDetails.add(criteriaDetailsItem);
    return this;
  }

  /**
   * Get criteriaDetails
   * @return criteriaDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<AttributeInformationTypeU198185C> getCriteriaDetails() {
    return criteriaDetails;
  }

  public void setCriteriaDetails(List<AttributeInformationTypeU198185C> criteriaDetails) {
    this.criteriaDetails = criteriaDetails;
  }

  public AttributeType criteriaSetType(String criteriaSetType) {
    this.criteriaSetType = criteriaSetType;
    return this;
  }

  /**
   * Get criteriaSetType
   * @return criteriaSetType
  */
  @ApiModelProperty(value = "")


  public String getCriteriaSetType() {
    return criteriaSetType;
  }

  public void setCriteriaSetType(String criteriaSetType) {
    this.criteriaSetType = criteriaSetType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AttributeType attributeType = (AttributeType) o;
    return Objects.equals(this.criteriaDetails, attributeType.criteriaDetails) &&
        Objects.equals(this.criteriaSetType, attributeType.criteriaSetType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(criteriaDetails, criteriaSetType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttributeType {\n");
    
    sb.append("    criteriaDetails: ").append(toIndentedString(criteriaDetails)).append("\n");
    sb.append("    criteriaSetType: ").append(toIndentedString(criteriaSetType)).append("\n");
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

