package com.cydeo.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix= "author")
@Getter
@Setter
public class ReadConfig {
    private String name;
    private int number;
}
