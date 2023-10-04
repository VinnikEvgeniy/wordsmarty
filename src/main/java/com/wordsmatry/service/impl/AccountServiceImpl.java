package com.wordsmatry.service.impl;

import com.wordsmatry.api.AccountDTO;
import com.wordsmatry.core.fieldname.FieldName;
import com.wordsmatry.domain.Account;
import com.wordsmatry.exception.ApiError;
import com.wordsmatry.exception.ApiException;
import com.wordsmatry.exception.ErrorCode;
import com.wordsmatry.mapper.AccountMapper;
import com.wordsmatry.repository.AccountRepository;
import com.wordsmatry.service.AccountService;
import com.wordsmatry.util.StringUtil;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

/**
 * @author Yevhenii Vynnyk
 * @since 2023/09/27
 */
@Service
public class AccountServiceImpl implements AccountService {
	@Autowired
	AccountRepository accountRepository;
	@Autowired
	AccountMapper accountMapper;

	@Override
	public String save(AccountDTO accountDTO) {
		Account account = accountMapper.toEntity(accountDTO);
		account = accountRepository.save(account);
		account = accountRepository.findById(account.getId()).orElseThrow();
		return StringUtil.toJson(Map.of(FieldName.ACCOUNT_USER_ID, account.getUserId()));
	}

	@Override
	public AccountDTO modify(AccountDTO accountDTO) {
		if (accountDTO != null && accountDTO.getUserId() != null && accountDTO.getUserId().isBlank()) {
			Long id = accountRepository.findByUserId(accountDTO.getUserId())
					.orElseThrow(() -> new ApiException(
							"account-not-found",
							String.format("Account with userId=%s not found", accountDTO.getUserId()),
							HttpStatus.NOT_FOUND))
					.getId();
			Account account = accountMapper.toEntity(accountDTO);
			account.setId(id);
			account = accountRepository.save(account);
			account = accountRepository.findById(account.getId()).orElseThrow();
			return accountMapper.toApi(account);
		}
		throw new ApiException(
				"parameter-is-missing",
				"Field userId is missing",
				HttpStatus.BAD_REQUEST);
	}

	@Override
	public void delete(String userId) {
		accountRepository.deleteByUserId(userId);
	}

	@Override
	public AccountDTO findByUserId(String userId) {
		Account account = accountRepository.findByUserId(userId).orElseThrow(() -> new ApiException(
				"account-not-found",
				String.format("Account with userId=%s not found", userId),
				HttpStatus.NOT_FOUND));
		return accountMapper.toApi(account);
	}

	@Override
	public List<AccountDTO> findAll() {
		return accountRepository.findAll().stream().map(accountMapper::toApi).toList();
	}
}