package com.wordsmatry.service;

import com.wordsmatry.api.AccountDTO;
import com.wordsmatry.domain.Account;
import java.util.List;

/**
 * @author Yevhenii Vynnyk
 * @since 2023/09/27
 */
public interface AccountService {
	String save(AccountDTO accountDTO);

	void modify(AccountDTO accountDTO);

	void delete(String userId);

	AccountDTO findByUserId(String userId);

	List<AccountDTO> findAll();
}
