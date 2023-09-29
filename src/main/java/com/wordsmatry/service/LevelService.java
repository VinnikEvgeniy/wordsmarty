package com.wordsmatry.service;

import com.wordsmatry.domain.Account;
import com.wordsmatry.domain.Level;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 * @author Yevhenii Vynnyk
 * @since 2023/09/27
 */
public interface LevelService {
	void save(Level level);

	void delete(Long id);

	Level findById(Long id);

	List<Level> findAll();
}
