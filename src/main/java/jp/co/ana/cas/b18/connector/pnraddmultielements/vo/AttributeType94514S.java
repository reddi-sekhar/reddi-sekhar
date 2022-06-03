package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.AttributeInformationTypeU142127C;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AttributeType94514S
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class AttributeType94514S   {
  @JsonProperty("criteriaDetails")
  private AttributeInformationTypeU142127C criteriaDetails;

  @JsonProperty("criteriaSetType")
  private String criteriaSetType;

  public AttributeType94514S criteriaDetails(AttributeInformationTypeU142127C criteriaDetails) {
    this.criteriaDetails = criteriaDetails;
    return this;
  }

  /**
   * Get criteriaDetails
   * @return criteriaDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public AttributeInformationTypeU142127C getCriteriaDetails() {
    return criteriaDetails;
  }

  public void setCriteriaDetails(AttributeInformationTypeU142127C criteriaDetails) {
    this.criteriaDetails = criteriaDetails;
  }

  public AttributeType94514S criteriaSetType(String criteriaSetType) {
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
    AttributeType94514S attributeType94514S = (AttributeType94514S) o;
    return Objects.equals(this.criteriaDetails, attributeType94514S.criteriaDetails) &&
        Objects.equals(this.criteriaSetType, attributeType94514S.criteriaSetType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(criteriaDetails, criteriaSetType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttributeType94514S {\n");
    
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

