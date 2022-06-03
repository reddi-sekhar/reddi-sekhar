package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ItemNumberIdentificationType311115C;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ItemNumberType227073S
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class ItemNumberType227073S   {
  @JsonProperty("itemNumberDetails")
  @Valid
  private List<ItemNumberIdentificationType311115C> itemNumberDetails = null;

  public ItemNumberType227073S itemNumberDetails(List<ItemNumberIdentificationType311115C> itemNumberDetails) {
    this.itemNumberDetails = itemNumberDetails;
    return this;
  }

  public ItemNumberType227073S addItemNumberDetailsItem(ItemNumberIdentificationType311115C itemNumberDetailsItem) {
    if (this.itemNumberDetails == null) {
      this.itemNumberDetails = new ArrayList<>();
    }
    this.itemNumberDetails.add(itemNumberDetailsItem);
    return this;
  }

  /**
   * Get itemNumberDetails
   * @return itemNumberDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<ItemNumberIdentificationType311115C> getItemNumberDetails() {
    return itemNumberDetails;
  }

  public void setItemNumberDetails(List<ItemNumberIdentificationType311115C> itemNumberDetails) {
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
    ItemNumberType227073S itemNumberType227073S = (ItemNumberType227073S) o;
    return Objects.equals(this.itemNumberDetails, itemNumberType227073S.itemNumberDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemNumberDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemNumberType227073S {\n");
    
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

