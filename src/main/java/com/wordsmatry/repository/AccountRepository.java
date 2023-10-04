package com.wordsmatry.repository;

import com.wordsmatry.domain.Account;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Yevhenii Vynnyk
 * @since 2023/09/27
 */
@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
	Optional<Account> findByUserId(String userId);
	void deleteByUserId(String userId);
}
