package com.wordsmatry.domain.enumeration;

/**
 * @author Yevhenii Vynnyk
 * @since 2023/07/08
 */
public enum Country {
	UnitedKingdom("UK", "United Kingdom"),
	Russia("RU", "Russia"),
	UnitedStates("US", "United States"),
	China("CN", "China"),
	India("IN", "India"),
	Brazil("BR", "Brazil"),
	Japan("JP", "Japan"),
	Germany("DE", "Germany"),
	Indonesia("ID", "Indonesia"),
	France("FR", "France"),
	Italy("IT", "Italy"),
	Mexico("MX", "Mexico"),
	Spain("ES", "Spain"),
	Turkey("TR", "Turkey"),
	Poland("PL", "Poland"),
	Canada("CA", "Canada"),
	Australia("AU", "Australia"),
	Netherlands("NL", "Netherlands"),
	SouthKorea("KR", "South Korea");

	private final String countryCode;
	private final String countryName;

	private Country(String countryCode, String countryName) {
		this.countryCode = countryCode;
		this.countryName = countryName;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public String getCountryName() {
		return countryName;
	}

	public static Country fromString(String value) {
		if (value != null) {
			for (Country country : Country.values()) {
				if (country.getCountryCode().equalsIgnoreCase(value)) {
					return country;
				}
				if (country.getCountryName().equalsIgnoreCase(value)) {
					return country;
				}
			}
		}
		return null;
	}
}

