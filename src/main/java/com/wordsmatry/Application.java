package com.wordsmatry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;

/**
 * @author Yevhenii Vynnyk
 * @since 2023/09/26
 */
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public OpenAPI openApiInformation() {
		Server localServer = new Server().url("http://localhost:8080");
		Info info = new Info()
				.description("Docs for WordSmarty")
				.summary("Demo of WordSmarty Integration")
				.title("WordSmarty")
				.version("V1.0.0");
		return new OpenAPI().info(info).addServersItem(localServer);
	}
}