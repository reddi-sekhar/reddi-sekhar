package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.CompanyIdentificationTypeI;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TransportIdentifierType79027S
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class TransportIdentifierType79027S   {
  @JsonProperty("companyIdentification")
  private CompanyIdentificationTypeI companyIdentification;

  public TransportIdentifierType79027S companyIdentification(CompanyIdentificationTypeI companyIdentification) {
    this.companyIdentification = companyIdentification;
    return this;
  }

  /**
   * Get companyIdentification
   * @return companyIdentification
  */
  @ApiModelProperty(value = "")

  @Valid

  public CompanyIdentificationTypeI getCompanyIdentification() {
    return companyIdentification;
  }

  public void setCompanyIdentification(CompanyIdentificationTypeI companyIdentification) {
    this.companyIdentification = companyIdentification;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransportIdentifierType79027S transportIdentifierType79027S = (TransportIdentifierType79027S) o;
    return Objects.equals(this.companyIdentification, transportIdentifierType79027S.companyIdentification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyIdentification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransportIdentifierType79027S {\n");
    
    sb.append("    companyIdentification: ").append(toIndentedString(companyIdentification)).append("\n");
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

