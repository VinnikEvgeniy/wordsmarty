package com.wordsmatry.service;

import com.wordsmatry.domain.Account;
import com.wordsmatry.domain.InGameResourceSpending;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 * @author Yevhenii Vynnyk
 * @since 2023/09/27
 */
public interface InGameResourceSpendingService {
	void save(InGameResourceSpending inGameResourceSpending);

	void delete(Long id);

	InGameResourceSpending findById(Long id);

	List<InGameResourceSpending> findAll();
}
