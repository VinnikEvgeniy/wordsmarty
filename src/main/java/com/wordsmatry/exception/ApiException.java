package com.wordsmatry.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

/**
 * @author Yevhenii Vynnyk
 * @since 2023/10/04
 */
@Getter
@AllArgsConstructor
public class ApiException extends RuntimeException {
	private final String errorCode;
	private final String message;
	private final HttpStatus httpStatus;
}
