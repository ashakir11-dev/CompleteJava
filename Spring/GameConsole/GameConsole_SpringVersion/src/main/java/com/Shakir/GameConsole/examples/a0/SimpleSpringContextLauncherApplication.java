package com.Shakir.GameConsole.examples.a0;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@ComponentScan
public class SimpleSpringContextLauncherApplication {

    public static void main(String[] args){

        // Launching a Spring application context
       try(var context = new AnnotationConfigApplicationContext(SimpleSpringContextLauncherApplication.class)){
           Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
           System.out.println(context.getBean(BusinessClass.class));
       }
    }
}



