package com.wordsmatry.repository;

import com.wordsmatry.domain.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Yevhenii Vynnyk
 * @since 2023/09/27
 */
@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
	Account findByUserId(String userId);
	void deleteByUserId(String userId);
}
