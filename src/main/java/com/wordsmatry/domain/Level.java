package com.wordsmatry.domain;

import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.Date;
import java.util.List;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "level")
@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class Level {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;

	@Column(name = "user_id")
	String userId;

	@Column(name = "level_id")
	Long levelId;

	@Column(name = "chapter_name")
	String chapterName;

	@Column(name = "letters")
	String letters;

	@Column(name = "words", length = 512)
	String words;

	@Column(name = "bonus_words", length = 512)
	String bonusWords;

	@Column(name = "start_datetime")
	Date startDatetime;

	@Column(name = "end_datetime")
	Date endDatetime;

	@Column(name = "bonus")
	String bonus;
}