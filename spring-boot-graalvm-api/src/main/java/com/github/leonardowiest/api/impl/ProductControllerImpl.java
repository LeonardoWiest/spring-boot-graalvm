package com.github.leonardowiest.api.impl;

import static org.springframework.http.HttpStatus.NOT_FOUND;
import static org.springframework.http.HttpStatus.OK;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.github.leonardowiest.api.ProductController;
import com.github.leonardowiest.service.ProductService;

@RestController
public class ProductControllerImpl implements ProductController {

	@Autowired
	private ProductService productService;

	@Override
	public ResponseEntity<List<Long>> getAll() {

		List<Long> products = productService.getAll();

		System.out.println("Retornou com sucesso!");

		if (products.isEmpty()) {

			return new ResponseEntity<>(NOT_FOUND);
		}

		return new ResponseEntity<>(products, OK);
	}

}
