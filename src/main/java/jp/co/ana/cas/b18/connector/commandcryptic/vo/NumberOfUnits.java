package jp.co.ana.cas.b18.connector.commandcryptic.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.connector.commandcryptic.vo.NumberOfUnitsDetails1;
import jp.co.ana.cas.b18.connector.commandcryptic.vo.NumberOfUnitsDetails2;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * NumberOfUnits
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T19:01:00.408185400+05:30[Asia/Calcutta]")
public class NumberOfUnits   {
  @JsonProperty("numberOfUnitsDetails1")
  private NumberOfUnitsDetails1 numberOfUnitsDetails1;

  @JsonProperty("numberOfUnitsDetails2")
  @Valid
  private List<NumberOfUnitsDetails2> numberOfUnitsDetails2 = null;

  public NumberOfUnits numberOfUnitsDetails1(NumberOfUnitsDetails1 numberOfUnitsDetails1) {
    this.numberOfUnitsDetails1 = numberOfUnitsDetails1;
    return this;
  }

  /**
   * Get numberOfUnitsDetails1
   * @return numberOfUnitsDetails1
  */
  @ApiModelProperty(value = "")

  @Valid

  public NumberOfUnitsDetails1 getNumberOfUnitsDetails1() {
    return numberOfUnitsDetails1;
  }

  public void setNumberOfUnitsDetails1(NumberOfUnitsDetails1 numberOfUnitsDetails1) {
    this.numberOfUnitsDetails1 = numberOfUnitsDetails1;
  }

  public NumberOfUnits numberOfUnitsDetails2(List<NumberOfUnitsDetails2> numberOfUnitsDetails2) {
    this.numberOfUnitsDetails2 = numberOfUnitsDetails2;
    return this;
  }

  public NumberOfUnits addNumberOfUnitsDetails2Item(NumberOfUnitsDetails2 numberOfUnitsDetails2Item) {
    if (this.numberOfUnitsDetails2 == null) {
      this.numberOfUnitsDetails2 = new ArrayList<>();
    }
    this.numberOfUnitsDetails2.add(numberOfUnitsDetails2Item);
    return this;
  }

  /**
   * Get numberOfUnitsDetails2
   * @return numberOfUnitsDetails2
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<NumberOfUnitsDetails2> getNumberOfUnitsDetails2() {
    return numberOfUnitsDetails2;
  }

  public void setNumberOfUnitsDetails2(List<NumberOfUnitsDetails2> numberOfUnitsDetails2) {
    this.numberOfUnitsDetails2 = numberOfUnitsDetails2;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NumberOfUnits numberOfUnits = (NumberOfUnits) o;
    return Objects.equals(this.numberOfUnitsDetails1, numberOfUnits.numberOfUnitsDetails1) &&
        Objects.equals(this.numberOfUnitsDetails2, numberOfUnits.numberOfUnitsDetails2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numberOfUnitsDetails1, numberOfUnitsDetails2);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NumberOfUnits {\n");
    
    sb.append("    numberOfUnitsDetails1: ").append(toIndentedString(numberOfUnitsDetails1)).append("\n");
    sb.append("    numberOfUnitsDetails2: ").append(toIndentedString(numberOfUnitsDetails2)).append("\n");
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

