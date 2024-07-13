package com.Shakir.GameConsole.game;

public class SuperContra implements GamingConsole{
    @Override
    public void up() {
        System.out.println("Jump");
    }

    @Override
    public void down() {
        System.out.println("Duck");
    }

    @Override
    public void right() {
        System.out.println("Run");
    }

    @Override
    public void left() {
        System.out.println("Go Back");
    }

    @Override
    public void xButton() {
        System.out.println("Shoot");
    }

    @Override
    public String toString() {
        return "SuperContra";
    }
}
