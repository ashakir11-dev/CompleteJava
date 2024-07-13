package com.Shakir.GameConsole.game;

import org.springframework.stereotype.Component;

@Component
public record Person(String name, int age, Address address) {}
