package com.Shakir.GameConsole.examples.a4;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Lazy
class NormalClass{
    public String name;
    public int age;
    public boolean isMale;

    public NormalClass( String name, int age, boolean isMale) {
        this.name = name;
        this.age = age;
        this.isMale = isMale;
    }
    @PostConstruct
    public void Print(){
        System.out.println(name + age + isMale);
    }

    @PreDestroy
    public void reset(){
        name = null;
        age = 0;
        isMale = false;
    }
}

@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
class PrototypeClass{

}
public class Main {
    public static void main(String[] args){
        try(var context = new AnnotationConfigApplicationContext(ApplicationContextLauncherConfiguration.class)){
            var normalClass = context.getBean(NormalClass.class);
            System.out.println( context.getBean(NormalClass.class));
            System.out.println(normalClass.age);
            System.out.println(normalClass.name);
            System.out.println(normalClass.isMale);


            System.out.println( context.getBean(NormalClass.class));

            System.out.println( context.getBean(PrototypeClass.class));
            System.out.println( context.getBean(PrototypeClass.class));
            System.out.println( context.getBean(PrototypeClass.class));
        }
    }
}
