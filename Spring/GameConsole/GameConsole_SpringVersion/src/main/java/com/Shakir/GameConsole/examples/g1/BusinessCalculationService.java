package com.Shakir.GameConsole.examples.g1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class BusinessCalculationService {


    private DataService dataService1;

    //public BusinessCalculationService(DataService dataService1) {
//        this.dataService1 = dataService1;
//    }

    public int findMax(){
        return Arrays.stream(dataService1.retriveData()).max().orElse(0);
    }

    @Autowired
    public void setDataService1(DataService dataService1) {
        System.out.println("Setter Injection");
        this.dataService1 = dataService1;
    }
    public DataService getDataService1() {
        return dataService1;
    }

}
