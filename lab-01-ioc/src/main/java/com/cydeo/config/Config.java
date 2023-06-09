package com.cydeo.config;

import com.cydeo.Currency;
import com.cydeo.account.Current;
import com.cydeo.account.Saving;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

@Configuration
public class Config {

    @Bean
    public Currency currency(){ return new Currency();}
    @Bean
    public Current current(){return new Current();}
    @Bean
    public Saving saving(){return new Saving();}



//    @Bean
//    Current current = new Current( currency, new BigDecimal(10), new UUID(10,10) );
//
//    @Bean
//    Saving saving = new Saving( currency, new BigDecimal(20), );
}
