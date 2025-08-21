package week6;

class Base{

    public void error(){
        System.out.println("No parameter");
    }
    void error_overload(){
        System.out.println("void return type overload");
    }
    public void method(){
        System.out.println("Base method");
    }
    void method(int no){
        System.out.println("Overloading for question "+no);
    }
    Base covariant() {
        System.out.println("covariant practice");
        return this;
    }
    static void static_method(){
        System.out.println("original static");
    }
    static void static_method(int no){
        System.out.println("overloaded static for question no "+no);
    }
}
class Child extends Base{
    //public int method() gives 'method()' in 'Child' clashes with 'method()' in 'Base'; attempting to use incompatible return type
    //void method() gives 'method()' in 'Child' clashes with 'method()' in 'Base'; attempting to assign weaker access privileges ('private'); was 'public'

    @Override
    public void method() {
        System.out.println("Child method");
    }
    public void error(int error_no){
        System.out.println("Overriding with parameter");
    }
    //int error_overload(){ clashes with the exisitng method in Base class
    Child covariant(){
        System.out.println("Covariant exploring");
        return this;
    }
    void method(int no1,int no2){
        System.out.println("Overloading across classes with part "+no1+" for question "+no2);
    }


}
public class W6Q5 {
    public static void main(String[] args) {
        System.out.println("Name: Yuvaraj B (2024503541) | Week 6 | Question - OOP Concepts\n");
        Child child=new Child();
        child.method();
        child.method(6);
        Child.static_method();
        Child.static_method(2);

        child.covariant();

        if (child instanceof Base){
            Child obj1= child;
        }
        Child obj1= child;
        obj1.method(2,6);
    }
}
