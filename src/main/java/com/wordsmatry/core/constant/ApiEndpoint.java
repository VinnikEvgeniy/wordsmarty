package com.wordsmatry.core.constant;

/**
 * @author Yevhenii Vynnyk
 * @since 2023/09/27
 */
public final class ApiEndpoint {
	public static final String CONFIG = "/api/config";
	public static final String ACCOUNT = "/api/account";
	public static final String ATTEMPT = "/api/attempt";
	public static final String ATTEMPT_DAILY_PUZZLE = "/api/attemptDailyPuzzle";
	public static final String IN_GAME_INCOME = "/api/inGameIncome";
	public static final String IN_GAME_RESOURCE_SPENDING = "/api/inGameResourceSpending";
	public static final String LEVEL = "/api/level";
	public static final String PAYMENT = "/api/payment";
	public static final String CREATE = "/create";
	public static final String DELETE = "/delete/{id}";
	public static final String FIND_BY_ID = "/{id}";
	public static final String FIND_ALL = "/all";
}
