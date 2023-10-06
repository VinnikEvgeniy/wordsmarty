package com.wordsmatry.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.Date;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "account")
@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class Account {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "user_id")
	private String userId;
	@Column(name = "user_info")
	private String userInfo;
	@Column(name = "device_info")
	private String deviceInfo;
	@Column(name = "settings")
	private String settings;
	@Column(name = "app_info")
	private String appInfo;
	@Column(name = "first_app_install_datetime")
	private Date firstAppInstallDatetime;
	@Column(name = "first_session_datetime")
	private Date firstSessionDatetime;
	@Column(name = "balances")
	private String balances;
	@Column(name = "language")
	private String language;
	@Column(name = "country")
	private String country;
	@Column(name = "platform")
	private String platform;
}