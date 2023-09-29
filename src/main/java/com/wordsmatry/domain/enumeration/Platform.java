package com.wordsmatry.domain.enumeration;

import java.util.Map;
import java.util.TreeMap;

/**
 * @author Yevhenii Vynnyk
 * @since 2023/07/08
 */
public enum Platform {
	ANDROID("Android"),
	IOS("iOS");

	private static final Map<String, Platform> PLATFORM_MAP = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);

	static {
		for (Platform platform : Platform.values()) {
			PLATFORM_MAP.put(platform.name(), platform);
			PLATFORM_MAP.put(platform.getName(), platform);
		}
	}

	private final String name;

	Platform(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public static Platform fromString(String value) {
		return PLATFORM_MAP.getOrDefault(value, null);
	}
}