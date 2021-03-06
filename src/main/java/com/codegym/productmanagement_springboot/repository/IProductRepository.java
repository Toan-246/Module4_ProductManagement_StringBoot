package com.codegym.productmanagement_springboot.repository;

import com.codegym.productmanagement_springboot.model.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductRepository extends PagingAndSortingRepository<Product, Long> {
	Iterable<Product> findAllByNameContaining (String name);

	@Query (value = "select * from products where price between ?1 and ?2", nativeQuery = true)
	Iterable<Product> findAllByPriceBetween (Double min, Double max);
}
