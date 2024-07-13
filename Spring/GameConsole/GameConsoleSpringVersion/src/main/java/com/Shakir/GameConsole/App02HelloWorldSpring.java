package com.Shakir.GameConsole;

import com.Shakir.GameConsole.game.Address;
import com.Shakir.GameConsole.peopleDatabase.HelloWorldConfigurationClass;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {

    public static void main(String[] args){
        // Launching a Spring application context
        var context = new AnnotationConfigApplicationContext(HelloWorldConfigurationClass.class);

        // Configure things we want Spring to manage
        System.out.println(context.getBean("name"));

        // Providing the name of the bean
        System.out.println(context.getBean("age"));

        // Providing the class of the beanm
        System.out.println(context.getBean(Address.class));

        // Providing other beans as parameter
        System.out.println(context.getBean("person2"));

        //Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
    }
}
