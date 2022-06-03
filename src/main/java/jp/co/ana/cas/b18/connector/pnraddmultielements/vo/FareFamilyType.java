package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.FareFamilyDetailsType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FareFamilyType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class FareFamilyType   {
  @JsonProperty("commercialFamilyDetails")
  @Valid
  private List<FareFamilyDetailsType> commercialFamilyDetails = null;

  @JsonProperty("fareFamilyname")
  private String fareFamilyname;

  @JsonProperty("hierarchy")
  private Long hierarchy;

  public FareFamilyType commercialFamilyDetails(List<FareFamilyDetailsType> commercialFamilyDetails) {
    this.commercialFamilyDetails = commercialFamilyDetails;
    return this;
  }

  public FareFamilyType addCommercialFamilyDetailsItem(FareFamilyDetailsType commercialFamilyDetailsItem) {
    if (this.commercialFamilyDetails == null) {
      this.commercialFamilyDetails = new ArrayList<>();
    }
    this.commercialFamilyDetails.add(commercialFamilyDetailsItem);
    return this;
  }

  /**
   * Get commercialFamilyDetails
   * @return commercialFamilyDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<FareFamilyDetailsType> getCommercialFamilyDetails() {
    return commercialFamilyDetails;
  }

  public void setCommercialFamilyDetails(List<FareFamilyDetailsType> commercialFamilyDetails) {
    this.commercialFamilyDetails = commercialFamilyDetails;
  }

  public FareFamilyType fareFamilyname(String fareFamilyname) {
    this.fareFamilyname = fareFamilyname;
    return this;
  }

  /**
   * Get fareFamilyname
   * @return fareFamilyname
  */
  @ApiModelProperty(value = "")


  public String getFareFamilyname() {
    return fareFamilyname;
  }

  public void setFareFamilyname(String fareFamilyname) {
    this.fareFamilyname = fareFamilyname;
  }

  public FareFamilyType hierarchy(Long hierarchy) {
    this.hierarchy = hierarchy;
    return this;
  }

  /**
   * Get hierarchy
   * @return hierarchy
  */
  @ApiModelProperty(value = "")


  public Long getHierarchy() {
    return hierarchy;
  }

  public void setHierarchy(Long hierarchy) {
    this.hierarchy = hierarchy;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FareFamilyType fareFamilyType = (FareFamilyType) o;
    return Objects.equals(this.commercialFamilyDetails, fareFamilyType.commercialFamilyDetails) &&
        Objects.equals(this.fareFamilyname, fareFamilyType.fareFamilyname) &&
        Objects.equals(this.hierarchy, fareFamilyType.hierarchy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commercialFamilyDetails, fareFamilyname, hierarchy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FareFamilyType {\n");
    
    sb.append("    commercialFamilyDetails: ").append(toIndentedString(commercialFamilyDetails)).append("\n");
    sb.append("    fareFamilyname: ").append(toIndentedString(fareFamilyname)).append("\n");
    sb.append("    hierarchy: ").append(toIndentedString(hierarchy)).append("\n");
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

