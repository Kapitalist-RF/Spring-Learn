package spring_introduction;

public class Person {

    private String surname;
    private int age;
    private Pet pet;

//    public Person(Pet pet) {
//        this.pet = pet;
//    }

    public Person() {

    }

    public void callYourPet(){
        System.out.println("Hello, my lovely Pet!");
        pet.say();
    }

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
