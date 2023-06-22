package spring_introduction;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component("dogBean")
//@Scope("singleton")
//@Scope("prototype")
public class Dog implements Pet{

//    private String name;
    @Override
    public void say(){
        System.out.println("Bow-Wow");
    }

    @PostConstruct
    private void init(){
        System.out.println("Class Dog: init method");
    }
    @PreDestroy
    protected void destroy(){
        System.out.println("Class Dog: destroy");
    }

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
}
