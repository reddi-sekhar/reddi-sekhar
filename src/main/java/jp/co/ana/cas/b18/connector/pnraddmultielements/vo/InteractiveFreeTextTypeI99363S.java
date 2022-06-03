package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.FreeTextQualificationTypeI148295C;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InteractiveFreeTextTypeI99363S
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class InteractiveFreeTextTypeI99363S   {
  @JsonProperty("freeText")
  private String freeText;

  @JsonProperty("freeTextQualification")
  private FreeTextQualificationTypeI148295C freeTextQualification;

  public InteractiveFreeTextTypeI99363S freeText(String freeText) {
    this.freeText = freeText;
    return this;
  }

  /**
   * Get freeText
   * @return freeText
  */
  @ApiModelProperty(value = "")


  public String getFreeText() {
    return freeText;
  }

  public void setFreeText(String freeText) {
    this.freeText = freeText;
  }

  public InteractiveFreeTextTypeI99363S freeTextQualification(FreeTextQualificationTypeI148295C freeTextQualification) {
    this.freeTextQualification = freeTextQualification;
    return this;
  }

  /**
   * Get freeTextQualification
   * @return freeTextQualification
  */
  @ApiModelProperty(value = "")

  @Valid

  public FreeTextQualificationTypeI148295C getFreeTextQualification() {
    return freeTextQualification;
  }

  public void setFreeTextQualification(FreeTextQualificationTypeI148295C freeTextQualification) {
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
    InteractiveFreeTextTypeI99363S interactiveFreeTextTypeI99363S = (InteractiveFreeTextTypeI99363S) o;
    return Objects.equals(this.freeText, interactiveFreeTextTypeI99363S.freeText) &&
        Objects.equals(this.freeTextQualification, interactiveFreeTextTypeI99363S.freeTextQualification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(freeText, freeTextQualification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InteractiveFreeTextTypeI99363S {\n");
    
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

