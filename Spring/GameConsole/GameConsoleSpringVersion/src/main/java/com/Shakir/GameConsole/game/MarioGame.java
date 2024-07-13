package com.Shakir.GameConsole.game;

public class MarioGame implements GamingConsole{

    @Override
    public String toString() {
        return "Mario Game";
    }

    @Override
    public void up() {
        System.out.println("Jump");
    }

    @Override
    public void left() {
        System.out.println("Go Back");
    }

    @Override
    public void right() {
        System.out.println("Accelerate");
    }

    @Override
    public void down() {
        System.out.println("Duck");
    }

    @Override
    public void xButton() {
        System.out.println("Attack");
    }
}