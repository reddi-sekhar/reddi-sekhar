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
 * ReferencingDetailsType2780C
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class ReferencingDetailsType2780C   {
  @JsonProperty("marriageQualifier")
  private String marriageQualifier;

  @JsonProperty("tatooNum")
  private String tatooNum;

  public ReferencingDetailsType2780C marriageQualifier(String marriageQualifier) {
    this.marriageQualifier = marriageQualifier;
    return this;
  }

  /**
   * Get marriageQualifier
   * @return marriageQualifier
  */
  @ApiModelProperty(value = "")


  public String getMarriageQualifier() {
    return marriageQualifier;
  }

  public void setMarriageQualifier(String marriageQualifier) {
    this.marriageQualifier = marriageQualifier;
  }

  public ReferencingDetailsType2780C tatooNum(String tatooNum) {
    this.tatooNum = tatooNum;
    return this;
  }

  /**
   * Get tatooNum
   * @return tatooNum
  */
  @ApiModelProperty(value = "")


  public String getTatooNum() {
    return tatooNum;
  }

  public void setTatooNum(String tatooNum) {
    this.tatooNum = tatooNum;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReferencingDetailsType2780C referencingDetailsType2780C = (ReferencingDetailsType2780C) o;
    return Objects.equals(this.marriageQualifier, referencingDetailsType2780C.marriageQualifier) &&
        Objects.equals(this.tatooNum, referencingDetailsType2780C.tatooNum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(marriageQualifier, tatooNum);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReferencingDetailsType2780C {\n");
    
    sb.append("    marriageQualifier: ").append(toIndentedString(marriageQualifier)).append("\n");
    sb.append("    tatooNum: ").append(toIndentedString(tatooNum)).append("\n");
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

