package com.cydeo.loosely;

import com.cydeo.loosely.model.CustomerBalance;
import com.cydeo.loosely.model.GiftcardBalance;
import com.cydeo.loosely.service.BalanceManager;

import java.math.BigDecimal;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {

        UUID user = UUID.randomUUID();

        CustomerBalance customerBalance = new CustomerBalance(user, BigDecimal.ZERO);
        GiftcardBalance giftCardBalance = new GiftcardBalance(user, BigDecimal.ZERO);

        customerBalance.addBalance(new BigDecimal(150));
        giftCardBalance.addBalance(new BigDecimal(120));

        BalanceManager balanceService =
                new BalanceManager();

        System.out.println(balanceService.checkout(new BigDecimal(151), customerBalance));
        System.out.println(balanceService.checkout(new BigDecimal(80), giftCardBalance));
    }

}
