package com.easyshop.products.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * The Class SwaggerConfig is only for Swagger documentation
 *
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

  /**
   * Provides basic docket api for the application
   *
   * @return the docket
   */
  /*@Bean
  public Docket api() {
    System.out.println("Here**************");
    return new Docket(DocumentationType.SWAGGER_2)
        .select()
        .apis(RequestHandlerSelectors.basePackage("com.easyshop.products"))
        .paths(PathSelectors.any())
        .build()
        .apiInfo(apiInfo());
  }*/
  @Bean
  public Docket api() {
    return new Docket(DocumentationType.SWAGGER_2)
            .select()
            //.apis(RequestHandlerSelectors.basePackage("com.easyshop.products"))
            .apis(RequestHandlerSelectors.any())
            .paths(PathSelectors.any())
            .build();
            //.apiInfo(apiInfo());
  }

  /**
   * Provides the basic api meta data information.
   *
   * @return the api info
   */
  /*private ApiInfo apiInfo() {
    return new ApiInfoBuilder()
        .title("Easy Shop Product Info REST API")
        .description("Product Info Apis provide the rest end points to get details and update the product details in easy shop application")
        .termsOfServiceUrl("http://springfox.io")
        .contact(
            new Contact(
                "Praveen Belkar", "", "praveenbelkar18@gmail.com"))
        .version("0.0.1")
        .build();
  }*/
  private ApiInfo apiInfo() {
    return new ApiInfoBuilder()
            .title("Easy Migrator (EM) REST API")
            .description("Easy Migrator is an application which provides swift installation of VxRail")
            .termsOfServiceUrl("http://springfox.io")
            .contact(
                    new Contact(
                            "DellEmc", "http://www.dellemc.com/en-us/index.htm", "debadatta.mishra@emc.com"))
            .license("DellEmc Easy Migrator Version 0.0.1")
            .licenseUrl(
                    "http://www.dell.com/learn/us/en/uscorp1/terms-conditions/art-dell-end-user-license-agreement")
            .version("0.0.1")
            .build();
  }

}
