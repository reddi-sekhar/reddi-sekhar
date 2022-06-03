package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.SelectionDetailsInformationTypeI1;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SelectionDetailsTypeI1
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class SelectionDetailsTypeI1   {
  @JsonProperty("selection")
  @Valid
  private List<SelectionDetailsInformationTypeI1> selection = null;

  public SelectionDetailsTypeI1 selection(List<SelectionDetailsInformationTypeI1> selection) {
    this.selection = selection;
    return this;
  }

  public SelectionDetailsTypeI1 addSelectionItem(SelectionDetailsInformationTypeI1 selectionItem) {
    if (this.selection == null) {
      this.selection = new ArrayList<>();
    }
    this.selection.add(selectionItem);
    return this;
  }

  /**
   * Get selection
   * @return selection
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<SelectionDetailsInformationTypeI1> getSelection() {
    return selection;
  }

  public void setSelection(List<SelectionDetailsInformationTypeI1> selection) {
    this.selection = selection;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SelectionDetailsTypeI1 selectionDetailsTypeI1 = (SelectionDetailsTypeI1) o;
    return Objects.equals(this.selection, selectionDetailsTypeI1.selection);
  }

  @Override
  public int hashCode() {
    return Objects.hash(selection);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SelectionDetailsTypeI1 {\n");
    
    sb.append("    selection: ").append(toIndentedString(selection)).append("\n");
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

