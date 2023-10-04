package com.wordsmatry.api;

import com.wordsmatry.domain.enumeration.Language;
import com.wordsmatry.domain.enumeration.Platform;
import com.wordsmatry.domain.record.Balance;
import com.wordsmatry.domain.record.Setting;
import java.util.Date;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class AccountDTO {
	String userId;
	String userInfo;
	String deviceInfo;
	Setting settings;
	String appInfo;
	Date firstAppInstallDatetime;
	Date firstSessionDatetime;
	Balance balances;
	Language language;
	String country;
	Platform platform;
}