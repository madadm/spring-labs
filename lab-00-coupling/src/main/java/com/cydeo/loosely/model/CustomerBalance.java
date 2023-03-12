package com.cydeo.loosely.model;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.UUID;


@Getter
@Setter
public class CustomerBalance extends Balance {


    public CustomerBalance(UUID CustomId, BigDecimal amount) {
        super(CustomId,amount);
    }

    public BigDecimal getBalance(){
        return this.amount;
    }
    @Override
    public void addBalance(BigDecimal amount) {
        setAmount(this.amount.add(amount));

    }
}
