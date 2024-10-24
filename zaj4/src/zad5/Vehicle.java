package zad5;

import java.util.Objects;

public class Vehicle {
    public String brand;
    public String model;
    public Integer yearOfProduction;

    public Vehicle(String brand, String model, Integer yearOfProduction) {
        if (brand == null || brand.isEmpty()) {
            this.brand = "---";
        }
        else {
            this.brand = brand;
        }

        if (brand == null || brand.isEmpty()) {
            this.model = "---";
        }
        else {
            this.model = model;
        }

        if (yearOfProduction <= 2024) {
            this.yearOfProduction = yearOfProduction;
        }
        else {
            this.yearOfProduction = 2024;
        }
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return Objects.equals(brand, vehicle.brand) && Objects.equals(model, vehicle.model) && Objects.equals(yearOfProduction, vehicle.yearOfProduction);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, yearOfProduction);
    }
}
