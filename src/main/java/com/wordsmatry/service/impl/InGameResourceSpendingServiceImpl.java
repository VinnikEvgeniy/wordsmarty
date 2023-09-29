package com.wordsmatry.service.impl;

import com.wordsmatry.domain.InGameResourceSpending;
import com.wordsmatry.repository.InGameResourceSpendingRepository;
import com.wordsmatry.service.InGameResourceSpendingService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Yevhenii Vynnyk
 * @since 2023/09/27
 */
@Service
public class InGameResourceSpendingServiceImpl implements InGameResourceSpendingService {
	@Autowired
	InGameResourceSpendingRepository inGameResourceSpendingRepository;

	@Override
	public void save(InGameResourceSpending inGameResourceSpending) {
		inGameResourceSpendingRepository.save(inGameResourceSpending);
	}

	@Override
	public void delete(Long id) {
		inGameResourceSpendingRepository.deleteById(id);
	}

	@Override
	public InGameResourceSpending findById(Long id) {
		return inGameResourceSpendingRepository.findById(id).orElseThrow();
	}

	@Override
	public List<InGameResourceSpending> findAll() {
		return inGameResourceSpendingRepository.findAll();
	}
}
