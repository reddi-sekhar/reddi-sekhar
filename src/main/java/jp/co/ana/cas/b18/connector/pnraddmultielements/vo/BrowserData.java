package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.BrowserInformationType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.FreeTextInformationType94526S;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BrowserData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class BrowserData   {
  @JsonProperty("browserProperties")
  private BrowserInformationType browserProperties;

  @JsonProperty("freeFlowBrowserData")
  @Valid
  private List<FreeTextInformationType94526S> freeFlowBrowserData = null;

  public BrowserData browserProperties(BrowserInformationType browserProperties) {
    this.browserProperties = browserProperties;
    return this;
  }

  /**
   * Get browserProperties
   * @return browserProperties
  */
  @ApiModelProperty(value = "")

  @Valid

  public BrowserInformationType getBrowserProperties() {
    return browserProperties;
  }

  public void setBrowserProperties(BrowserInformationType browserProperties) {
    this.browserProperties = browserProperties;
  }

  public BrowserData freeFlowBrowserData(List<FreeTextInformationType94526S> freeFlowBrowserData) {
    this.freeFlowBrowserData = freeFlowBrowserData;
    return this;
  }

  public BrowserData addFreeFlowBrowserDataItem(FreeTextInformationType94526S freeFlowBrowserDataItem) {
    if (this.freeFlowBrowserData == null) {
      this.freeFlowBrowserData = new ArrayList<>();
    }
    this.freeFlowBrowserData.add(freeFlowBrowserDataItem);
    return this;
  }

  /**
   * Get freeFlowBrowserData
   * @return freeFlowBrowserData
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<FreeTextInformationType94526S> getFreeFlowBrowserData() {
    return freeFlowBrowserData;
  }

  public void setFreeFlowBrowserData(List<FreeTextInformationType94526S> freeFlowBrowserData) {
    this.freeFlowBrowserData = freeFlowBrowserData;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrowserData browserData = (BrowserData) o;
    return Objects.equals(this.browserProperties, browserData.browserProperties) &&
        Objects.equals(this.freeFlowBrowserData, browserData.freeFlowBrowserData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(browserProperties, freeFlowBrowserData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrowserData {\n");
    
    sb.append("    browserProperties: ").append(toIndentedString(browserProperties)).append("\n");
    sb.append("    freeFlowBrowserData: ").append(toIndentedString(freeFlowBrowserData)).append("\n");
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

