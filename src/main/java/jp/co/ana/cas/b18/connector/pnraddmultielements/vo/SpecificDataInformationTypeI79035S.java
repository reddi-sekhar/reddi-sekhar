package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.DataInformationTypeI;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.DataTypeInformationTypeI;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SpecificDataInformationTypeI79035S
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class SpecificDataInformationTypeI79035S   {
  @JsonProperty("dataInformation")
  @Valid
  private List<DataInformationTypeI> dataInformation = null;

  @JsonProperty("dataTypeInformation")
  private DataTypeInformationTypeI dataTypeInformation;

  public SpecificDataInformationTypeI79035S dataInformation(List<DataInformationTypeI> dataInformation) {
    this.dataInformation = dataInformation;
    return this;
  }

  public SpecificDataInformationTypeI79035S addDataInformationItem(DataInformationTypeI dataInformationItem) {
    if (this.dataInformation == null) {
      this.dataInformation = new ArrayList<>();
    }
    this.dataInformation.add(dataInformationItem);
    return this;
  }

  /**
   * Get dataInformation
   * @return dataInformation
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<DataInformationTypeI> getDataInformation() {
    return dataInformation;
  }

  public void setDataInformation(List<DataInformationTypeI> dataInformation) {
    this.dataInformation = dataInformation;
  }

  public SpecificDataInformationTypeI79035S dataTypeInformation(DataTypeInformationTypeI dataTypeInformation) {
    this.dataTypeInformation = dataTypeInformation;
    return this;
  }

  /**
   * Get dataTypeInformation
   * @return dataTypeInformation
  */
  @ApiModelProperty(value = "")

  @Valid

  public DataTypeInformationTypeI getDataTypeInformation() {
    return dataTypeInformation;
  }

  public void setDataTypeInformation(DataTypeInformationTypeI dataTypeInformation) {
    this.dataTypeInformation = dataTypeInformation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpecificDataInformationTypeI79035S specificDataInformationTypeI79035S = (SpecificDataInformationTypeI79035S) o;
    return Objects.equals(this.dataInformation, specificDataInformationTypeI79035S.dataInformation) &&
        Objects.equals(this.dataTypeInformation, specificDataInformationTypeI79035S.dataTypeInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataInformation, dataTypeInformation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpecificDataInformationTypeI79035S {\n");
    
    sb.append("    dataInformation: ").append(toIndentedString(dataInformation)).append("\n");
    sb.append("    dataTypeInformation: ").append(toIndentedString(dataTypeInformation)).append("\n");
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

