package jp.co.ana.cas.b18.dto.response;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * StatusDetailsResponseDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class StatusDetailsResponseDto   {
  @JsonProperty("isPNRModifDuringTrans")
  private String isPNRModifDuringTrans;

  public StatusDetailsResponseDto isPNRModifDuringTrans(String isPNRModifDuringTrans) {
    this.isPNRModifDuringTrans = isPNRModifDuringTrans;
    return this;
  }

  /**
   * if the PNR has been modifed since it has been retrieved
   * @return isPNRModifDuringTrans
  */
  @ApiModelProperty(example = "MOD", value = "if the PNR has been modifed since it has been retrieved")

@Size(min=1,max=3) 
  public String getIsPNRModifDuringTrans() {
    return isPNRModifDuringTrans;
  }

  public void setIsPNRModifDuringTrans(String isPNRModifDuringTrans) {
    this.isPNRModifDuringTrans = isPNRModifDuringTrans;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatusDetailsResponseDto statusDetailsResponseDto = (StatusDetailsResponseDto) o;
    return Objects.equals(this.isPNRModifDuringTrans, statusDetailsResponseDto.isPNRModifDuringTrans);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isPNRModifDuringTrans);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusDetailsResponseDto {\n");
    
    sb.append("    isPNRModifDuringTrans: ").append(toIndentedString(isPNRModifDuringTrans)).append("\n");
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

