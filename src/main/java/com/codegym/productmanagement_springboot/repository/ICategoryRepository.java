package com.codegym.productmanagement_springboot.repository;

import com.codegym.productmanagement_springboot.model.Category;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface ICategoryRepository extends PagingAndSortingRepository<Category, Long> {
	@Modifying
	@Query(value = "call delete_category(?1)", nativeQuery = true)
	void deleteCategoryByProcedure (Long id);
}
