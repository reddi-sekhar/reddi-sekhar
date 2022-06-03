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
 * CompanyDetailResponseDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class CompanyDetailResponseDto   {
  @JsonProperty("identification")
  private String identification;

  @JsonProperty("secondIdentification")
  private String secondIdentification;

  public CompanyDetailResponseDto identification(String identification) {
    this.identification = identification;
    return this;
  }

  /**
   * Company code
   * @return identification
  */
  @ApiModelProperty(example = "NH", value = "Company code")

@Size(min=1,max=3) 
  public String getIdentification() {
    return identification;
  }

  public void setIdentification(String identification) {
    this.identification = identification;
  }

  public CompanyDetailResponseDto secondIdentification(String secondIdentification) {
    this.secondIdentification = secondIdentification;
    return this;
  }

  /**
   * AIR segment : second airline code for joint flight number.
   * @return secondIdentification
  */
  @ApiModelProperty(value = "AIR segment : second airline code for joint flight number.")

@Size(min=1,max=4) 
  public String getSecondIdentification() {
    return secondIdentification;
  }

  public void setSecondIdentification(String secondIdentification) {
    this.secondIdentification = secondIdentification;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompanyDetailResponseDto companyDetailResponseDto = (CompanyDetailResponseDto) o;
    return Objects.equals(this.identification, companyDetailResponseDto.identification) &&
        Objects.equals(this.secondIdentification, companyDetailResponseDto.secondIdentification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identification, secondIdentification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompanyDetailResponseDto {\n");
    
    sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
    sb.append("    secondIdentification: ").append(toIndentedString(secondIdentification)).append("\n");
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

