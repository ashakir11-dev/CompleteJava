package com.Shakir.GameConsole.examples.a3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.Arrays;

public class Main {

    public static void main(String[] args){
        try(var context = new AnnotationConfigApplicationContext(ApplicationContextLauncherConfiguration.class)){
            int business = context.getBean(BusinessCalculationService.class).findMax();
            System.out.println(business);
        }
    }
}
