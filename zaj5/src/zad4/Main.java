package zad4;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car("Porsche");
        Vehicle v1 = new Vehicle();
        System.out.println(c1.drive());
        v1.drive();
    }
}
