package jp.co.ana.cas.b18.dto.response;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.dto.response.DataElementsIndiv1RequestDto;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DataElementsMaster1RequestDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class DataElementsMaster1RequestDto   {
  @JsonProperty("dataElementsIndiv")
  @Valid
  private List<DataElementsIndiv1RequestDto> dataElementsIndiv = null;

  public DataElementsMaster1RequestDto dataElementsIndiv(List<DataElementsIndiv1RequestDto> dataElementsIndiv) {
    this.dataElementsIndiv = dataElementsIndiv;
    return this;
  }

  public DataElementsMaster1RequestDto addDataElementsIndivItem(DataElementsIndiv1RequestDto dataElementsIndivItem) {
    if (this.dataElementsIndiv == null) {
      this.dataElementsIndiv = new ArrayList<>();
    }
    this.dataElementsIndiv.add(dataElementsIndivItem);
    return this;
  }

  /**
   * Get dataElementsIndiv
   * @return dataElementsIndiv
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<DataElementsIndiv1RequestDto> getDataElementsIndiv() {
    return dataElementsIndiv;
  }

  public void setDataElementsIndiv(List<DataElementsIndiv1RequestDto> dataElementsIndiv) {
    this.dataElementsIndiv = dataElementsIndiv;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataElementsMaster1RequestDto dataElementsMaster1RequestDto = (DataElementsMaster1RequestDto) o;
    return Objects.equals(this.dataElementsIndiv, dataElementsMaster1RequestDto.dataElementsIndiv);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataElementsIndiv);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataElementsMaster1RequestDto {\n");
    
    sb.append("    dataElementsIndiv: ").append(toIndentedString(dataElementsIndiv)).append("\n");
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

