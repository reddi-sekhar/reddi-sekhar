package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.DataElementsIndiv1;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DataElementsMaster1
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class DataElementsMaster1   {
  @JsonProperty("dataElementsIndiv")
  @Valid
  private List<DataElementsIndiv1> dataElementsIndiv = null;

  @JsonProperty("marker1")
  private Object marker1;

  public DataElementsMaster1 dataElementsIndiv(List<DataElementsIndiv1> dataElementsIndiv) {
    this.dataElementsIndiv = dataElementsIndiv;
    return this;
  }

  public DataElementsMaster1 addDataElementsIndivItem(DataElementsIndiv1 dataElementsIndivItem) {
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

  public List<DataElementsIndiv1> getDataElementsIndiv() {
    return dataElementsIndiv;
  }

  public void setDataElementsIndiv(List<DataElementsIndiv1> dataElementsIndiv) {
    this.dataElementsIndiv = dataElementsIndiv;
  }

  public DataElementsMaster1 marker1(Object marker1) {
    this.marker1 = marker1;
    return this;
  }

  /**
   * Get marker1
   * @return marker1
  */
  @ApiModelProperty(value = "")


  public Object getMarker1() {
    return marker1;
  }

  public void setMarker1(Object marker1) {
    this.marker1 = marker1;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataElementsMaster1 dataElementsMaster1 = (DataElementsMaster1) o;
    return Objects.equals(this.dataElementsIndiv, dataElementsMaster1.dataElementsIndiv) &&
        Objects.equals(this.marker1, dataElementsMaster1.marker1);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataElementsIndiv, marker1);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataElementsMaster1 {\n");
    
    sb.append("    dataElementsIndiv: ").append(toIndentedString(dataElementsIndiv)).append("\n");
    sb.append("    marker1: ").append(toIndentedString(marker1)).append("\n");
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

