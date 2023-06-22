package spring_introduction;

import org.springframework.stereotype.Component;

//@Component("catBean")//id для спринг бина!
//@Component("catBean")//id будет как название класса с мал буквой cat SQL==SQL
public class Cat implements Pet {
    @Override
    public void say() {
        System.out.println("Meow-Meow");
    }
}
