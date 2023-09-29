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
@Table(name = "attendance_book")
public class AttendanceBook {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	@Column(name = "user_id")
	int userId;

	@Column(name = "session_start_time")
	Date sessionStartTime;

	@Column(name = "session_end_time")
	Date sessionEndTime;


}
