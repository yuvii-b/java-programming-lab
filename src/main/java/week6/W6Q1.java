package week6;

class LivingBeing{
    public void breathe(){
        System.out.println("Living being breathes");
    }

    public void response(){
        System.out.println("Living being responds to stimuli");
    }
}

class Animal extends LivingBeing{
    public void walk(){
        System.out.println("Animal walks");
    }

    public void noOfLegs(){
        System.out.println("Animal has 4 legs");
    }
}

public class W6Q1 {
    public static void main(String[] args) {
        System.out.println("Name: Yuvaraj B (2024503541) | Week 6 | Question - Single Inheritance\n");

        Animal animal = new Animal();
        animal.breathe();
        animal.response();
        animal.walk();
        animal.noOfLegs();
    }
}
