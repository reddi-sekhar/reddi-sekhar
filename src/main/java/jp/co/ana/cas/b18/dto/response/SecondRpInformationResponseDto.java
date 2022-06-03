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
 * SecondRpInformationResponseDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class SecondRpInformationResponseDto   {
  @JsonProperty("creationOfficeId")
  private String creationOfficeId;

  @JsonProperty("creationDate")
  private String creationDate;

  @JsonProperty("creationTime")
  private String creationTime;

  public SecondRpInformationResponseDto creationOfficeId(String creationOfficeId) {
    this.creationOfficeId = creationOfficeId;
    return this;
  }

  /**
   * Creation office
   * @return creationOfficeId
  */
  @ApiModelProperty(example = "TYONH0980", value = "Creation office")

@Size(min=1,max=9) 
  public String getCreationOfficeId() {
    return creationOfficeId;
  }

  public void setCreationOfficeId(String creationOfficeId) {
    this.creationOfficeId = creationOfficeId;
  }

  public SecondRpInformationResponseDto creationDate(String creationDate) {
    this.creationDate = creationDate;
    return this;
  }

  /**
   * Creation agent sine/queue category (eg: 1234AA)
   * @return creationDate
  */
  @ApiModelProperty(example = "20322", value = "Creation agent sine/queue category (eg: 1234AA)")

@Size(min=1,max=6) 
  public String getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(String creationDate) {
    this.creationDate = creationDate;
  }

  public SecondRpInformationResponseDto creationTime(String creationTime) {
    this.creationTime = creationTime;
    return this;
  }

  /**
   * PNR creation time
   * @return creationTime
  */
  @ApiModelProperty(example = "458.0", value = "PNR creation time")

@Pattern(regexp="([0-1][0-9]|2[0-3])[0-5][0-9]") 
  public String getCreationTime() {
    return creationTime;
  }

  public void setCreationTime(String creationTime) {
    this.creationTime = creationTime;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecondRpInformationResponseDto secondRpInformationResponseDto = (SecondRpInformationResponseDto) o;
    return Objects.equals(this.creationOfficeId, secondRpInformationResponseDto.creationOfficeId) &&
        Objects.equals(this.creationDate, secondRpInformationResponseDto.creationDate) &&
        Objects.equals(this.creationTime, secondRpInformationResponseDto.creationTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creationOfficeId, creationDate, creationTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecondRpInformationResponseDto {\n");
    
    sb.append("    creationOfficeId: ").append(toIndentedString(creationOfficeId)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
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

