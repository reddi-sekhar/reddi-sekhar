package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.AttributeInformationTypeU142127C;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AttributeType195221S
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class AttributeType195221S   {
  @JsonProperty("criteriaDetails")
  @Valid
  private List<AttributeInformationTypeU142127C> criteriaDetails = null;

  public AttributeType195221S criteriaDetails(List<AttributeInformationTypeU142127C> criteriaDetails) {
    this.criteriaDetails = criteriaDetails;
    return this;
  }

  public AttributeType195221S addCriteriaDetailsItem(AttributeInformationTypeU142127C criteriaDetailsItem) {
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

  public List<AttributeInformationTypeU142127C> getCriteriaDetails() {
    return criteriaDetails;
  }

  public void setCriteriaDetails(List<AttributeInformationTypeU142127C> criteriaDetails) {
    this.criteriaDetails = criteriaDetails;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AttributeType195221S attributeType195221S = (AttributeType195221S) o;
    return Objects.equals(this.criteriaDetails, attributeType195221S.criteriaDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(criteriaDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttributeType195221S {\n");
    
    sb.append("    criteriaDetails: ").append(toIndentedString(criteriaDetails)).append("\n");
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

