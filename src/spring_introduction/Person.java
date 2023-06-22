package spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("personBean")
public class Person {
    //@Value("${person.surname}")
    private String surname;
    //@Value("${person.age}")
    private int age;
//    @Autowired
//    @Qualifier("dogBean")
    private Pet pet;

    @Autowired
    public Person(@Qualifier("dogBean") Pet pet) {
        System.out.println("Person class: constructor");
        this.pet = pet;
    }

////    public Person() {
////
////    }

    public void callYourPet(){
        System.out.println("Hello, my lovely Pet!");
        pet.say();
    }
    //@Autowired
    public void setPet(Pet pet) {
        System.out.println("Class Person: setPet");
        this.pet = pet;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Pet getPet() {
        return pet;
    }
}
