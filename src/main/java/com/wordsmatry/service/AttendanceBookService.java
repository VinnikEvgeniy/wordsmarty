package com.wordsmatry.service;

import com.wordsmatry.api.AttendanceDTO;
import java.util.List;

/**
 * @author Yevhenii Vynnyk
 * @since 2023/10/04
 */
public interface AttendanceBookService {
	void save(AttendanceDTO attendanceDTO);

	void delete(Long id);

	AttendanceDTO findById(Long id);

	List<AttendanceDTO> findAll();
}