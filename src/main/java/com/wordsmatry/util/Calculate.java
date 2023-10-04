package com.wordsmatry.util;

import java.util.Collections;
import java.util.List;

/**
 * @author Yevhenii Vynnyk
 * @since 2023/10/02
 */
public class Calculate {
	public static double median(List<Double> numbers) {
		Collections.sort(numbers);
		int size = numbers.size();
		return size % 2 == 0
				? (numbers.get(size / 2 - 1) + numbers.get(size / 2)) / 2.0
				: numbers.get(size / 2);
	}
}
