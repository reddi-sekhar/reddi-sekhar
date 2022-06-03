package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.OriginatorIdentificationDetailsTypeI297346C;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UserIdentificationType215330S
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class UserIdentificationType215330S   {
  @JsonProperty("originIdentification")
  private OriginatorIdentificationDetailsTypeI297346C originIdentification;

  public UserIdentificationType215330S originIdentification(OriginatorIdentificationDetailsTypeI297346C originIdentification) {
    this.originIdentification = originIdentification;
    return this;
  }

  /**
   * Get originIdentification
   * @return originIdentification
  */
  @ApiModelProperty(value = "")

  @Valid

  public OriginatorIdentificationDetailsTypeI297346C getOriginIdentification() {
    return originIdentification;
  }

  public void setOriginIdentification(OriginatorIdentificationDetailsTypeI297346C originIdentification) {
    this.originIdentification = originIdentification;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserIdentificationType215330S userIdentificationType215330S = (UserIdentificationType215330S) o;
    return Objects.equals(this.originIdentification, userIdentificationType215330S.originIdentification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(originIdentification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserIdentificationType215330S {\n");
    
    sb.append("    originIdentification: ").append(toIndentedString(originIdentification)).append("\n");
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

