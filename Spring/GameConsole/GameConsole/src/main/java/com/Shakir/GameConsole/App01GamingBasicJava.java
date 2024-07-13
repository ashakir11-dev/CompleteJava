package com.Shakir.GameConsole;

import com.Shakir.GameConsole.game.GameRunner;
import com.Shakir.GameConsole.game.MarioGame;
import com.Shakir.GameConsole.game.SuperContra;

public class App01GamingBasicJava {

    public static void main(String[] args){
        var marioGame = new MarioGame();
        var gameRunner = new GameRunner(marioGame);
        gameRunner.run();

        var superContraGame = new SuperContra();
        gameRunner = new GameRunner(superContraGame);
        gameRunner.run();
    }
}
