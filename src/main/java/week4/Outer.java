package week4;

// w4q8 - nested classes
public class Outer {
    private static final String outerStatic = "Outer static data";
    private final String outerInstance = "Outer instance data";

    // Private static nested class
    private static class PrivateNested {
        static void show() {
            System.out.println("Inside Private Nested Class");
            System.out.println("Accessing outer static: " + outerStatic);
            // Cannot access outerInstance directly
        }
    }

    // Public static nested class
    public static class PublicNested {
        static void show() {
            System.out.println("Inside Public Nested Class");
            System.out.println("Accessing outer static: " + outerStatic);
            // Cannot access outerInstance directly
        }
    }

    public void accessPrivateNested() {
        // Can access private nested class from inside Outer
        PrivateNested.show();
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.accessPrivateNested(); // Accessing private nested class internally

        // Public nested class can be accessed outside too
        Outer.PublicNested.show();

        // Outer.PrivateNested.show();  Compilation error if used outside the class
    }
}
