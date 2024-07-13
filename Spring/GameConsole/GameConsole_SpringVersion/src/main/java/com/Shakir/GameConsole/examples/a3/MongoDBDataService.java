package com.Shakir.GameConsole.examples.a3;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class MongoDBDataService implements DataService{
    @Override
    public int[] retriveData() {
        return new int[] {1,3,5,55,20};
    }
}
