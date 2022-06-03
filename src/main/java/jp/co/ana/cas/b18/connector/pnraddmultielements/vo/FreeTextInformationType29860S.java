package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.FreeTextDetailsType187698C;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FreeTextInformationType29860S
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class FreeTextInformationType29860S   {
  @JsonProperty("freeText")
  private String freeText;

  @JsonProperty("freeTextDetails")
  private FreeTextDetailsType187698C freeTextDetails;

  public FreeTextInformationType29860S freeText(String freeText) {
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

  public FreeTextInformationType29860S freeTextDetails(FreeTextDetailsType187698C freeTextDetails) {
    this.freeTextDetails = freeTextDetails;
    return this;
  }

  /**
   * Get freeTextDetails
   * @return freeTextDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public FreeTextDetailsType187698C getFreeTextDetails() {
    return freeTextDetails;
  }

  public void setFreeTextDetails(FreeTextDetailsType187698C freeTextDetails) {
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
    FreeTextInformationType29860S freeTextInformationType29860S = (FreeTextInformationType29860S) o;
    return Objects.equals(this.freeText, freeTextInformationType29860S.freeText) &&
        Objects.equals(this.freeTextDetails, freeTextInformationType29860S.freeTextDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(freeText, freeTextDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FreeTextInformationType29860S {\n");
    
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

