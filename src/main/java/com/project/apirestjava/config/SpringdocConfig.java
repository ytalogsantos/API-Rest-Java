package com.project.apirestjava.config;

import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import io.swagger.v3.oas.models.ExternalDocumentation;

import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class SpringdocConfig {
    @Bean
    public OpenAPI springShopOpenAPI() {
        return new OpenAPI()
                .info(new Info().title("Restful API to query anime information.")
                .description("Restful API with Java, Spring Boot, and Springdoc for documentation.")
                .version("1.0")
                .license(new License().name("Apache 3.0").url("http://springdoc.org")))
                .externalDocs(new ExternalDocumentation()
                        .description("Documentation's repository")
                        .url("https://github.com/ytalogsantos"));


    }
}
