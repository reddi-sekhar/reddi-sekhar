package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.IndividualSecurityType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.MiscellaneousRemarkType151C;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * MiscellaneousRemarksType211S
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class MiscellaneousRemarksType211S   {
  @JsonProperty("individualSecurity")
  @Valid
  private List<IndividualSecurityType> individualSecurity = null;

  @JsonProperty("remarks")
  private MiscellaneousRemarkType151C remarks;

  public MiscellaneousRemarksType211S individualSecurity(List<IndividualSecurityType> individualSecurity) {
    this.individualSecurity = individualSecurity;
    return this;
  }

  public MiscellaneousRemarksType211S addIndividualSecurityItem(IndividualSecurityType individualSecurityItem) {
    if (this.individualSecurity == null) {
      this.individualSecurity = new ArrayList<>();
    }
    this.individualSecurity.add(individualSecurityItem);
    return this;
  }

  /**
   * Get individualSecurity
   * @return individualSecurity
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<IndividualSecurityType> getIndividualSecurity() {
    return individualSecurity;
  }

  public void setIndividualSecurity(List<IndividualSecurityType> individualSecurity) {
    this.individualSecurity = individualSecurity;
  }

  public MiscellaneousRemarksType211S remarks(MiscellaneousRemarkType151C remarks) {
    this.remarks = remarks;
    return this;
  }

  /**
   * Get remarks
   * @return remarks
  */
  @ApiModelProperty(value = "")

  @Valid

  public MiscellaneousRemarkType151C getRemarks() {
    return remarks;
  }

  public void setRemarks(MiscellaneousRemarkType151C remarks) {
    this.remarks = remarks;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MiscellaneousRemarksType211S miscellaneousRemarksType211S = (MiscellaneousRemarksType211S) o;
    return Objects.equals(this.individualSecurity, miscellaneousRemarksType211S.individualSecurity) &&
        Objects.equals(this.remarks, miscellaneousRemarksType211S.remarks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(individualSecurity, remarks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MiscellaneousRemarksType211S {\n");
    
    sb.append("    individualSecurity: ").append(toIndentedString(individualSecurity)).append("\n");
    sb.append("    remarks: ").append(toIndentedString(remarks)).append("\n");
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

