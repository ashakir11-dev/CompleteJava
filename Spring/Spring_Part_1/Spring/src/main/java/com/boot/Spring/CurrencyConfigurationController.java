package com.boot.Spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CurrencyConfigurationController {
    @Autowired
    private CurrencyServiceConfiguration currencyConfiguration;

    @RequestMapping("/login")
    public CurrencyServiceConfiguration retrieveCurrencyConfig(){
        return  currencyConfiguration;
    }

}
