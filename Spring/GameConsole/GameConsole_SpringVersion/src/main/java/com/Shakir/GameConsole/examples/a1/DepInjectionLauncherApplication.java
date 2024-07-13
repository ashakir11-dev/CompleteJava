package com.Shakir.GameConsole.examples.a1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.Shakir.GameConsole.game")
public class DepInjectionLauncherApplication {

    public static void main(String[] args){

        // Launching a Spring application context
       try(var context = new AnnotationConfigApplicationContext(DepInjectionLauncherApplication.class)){

       }
    }
}



