package com.Shakir.GameConsole.peopleDatabase;

import com.Shakir.GameConsole.game.GameRunner;
import com.Shakir.GameConsole.game.GamingConsole;
import com.Shakir.GameConsole.game.MarioGame;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfigurationClass {
    @Bean
    public GamingConsole game(){
        return new MarioGame();
    }

    @Bean
    public GameRunner gameRunner(GamingConsole game){
        return new GameRunner(game);
    }
}
