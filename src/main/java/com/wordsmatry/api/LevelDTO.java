package com.wordsmatry.api;

import com.wordsmatry.domain.record.Bonus;
import java.util.Date;
import java.util.List;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class LevelDTO {
	String userId;
	Long levelId;
	String chapterName;
	String letters;
	List<String> words;
	List<String> bonusWords;
	Date startDatetime;
	Date endDatetime;
	Bonus bonus;
}