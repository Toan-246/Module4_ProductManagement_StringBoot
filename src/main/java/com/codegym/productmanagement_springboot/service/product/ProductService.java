package com.codegym.productmanagement_springboot.service.product;

import com.codegym.productmanagement_springboot.model.Product;
import com.codegym.productmanagement_springboot.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class ProductService implements IProductService{
	@Autowired
	private IProductRepository productRepository;
	@Override
	public Iterable<Product> findAll() {
		return productRepository.findAll();
	}

	@Override
	public Optional<Product> findById(Long id) {
		return productRepository.findById(id);
	}

	@Override
	public Product save(Product product) {
		return productRepository.save(product);
	}

	@Override
	public void deleteById(Long id) {
		productRepository.deleteById(id);
	}

	@Override
	public Page<Product> findAll(Pageable pageable) {
		return productRepository.findAll(pageable);
	}

	@Override
	public Iterable<Product> findAllByNameContaining(String name) {
		return productRepository.findAllByNameContaining(name);
	}

	@Override
	public Iterable<Product> findAllByPriceBetween(Double min, Double max) {
		return productRepository.findAllByPriceBetween(min, max);
	}
}
