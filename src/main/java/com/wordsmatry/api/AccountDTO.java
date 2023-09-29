package com.wordsmatry.api;

import com.wordsmatry.domain.enumeration.Language;
import com.wordsmatry.domain.enumeration.Platform;
import com.wordsmatry.domain.record.Balance;
import com.wordsmatry.domain.record.Setting;
import java.util.Date;

/**
 * @author Yevhenii Vynnyk
 * @since 2023/09/28
 */
public class AccountDTO {
	private String userId;
	private String userInfo;
	private String deviceInfo;
	private Setting settings;
	private String appInfo;
	private Date firstAppInstallDatetime;
	private Date firstSessionDatetime;
	private Balance balances;
	private Language language;
	private String country;
	private Platform platform;

	public AccountDTO() {
	}

	public AccountDTO(String userId, String userInfo, String deviceInfo, Setting settings, String appInfo, Date firstAppInstallDatetime, Date firstSessionDatetime, Balance balances, Language language, String country, Platform platform) {
		this.userId = userId;
		this.userInfo = userInfo;
		this.deviceInfo = deviceInfo;
		this.settings = settings;
		this.appInfo = appInfo;
		this.firstAppInstallDatetime = firstAppInstallDatetime;
		this.firstSessionDatetime = firstSessionDatetime;
		this.balances = balances;
		this.language = language;
		this.country = country;
		this.platform = platform;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(String userInfo) {
		this.userInfo = userInfo;
	}

	public String getDeviceInfo() {
		return deviceInfo;
	}

	public void setDeviceInfo(String deviceInfo) {
		this.deviceInfo = deviceInfo;
	}

	public Setting getSettings() {
		return settings;
	}

	public void setSettings(Setting settings) {
		this.settings = settings;
	}

	public String getAppInfo() {
		return appInfo;
	}

	public void setAppInfo(String appInfo) {
		this.appInfo = appInfo;
	}

	public Date getFirstAppInstallDatetime() {
		return firstAppInstallDatetime;
	}

	public void setFirstAppInstallDatetime(Date firstAppInstallDatetime) {
		this.firstAppInstallDatetime = firstAppInstallDatetime;
	}

	public Date getFirstSessionDatetime() {
		return firstSessionDatetime;
	}

	public void setFirstSessionDatetime(Date firstSessionDatetime) {
		this.firstSessionDatetime = firstSessionDatetime;
	}

	public Balance getBalances() {
		return balances;
	}

	public void setBalances(Balance balances) {
		this.balances = balances;
	}

	public Language getLanguage() {
		return language;
	}

	public void setLanguage(Language language) {
		this.language = language;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Platform getPlatform() {
		return platform;
	}

	public void setPlatform(Platform platform) {
		this.platform = platform;
	}
}
