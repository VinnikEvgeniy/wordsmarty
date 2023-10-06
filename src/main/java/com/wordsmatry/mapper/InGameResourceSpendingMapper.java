package com.wordsmatry.mapper;

import com.wordsmatry.api.InGameResourceSpendingDTO;
import com.wordsmatry.domain.InGameResourceSpending;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 * @author Yevhenii Vynnyk
 * @since 2023/10/04
 */
@Service
public class InGameResourceSpendingMapper implements Mapper<InGameResourceSpendingDTO, InGameResourceSpending> {
	@Override
	public InGameResourceSpending toEntity(InGameResourceSpendingDTO api) {
		return InGameResourceSpending.builder()
				.userId(api.getUserId())
				.dateTime(api.getDateTime())
				.eventType(api.getEventType())
				.spendingType(api.getSpendingType())
				.amountSpent(api.getAmountSpent())
				.currentBalance(api.getCurrentBalance())
				.build();
	}

	@Override
	public InGameResourceSpendingDTO toApi(InGameResourceSpending entity) {
		return InGameResourceSpendingDTO.builder()
				.userId(entity.getUserId())
				.dateTime(entity.getDateTime())
				.eventType(entity.getEventType())
				.spendingType(entity.getSpendingType())
				.amountSpent(entity.getAmountSpent())
				.currentBalance(entity.getCurrentBalance())
				.build();
	}

	@Override
	public List<InGameResourceSpending> toEntity(List<InGameResourceSpendingDTO> apiList) {
		return apiList.stream().map(this::toEntity).toList();
	}

	@Override
	public List<InGameResourceSpendingDTO> toApi(List<InGameResourceSpending> entityList) {
		return entityList.stream().map(this::toApi).toList();
	}
}
