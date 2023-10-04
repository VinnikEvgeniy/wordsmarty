package com.wordsmatry.exception;

/**
 * @author Yevhenii Vynnyk
 * @since 2023/10/04
 */
public enum ErrorCode {
	NOT_FOUND("Not found!");
	private final String value;

	ErrorCode(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
