package jp.co.ana.cas.soapfront.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/**
 * CategoryType.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen",
    date = "2022-04-12T10:54:30.513642700+05:30[Asia/Calcutta]")
public class CategoryType   {
  
  /** The code. */
  @JsonProperty("code")
  private String code;

  /** The desc. */
  @JsonProperty("desc")
  private String desc;

  /** The index number. */
  @JsonProperty("indexNumber")
  private String indexNumber;

  /** The list code. */
  @JsonProperty("listCode")
  private String listCode;

  /** The list name. */
  @JsonProperty("listName")
  private String listName;

  /** The owner. */
  @JsonProperty("owner")
  private String owner;

  /**
   * Code.
   *
   * @param code the code
   * @return the category type
   */
  public CategoryType code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Get code.
   *
   * @return code
   */
  @ApiModelProperty(value = "")


  public String getCode() {
    return code;
  }

  /**
   * Sets the code.
   *
   * @param code the new code
   */
  public void setCode(String code) {
    this.code = code;
  }

  /**
   * Desc.
   *
   * @param desc the desc
   * @return the category type
   */
  public CategoryType desc(String desc) {
    this.desc = desc;
    return this;
  }

  /**
   * Get desc.
   *
   * @return desc
   */
  @ApiModelProperty(value = "")


  public String getDesc() {
    return desc;
  }

  /**
   * Sets the desc.
   *
   * @param desc the new desc
   */
  public void setDesc(String desc) {
    this.desc = desc;
  }

  /**
   * Index number.
   *
   * @param indexNumber the index number
   * @return the category type
   */
  public CategoryType indexNumber(String indexNumber) {
    this.indexNumber = indexNumber;
    return this;
  }

  /**
   * Get indexNumber.
   *
   * @return indexNumber
   */
  @ApiModelProperty(value = "")


  public String getIndexNumber() {
    return indexNumber;
  }

  /**
   * Sets the index number.
   *
   * @param indexNumber the new index number
   */
  public void setIndexNumber(String indexNumber) {
    this.indexNumber = indexNumber;
  }

  /**
   * List code.
   *
   * @param listCode the list code
   * @return the category type
   */
  public CategoryType listCode(String listCode) {
    this.listCode = listCode;
    return this;
  }

  /**
   * Get listCode.
   *
   * @return listCode
   */
  @ApiModelProperty(value = "")


  public String getListCode() {
    return listCode;
  }

  /**
   * Sets the list code.
   *
   * @param listCode the new list code
   */
  public void setListCode(String listCode) {
    this.listCode = listCode;
  }

  /**
   * List name.
   *
   * @param listName the list name
   * @return the category type
   */
  public CategoryType listName(String listName) {
    this.listName = listName;
    return this;
  }

  /**
   * Get listName.
   *
   * @return listName
   */
  @ApiModelProperty(value = "")


  public String getListName() {
    return listName;
  }

  /**
   * Sets the list name.
   *
   * @param listName the new list name
   */
  public void setListName(String listName) {
    this.listName = listName;
  }

  /**
   * Owner.
   *
   * @param owner the owner
   * @return the category type
   */
  public CategoryType owner(String owner) {
    this.owner = owner;
    return this;
  }

  /**
   * Get owner.
   *
   * @return owner
   */
  @ApiModelProperty(value = "")


  public String getOwner() {
    return owner;
  }

  /**
   * Sets the owner.
   *
   * @param owner the new owner
   */
  public void setOwner(String owner) {
    this.owner = owner;
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
    CategoryType categoryType = (CategoryType) o;
    return Objects.equals(this.code, categoryType.code)
        && Objects.equals(this.desc, categoryType.desc)
        && Objects.equals(this.indexNumber, categoryType.indexNumber)
        && Objects.equals(this.listCode, categoryType.listCode)
        && Objects.equals(this.listName, categoryType.listName)
        && Objects.equals(this.owner, categoryType.owner);
  }

  /**
   * Hash code.
   *
   * @return the int
   */
  @Override
  public int hashCode() {
    return Objects.hash(code, desc, indexNumber, listCode, listName, owner);
  }

  /**
   * To string.
   *
   * @return the string
   */
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

