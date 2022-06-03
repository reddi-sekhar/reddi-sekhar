package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.SystemDetailsInfoType33158S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.UserIdentificationType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.UserPreferencesType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * POSGroupType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class POSGroupType   {
  @JsonProperty("sbrPreferences")
  private UserPreferencesType sbrPreferences;

  @JsonProperty("sbrSystemDetails")
  private SystemDetailsInfoType33158S sbrSystemDetails;

  @JsonProperty("sbrUserIdentificationOwn")
  private UserIdentificationType sbrUserIdentificationOwn;

  public POSGroupType sbrPreferences(UserPreferencesType sbrPreferences) {
    this.sbrPreferences = sbrPreferences;
    return this;
  }

  /**
   * Get sbrPreferences
   * @return sbrPreferences
  */
  @ApiModelProperty(value = "")

  @Valid

  public UserPreferencesType getSbrPreferences() {
    return sbrPreferences;
  }

  public void setSbrPreferences(UserPreferencesType sbrPreferences) {
    this.sbrPreferences = sbrPreferences;
  }

  public POSGroupType sbrSystemDetails(SystemDetailsInfoType33158S sbrSystemDetails) {
    this.sbrSystemDetails = sbrSystemDetails;
    return this;
  }

  /**
   * Get sbrSystemDetails
   * @return sbrSystemDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public SystemDetailsInfoType33158S getSbrSystemDetails() {
    return sbrSystemDetails;
  }

  public void setSbrSystemDetails(SystemDetailsInfoType33158S sbrSystemDetails) {
    this.sbrSystemDetails = sbrSystemDetails;
  }

  public POSGroupType sbrUserIdentificationOwn(UserIdentificationType sbrUserIdentificationOwn) {
    this.sbrUserIdentificationOwn = sbrUserIdentificationOwn;
    return this;
  }

  /**
   * Get sbrUserIdentificationOwn
   * @return sbrUserIdentificationOwn
  */
  @ApiModelProperty(value = "")

  @Valid

  public UserIdentificationType getSbrUserIdentificationOwn() {
    return sbrUserIdentificationOwn;
  }

  public void setSbrUserIdentificationOwn(UserIdentificationType sbrUserIdentificationOwn) {
    this.sbrUserIdentificationOwn = sbrUserIdentificationOwn;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    POSGroupType poSGroupType = (POSGroupType) o;
    return Objects.equals(this.sbrPreferences, poSGroupType.sbrPreferences) &&
        Objects.equals(this.sbrSystemDetails, poSGroupType.sbrSystemDetails) &&
        Objects.equals(this.sbrUserIdentificationOwn, poSGroupType.sbrUserIdentificationOwn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sbrPreferences, sbrSystemDetails, sbrUserIdentificationOwn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class POSGroupType {\n");
    
    sb.append("    sbrPreferences: ").append(toIndentedString(sbrPreferences)).append("\n");
    sb.append("    sbrSystemDetails: ").append(toIndentedString(sbrSystemDetails)).append("\n");
    sb.append("    sbrUserIdentificationOwn: ").append(toIndentedString(sbrUserIdentificationOwn)).append("\n");
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

