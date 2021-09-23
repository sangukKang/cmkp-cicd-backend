/**
 * Project: SKT MarketPlace
 *
 * <p>Copyright (c) 2021 Bespinglobal
 *
 * <p>This software is STK MP Launcher
 */
package com.bespinglobal.backend.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 *
 *
 * <pre>
 * service           : backend
 * package           : com.bespinglobal.backend.config
 * class             : SwaggerConfig
 * description       :
 *
 * ====================================================================================
 *
 * </pre>
 *
 * @author minji.hong
 * @version 1.0.0
 * @date 2021/09/23
 */
@Configuration
@EnableSwagger2
@EnableWebMvc
public class SwaggerConfig implements WebMvcConfigurer {

  @Override
  public void addResourceHandlers(ResourceHandlerRegistry registry) {
    registry
        .addResourceHandler("swagger-ui.html")
        .addResourceLocations("classpath:/META-INF/resources/");

    registry
        .addResourceHandler("/webjars/**")
        .addResourceLocations("classpath:/META-INF/resources/webjars/");
  }

  @Bean
  public Docket docket() {
    return new Docket(DocumentationType.SWAGGER_2)
        .select()
        .apis(RequestHandlerSelectors.any())
        .apis(RequestHandlerSelectors.basePackage("com.bespinglobal.backend.controller"))
        .paths(PathSelectors.any())
        .build()
        .apiInfo(apiInfo())
        .useDefaultResponseMessages(false);
  }

  private ApiInfo apiInfo() {
    return new ApiInfoBuilder()
        .title("Launcher Backend Sample App")
        .version("1.0")
        .description("REST API for test")
        .license("Bespinglobal")
        .build();
  }
}
