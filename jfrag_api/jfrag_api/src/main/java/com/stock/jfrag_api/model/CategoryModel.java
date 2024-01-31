package com.stock.jfrag_api.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "categories")
public class CategoryModel {

    @Id
    @Column(name ="id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(name = "category_value", nullable = false)
    private String categoryValue;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_cat_id", referencedColumnName = "id")
    private List<ProductModel> productModel;
}
