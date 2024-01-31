package com.stock.jfrag_api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "product")
@ToString
public class ProductModel {

    @Id
    @Column(name ="id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(name="name", nullable = false)
    private  String name;

    @Column(name= "price", nullable = false , columnDefinition = "Decimal(10,2) default '0.00'")// here datatype and default value included in the same line
    private Double price = 0.0;

    @Column(name="discount", columnDefinition = "Decimal(10,2) default '0.00'")
    private Double discount = 0.0;

    @Column(name = "image", length = 50000000)
    private byte[] image;

    @Column(name = "description")
    private String description;

    @OneToOne(mappedBy = "productModel")
    private StockModel stockModel;

    @ToString.Exclude
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_cat_id")
    private CategoryModel categoryModel;

}
