package com.codegym.productmanagement_springboot.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductForm {
	private Long id;

	@NotEmpty (message = "Không được để trống")
	@Size (min = 1, max = 10)
	private String name;

	@NotNull (message = "Không được để trống")
	private double price;

	@NotEmpty (message = "Không được để trống")
	private String description;
	private MultipartFile image;

	Category category;

}
