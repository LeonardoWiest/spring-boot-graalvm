package com.github.leonardowiest.service.impl;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.github.leonardowiest.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Override
	public List<Long> getAll() {

		return Arrays.asList(1L, 2L, 10L, 12L);
	}

}
