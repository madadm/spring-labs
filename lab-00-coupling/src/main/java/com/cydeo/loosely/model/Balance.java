package com.cydeo.loosely.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
public abstract class Balance {
    private UUID userId;
    BigDecimal amount;
    public abstract void addBalance(BigDecimal amount);
}
