package com.codegym.productmanagement_springboot.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "products")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message = "Không được để trống")
    @Size(min = 1, max = 10)
    private String name;

    @Column (nullable = false)
    @NotNull(message = "Không được để trống")
    private double price;

    @Column (nullable = false)
    @NotEmpty (message = "Không được để trống")
    private String description;
    private String image;

    @ManyToOne
    Category category;

}
