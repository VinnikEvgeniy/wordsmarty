package com.wordsmatry.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.Date;

/**
 * @author Yevhenii Vynnyk
 * @since 2023/06/21
 */
@Entity
@Table(name = "attempt_daily_puzzle")
public class AttemptDailyPuzzle {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;

	@Column(name = "user_id")
	int userId;

	@Column(name = "date_time")
	Date dateTime;

	@Column(name = "daily_puzzle_id")
	int dailyPuzzleId;

	@Column(name = "attempt_word")
	int attemptWord;

	@Column(name = "bonus_word")
	int bonusWord;

	@Column(name = "crossword_success")
	int crosswordSuccess;

	@Column(name = "num_puzzle_stars")
	Long numBonusWords;

	public AttemptDailyPuzzle() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public Date getDateTime() {
		return dateTime;
	}

	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}

	public int getDailyPuzzleId() {
		return dailyPuzzleId;
	}

	public void setDailyPuzzleId(int dailyPuzzleId) {
		this.dailyPuzzleId = dailyPuzzleId;
	}

	public int getAttemptWord() {
		return attemptWord;
	}

	public void setAttemptWord(int attemptWord) {
		this.attemptWord = attemptWord;
	}

	public int getBonusWord() {
		return bonusWord;
	}

	public void setBonusWord(int bonusWord) {
		this.bonusWord = bonusWord;
	}

	public int getCrosswordSuccess() {
		return crosswordSuccess;
	}

	public void setCrosswordSuccess(int crosswordSuccess) {
		this.crosswordSuccess = crosswordSuccess;
	}

	public Long getNumBonusWords() {
		return numBonusWords;
	}

	public void setNumBonusWords(Long numBonusWords) {
		this.numBonusWords = numBonusWords;
	}
}
