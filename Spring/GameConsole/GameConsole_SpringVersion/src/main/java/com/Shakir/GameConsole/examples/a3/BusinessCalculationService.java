package com.Shakir.GameConsole.examples.a3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class BusinessCalculationService {
    public DataService dataService1;

    public BusinessCalculationService(DataService dataService1) {
        this.dataService1 = dataService1;
    }

    public int findMax(){
        return Arrays.stream(dataService1.retriveData()).max().orElse(0);
    }


}
