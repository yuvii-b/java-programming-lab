package week4;

// w4q1 - Demonstrate automatic default constructor behaviour
public class AutoDefaultConstructor {
    String name;
    int age;

    public static void main(String[] args) {
        AutoDefaultConstructor obj = new AutoDefaultConstructor();
        System.out.println(obj.name); // default values are assigned by the automatic default constructor
        System.out.println(obj.age);
    }
}
