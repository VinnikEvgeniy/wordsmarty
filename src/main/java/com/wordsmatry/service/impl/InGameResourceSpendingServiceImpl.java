package com.wordsmatry.service.impl;

import com.wordsmatry.api.InGameResourceSpendingDTO;
import com.wordsmatry.mapper.InGameResourceSpendingMapper;
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
	@Autowired
	InGameResourceSpendingMapper inGameResourceSpendingMapper;

	@Override
	public void save(InGameResourceSpendingDTO inGameResourceSpending) {
		inGameResourceSpendingRepository.save(inGameResourceSpendingMapper.toEntity(inGameResourceSpending));
	}

	@Override
	public void delete(Long id) {
		inGameResourceSpendingRepository.deleteById(id);
	}

	@Override
	public InGameResourceSpendingDTO findById(Long id) {
		return inGameResourceSpendingMapper.toApi(inGameResourceSpendingRepository.findById(id).orElseThrow());
	}

	@Override
	public List<InGameResourceSpendingDTO> findAll() {
		return inGameResourceSpendingMapper.toApi(inGameResourceSpendingRepository.findAll());
	}
}