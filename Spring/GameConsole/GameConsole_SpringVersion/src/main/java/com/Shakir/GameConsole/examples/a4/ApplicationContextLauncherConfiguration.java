package com.Shakir.GameConsole.examples.a4;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.Shakir.GameConsole.examples.a4")
public class ApplicationContextLauncherConfiguration {
    public final String p = "p";

    @Bean
    @Qualifier("p")
    public String getString(){
        return p;
    }
    @Bean
    public int getInt(){
        return 0;
    }
    @Bean
    public boolean getBool(){
        return false;
    }

}
