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
 * CommunicationContactDetailsType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class CommunicationContactDetailsType   {
  @JsonProperty("urlAddress")
  private String urlAddress;

  @JsonProperty("urlType")
  private String urlType;

  public CommunicationContactDetailsType urlAddress(String urlAddress) {
    this.urlAddress = urlAddress;
    return this;
  }

  /**
   * Get urlAddress
   * @return urlAddress
  */
  @ApiModelProperty(value = "")


  public String getUrlAddress() {
    return urlAddress;
  }

  public void setUrlAddress(String urlAddress) {
    this.urlAddress = urlAddress;
  }

  public CommunicationContactDetailsType urlType(String urlType) {
    this.urlType = urlType;
    return this;
  }

  /**
   * Get urlType
   * @return urlType
  */
  @ApiModelProperty(value = "")


  public String getUrlType() {
    return urlType;
  }

  public void setUrlType(String urlType) {
    this.urlType = urlType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommunicationContactDetailsType communicationContactDetailsType = (CommunicationContactDetailsType) o;
    return Objects.equals(this.urlAddress, communicationContactDetailsType.urlAddress) &&
        Objects.equals(this.urlType, communicationContactDetailsType.urlType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(urlAddress, urlType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommunicationContactDetailsType {\n");
    
    sb.append("    urlAddress: ").append(toIndentedString(urlAddress)).append("\n");
    sb.append("    urlType: ").append(toIndentedString(urlType)).append("\n");
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

