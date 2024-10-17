package zad7;

import java.time.Year;

public class Car {
    String brand;
    String model;
    int productionYear;

    public Car(String brand, String model, int productionYear) {
        this.brand = brand;
        this.model = model;
        this.productionYear = Year.now().getValue();
    }

    public Car(String brand, String model) {
        this(brand, model, Year.now().getValue());
    }
}
