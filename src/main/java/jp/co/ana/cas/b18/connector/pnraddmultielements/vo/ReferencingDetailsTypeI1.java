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
 * ReferencingDetailsTypeI1
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class ReferencingDetailsTypeI1   {
  @JsonProperty("dataValue")
  private String dataValue;

  @JsonProperty("referenceQualifier")
  private String referenceQualifier;

  public ReferencingDetailsTypeI1 dataValue(String dataValue) {
    this.dataValue = dataValue;
    return this;
  }

  /**
   * Get dataValue
   * @return dataValue
  */
  @ApiModelProperty(value = "")


  public String getDataValue() {
    return dataValue;
  }

  public void setDataValue(String dataValue) {
    this.dataValue = dataValue;
  }

  public ReferencingDetailsTypeI1 referenceQualifier(String referenceQualifier) {
    this.referenceQualifier = referenceQualifier;
    return this;
  }

  /**
   * Get referenceQualifier
   * @return referenceQualifier
  */
  @ApiModelProperty(value = "")


  public String getReferenceQualifier() {
    return referenceQualifier;
  }

  public void setReferenceQualifier(String referenceQualifier) {
    this.referenceQualifier = referenceQualifier;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReferencingDetailsTypeI1 referencingDetailsTypeI1 = (ReferencingDetailsTypeI1) o;
    return Objects.equals(this.dataValue, referencingDetailsTypeI1.dataValue) &&
        Objects.equals(this.referenceQualifier, referencingDetailsTypeI1.referenceQualifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataValue, referenceQualifier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReferencingDetailsTypeI1 {\n");
    
    sb.append("    dataValue: ").append(toIndentedString(dataValue)).append("\n");
    sb.append("    referenceQualifier: ").append(toIndentedString(referenceQualifier)).append("\n");
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

