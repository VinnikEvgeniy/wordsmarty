package com.wordsmatry.api;

import java.util.Date;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

/**
 * @author Yevhenii Vynnyk
 * @since 2023/10/04
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class AttemptDailyPuzzleDTO {
	String userId;
	Date dateTime;
	int dailyPuzzleId;
	int attemptWord;
	int bonusWord;
	int crosswordSuccess;
	Long numBonusWords;
}
