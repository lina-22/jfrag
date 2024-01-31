package com.stock.jfrag_api.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "stocks")
public class StockModel {
    @Id
    @Column(name ="id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(name="quantity", nullable = true)
    private int quantity;


    @OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinTable(name = "stock_prod", joinColumns = {@JoinColumn( name = "fk_stock_id", referencedColumnName="id")},
    inverseJoinColumns = {@JoinColumn(name = "fk_ product_id", referencedColumnName ="id")})
    private ProductModel productModel;
}
