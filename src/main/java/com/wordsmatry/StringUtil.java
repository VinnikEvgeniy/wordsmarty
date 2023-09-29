package com.wordsmatry;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.util.Map;

/**
 * @author Yevhenii Vynnyk
 * @since 2023/09/28
 */
public class StringUtil {
	public static String toJson(Map<String, String> value) {
		// Создаем объект ObjectMapper из библиотеки Jackson
		ObjectMapper objectMapper = new ObjectMapper();
		try {
			// Преобразовываем строку в JSON
			return objectMapper.writeValueAsString(value);
		} catch (JsonProcessingException e) {
			// Обработка исключения, если что-то пошло не так
			e.printStackTrace();
			return null; // Или выбросьте исключение, если это необходимо
		}
	}

	public static String toJson(Object value) {
		// Создаем объект ObjectMapper из библиотеки Jackson
		ObjectMapper objectMapper = new ObjectMapper();
		try {
			// Преобразовываем строку в JSON
			return objectMapper.writeValueAsString(value);
		} catch (JsonProcessingException e) {
			// Обработка исключения, если что-то пошло не так
			e.printStackTrace();
			return null; // Или выбросьте исключение, если это необходимо
		}
	}

	public static <T> T toPojo(String json, Class<T> clazz) {
		ObjectMapper objectMapper = new ObjectMapper();
		System.out.println(json);
		try {
			return objectMapper.readValue(json, clazz);
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
}
