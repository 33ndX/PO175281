package zad7;

public class Animal {
    String name;

    public Animal() {
        this.name = "Unknown";
    }

    public String getAnimalClass() {
        return this.getClass().getName();
    }
}
