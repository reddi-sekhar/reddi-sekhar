package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.OriginatorIdentificationDetailsType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UserIdentificationType132824S
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class UserIdentificationType132824S   {
  @JsonProperty("originIdentification")
  private OriginatorIdentificationDetailsType originIdentification;

  @JsonProperty("originatorTypeCode")
  private String originatorTypeCode;

  public UserIdentificationType132824S originIdentification(OriginatorIdentificationDetailsType originIdentification) {
    this.originIdentification = originIdentification;
    return this;
  }

  /**
   * Get originIdentification
   * @return originIdentification
  */
  @ApiModelProperty(value = "")

  @Valid

  public OriginatorIdentificationDetailsType getOriginIdentification() {
    return originIdentification;
  }

  public void setOriginIdentification(OriginatorIdentificationDetailsType originIdentification) {
    this.originIdentification = originIdentification;
  }

  public UserIdentificationType132824S originatorTypeCode(String originatorTypeCode) {
    this.originatorTypeCode = originatorTypeCode;
    return this;
  }

  /**
   * Get originatorTypeCode
   * @return originatorTypeCode
  */
  @ApiModelProperty(value = "")


  public String getOriginatorTypeCode() {
    return originatorTypeCode;
  }

  public void setOriginatorTypeCode(String originatorTypeCode) {
    this.originatorTypeCode = originatorTypeCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserIdentificationType132824S userIdentificationType132824S = (UserIdentificationType132824S) o;
    return Objects.equals(this.originIdentification, userIdentificationType132824S.originIdentification) &&
        Objects.equals(this.originatorTypeCode, userIdentificationType132824S.originatorTypeCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(originIdentification, originatorTypeCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserIdentificationType132824S {\n");
    
    sb.append("    originIdentification: ").append(toIndentedString(originIdentification)).append("\n");
    sb.append("    originatorTypeCode: ").append(toIndentedString(originatorTypeCode)).append("\n");
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

