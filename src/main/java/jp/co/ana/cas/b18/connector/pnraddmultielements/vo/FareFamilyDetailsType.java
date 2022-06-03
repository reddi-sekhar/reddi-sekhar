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
 * FareFamilyDetailsType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class FareFamilyDetailsType   {
  @JsonProperty("commercialFamily")
  private String commercialFamily;

  public FareFamilyDetailsType commercialFamily(String commercialFamily) {
    this.commercialFamily = commercialFamily;
    return this;
  }

  /**
   * Get commercialFamily
   * @return commercialFamily
  */
  @ApiModelProperty(value = "")


  public String getCommercialFamily() {
    return commercialFamily;
  }

  public void setCommercialFamily(String commercialFamily) {
    this.commercialFamily = commercialFamily;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FareFamilyDetailsType fareFamilyDetailsType = (FareFamilyDetailsType) o;
    return Objects.equals(this.commercialFamily, fareFamilyDetailsType.commercialFamily);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commercialFamily);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FareFamilyDetailsType {\n");
    
    sb.append("    commercialFamily: ").append(toIndentedString(commercialFamily)).append("\n");
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

