package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.DataElementsIndiv;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DataElementsMaster
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class DataElementsMaster   {
  @JsonProperty("dataElementsIndiv")
  @Valid
  private List<DataElementsIndiv> dataElementsIndiv = null;

  @JsonProperty("marker2")
  private Object marker2;

  public DataElementsMaster dataElementsIndiv(List<DataElementsIndiv> dataElementsIndiv) {
    this.dataElementsIndiv = dataElementsIndiv;
    return this;
  }

  public DataElementsMaster addDataElementsIndivItem(DataElementsIndiv dataElementsIndivItem) {
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

  public List<DataElementsIndiv> getDataElementsIndiv() {
    return dataElementsIndiv;
  }

  public void setDataElementsIndiv(List<DataElementsIndiv> dataElementsIndiv) {
    this.dataElementsIndiv = dataElementsIndiv;
  }

  public DataElementsMaster marker2(Object marker2) {
    this.marker2 = marker2;
    return this;
  }

  /**
   * Get marker2
   * @return marker2
  */
  @ApiModelProperty(value = "")


  public Object getMarker2() {
    return marker2;
  }

  public void setMarker2(Object marker2) {
    this.marker2 = marker2;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataElementsMaster dataElementsMaster = (DataElementsMaster) o;
    return Objects.equals(this.dataElementsIndiv, dataElementsMaster.dataElementsIndiv) &&
        Objects.equals(this.marker2, dataElementsMaster.marker2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataElementsIndiv, marker2);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataElementsMaster {\n");
    
    sb.append("    dataElementsIndiv: ").append(toIndentedString(dataElementsIndiv)).append("\n");
    sb.append("    marker2: ").append(toIndentedString(marker2)).append("\n");
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

