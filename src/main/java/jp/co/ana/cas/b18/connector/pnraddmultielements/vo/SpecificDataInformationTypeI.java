package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.DataInformationTypeI35753C;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.DataTypeInformationTypeI;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SpecificDataInformationTypeI
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class SpecificDataInformationTypeI   {
  @JsonProperty("dataInformation")
  private DataInformationTypeI35753C dataInformation;

  @JsonProperty("dataTypeInformation")
  private DataTypeInformationTypeI dataTypeInformation;

  public SpecificDataInformationTypeI dataInformation(DataInformationTypeI35753C dataInformation) {
    this.dataInformation = dataInformation;
    return this;
  }

  /**
   * Get dataInformation
   * @return dataInformation
  */
  @ApiModelProperty(value = "")

  @Valid

  public DataInformationTypeI35753C getDataInformation() {
    return dataInformation;
  }

  public void setDataInformation(DataInformationTypeI35753C dataInformation) {
    this.dataInformation = dataInformation;
  }

  public SpecificDataInformationTypeI dataTypeInformation(DataTypeInformationTypeI dataTypeInformation) {
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
    SpecificDataInformationTypeI specificDataInformationTypeI = (SpecificDataInformationTypeI) o;
    return Objects.equals(this.dataInformation, specificDataInformationTypeI.dataInformation) &&
        Objects.equals(this.dataTypeInformation, specificDataInformationTypeI.dataTypeInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataInformation, dataTypeInformation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpecificDataInformationTypeI {\n");
    
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

