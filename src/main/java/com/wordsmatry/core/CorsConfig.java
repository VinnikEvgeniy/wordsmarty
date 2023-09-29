package com.wordsmatry.core;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class CorsConfig implements WebMvcConfigurer {

	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry
				.addMapping("/**") // Разрешает CORS для всех путей
				.allowedOrigins("*") // Разрешенный источник (может быть "*", чтобы разрешить из любого источника)
				.allowedMethods("GET", "POST") // Разрешенные HTTP-методы (GET, POST, PUT, DELETE и др.)
				.allowedHeaders("*"); // Разрешенные заголовки
	}
}
