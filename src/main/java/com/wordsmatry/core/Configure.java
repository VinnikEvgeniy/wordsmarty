package com.wordsmatry.core;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;
import java.util.List;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Yevhenii Vynnyk
 * @since 2023/09/26
 */
@Configuration
public class Configure {
	@Bean
	public OpenAPI openApiInformation() {
		Server localServer = new Server().url("http://localhost:8080");
		Server remoutServer = new Server().url("https://wordsmarty-api.onrender.com");
		Info info = new Info()
				.description("Docs for WordSmarty")
				.summary("Demo of WordSmarty Integration")
				.title("WordSmarty")
				.version("V1.0.0");
		return new OpenAPI().info(info).servers(List.of(localServer, remoutServer));
	}
}