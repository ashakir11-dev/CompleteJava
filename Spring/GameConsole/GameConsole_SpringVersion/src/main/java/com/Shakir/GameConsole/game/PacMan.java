package com.Shakir.GameConsole.game;

import org.springframework.stereotype.Component;

@Component
public class PacMan implements GamingConsole{
    @Override
    public void up() {
        System.out.println("Go Up");
    }

    @Override
    public void down() {
        System.out.println("Go Down");
    }

    @Override
    public void right() {
        System.out.println("Go right");
    }

    @Override
    public void left() {
        System.out.println("Go Left");
    }

    @Override
    public void xButton() {
        System.out.println("Does Nth");
    }
}
