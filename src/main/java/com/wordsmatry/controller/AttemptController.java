package com.wordsmatry.controller;

import com.wordsmatry.core.constant.ApiEndpoint;
import com.wordsmatry.domain.Attempt;
import com.wordsmatry.service.AttemptService;
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
@RequestMapping(value = ApiEndpoint.ATTEMPT, produces = {MediaType.APPLICATION_JSON_VALUE})
public class AttemptController {
	@Autowired
	AttemptService attemptService;

	@PostMapping(ApiEndpoint.CREATE)
	public void createAttempt(@RequestBody Attempt attempt) {
		attemptService.save(attempt);
	}

	@DeleteMapping(ApiEndpoint.DELETE)
	public void deleteAttempt(@PathVariable Long id) {
		attemptService.delete(id);
	}

	@GetMapping(ApiEndpoint.FIND_BY_ID)
	public Attempt getAttemptById(@PathVariable Long id) {
		return attemptService.findById(id);
	}

	@GetMapping(ApiEndpoint.FIND_ALL)
	public List<Attempt> getAllAttempts() {
		return attemptService.findAll();
	}

}