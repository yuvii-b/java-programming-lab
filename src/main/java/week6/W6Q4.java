package week6;

class LivingBeing {
    String name;

    LivingBeing(String name) {
        this.name = name;
        System.out.println("LivingBeing constructor called for: " + name);
    }

    void breathe() {
        System.out.println(name + " is breathing.");
    }

    void response() {
        System.out.println(name + " is responding to stimuli.");
    }
}

class LandAnimal extends LivingBeing {
    LandAnimal(String name) {
        super(name);
        System.out.println("LandAnimal constructor called for: " + name);
    }

    void walk() {
        System.out.println(name + " is walking.");
    }

    void numberOfLegs() {
        System.out.println(name + " has 4 legs.");
    }
}

class WaterAnimal extends LivingBeing {
    WaterAnimal(String name) {
        super(name);
        System.out.println("WaterAnimal constructor called for: " + name);
    }

    void swim() {
        System.out.println(name + " is swimming.");
    }

    void waterType() {
        System.out.println(name + " lives in fresh water.");
    }
}

class Dog extends LandAnimal {
    Dog(String name) {
        super(name);
        System.out.println("Dog constructor called for: " + name);
    }

    void bark() {
        System.out.println(name + " is barking.");
    }
}

class Cat extends LandAnimal {
    Cat(String name) {
        super(name);
        System.out.println("Cat constructor called for: " + name);
    }

    void meow() {
        System.out.println(name + " is meowing.");
    }
}

public class W6Q4 {
    public static void main(String[] args) {
        System.out.println("Name: Yuvaraj B (2024503541) | Week 6 | Question - Hierarchical Inheritance\n");

        Dog dog = new Dog("Timmy");
        System.out.println();
        dog.breathe();
        dog.response();
        dog.walk();
        dog.numberOfLegs();
        dog.bark();

        System.out.println();

        Cat cat = new Cat("Kitty");
        System.out.println();
        cat.breathe();
        cat.response();
        cat.walk();
        cat.numberOfLegs();
        cat.meow();
    }
}