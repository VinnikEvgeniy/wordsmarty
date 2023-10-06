package com.wordsmatry.controller;

import com.wordsmatry.api.InGameResourceSpendingDTO;
import com.wordsmatry.core.constant.ApiEndpoint;
import com.wordsmatry.service.InGameResourceSpendingService;
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
@RequestMapping(value = ApiEndpoint.IN_GAME_RESOURCE_SPENDING, produces = {MediaType.APPLICATION_JSON_VALUE})
public class InGameResourceSpendingController {
	@Autowired
	InGameResourceSpendingService inGameResourceSpendingService;

	@PostMapping(ApiEndpoint.CREATE)
	public void createInGameResourceSpending(@RequestBody InGameResourceSpendingDTO inGameResourceSpending) {
		inGameResourceSpendingService.save(inGameResourceSpending);
	}

	@DeleteMapping(ApiEndpoint.DELETE)
	public void deleteInGameResourceSpending(@PathVariable Long id) {
		inGameResourceSpendingService.delete(id);
	}

	@GetMapping(ApiEndpoint.FIND_BY_ID)
	public InGameResourceSpendingDTO getInGameResourceSpendingById(@PathVariable Long id) {
		return inGameResourceSpendingService.findById(id);
	}

	@GetMapping(ApiEndpoint.FIND_ALL)
	public List<InGameResourceSpendingDTO> getAllInGameResourceSpendings() {
		return inGameResourceSpendingService.findAll();
	}

}