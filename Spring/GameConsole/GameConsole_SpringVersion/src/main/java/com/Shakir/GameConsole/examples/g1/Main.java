package com.Shakir.GameConsole.examples.g1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args){
        try(var context =
                    new AnnotationConfigApplicationContext
                            (CDIApplicationContextLauncherConfiguration.class)){
            var busClass = context.getBean(BusinessCalculationService.class).getDataService1();
            int business = context.getBean(BusinessCalculationService.class).findMax();
            System.out.println(busClass);
        }
    }
}
