package com.wordsmatry.controller;

import com.wordsmatry.api.InGameIncomeDTO;
import com.wordsmatry.core.constant.ApiEndpoint;
import com.wordsmatry.service.InGameIncomeService;
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
@RequestMapping(value = ApiEndpoint.IN_GAME_INCOME, produces = {MediaType.APPLICATION_JSON_VALUE})
public class InGameIncomeController {
	@Autowired
	InGameIncomeService inGameIncomeService;

	@PostMapping(ApiEndpoint.CREATE)
	public void createInGameIncome(@RequestBody InGameIncomeDTO inGameIncome) {
		inGameIncomeService.save(inGameIncome);
	}

	@DeleteMapping(ApiEndpoint.DELETE)
	public void deleteInGameIncome(@PathVariable Long id) {
		inGameIncomeService.delete(id);
	}

	@GetMapping(ApiEndpoint.FIND_BY_ID)
	public InGameIncomeDTO getInGameIncomeById(@PathVariable Long id) {
		return inGameIncomeService.findById(id);
	}

	@GetMapping(ApiEndpoint.FIND_ALL)
	public List<InGameIncomeDTO> getAllInGameIncomes() {
		return inGameIncomeService.findAll();
	}

}