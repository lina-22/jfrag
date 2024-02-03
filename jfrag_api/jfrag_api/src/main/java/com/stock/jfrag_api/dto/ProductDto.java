package com.stock.jfrag_api.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDto {
    private Long Id;
    private  String name;
    private Double price = 0.0;
    private Double discount = 0.0;
    private byte[] image;
    private String description;
}
