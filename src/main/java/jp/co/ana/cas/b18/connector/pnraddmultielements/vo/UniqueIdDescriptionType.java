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
 * UniqueIdDescriptionType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class UniqueIdDescriptionType   {
  @JsonProperty("idqualifier")
  private String idqualifier;

  @JsonProperty("idsequenceNumber")
  private Long idsequenceNumber;

  public UniqueIdDescriptionType idqualifier(String idqualifier) {
    this.idqualifier = idqualifier;
    return this;
  }

  /**
   * Get idqualifier
   * @return idqualifier
  */
  @ApiModelProperty(value = "")


  public String getIdqualifier() {
    return idqualifier;
  }

  public void setIdqualifier(String idqualifier) {
    this.idqualifier = idqualifier;
  }

  public UniqueIdDescriptionType idsequenceNumber(Long idsequenceNumber) {
    this.idsequenceNumber = idsequenceNumber;
    return this;
  }

  /**
   * Get idsequenceNumber
   * @return idsequenceNumber
  */
  @ApiModelProperty(value = "")


  public Long getIdsequenceNumber() {
    return idsequenceNumber;
  }

  public void setIdsequenceNumber(Long idsequenceNumber) {
    this.idsequenceNumber = idsequenceNumber;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UniqueIdDescriptionType uniqueIdDescriptionType = (UniqueIdDescriptionType) o;
    return Objects.equals(this.idqualifier, uniqueIdDescriptionType.idqualifier) &&
        Objects.equals(this.idsequenceNumber, uniqueIdDescriptionType.idsequenceNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idqualifier, idsequenceNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UniqueIdDescriptionType {\n");
    
    sb.append("    idqualifier: ").append(toIndentedString(idqualifier)).append("\n");
    sb.append("    idsequenceNumber: ").append(toIndentedString(idsequenceNumber)).append("\n");
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

