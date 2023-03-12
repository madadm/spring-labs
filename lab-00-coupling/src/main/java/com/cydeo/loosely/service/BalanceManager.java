package com.cydeo.loosely.service;

import com.cydeo.loosely.model.Balance;

import java.math.BigDecimal;

public class BalanceManager {
    public boolean checkout(BigDecimal amount, Balance balance){

        if(balance.getAmount().compareTo(amount) > -1){
            balance.setAmount(balance.getAmount().subtract(amount));
            return true;
        }
        // implement checkout business
        return false;
    }
}
