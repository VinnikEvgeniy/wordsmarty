package com.wordsmatry.mapper;

import com.wordsmatry.StringUtil;
import com.wordsmatry.api.AccountDTO;
import com.wordsmatry.domain.Account;
import com.wordsmatry.domain.enumeration.Language;
import com.wordsmatry.domain.enumeration.Platform;
import com.wordsmatry.domain.record.Balance;
import com.wordsmatry.domain.record.Setting;

/**
 * @author Yevhenii Vynnyk
 * @since 2023/09/28
 */
public final class AccountMapper {
	public static Account toEntity(AccountDTO accountDTO) {
		return new Account(accountDTO.getUserId(),
				accountDTO.getUserInfo(),
				accountDTO.getDeviceInfo(),
				StringUtil.toJson(accountDTO.getSettings()),
				accountDTO.getAppInfo(),
				accountDTO.getFirstAppInstallDatetime(),
				accountDTO.getFirstSessionDatetime(),
				StringUtil.toJson(accountDTO.getBalances()),
				accountDTO.getLanguage().getName(),
				accountDTO.getCountry(),
				accountDTO.getPlatform().getName());
	}

	public static AccountDTO toDto(Account account) {
		return new AccountDTO(account.getUserId(),
				account.getUserInfo(),
				account.getDeviceInfo(),
				StringUtil.toPojo(account.getSettings(), Setting.class),
				account.getAppInfo(),
				account.getFirstAppInstallDatetime(),
				account.getFirstSessionDatetime(),
				StringUtil.toPojo(account.getBalances(), Balance.class),
				Language.fromString(account.getLanguage()),
				account.getCountry(),
				Platform.fromString(account.getPlatform()));
	}
}
