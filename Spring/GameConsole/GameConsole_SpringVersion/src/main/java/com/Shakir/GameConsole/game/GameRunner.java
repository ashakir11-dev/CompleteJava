package com.Shakir.GameConsole.game;

import org.springframework.stereotype.Component;

@Component
public class GameRunner {
    GamingConsole game;

    public GameRunner(GamingConsole game) {
        this.game = game;
    }

    public void run() {
        System.out.println("Running " + game);

        game.right();
        game.up();
        game.down();
        game.left();
    }

    public void run(GamingConsole game){
        System.out.println("Running " + game);

        game.right();
        game.up();
        game.down();
        game.left();
    }
}
