package jp.co.ana.cas.b18.dto.response;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.dto.response.SelectionDetails1RequestDto;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SelectionDetailsAir1RequestDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class SelectionDetailsAir1RequestDto   {
  @JsonProperty("selection")
  @Valid
  private List<SelectionDetails1RequestDto> selection = null;

  public SelectionDetailsAir1RequestDto selection(List<SelectionDetails1RequestDto> selection) {
    this.selection = selection;
    return this;
  }

  public SelectionDetailsAir1RequestDto addSelectionItem(SelectionDetails1RequestDto selectionItem) {
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

  public List<SelectionDetails1RequestDto> getSelection() {
    return selection;
  }

  public void setSelection(List<SelectionDetails1RequestDto> selection) {
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
    SelectionDetailsAir1RequestDto selectionDetailsAir1RequestDto = (SelectionDetailsAir1RequestDto) o;
    return Objects.equals(this.selection, selectionDetailsAir1RequestDto.selection);
  }

  @Override
  public int hashCode() {
    return Objects.hash(selection);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SelectionDetailsAir1RequestDto {\n");
    
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

