package com.Shakir.GameConsole.examples.h1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

@Configuration
@ComponentScan
public class XMLSimpleSpringContextLauncherApplication {

    public static void main(String[] args){

        // Launching a Spring application context
       try(var context = new ClassPathXmlApplicationContext("contextConfiguration.xml")){
          // Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
          // System.out.println(context.getBean(BusinessClass.class));
           Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
           System.out.println(context.getBean("name"));
           System.out.println(context.getBean(BusinessClass.class));
       }
    }
}



