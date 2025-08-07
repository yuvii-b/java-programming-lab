package week4;

// w4q5 - constructor chaining
public class Chaining {
    int number1, number2, number3;
    String name;

    Chaining(){
        name = "John";
    }

    Chaining(int number1){
        this(); // calling default constructor
        this.number1 = number1;
    }

    Chaining(int number1, int number2){
        this(number1); // calling constructor with parameter
        this.number2 = number2;
    }

    Chaining(int number1, int number2, int number3){
        this(number1, number2); // starting the chain
        this.number3 = number3;
    }

    public void display(){
        System.out.println("Name: " + name);
        System.out.printf("Number1: %d\tNumber2: %d\tNumber3: %d\n", number1, number2, number3);
    }

    public static void main(String[] args) {
        Chaining obj = new Chaining(10, 20, 30);
        obj.display();
    }
}
