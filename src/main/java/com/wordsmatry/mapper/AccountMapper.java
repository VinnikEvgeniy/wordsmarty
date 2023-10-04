package com.wordsmatry.mapper;

import com.wordsmatry.api.AccountDTO;
import com.wordsmatry.domain.Account;
import com.wordsmatry.domain.enumeration.Language;
import com.wordsmatry.domain.enumeration.Platform;
import com.wordsmatry.domain.record.Balance;
import com.wordsmatry.domain.record.Setting;
import com.wordsmatry.util.StringUtil;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;

@Service
public final class AccountMapper implements Mapper<AccountDTO, Account> {
	@Override
	public Account toEntity(AccountDTO api) {
		return Account.builder()
				.userId(api.getUserId())
				.userInfo(api.getUserInfo())
				.deviceInfo(api.getDeviceInfo())
				.settings(StringUtil.toJson(api.getSettings()))
				.appInfo(api.getAppInfo())
				.firstAppInstallDatetime(api.getFirstAppInstallDatetime())
				.firstSessionDatetime(api.getFirstSessionDatetime())
				.balances(StringUtil.toJson(api.getBalances()))
				.language(api.getLanguage().getCode())
				.country(api.getCountry())
				.platform(api.getPlatform().getName())
				.build();
	}

	@Override
	public AccountDTO toApi(Account entity) {
		return AccountDTO.builder()
				.userId(entity.getUserId())
				.userInfo(entity.getUserInfo())
				.deviceInfo(entity.getDeviceInfo())
				.settings(StringUtil.toPojo(entity.getSettings(), Setting.class))
				.appInfo(entity.getAppInfo())
				.firstAppInstallDatetime(entity.getFirstAppInstallDatetime())
				.firstSessionDatetime(entity.getFirstSessionDatetime())
				.balances(StringUtil.toPojo(entity.getBalances(), Balance.class))
				.language(Language.fromString(entity.getLanguage()))
				.country(entity.getCountry())
				.platform(Platform.fromString(entity.getPlatform()))
				.build();
	}

	@Override
	public List<Account> toEntity(List<AccountDTO> accountDTOs) {
		return accountDTOs.stream()
				.map(this::toEntity)
				.collect(Collectors.toList());
	}

	@Override
	public List<AccountDTO> toApi(List<Account> accounts) {
		return accounts.stream()
				.map(this::toApi)
				.collect(Collectors.toList());
	}
}
