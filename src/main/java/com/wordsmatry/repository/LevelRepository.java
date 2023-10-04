package com.wordsmatry.repository;

import com.wordsmatry.domain.Level;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Yevhenii Vynnyk
 * @since 2023/09/27
 */
@Repository
public interface LevelRepository extends JpaRepository<Level, Long> {
}
