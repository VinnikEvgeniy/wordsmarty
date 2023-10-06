package com.wordsmatry.mapper;

import com.wordsmatry.api.AttendanceDTO;
import com.wordsmatry.domain.Attendance;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 * @author Yevhenii Vynnyk
 * @since 2023/10/04
 */
@Service
public class AttendanceMapper implements Mapper<AttendanceDTO, Attendance> {
	@Override
	public Attendance toEntity(AttendanceDTO api) {
		return Attendance.builder()
				.userId(api.getUserId())
				.sessionStartTime(api.getSessionStartTime())
				.sessionEndTime(api.getSessionEndTime())
				.build();
	}

	@Override
	public AttendanceDTO toApi(Attendance entity) {
		return AttendanceDTO.builder()
				.userId(entity.getUserId())
				.sessionStartTime(entity.getSessionStartTime())
				.sessionEndTime(entity.getSessionEndTime())
				.build();
	}

	@Override
	public List<Attendance> toEntity(List<AttendanceDTO> apiList) {
		return apiList.stream().map(this::toEntity).toList();
	}

	@Override
	public List<AttendanceDTO> toApi(List<Attendance> entityList) {
		return entityList.stream().map(this::toApi).toList();
	}
}
