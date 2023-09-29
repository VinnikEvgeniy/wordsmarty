package com.wordsmatry.domain.enumeration;

import java.util.Map;
import java.util.TreeMap;

/**
 * @author Yevhenii Vynnyk
 * @since 2023/07/08
 */
public enum Language {
	US("US","USA");
	private static final Map<String, Language> LANGUAGE_MAP = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);

	static {
		for (Language language : Language.values()) {
			LANGUAGE_MAP.put(language.name(), language);
			LANGUAGE_MAP.put(language.getName(), language);
			LANGUAGE_MAP.put(language.getCode(), language);

		}
	}
	private final String code;
	private final String name;

	Language(String code, String name) {
		this.code = code;
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public String getName() {
		return name;
	}

	public static Language fromString(String value) {
		return LANGUAGE_MAP.getOrDefault(value,null);
	}
}
