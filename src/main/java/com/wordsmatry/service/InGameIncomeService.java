package com.wordsmatry.service;

import com.wordsmatry.domain.Account;
import com.wordsmatry.domain.InGameIncome;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 * @author Yevhenii Vynnyk
 * @since 2023/09/27
 */

public interface InGameIncomeService {
	void save(InGameIncome inGameIncome);

	void delete(Long id);

	InGameIncome findById(Long id);

	List<InGameIncome> findAll();
}
