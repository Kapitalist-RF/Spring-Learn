package spring_introduction;

public class Dog implements Pet{

    private String name;
    @Override
    public void say(){
        System.out.println("Bow-Wow");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
