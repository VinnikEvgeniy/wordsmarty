package com.wordsmatry.service.impl;

import com.wordsmatry.service.FileService;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Optional;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

/**
 * @author Yevhenii Vynnyk
 * @since 2023/09/27
 */
@Service
public class FileServiceImpl implements FileService {
	@Override
	public String getFile(String path) {
		try {
			Optional<String> fileContent = readFileContents(new File(path));
			return fileContent.orElseGet(() -> "Config file not found!");
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}

	private Optional<String> readFileContents(File file) throws IOException {
		if (!file.exists()) {
			return Optional.empty();
		}
		try (FileInputStream fis = new FileInputStream(file)) {
			byte[] data = new byte[(int) file.length()];
			fis.read(data);
			return Optional.of(new String(data, StandardCharsets.UTF_8));
		}
	}
}