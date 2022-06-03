package jp.co.ana.cas.b18.dto.response;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.dto.response.DataElementsIndivResponseDto;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DataElementsMasterResponseDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class DataElementsMasterResponseDto   {
  @JsonProperty("dataElementsIndiv")
  @Valid
  private List<DataElementsIndivResponseDto> dataElementsIndiv = null;

  public DataElementsMasterResponseDto dataElementsIndiv(List<DataElementsIndivResponseDto> dataElementsIndiv) {
    this.dataElementsIndiv = dataElementsIndiv;
    return this;
  }

  public DataElementsMasterResponseDto addDataElementsIndivItem(DataElementsIndivResponseDto dataElementsIndivItem) {
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

  public List<DataElementsIndivResponseDto> getDataElementsIndiv() {
    return dataElementsIndiv;
  }

  public void setDataElementsIndiv(List<DataElementsIndivResponseDto> dataElementsIndiv) {
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
    DataElementsMasterResponseDto dataElementsMasterResponseDto = (DataElementsMasterResponseDto) o;
    return Objects.equals(this.dataElementsIndiv, dataElementsMasterResponseDto.dataElementsIndiv);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataElementsIndiv);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataElementsMasterResponseDto {\n");
    
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

