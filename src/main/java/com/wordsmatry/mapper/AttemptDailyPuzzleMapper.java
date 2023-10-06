package com.wordsmatry.mapper;

import com.wordsmatry.api.AttemptDailyPuzzleDTO;
import com.wordsmatry.domain.AttemptDailyPuzzle;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 * @author Yevhenii Vynnyk
 * @since 2023/10/04
 */
@Service
public class AttemptDailyPuzzleMapper implements Mapper<AttemptDailyPuzzleDTO, AttemptDailyPuzzle> {
	@Override
	public AttemptDailyPuzzle toEntity(AttemptDailyPuzzleDTO api) {
		return AttemptDailyPuzzle.builder()
				.userId(api.getUserId())
				.dateTime(api.getDateTime())
				.dailyPuzzleId(api.getDailyPuzzleId())
				.attemptWord(api.getAttemptWord())
				.bonusWord(api.getBonusWord())
				.crosswordSuccess(api.getCrosswordSuccess())
				.numBonusWords(api.getNumBonusWords())
				.build();
	}

	@Override
	public AttemptDailyPuzzleDTO toApi(AttemptDailyPuzzle entity) {
		return AttemptDailyPuzzleDTO.builder()
				.userId(entity.getUserId())
				.dateTime(entity.getDateTime())
				.dailyPuzzleId(entity.getDailyPuzzleId())
				.attemptWord(entity.getAttemptWord())
				.bonusWord(entity.getBonusWord())
				.crosswordSuccess(entity.getCrosswordSuccess())
				.numBonusWords(entity.getNumBonusWords())
				.build();
	}

	@Override
	public List<AttemptDailyPuzzle> toEntity(List<AttemptDailyPuzzleDTO> apiList) {
		return apiList.stream().map(this::toEntity).toList();
	}

	@Override
	public List<AttemptDailyPuzzleDTO> toApi(List<AttemptDailyPuzzle> entityList) {
		return entityList.stream().map(this::toApi).toList();
	}
}
