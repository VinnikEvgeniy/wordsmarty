package com.wordsmatry.service;

import com.wordsmatry.domain.Account;
import com.wordsmatry.domain.Attempt;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 * @author Yevhenii Vynnyk
 * @since 2023/09/27
 */

public interface AttemptService {
	void save(Attempt attempt);

	void delete(Long id);

	Attempt findById(Long id);

	List<Attempt> findAll();
}
