package com.joonseolee.simplewas.config

import io.swagger.v3.oas.annotations.OpenAPIDefinition
import io.swagger.v3.oas.annotations.info.Info
import org.springframework.context.annotation.Configuration

@Configuration
@OpenAPIDefinition(
    info = Info(title = "Simple WAS API Documentation", version = "v1.0"),
)
class SwaggerConfig