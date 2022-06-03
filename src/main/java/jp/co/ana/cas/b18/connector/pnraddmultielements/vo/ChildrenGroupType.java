package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.QuantityTypeI65488S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ReferenceInformationType65487S;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ChildrenGroupType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class ChildrenGroupType   {
  @JsonProperty("age")
  private QuantityTypeI65488S age;

  @JsonProperty("referenceForPassenger")
  private ReferenceInformationType65487S referenceForPassenger;

  public ChildrenGroupType age(QuantityTypeI65488S age) {
    this.age = age;
    return this;
  }

  /**
   * Get age
   * @return age
  */
  @ApiModelProperty(value = "")

  @Valid

  public QuantityTypeI65488S getAge() {
    return age;
  }

  public void setAge(QuantityTypeI65488S age) {
    this.age = age;
  }

  public ChildrenGroupType referenceForPassenger(ReferenceInformationType65487S referenceForPassenger) {
    this.referenceForPassenger = referenceForPassenger;
    return this;
  }

  /**
   * Get referenceForPassenger
   * @return referenceForPassenger
  */
  @ApiModelProperty(value = "")

  @Valid

  public ReferenceInformationType65487S getReferenceForPassenger() {
    return referenceForPassenger;
  }

  public void setReferenceForPassenger(ReferenceInformationType65487S referenceForPassenger) {
    this.referenceForPassenger = referenceForPassenger;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChildrenGroupType childrenGroupType = (ChildrenGroupType) o;
    return Objects.equals(this.age, childrenGroupType.age) &&
        Objects.equals(this.referenceForPassenger, childrenGroupType.referenceForPassenger);
  }

  @Override
  public int hashCode() {
    return Objects.hash(age, referenceForPassenger);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChildrenGroupType {\n");
    
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
    sb.append("    referenceForPassenger: ").append(toIndentedString(referenceForPassenger)).append("\n");
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

