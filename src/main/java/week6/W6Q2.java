package week6;

class LivingBeing {
    public void breath() {
        System.out.println("Living being breathes.");
    }

    public void response() {
        System.out.println("Living being responds to stimuli.");
    }
}

class Animal extends LivingBeing {
    public void walk() {
        System.out.println("Animal walks.");
    }

    public void noOfLegs() {
        System.out.println("Animal has 4 legs.");
    }
}

class Cat extends Animal {
    public void meow() {
        System.out.println("Cat says Meow!");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("Dog says Woof!");
    }
}

public class W6Q2 {
    public static void main(String[] args) {
        System.out.println("Name: Yuvaraj B (2024503541) | Week 6 | Question - Multilevel Inheritance\n");

        Cat cat = new Cat();
        System.out.println("Cat Actions");
        cat.breathe();
        cat.response();
        cat.walk();
        cat.noOfLegs();
        cat.meow();
        System.out.println();
        Dog dog = new Dog();
        System.out.println("Dog Actions");
        dog.breathe();
        dog.response();
        dog.walk();
        dog.noOfLegs();
        dog.bark();
    }
}
