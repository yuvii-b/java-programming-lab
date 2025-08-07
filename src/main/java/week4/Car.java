package week4;

// w4q4 - object passing and returning using this keyword
public class Car {
    private String colour;
    private String model;
    private int year;

    Car(String model, String colour, int year){
        this.model = model;
        this.colour = colour;
        this.year = year;
    }
    public Car modifyCar(){
        colour = "matte black";
        return this; // returning the current instance
    }

    public static void display(Car car){ // passing the object car as argument
        System.out.println("Model: " + car.model);
        System.out.println("Colour: " + car.colour);
        System.out.println("Year: " + car.year);
    }

    public static void main(String[] args) {
        Car car = new Car("Mercedes", "Gray", 2010);
        System.out.println("Original Car details");
        Car.display(car);
        System.out.println("After colour modification");
        Car modifiedCar = car.modifyCar();
        Car.display(modifiedCar);
    }
}
