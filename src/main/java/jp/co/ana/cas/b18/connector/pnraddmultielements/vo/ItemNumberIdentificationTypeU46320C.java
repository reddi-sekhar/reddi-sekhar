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
 * ItemNumberIdentificationTypeU46320C
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class ItemNumberIdentificationTypeU46320C   {
  @JsonProperty("itemID")
  private Long itemID;

  @JsonProperty("itemIDQualifier")
  private String itemIDQualifier;

  public ItemNumberIdentificationTypeU46320C itemID(Long itemID) {
    this.itemID = itemID;
    return this;
  }

  /**
   * Get itemID
   * @return itemID
  */
  @ApiModelProperty(value = "")


  public Long getItemID() {
    return itemID;
  }

  public void setItemID(Long itemID) {
    this.itemID = itemID;
  }

  public ItemNumberIdentificationTypeU46320C itemIDQualifier(String itemIDQualifier) {
    this.itemIDQualifier = itemIDQualifier;
    return this;
  }

  /**
   * Get itemIDQualifier
   * @return itemIDQualifier
  */
  @ApiModelProperty(value = "")


  public String getItemIDQualifier() {
    return itemIDQualifier;
  }

  public void setItemIDQualifier(String itemIDQualifier) {
    this.itemIDQualifier = itemIDQualifier;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemNumberIdentificationTypeU46320C itemNumberIdentificationTypeU46320C = (ItemNumberIdentificationTypeU46320C) o;
    return Objects.equals(this.itemID, itemNumberIdentificationTypeU46320C.itemID) &&
        Objects.equals(this.itemIDQualifier, itemNumberIdentificationTypeU46320C.itemIDQualifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemID, itemIDQualifier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemNumberIdentificationTypeU46320C {\n");
    
    sb.append("    itemID: ").append(toIndentedString(itemID)).append("\n");
    sb.append("    itemIDQualifier: ").append(toIndentedString(itemIDQualifier)).append("\n");
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

