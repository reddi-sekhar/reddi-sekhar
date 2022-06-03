package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ItemNumberIdentificationTypeU;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ItemNumberTypeU33258S
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class ItemNumberTypeU33258S   {
  @JsonProperty("itemNumberDetails")
  private ItemNumberIdentificationTypeU itemNumberDetails;

  public ItemNumberTypeU33258S itemNumberDetails(ItemNumberIdentificationTypeU itemNumberDetails) {
    this.itemNumberDetails = itemNumberDetails;
    return this;
  }

  /**
   * Get itemNumberDetails
   * @return itemNumberDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public ItemNumberIdentificationTypeU getItemNumberDetails() {
    return itemNumberDetails;
  }

  public void setItemNumberDetails(ItemNumberIdentificationTypeU itemNumberDetails) {
    this.itemNumberDetails = itemNumberDetails;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemNumberTypeU33258S itemNumberTypeU33258S = (ItemNumberTypeU33258S) o;
    return Objects.equals(this.itemNumberDetails, itemNumberTypeU33258S.itemNumberDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemNumberDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemNumberTypeU33258S {\n");
    
    sb.append("    itemNumberDetails: ").append(toIndentedString(itemNumberDetails)).append("\n");
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

