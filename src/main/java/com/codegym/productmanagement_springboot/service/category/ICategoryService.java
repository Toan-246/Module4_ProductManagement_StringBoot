package com.codegym.productmanagement_springboot.service.category;

import com.codegym.productmanagement_springboot.model.Category;
import com.codegym.productmanagement_springboot.service.IGeneralService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ICategoryService extends IGeneralService<Category> {
	Page<Category> findAll (Pageable pageable);
	void deleteCategoryByProcedure (Long id);
}
