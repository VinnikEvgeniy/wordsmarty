package com.wordsmatry.controller;

import com.wordsmatry.api.AttendanceDTO;
import com.wordsmatry.core.constant.ApiEndpoint;
import com.wordsmatry.service.AccountService;
import com.wordsmatry.service.AttendanceBookService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Yevhenii Vynnyk
 * @since 2023/10/04
 */
@RestController
@RequestMapping(value = ApiEndpoint.ATTENDANCE_BOOK, produces = {MediaType.APPLICATION_JSON_VALUE})
public class AttendanceController {
	@Autowired
	private AttendanceBookService attendanceBookService;
	@Autowired
	private AccountService accountService;

	@PostMapping(ApiEndpoint.CREATE)
	public void createAttempt(@RequestBody AttendanceDTO attendanceDTO) {
		if (attendanceDTO.getUserId() != null && accountService.findByUserId(attendanceDTO.getUserId()) != null) {
			attendanceBookService.save(attendanceDTO);
		}
	}

	@DeleteMapping(ApiEndpoint.DELETE)
	public void deleteAttendanceBook(@PathVariable Long id) {
		attendanceBookService.delete(id);
	}

	@GetMapping(ApiEndpoint.FIND_BY_ID)
	public AttendanceDTO getAttendanceBookById(@PathVariable Long id) {
		return attendanceBookService.findById(id);
	}

	@GetMapping(ApiEndpoint.FIND_ALL)
	public List<AttendanceDTO> getAllAttendanceBooks() {
		return attendanceBookService.findAll();
	}

}