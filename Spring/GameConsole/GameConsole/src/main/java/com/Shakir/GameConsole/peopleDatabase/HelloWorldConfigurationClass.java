package com.Shakir.GameConsole.peopleDatabase;

import com.Shakir.GameConsole.game.Address;
import com.Shakir.GameConsole.game.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class HelloWorldConfigurationClass {
    @Bean
    public String name(){
        return "Messi";
    }

    @Bean
    public int age(){
        return 37;
    }

    @Bean
    public Person person(){
        return new Person(name(),age(), address());
    }

    @Bean
    public Person person2(String name, int age, String Actual_Address){
        return new Person(name,age,actual_address());
    }

    @Bean
    @Primary
    public Address address(){
        return new Address("Camp Nou", "Barcelona");
    }

    @Bean(name = "Actual_Address")
    public Address actual_address(){
        return new Address("Inter Miami", "Miami");
    }


}
