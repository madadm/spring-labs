package com.cydeo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Currency {
    private String code;
    private String name;

    public Currency(){
        this.code = "100";
        this.name = "USD";
    }

    public String getCode() {
        return code;
    }
}
