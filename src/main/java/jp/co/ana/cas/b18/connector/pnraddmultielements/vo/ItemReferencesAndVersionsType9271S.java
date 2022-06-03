package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ItemReferencesAndVersionsType9271S
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class ItemReferencesAndVersionsType9271S   {
  @JsonProperty("referenceType")
  private String referenceType;

  @JsonProperty("uniqueReference")
  private String uniqueReference;

  public ItemReferencesAndVersionsType9271S referenceType(String referenceType) {
    this.referenceType = referenceType;
    return this;
  }

  /**
   * Get referenceType
   * @return referenceType
  */
  @ApiModelProperty(value = "")


  public String getReferenceType() {
    return referenceType;
  }

  public void setReferenceType(String referenceType) {
    this.referenceType = referenceType;
  }

  public ItemReferencesAndVersionsType9271S uniqueReference(String uniqueReference) {
    this.uniqueReference = uniqueReference;
    return this;
  }

  /**
   * Get uniqueReference
   * @return uniqueReference
  */
  @ApiModelProperty(value = "")


  public String getUniqueReference() {
    return uniqueReference;
  }

  public void setUniqueReference(String uniqueReference) {
    this.uniqueReference = uniqueReference;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemReferencesAndVersionsType9271S itemReferencesAndVersionsType9271S = (ItemReferencesAndVersionsType9271S) o;
    return Objects.equals(this.referenceType, itemReferencesAndVersionsType9271S.referenceType) &&
        Objects.equals(this.uniqueReference, itemReferencesAndVersionsType9271S.uniqueReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(referenceType, uniqueReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemReferencesAndVersionsType9271S {\n");
    
    sb.append("    referenceType: ").append(toIndentedString(referenceType)).append("\n");
    sb.append("    uniqueReference: ").append(toIndentedString(uniqueReference)).append("\n");
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

