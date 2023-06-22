package spring_introduction;

import org.springframework.stereotype.Component;

@Component("dogBean")
public class Dog implements Pet{

//    private String name;
    @Override
    public void say(){
        System.out.println("Bow-Wow");
    }

    private void init(){
        System.out.println("Class Dog: init method");
    }

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
