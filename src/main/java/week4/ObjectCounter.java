package week4;

// w4q6 - static methods
public class ObjectCounter {
    static int count = 0; // class-level data
    int value; // object-level data

    ObjectCounter(){
        count++;
    }
    ObjectCounter(int value){
        this();
        this.value = value;
    }

    public void display(){
        System.out.println("Value: " + value);
    }

    public static void totalObjects(){
        System.out.println("Total objects created: " + count);
    }

    public static void main(String[] args) {
        ObjectCounter obj1 = new ObjectCounter(10);
        ObjectCounter obj2 = new ObjectCounter(20);
        obj1.display();
        obj2.display();
        ObjectCounter.totalObjects();
    }
}
