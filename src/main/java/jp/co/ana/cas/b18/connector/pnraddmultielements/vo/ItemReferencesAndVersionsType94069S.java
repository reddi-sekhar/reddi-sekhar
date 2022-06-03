package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.UniqueIdDescriptionType141680C;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ItemReferencesAndVersionsType94069S
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class ItemReferencesAndVersionsType94069S   {
  @JsonProperty("actionCategory")
  private String actionCategory;

  @JsonProperty("idSection")
  @Valid
  private List<UniqueIdDescriptionType141680C> idSection = null;

  @JsonProperty("referenceType")
  private String referenceType;

  @JsonProperty("uniqueReference")
  private String uniqueReference;

  public ItemReferencesAndVersionsType94069S actionCategory(String actionCategory) {
    this.actionCategory = actionCategory;
    return this;
  }

  /**
   * Get actionCategory
   * @return actionCategory
  */
  @ApiModelProperty(value = "")


  public String getActionCategory() {
    return actionCategory;
  }

  public void setActionCategory(String actionCategory) {
    this.actionCategory = actionCategory;
  }

  public ItemReferencesAndVersionsType94069S idSection(List<UniqueIdDescriptionType141680C> idSection) {
    this.idSection = idSection;
    return this;
  }

  public ItemReferencesAndVersionsType94069S addIdSectionItem(UniqueIdDescriptionType141680C idSectionItem) {
    if (this.idSection == null) {
      this.idSection = new ArrayList<>();
    }
    this.idSection.add(idSectionItem);
    return this;
  }

  /**
   * Get idSection
   * @return idSection
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<UniqueIdDescriptionType141680C> getIdSection() {
    return idSection;
  }

  public void setIdSection(List<UniqueIdDescriptionType141680C> idSection) {
    this.idSection = idSection;
  }

  public ItemReferencesAndVersionsType94069S referenceType(String referenceType) {
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

  public ItemReferencesAndVersionsType94069S uniqueReference(String uniqueReference) {
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
    ItemReferencesAndVersionsType94069S itemReferencesAndVersionsType94069S = (ItemReferencesAndVersionsType94069S) o;
    return Objects.equals(this.actionCategory, itemReferencesAndVersionsType94069S.actionCategory) &&
        Objects.equals(this.idSection, itemReferencesAndVersionsType94069S.idSection) &&
        Objects.equals(this.referenceType, itemReferencesAndVersionsType94069S.referenceType) &&
        Objects.equals(this.uniqueReference, itemReferencesAndVersionsType94069S.uniqueReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionCategory, idSection, referenceType, uniqueReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemReferencesAndVersionsType94069S {\n");
    
    sb.append("    actionCategory: ").append(toIndentedString(actionCategory)).append("\n");
    sb.append("    idSection: ").append(toIndentedString(idSection)).append("\n");
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

