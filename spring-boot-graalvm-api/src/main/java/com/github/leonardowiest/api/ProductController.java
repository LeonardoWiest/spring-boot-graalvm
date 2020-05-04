package com.github.leonardowiest.api;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@FunctionalInterface
@RequestMapping(value = "/products")
public interface ProductController {

	@GetMapping(path = "/", produces = MediaType.APPLICATION_JSON_VALUE)
	public abstract ResponseEntity<List<Long>> getAll();
}
