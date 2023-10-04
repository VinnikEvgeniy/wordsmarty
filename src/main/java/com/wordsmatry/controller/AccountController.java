package com.wordsmatry.controller;

import com.wordsmatry.api.AccountDTO;
import com.wordsmatry.core.constant.ApiEndpoint;
import com.wordsmatry.service.AccountService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Yevhenii Vynnyk
 * @since 2023/09/27
 */
@RestController
@RequestMapping(value = ApiEndpoint.ACCOUNT, produces = {MediaType.APPLICATION_JSON_VALUE})
public class AccountController {
	@Autowired
	AccountService accountService;

	@PostMapping(ApiEndpoint.CREATE)
	public String createAccount(@RequestBody AccountDTO accountDTO) {
		return accountService.save(accountDTO);
	}

	@DeleteMapping(ApiEndpoint.DELETE)
	public void deleteAccount(@PathVariable("id") String userId) {
		accountService.delete(userId);
	}

	@GetMapping(ApiEndpoint.FIND_BY_ID)
	public AccountDTO getAccountById(@PathVariable("id") String userId) {
		return accountService.findByUserId(userId);
	}

	@GetMapping(ApiEndpoint.FIND_ALL)
	public List<AccountDTO> getAllAccounts() {
		return accountService.findAll();
	}

	@PostMapping(ApiEndpoint.MODIFY)
	public AccountDTO modifyAccount(@RequestBody AccountDTO accountDTO) {
		return accountService.modify(accountDTO);
	}

}