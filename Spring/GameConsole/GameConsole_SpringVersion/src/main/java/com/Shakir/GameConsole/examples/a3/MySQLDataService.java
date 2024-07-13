package com.Shakir.GameConsole.examples.a3;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@Lazy
public class MySQLDataService implements DataService{
    @Override
    public int[] retriveData() {
        return new int[] {10,15,30,2};
    }
}
