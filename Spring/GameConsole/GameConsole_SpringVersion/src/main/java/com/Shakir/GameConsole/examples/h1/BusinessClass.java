package com.Shakir.GameConsole.examples.h1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BusinessClass {
   @Autowired
   Dependency1 dependency1;

    @Autowired
    Dependency2 dependency2;

    @Autowired
    public BusinessClass(Dependency2 dependency2, Dependency1 dependency1) {
        System.out.println("Constructor Injection " + dependency1 + "," + dependency2);
        this.dependency2 = dependency2;
        this.dependency1 = dependency1;
    }

    @Override
    public String toString() {
        return dependency1 + "," + dependency2;
    }

    @Autowired
    public void setDependency2(Dependency2 dependency2) {
        System.out.println("Setter Injection");
        this.dependency2 = dependency2;
    }

    @Autowired
    public void setDependency1(Dependency1 dependency1) {
        this.dependency1 = dependency1;
    }
}

