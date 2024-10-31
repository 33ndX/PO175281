package zad6;

public class Child extends Base {

    public static void info() {
        System.out.println("This is the child class.");

    }

    public static void main(String[] args) {
        Base base = new Base();
        base.info();

        Child child = new Child();
        child.info();



    }
}