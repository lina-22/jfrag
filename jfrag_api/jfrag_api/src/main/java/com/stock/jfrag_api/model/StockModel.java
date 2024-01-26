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
    @Column(name ="stock_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long stockId;

    @Column(name="quantity", nullable = true)
    private int quantity;
}
