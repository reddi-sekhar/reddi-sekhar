package jp.co.ana.cas.resources.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * The Swagger Docket Configuration Class.
 *
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen",
    date = "2021-10-18T15:38:42.025345300+05:30[Asia/Calcutta]")
@Configuration
@EnableSwagger2
public class OpenAPIConfig {


  /**
   * Product api.
   *
   * @return docket
   */
  @Bean
  public Docket productApi() {
    return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).select()
        .apis(RequestHandlerSelectors.basePackage("jp.co.ana.cas")).paths(PathSelectors.any())
        .build();

  }

  /**
   * Api info.
   *
   * @return api information
   */
  private ApiInfo apiInfo() {

    return new ApiInfoBuilder().title("MARVEL BUSINESS API MARB-B01.")
        .description("BUSINESS API for MARVEL MARB-B01(AcquisitionOfOfficeInformation).").version("0.0.1").build();

  }
}
