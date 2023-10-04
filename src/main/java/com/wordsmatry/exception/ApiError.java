package com.wordsmatry.exception;

import java.time.LocalDateTime;
import lombok.Data;

/**
 * @author Yevhenii Vynnyk
 * @since 2023/10/04
 */
@Data
public class ApiError {
	private final String message;
	private final Integer statusCode;
	private final String statusName;
	private final String path;
	private final String method;
	private final LocalDateTime timestamp;
}