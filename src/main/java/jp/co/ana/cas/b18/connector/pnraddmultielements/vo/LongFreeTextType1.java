package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.FreeTextQualificationType1;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * LongFreeTextType1
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class LongFreeTextType1   {
  @JsonProperty("freetextDetail")
  private FreeTextQualificationType1 freetextDetail;

  @JsonProperty("longFreetext")
  private String longFreetext;

  public LongFreeTextType1 freetextDetail(FreeTextQualificationType1 freetextDetail) {
    this.freetextDetail = freetextDetail;
    return this;
  }

  /**
   * Get freetextDetail
   * @return freetextDetail
  */
  @ApiModelProperty(value = "")

  @Valid

  public FreeTextQualificationType1 getFreetextDetail() {
    return freetextDetail;
  }

  public void setFreetextDetail(FreeTextQualificationType1 freetextDetail) {
    this.freetextDetail = freetextDetail;
  }

  public LongFreeTextType1 longFreetext(String longFreetext) {
    this.longFreetext = longFreetext;
    return this;
  }

  /**
   * Get longFreetext
   * @return longFreetext
  */
  @ApiModelProperty(value = "")


  public String getLongFreetext() {
    return longFreetext;
  }

  public void setLongFreetext(String longFreetext) {
    this.longFreetext = longFreetext;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LongFreeTextType1 longFreeTextType1 = (LongFreeTextType1) o;
    return Objects.equals(this.freetextDetail, longFreeTextType1.freetextDetail) &&
        Objects.equals(this.longFreetext, longFreeTextType1.longFreetext);
  }

  @Override
  public int hashCode() {
    return Objects.hash(freetextDetail, longFreetext);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LongFreeTextType1 {\n");
    
    sb.append("    freetextDetail: ").append(toIndentedString(freetextDetail)).append("\n");
    sb.append("    longFreetext: ").append(toIndentedString(longFreetext)).append("\n");
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

