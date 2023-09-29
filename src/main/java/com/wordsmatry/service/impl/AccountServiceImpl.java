package com.wordsmatry.service.impl;

import com.wordsmatry.StringUtil;
import com.wordsmatry.api.AccountDTO;
import com.wordsmatry.core.fieldname.FieldName;
import com.wordsmatry.domain.Account;
import com.wordsmatry.mapper.AccountMapper;
import com.wordsmatry.repository.AccountRepository;
import com.wordsmatry.service.AccountService;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Yevhenii Vynnyk
 * @since 2023/09/27
 */
@Service
public class AccountServiceImpl implements AccountService {
	@Autowired
	AccountRepository accountRepository;

	@Override
	public String save(AccountDTO accountDTO) {
		accountDTO.setUserId(java.util.UUID.randomUUID().toString());
		Account account = AccountMapper.toEntity(accountDTO);
		return StringUtil.toJson(Map.of(FieldName.ACCOUNT_USER_ID, accountRepository.save(account).getUserId()));
	}

	@Override
	public void modify(AccountDTO accountDTO) {

	}

	@Override
	public void delete(String userId) {
		accountRepository.deleteByUserId(userId);
	}

	@Override
	public AccountDTO findByUserId(String userId) {
		Account account = accountRepository.findByUserId(userId);
		return account == null ? null : AccountMapper.toDto(account);
	}

	@Override
	public List<AccountDTO> findAll() {
		return accountRepository.findAll().stream().map(AccountMapper::toDto).toList();
	}
}