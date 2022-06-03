package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.FreeTextDetailsType1309C;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FreeTextInformationType9865S
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class FreeTextInformationType9865S   {
  @JsonProperty("freeText")
  private String freeText;

  @JsonProperty("freeTextDetails")
  private FreeTextDetailsType1309C freeTextDetails;

  public FreeTextInformationType9865S freeText(String freeText) {
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

  public FreeTextInformationType9865S freeTextDetails(FreeTextDetailsType1309C freeTextDetails) {
    this.freeTextDetails = freeTextDetails;
    return this;
  }

  /**
   * Get freeTextDetails
   * @return freeTextDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public FreeTextDetailsType1309C getFreeTextDetails() {
    return freeTextDetails;
  }

  public void setFreeTextDetails(FreeTextDetailsType1309C freeTextDetails) {
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
    FreeTextInformationType9865S freeTextInformationType9865S = (FreeTextInformationType9865S) o;
    return Objects.equals(this.freeText, freeTextInformationType9865S.freeText) &&
        Objects.equals(this.freeTextDetails, freeTextInformationType9865S.freeTextDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(freeText, freeTextDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FreeTextInformationType9865S {\n");
    
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

