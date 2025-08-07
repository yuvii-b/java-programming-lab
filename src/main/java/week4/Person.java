package week4;

// w4q3 - usage of this keyword
public class Person {
    private int age;
    private String name;
    public Person(int age, String name){
        this.age = age; // resolves conflict between parameter and instance variables
        this.name = name;
    }

    public void showInformation(){
        System.out.println("Person's name is: " + this.name);
        System.out.println("Person's age is: " + this.age);
    }

    public static void main(String[] args) {
        Person person = new Person(19, "Yuvaraj");
        person.showInformation(); // calling method of current class
    }
}
