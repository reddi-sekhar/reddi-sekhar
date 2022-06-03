package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.SpecialRequirementsDataDetailsTypeI;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.SpecialRequirementsTypeDetailsTypeI;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SpecialRequirementsDetailsTypeI
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class SpecialRequirementsDetailsTypeI   {
  @JsonProperty("ssr")
  private SpecialRequirementsTypeDetailsTypeI ssr;

  @JsonProperty("ssrb")
  @Valid
  private List<SpecialRequirementsDataDetailsTypeI> ssrb = null;

  public SpecialRequirementsDetailsTypeI ssr(SpecialRequirementsTypeDetailsTypeI ssr) {
    this.ssr = ssr;
    return this;
  }

  /**
   * Get ssr
   * @return ssr
  */
  @ApiModelProperty(value = "")

  @Valid

  public SpecialRequirementsTypeDetailsTypeI getSsr() {
    return ssr;
  }

  public void setSsr(SpecialRequirementsTypeDetailsTypeI ssr) {
    this.ssr = ssr;
  }

  public SpecialRequirementsDetailsTypeI ssrb(List<SpecialRequirementsDataDetailsTypeI> ssrb) {
    this.ssrb = ssrb;
    return this;
  }

  public SpecialRequirementsDetailsTypeI addSsrbItem(SpecialRequirementsDataDetailsTypeI ssrbItem) {
    if (this.ssrb == null) {
      this.ssrb = new ArrayList<>();
    }
    this.ssrb.add(ssrbItem);
    return this;
  }

  /**
   * Get ssrb
   * @return ssrb
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<SpecialRequirementsDataDetailsTypeI> getSsrb() {
    return ssrb;
  }

  public void setSsrb(List<SpecialRequirementsDataDetailsTypeI> ssrb) {
    this.ssrb = ssrb;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpecialRequirementsDetailsTypeI specialRequirementsDetailsTypeI = (SpecialRequirementsDetailsTypeI) o;
    return Objects.equals(this.ssr, specialRequirementsDetailsTypeI.ssr) &&
        Objects.equals(this.ssrb, specialRequirementsDetailsTypeI.ssrb);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ssr, ssrb);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpecialRequirementsDetailsTypeI {\n");
    
    sb.append("    ssr: ").append(toIndentedString(ssr)).append("\n");
    sb.append("    ssrb: ").append(toIndentedString(ssrb)).append("\n");
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

