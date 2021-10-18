package day01;

public class Human {

    private String name;
    private int age;

    public Human (String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void introduce() {
        System.out.println("Hi, my name is " + name +" .");
        System.out.println("I'm " + age + " years old.");
    }
}
