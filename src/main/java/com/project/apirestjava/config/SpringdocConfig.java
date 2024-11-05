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
                .info(new Info().title("API Restful para listagem e consulta de animes")
                .description("Exemplo de API Restful utilizando Java e Spring Boot, com Springdoc para documentação.")
                .version("1.0")
                .license(new License().name("Apache 3.0").url("http://springdoc.org")))
                .externalDocs(new ExternalDocumentation()
                        .description("Repositório da documentação")
                        .url("https://github.com/ytalogsantos"));


    }
}
