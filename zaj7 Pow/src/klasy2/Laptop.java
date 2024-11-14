package klasy2;

public class Laptop extends Computer{
    @Override
    public void start() {
        System.out.println("Laptop started");
    }

    public static void main(String[] args) {
        Computer c1 = new Computer();
        Laptop l1= new Laptop();

        c1.start();
        l1.start();
    }
}
