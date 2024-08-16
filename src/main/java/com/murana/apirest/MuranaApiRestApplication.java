package com.murana.apirest;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.murana.apirest.constants.AppConstants;

@SpringBootApplication
public class MuranaApiRestApplication {

    public static void main(String[] args) {
        SpringApplication.run(MuranaApiRestApplication.class, args);
    }

    @Bean
    public OpenAPI getOpenApiDocumentation(){
        return new OpenAPI().info(new Info().title(AppConstants.API_REST_TITLE).
                version(AppConstants.API_REST_VERSION));
    }

}
