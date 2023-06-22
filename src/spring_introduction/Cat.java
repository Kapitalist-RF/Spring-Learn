package spring_introduction;

import org.springframework.stereotype.Component;

//@Component("catBean")//id для спринг бина!
@Component//id будет как название класса с мал буквой cat
public class Cat implements Pet {
    @Override
    public void say() {
        System.out.println("Meow-Meow");
    }
}
