package zad4;

public class Car extends  Vehicle{
    public String brand;

    public Car(String brand) {
        this.brand = brand;
    }

    @Override
    public String drive() {
        return super.drive() + " " + brand;
    }


}
