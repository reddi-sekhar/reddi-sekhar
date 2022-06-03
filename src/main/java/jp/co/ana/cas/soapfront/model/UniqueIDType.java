package jp.co.ana.cas.soapfront.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import javax.validation.Valid;

/**
 * UniqueIDType.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen",
    date = "2022-04-12T10:54:30.513642700+05:30[Asia/Calcutta]")
public class UniqueIDType   {
  
  /** The company name. */
  @JsonProperty("companyName")
  private CompanyNameType1 companyName;

  /** The id. */
  @JsonProperty("id")
  private String id;

  /** The idcontext. */
  @JsonProperty("idcontext")
  private String idcontext;

  /** The instance. */
  @JsonProperty("instance")
  private String instance;

  /** The type. */
  @JsonProperty("type")
  private String type;

  /** The url. */
  @JsonProperty("url")
  private String url;

  /**
   * Company name.
   *
   * @param companyName the company name
   * @return the unique ID type
   */
  public UniqueIDType companyName(CompanyNameType1 companyName) {
    this.companyName = companyName;
    return this;
  }

  /**
   * Get companyName.
   *
   * @return companyName
   */
  @ApiModelProperty(value = "")

  @Valid

  public CompanyNameType1 getCompanyName() {
    return companyName;
  }

  /**
   * Sets the company name.
   *
   * @param companyName the new company name
   */
  public void setCompanyName(CompanyNameType1 companyName) {
    this.companyName = companyName;
  }

  /**
   * Id.
   *
   * @param id the id
   * @return the unique ID type
   */
  public UniqueIDType id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id.
   *
   * @return id
   */
  @ApiModelProperty(value = "")


  public String getId() {
    return id;
  }

  /**
   * Sets the id.
   *
   * @param id the new id
   */
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Idcontext.
   *
   * @param idcontext the idcontext
   * @return the unique ID type
   */
  public UniqueIDType idcontext(String idcontext) {
    this.idcontext = idcontext;
    return this;
  }

  /**
   * Get idcontext.
   *
   * @return idcontext
   */
  @ApiModelProperty(value = "")


  public String getIdcontext() {
    return idcontext;
  }

  /**
   * Sets the idcontext.
   *
   * @param idcontext the new idcontext
   */
  public void setIdcontext(String idcontext) {
    this.idcontext = idcontext;
  }

  /**
   * Instance.
   *
   * @param instance the instance
   * @return the unique ID type
   */
  public UniqueIDType instance(String instance) {
    this.instance = instance;
    return this;
  }

  /**
   * Get instance.
   *
   * @return instance
   */
  @ApiModelProperty(value = "")


  public String getInstance() {
    return instance;
  }

  /**
   * Sets the instance.
   *
   * @param instance the new instance
   */
  public void setInstance(String instance) {
    this.instance = instance;
  }

  /**
   * Type.
   *
   * @param type the type
   * @return the unique ID type
   */
  public UniqueIDType type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type.
   *
   * @return type
   */
  @ApiModelProperty(value = "")


  public String getType() {
    return type;
  }

  /**
   * Sets the type.
   *
   * @param type the new type
   */
  public void setType(String type) {
    this.type = type;
  }

  /**
   * Url.
   *
   * @param url the url
   * @return the unique ID type
   */
  public UniqueIDType url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Get url.
   *
   * @return url
   */
  @ApiModelProperty(value = "")


  public String getUrl() {
    return url;
  }

  /**
   * Sets the url.
   *
   * @param url the new url
   */
  public void setUrl(String url) {
    this.url = url;
  }


  /**
   * Equals.
   *
   * @param o the o
   * @return true, if successful
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UniqueIDType uniqueIDType = (UniqueIDType) o;
    return Objects.equals(this.companyName, uniqueIDType.companyName)
        && Objects.equals(this.id, uniqueIDType.id)
        && Objects.equals(this.idcontext, uniqueIDType.idcontext)
        && Objects.equals(this.instance, uniqueIDType.instance)
        && Objects.equals(this.type, uniqueIDType.type)
        && Objects.equals(this.url, uniqueIDType.url);
  }

  /**
   * Hash code.
   *
   * @return the int
   */
  @Override
  public int hashCode() {
    return Objects.hash(companyName, id, idcontext, instance, type, url);
  }

  /**
   * To string.
   *
   * @return the string
   */
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
   *
   * @param o the o
   * @return the string
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

