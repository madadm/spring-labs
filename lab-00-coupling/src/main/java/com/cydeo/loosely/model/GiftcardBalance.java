package com.cydeo.loosely.model;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.UUID;

@Getter
@Setter
public class GiftcardBalance extends Balance{

    public GiftcardBalance(UUID userId, BigDecimal amount) {
        super(userId, amount);
    }

    @Override
    public void addBalance(BigDecimal amount) {
        setAmount(this.amount.add(amount));
    }
}
