package com.wordsmatry.service.impl;

import com.wordsmatry.api.AttendanceDTO;
import com.wordsmatry.mapper.AttendanceMapper;
import com.wordsmatry.repository.AttendanceRepository;
import com.wordsmatry.service.AttendanceBookService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Yevhenii Vynnyk
 * @since 2023/10/04
 */
@Service
public class AttendanceBookServiceImpl implements AttendanceBookService {
	@Autowired
	private AttendanceRepository attendanceRepository;

	@Autowired
	private AttendanceMapper attendanceMapper;

	@Override
	public void save(AttendanceDTO attendanceDTO) {
		attendanceRepository.save(attendanceMapper.toEntity(attendanceDTO));
	}

	@Override
	public void delete(Long id) {

	}

	@Override
	public AttendanceDTO findById(Long id) {
		return null;
	}

	@Override
	public List<AttendanceDTO> findAll() {
		return null;
	}
}