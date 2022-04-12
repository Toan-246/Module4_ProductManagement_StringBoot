package com.codegym.productmanagement_springboot.service.product;

import com.codegym.productmanagement_springboot.model.Product;
import com.codegym.productmanagement_springboot.service.IGeneralService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IProductService extends IGeneralService<Product> {
	Page<Product> findAll(Pageable pageable);

	Iterable<Product> findAllByNameContaining(String name);

	Iterable<Product> findAllByPriceBetween (Double min, Double max);
}
