package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.OriginatorDetailsTypeI;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UserPreferencesType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class UserPreferencesType   {
  @JsonProperty("userPreferences")
  private OriginatorDetailsTypeI userPreferences;

  public UserPreferencesType userPreferences(OriginatorDetailsTypeI userPreferences) {
    this.userPreferences = userPreferences;
    return this;
  }

  /**
   * Get userPreferences
   * @return userPreferences
  */
  @ApiModelProperty(value = "")

  @Valid

  public OriginatorDetailsTypeI getUserPreferences() {
    return userPreferences;
  }

  public void setUserPreferences(OriginatorDetailsTypeI userPreferences) {
    this.userPreferences = userPreferences;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserPreferencesType userPreferencesType = (UserPreferencesType) o;
    return Objects.equals(this.userPreferences, userPreferencesType.userPreferences);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userPreferences);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserPreferencesType {\n");
    
    sb.append("    userPreferences: ").append(toIndentedString(userPreferences)).append("\n");
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

