package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.FreeTextQualificationTypeI185754C;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InteractiveFreeTextTypeI
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class InteractiveFreeTextTypeI   {
  @JsonProperty("freeText")
  @Valid
  private List<String> freeText = null;

  @JsonProperty("freeTextQualification")
  private FreeTextQualificationTypeI185754C freeTextQualification;

  public InteractiveFreeTextTypeI freeText(List<String> freeText) {
    this.freeText = freeText;
    return this;
  }

  public InteractiveFreeTextTypeI addFreeTextItem(String freeTextItem) {
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

  public InteractiveFreeTextTypeI freeTextQualification(FreeTextQualificationTypeI185754C freeTextQualification) {
    this.freeTextQualification = freeTextQualification;
    return this;
  }

  /**
   * Get freeTextQualification
   * @return freeTextQualification
  */
  @ApiModelProperty(value = "")

  @Valid

  public FreeTextQualificationTypeI185754C getFreeTextQualification() {
    return freeTextQualification;
  }

  public void setFreeTextQualification(FreeTextQualificationTypeI185754C freeTextQualification) {
    this.freeTextQualification = freeTextQualification;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InteractiveFreeTextTypeI interactiveFreeTextTypeI = (InteractiveFreeTextTypeI) o;
    return Objects.equals(this.freeText, interactiveFreeTextTypeI.freeText) &&
        Objects.equals(this.freeTextQualification, interactiveFreeTextTypeI.freeTextQualification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(freeText, freeTextQualification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InteractiveFreeTextTypeI {\n");
    
    sb.append("    freeText: ").append(toIndentedString(freeText)).append("\n");
    sb.append("    freeTextQualification: ").append(toIndentedString(freeTextQualification)).append("\n");
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

