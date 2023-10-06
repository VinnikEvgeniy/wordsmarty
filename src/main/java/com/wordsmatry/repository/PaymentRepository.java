package com.wordsmatry.repository;

import com.wordsmatry.domain.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Yevhenii Vynnyk
 * @since 2023/09/27
 */
@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
