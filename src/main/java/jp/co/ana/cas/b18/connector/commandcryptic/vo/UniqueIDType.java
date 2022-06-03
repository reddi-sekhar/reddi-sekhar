package jp.co.ana.cas.b18.connector.commandcryptic.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.commandcryptic.vo.CompanyNameType1;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UniqueIDType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T19:01:00.408185400+05:30[Asia/Calcutta]")
public class UniqueIDType   {
  @JsonProperty("companyName")
  private CompanyNameType1 companyName;

  @JsonProperty("id")
  private String id;

  @JsonProperty("idcontext")
  private String idcontext;

  @JsonProperty("instance")
  private String instance;

  @JsonProperty("type")
  private String type;

  @JsonProperty("url")
  private String url;

  public UniqueIDType companyName(CompanyNameType1 companyName) {
    this.companyName = companyName;
    return this;
  }

  /**
   * Get companyName
   * @return companyName
  */
  @ApiModelProperty(value = "")

  @Valid

  public CompanyNameType1 getCompanyName() {
    return companyName;
  }

  public void setCompanyName(CompanyNameType1 companyName) {
    this.companyName = companyName;
  }

  public UniqueIDType id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @ApiModelProperty(value = "")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public UniqueIDType idcontext(String idcontext) {
    this.idcontext = idcontext;
    return this;
  }

  /**
   * Get idcontext
   * @return idcontext
  */
  @ApiModelProperty(value = "")


  public String getIdcontext() {
    return idcontext;
  }

  public void setIdcontext(String idcontext) {
    this.idcontext = idcontext;
  }

  public UniqueIDType instance(String instance) {
    this.instance = instance;
    return this;
  }

  /**
   * Get instance
   * @return instance
  */
  @ApiModelProperty(value = "")


  public String getInstance() {
    return instance;
  }

  public void setInstance(String instance) {
    this.instance = instance;
  }

  public UniqueIDType type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  @ApiModelProperty(value = "")


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public UniqueIDType url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Get url
   * @return url
  */
  @ApiModelProperty(value = "")


  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UniqueIDType uniqueIDType = (UniqueIDType) o;
    return Objects.equals(this.companyName, uniqueIDType.companyName) &&
        Objects.equals(this.id, uniqueIDType.id) &&
        Objects.equals(this.idcontext, uniqueIDType.idcontext) &&
        Objects.equals(this.instance, uniqueIDType.instance) &&
        Objects.equals(this.type, uniqueIDType.type) &&
        Objects.equals(this.url, uniqueIDType.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyName, id, idcontext, instance, type, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UniqueIDType {\n");
    
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idcontext: ").append(toIndentedString(idcontext)).append("\n");
    sb.append("    instance: ").append(toIndentedString(instance)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

