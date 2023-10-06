package com.wordsmatry.repository;

import com.wordsmatry.domain.InGameResourceSpending;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Yevhenii Vynnyk
 * @since 2023/09/27
 */
public interface InGameResourceSpendingRepository extends JpaRepository<InGameResourceSpending, Long> {
}
