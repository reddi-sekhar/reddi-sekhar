package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.FareElementType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FareBasisCodesLineType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class FareBasisCodesLineType   {
  @JsonProperty("fareElement")
  @Valid
  private List<FareElementType> fareElement = null;

  public FareBasisCodesLineType fareElement(List<FareElementType> fareElement) {
    this.fareElement = fareElement;
    return this;
  }

  public FareBasisCodesLineType addFareElementItem(FareElementType fareElementItem) {
    if (this.fareElement == null) {
      this.fareElement = new ArrayList<>();
    }
    this.fareElement.add(fareElementItem);
    return this;
  }

  /**
   * Get fareElement
   * @return fareElement
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<FareElementType> getFareElement() {
    return fareElement;
  }

  public void setFareElement(List<FareElementType> fareElement) {
    this.fareElement = fareElement;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FareBasisCodesLineType fareBasisCodesLineType = (FareBasisCodesLineType) o;
    return Objects.equals(this.fareElement, fareBasisCodesLineType.fareElement);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fareElement);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FareBasisCodesLineType {\n");
    
    sb.append("    fareElement: ").append(toIndentedString(fareElement)).append("\n");
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

