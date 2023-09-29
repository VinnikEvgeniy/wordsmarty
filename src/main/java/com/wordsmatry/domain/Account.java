package com.wordsmatry.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.Date;

/**
 * @author Yevhenii Vynnyk
 * @company UnitedThinkers
 * @since 2023/06/17
 */
@Entity
@Table(name = "account")
public class Account {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	@Column(name = "user_id")
	String userId;
	@Column(name = "user_info")
	String userInfo;
	@Column(name = "device_info")
	String deviceInfo;
	@Column(name = "settings")
	String settings;
	@Column(name = "app_info")
	String appInfo;
	@Column(name = "first_app_install_datetime")
	Date firstAppInstallDatetime;
	@Column(name = "first_session_datetime")
	Date firstSessionDatetime;
	@Column(name = "balances")
	String balances;
	@Column(name = "language")
	String language;
	@Column(name = "country")
	String country;
	@Column(name = "platform")
	String platform;

	public Account() {
	}

	public Account(String userId, String userInfo, String deviceInfo, String settings, String appInfo, Date firstAppInstallDatetime, Date firstSessionDatetime, String balances, String language, String country, String platform) {
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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getSettings() {
		return settings;
	}

	public void setSettings(String settings) {
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

	public String getBalances() {
		return balances;
	}

	public void setBalances(String balances) {
		this.balances = balances;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}
}