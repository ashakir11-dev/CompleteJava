package com.Shakir.GameConsole;

import com.Shakir.GameConsole.game.Address;
import com.Shakir.GameConsole.game.GameRunner;
import com.Shakir.GameConsole.game.GamingConsole;
import com.Shakir.GameConsole.peopleDatabase.GamingConfigurationClass;
import com.Shakir.GameConsole.peopleDatabase.HelloWorldConfigurationClass;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App03HelloWorldSpring {

    public static void main(String[] args){
        // Launching a Spring application context
       try( var context = new AnnotationConfigApplicationContext(GamingConfigurationClass.class))
       {
           context.getBean(GamingConsole.class).up();
           context.getBean(GameRunner.class).run();
       }
    }
}
