package week6;

class Animal {
    public void move() {
        System.out.println("Animal moves");
    }

    public void move(String direction) {
        System.out.println("Animal moves " + direction);
    }

    public void move(int distance) {
        System.out.println("Animal moves " + distance + " meters");
    }

    public void move(String direction, int distance) {
        System.out.println("Animal moves " + distance + " meters " + direction);
    }
}

class Dog extends Animal {
    @Override
    public void move() {
        System.out.println("Dog runs swiftly");
    }

    @Override
    public void move(String direction) {
        System.out.println("Dog runs " + direction);
    }

    @Override
    public void move(int distance) {
        System.out.println("Dog runs " + distance + " meters");
    }

    @Override
    public void move(String direction, int distance) {
        System.out.println("Dog runs " + distance + " meters " + direction);
    }
}

class Cat extends Animal {
    @Override
    public void move() {
        System.out.println("Cat walks silently");
    }

    @Override
    public void move(String direction) {
        System.out.println("Cat sneaks " + direction);
    }

    @Override
    public void move(int distance) {
        System.out.println("Cat walks " + distance + " meters");
    }

    @Override
    public void move(String direction, int distance) {
        System.out.println("Cat sneaks " + distance + " meters " + direction);
    }
}

class Bird extends Animal {
    @Override
    public void move() {
        System.out.println("Bird flies in the sky");
    }

    @Override
    public void move(String direction) {
        System.out.println("Bird flies " + direction);
    }

    @Override
    public void move(int distance) {
        System.out.println("Bird flies " + distance + " meters high");
    }

    @Override
    public void move(String direction, int distance) {
        System.out.println("Bird flies " + distance + " meters " + direction);
    }
}

public class W6Q3 {
    public static void main(String[] args) {
        System.out.println("Name: Yuvaraj B (2024503541) | Week 6 | Question - Polymorphism\n");

        System.out.println("Runtime Polymorphism (Animal Array)");
        Animal[] animals = {new Dog(), new Cat(), new Bird()};

        for (Animal a : animals) {
            a.move();
            a.move("forward");
            a.move(10);
            a.move("left", 5);
            System.out.println();
        }

        System.out.println("Compile-Time Polymorphism (Dog Object)");
        Dog dog = new Dog();
        dog.move();
        dog.move("backward");
        dog.move(20);
        dog.move("right", 15);
    }
}

