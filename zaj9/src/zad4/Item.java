package zad4;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Item implements Comparable<Item> {
    String name;
    double weight;
    double price;

    public Item(String name, double weight, double price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return weight+"";
    }

    @Override
    public int compareTo(Item o) {
        return Double.compare(this.weight, o.weight);
    }

    public static void main(String[] args) {
        Item[] items = { new Item("Laptop", 2.5, 1500),
                new Item("Book", 0.5, 20),
                new Item("Phone", 0.2, 700),
                new Item("Tablet", 0.8, 300)
        };

        Arrays.sort(items);

        for (Item item : items) {
            System.out.println(item);
        }
    }
}
