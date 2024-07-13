package com.Shakir.GameConsole.examples.g1;

import org.springframework.stereotype.Component;

@Component
public class MongoDBDataService implements DataService {
    @Override
    public int[] retriveData() {
        return new int[] {1,3,5,55,20};
    }
}
