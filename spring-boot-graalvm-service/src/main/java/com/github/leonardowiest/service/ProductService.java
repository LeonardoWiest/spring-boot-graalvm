package com.github.leonardowiest.service;

import java.util.List;

@FunctionalInterface
public interface ProductService {

	public abstract List<Long> getAll();
}
