package com.wordsmatry.controller;

import com.wordsmatry.core.constant.ApiEndpoint;
import com.wordsmatry.domain.Attempt;
import com.wordsmatry.domain.AttemptDailyPuzzle;
import com.wordsmatry.service.AttemptDailyPuzzleService;
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
@RequestMapping(value = ApiEndpoint.ATTEMPT_DAILY_PUZZLE, produces = {MediaType.APPLICATION_JSON_VALUE})
public class AttemptDailyPuzzleController {
	@Autowired
	AttemptDailyPuzzleService attemptDailyPuzzleService;

	@PostMapping(ApiEndpoint.CREATE)
	public void createAttempt(@RequestBody AttemptDailyPuzzle attemptDailyPuzzle) {
		attemptDailyPuzzleService.save(attemptDailyPuzzle);
	}

	@DeleteMapping(ApiEndpoint.DELETE)
	public void deleteAttemptDailyPuzzle(@PathVariable Long id) {
		attemptDailyPuzzleService.delete(id);
	}

	@GetMapping(ApiEndpoint.FIND_BY_ID)
	public AttemptDailyPuzzle getAttemptDailyPuzzleById(@PathVariable Long id) {
		return attemptDailyPuzzleService.findById(id);
	}

	@GetMapping(ApiEndpoint.FIND_ALL)
	public List<AttemptDailyPuzzle> getAllAttemptDailyPuzzles() {
		return attemptDailyPuzzleService.findAll();
	}

}