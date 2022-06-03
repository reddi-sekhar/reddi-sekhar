package jp.co.ana.cas.b18.dto.response;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.dto.response.ClassCombinaisonResponseDto;
import jp.co.ana.cas.b18.dto.response.OndyieldGroupResponseDto;
import jp.co.ana.cas.b18.dto.response.YieldInformationsResponseDto;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * YieldDataGroupResponseDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class YieldDataGroupResponseDto   {
  @JsonProperty("yieldInformations")
  private YieldInformationsResponseDto yieldInformations;

  @JsonProperty("classCombinaison")
  private ClassCombinaisonResponseDto classCombinaison;

  @JsonProperty("ondyield")
  private OndyieldGroupResponseDto ondyield;

  public YieldDataGroupResponseDto yieldInformations(YieldInformationsResponseDto yieldInformations) {
    this.yieldInformations = yieldInformations;
    return this;
  }

  /**
   * Get yieldInformations
   * @return yieldInformations
  */
  @ApiModelProperty(value = "")

  @Valid

  public YieldInformationsResponseDto getYieldInformations() {
    return yieldInformations;
  }

  public void setYieldInformations(YieldInformationsResponseDto yieldInformations) {
    this.yieldInformations = yieldInformations;
  }

  public YieldDataGroupResponseDto classCombinaison(ClassCombinaisonResponseDto classCombinaison) {
    this.classCombinaison = classCombinaison;
    return this;
  }

  /**
   * Get classCombinaison
   * @return classCombinaison
  */
  @ApiModelProperty(value = "")

  @Valid

  public ClassCombinaisonResponseDto getClassCombinaison() {
    return classCombinaison;
  }

  public void setClassCombinaison(ClassCombinaisonResponseDto classCombinaison) {
    this.classCombinaison = classCombinaison;
  }

  public YieldDataGroupResponseDto ondyield(OndyieldGroupResponseDto ondyield) {
    this.ondyield = ondyield;
    return this;
  }

  /**
   * Get ondyield
   * @return ondyield
  */
  @ApiModelProperty(value = "")

  @Valid

  public OndyieldGroupResponseDto getOndyield() {
    return ondyield;
  }

  public void setOndyield(OndyieldGroupResponseDto ondyield) {
    this.ondyield = ondyield;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    YieldDataGroupResponseDto yieldDataGroupResponseDto = (YieldDataGroupResponseDto) o;
    return Objects.equals(this.yieldInformations, yieldDataGroupResponseDto.yieldInformations) &&
        Objects.equals(this.classCombinaison, yieldDataGroupResponseDto.classCombinaison) &&
        Objects.equals(this.ondyield, yieldDataGroupResponseDto.ondyield);
  }

  @Override
  public int hashCode() {
    return Objects.hash(yieldInformations, classCombinaison, ondyield);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class YieldDataGroupResponseDto {\n");
    
    sb.append("    yieldInformations: ").append(toIndentedString(yieldInformations)).append("\n");
    sb.append("    classCombinaison: ").append(toIndentedString(classCombinaison)).append("\n");
    sb.append("    ondyield: ").append(toIndentedString(ondyield)).append("\n");
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

