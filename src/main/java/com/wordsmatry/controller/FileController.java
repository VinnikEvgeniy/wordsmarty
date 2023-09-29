package com.wordsmatry.controller;

import com.wordsmatry.core.constant.ApiEndpoint;
import com.wordsmatry.core.constant.Global;
import com.wordsmatry.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Yevhenii Vynnyk
 * @since 2023/09/26
 */

@RestController
@RequestMapping(value = ApiEndpoint.CONFIG, produces = {MediaType.APPLICATION_JSON_VALUE})
public class FileController {

	@Autowired
	FileService fileService;

	@GetMapping
	public String getFile() {
		return fileService.getFile(Global.PATH_CONFIG);
	}

}