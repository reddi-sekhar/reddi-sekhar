package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.SpecialRequirementsDataDetailsTypeI1;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.SpecialRequirementsTypeDetailsTypeI1;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SpecialRequirementsDetailsTypeI1
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class SpecialRequirementsDetailsTypeI1   {
  @JsonProperty("ssr")
  private SpecialRequirementsTypeDetailsTypeI1 ssr;

  @JsonProperty("ssrb")
  @Valid
  private List<SpecialRequirementsDataDetailsTypeI1> ssrb = null;

  public SpecialRequirementsDetailsTypeI1 ssr(SpecialRequirementsTypeDetailsTypeI1 ssr) {
    this.ssr = ssr;
    return this;
  }

  /**
   * Get ssr
   * @return ssr
  */
  @ApiModelProperty(value = "")

  @Valid

  public SpecialRequirementsTypeDetailsTypeI1 getSsr() {
    return ssr;
  }

  public void setSsr(SpecialRequirementsTypeDetailsTypeI1 ssr) {
    this.ssr = ssr;
  }

  public SpecialRequirementsDetailsTypeI1 ssrb(List<SpecialRequirementsDataDetailsTypeI1> ssrb) {
    this.ssrb = ssrb;
    return this;
  }

  public SpecialRequirementsDetailsTypeI1 addSsrbItem(SpecialRequirementsDataDetailsTypeI1 ssrbItem) {
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

  public List<SpecialRequirementsDataDetailsTypeI1> getSsrb() {
    return ssrb;
  }

  public void setSsrb(List<SpecialRequirementsDataDetailsTypeI1> ssrb) {
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
    SpecialRequirementsDetailsTypeI1 specialRequirementsDetailsTypeI1 = (SpecialRequirementsDetailsTypeI1) o;
    return Objects.equals(this.ssr, specialRequirementsDetailsTypeI1.ssr) &&
        Objects.equals(this.ssrb, specialRequirementsDetailsTypeI1.ssrb);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ssr, ssrb);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpecialRequirementsDetailsTypeI1 {\n");
    
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

