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
 * CategoryType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class CategoryType   {
  @JsonProperty("code")
  private String code;

  @JsonProperty("desc")
  private String desc;

  @JsonProperty("indexNumber")
  private String indexNumber;

  @JsonProperty("listCode")
  private String listCode;

  @JsonProperty("listName")
  private String listName;

  @JsonProperty("owner")
  private String owner;

  public CategoryType code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Get code
   * @return code
  */
  @ApiModelProperty(value = "")


  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public CategoryType desc(String desc) {
    this.desc = desc;
    return this;
  }

  /**
   * Get desc
   * @return desc
  */
  @ApiModelProperty(value = "")


  public String getDesc() {
    return desc;
  }

  public void setDesc(String desc) {
    this.desc = desc;
  }

  public CategoryType indexNumber(String indexNumber) {
    this.indexNumber = indexNumber;
    return this;
  }

  /**
   * Get indexNumber
   * @return indexNumber
  */
  @ApiModelProperty(value = "")


  public String getIndexNumber() {
    return indexNumber;
  }

  public void setIndexNumber(String indexNumber) {
    this.indexNumber = indexNumber;
  }

  public CategoryType listCode(String listCode) {
    this.listCode = listCode;
    return this;
  }

  /**
   * Get listCode
   * @return listCode
  */
  @ApiModelProperty(value = "")


  public String getListCode() {
    return listCode;
  }

  public void setListCode(String listCode) {
    this.listCode = listCode;
  }

  public CategoryType listName(String listName) {
    this.listName = listName;
    return this;
  }

  /**
   * Get listName
   * @return listName
  */
  @ApiModelProperty(value = "")


  public String getListName() {
    return listName;
  }

  public void setListName(String listName) {
    this.listName = listName;
  }

  public CategoryType owner(String owner) {
    this.owner = owner;
    return this;
  }

  /**
   * Get owner
   * @return owner
  */
  @ApiModelProperty(value = "")


  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CategoryType categoryType = (CategoryType) o;
    return Objects.equals(this.code, categoryType.code) &&
        Objects.equals(this.desc, categoryType.desc) &&
        Objects.equals(this.indexNumber, categoryType.indexNumber) &&
        Objects.equals(this.listCode, categoryType.listCode) &&
        Objects.equals(this.listName, categoryType.listName) &&
        Objects.equals(this.owner, categoryType.owner);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, desc, indexNumber, listCode, listName, owner);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CategoryType {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
    sb.append("    indexNumber: ").append(toIndentedString(indexNumber)).append("\n");
    sb.append("    listCode: ").append(toIndentedString(listCode)).append("\n");
    sb.append("    listName: ").append(toIndentedString(listName)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
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

