package com.wordsmatry.repository;

import com.wordsmatry.domain.Attendance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Yevhenii Vynnyk
 * @since 2023/10/04
 */
@Repository
public interface AttendanceRepository extends JpaRepository<Attendance, Long> {
}
