package com.wordsmatry.controller;

import com.wordsmatry.core.constant.ApiEndpoint;
import com.wordsmatry.domain.InGameIncome;
import com.wordsmatry.service.InGameIncomeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping(ApiEndpoint.IN_GAME_INCOME)
public class InGameIncomeController {
	@Autowired
	InGameIncomeService inGameIncomeService;

	@PostMapping(ApiEndpoint.CREATE)
	public void createInGameIncome(@RequestBody InGameIncome inGameIncome) {
		inGameIncomeService.save(inGameIncome);
	}

	@DeleteMapping(ApiEndpoint.DELETE)
	public void deleteInGameIncome(@PathVariable Long id) {
		inGameIncomeService.delete(id);
	}

	@GetMapping(ApiEndpoint.FIND_BY_ID)
	public InGameIncome getInGameIncomeById(@PathVariable Long id) {
		return inGameIncomeService.findById(id);
	}

	@GetMapping(ApiEndpoint.FIND_ALL)
	public List<InGameIncome> getAllInGameIncomes() {
		return inGameIncomeService.findAll();
	}

}