package com.cydeo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Ingredients {
    private String name;
    private int quantity;
    QuantityType quantityType;

}
