package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2.xml");
        Dog pet = context.getBean("myPet", Dog.class);
        pet.setName("Belka");
        Dog pet2 = context.getBean("myPet", Dog.class);
        pet2.setName("Strelka");
        System.out.println(pet2.getName() + " " + pet.getName());
//        System.out.println(pet2 == pet);

    }

}
