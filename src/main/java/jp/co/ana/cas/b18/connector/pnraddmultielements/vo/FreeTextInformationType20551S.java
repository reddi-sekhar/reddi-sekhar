package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.FreeTextDetailsType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FreeTextInformationType20551S
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class FreeTextInformationType20551S   {
  @JsonProperty("freeText")
  @Valid
  private List<String> freeText = null;

  @JsonProperty("freeTextDetails")
  private FreeTextDetailsType freeTextDetails;

  public FreeTextInformationType20551S freeText(List<String> freeText) {
    this.freeText = freeText;
    return this;
  }

  public FreeTextInformationType20551S addFreeTextItem(String freeTextItem) {
    if (this.freeText == null) {
      this.freeText = new ArrayList<>();
    }
    this.freeText.add(freeTextItem);
    return this;
  }

  /**
   * Get freeText
   * @return freeText
  */
  @ApiModelProperty(value = "")


  public List<String> getFreeText() {
    return freeText;
  }

  public void setFreeText(List<String> freeText) {
    this.freeText = freeText;
  }

  public FreeTextInformationType20551S freeTextDetails(FreeTextDetailsType freeTextDetails) {
    this.freeTextDetails = freeTextDetails;
    return this;
  }

  /**
   * Get freeTextDetails
   * @return freeTextDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public FreeTextDetailsType getFreeTextDetails() {
    return freeTextDetails;
  }

  public void setFreeTextDetails(FreeTextDetailsType freeTextDetails) {
    this.freeTextDetails = freeTextDetails;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FreeTextInformationType20551S freeTextInformationType20551S = (FreeTextInformationType20551S) o;
    return Objects.equals(this.freeText, freeTextInformationType20551S.freeText) &&
        Objects.equals(this.freeTextDetails, freeTextInformationType20551S.freeTextDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(freeText, freeTextDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FreeTextInformationType20551S {\n");
    
    sb.append("    freeText: ").append(toIndentedString(freeText)).append("\n");
    sb.append("    freeTextDetails: ").append(toIndentedString(freeTextDetails)).append("\n");
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

