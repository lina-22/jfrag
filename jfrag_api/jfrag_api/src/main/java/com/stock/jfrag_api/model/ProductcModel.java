package com.stock.jfrag_api.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "products")
public class ProductcModel {
    @Id
    @Column(name ="product_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;

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
}
