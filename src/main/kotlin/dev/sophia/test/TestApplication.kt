package dev.sophia.test

import io.swagger.v3.oas.models.info.Info
import io.swagger.v3.oas.models.OpenAPI
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@SpringBootApplication
class TestApplication

fun main(args: Array<String>) {
	runApplication<TestApplication>(*args)
}

@Configuration
class SwaggerConfig {
	@Bean
	fun customOpenAPI(): OpenAPI {
		return OpenAPI()
			.info(Info().title("Sample API"))
	}
}