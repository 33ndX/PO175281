package zad3;

import zad2.Movie;

import java.util.ArrayList;
import java.util.Collections;

public class Order implements  Comparable<Order>, Cloneable{
    String productName;
    int quantity;
    double unitPrice;

    public Order(String productName, int quantity, double unitPrice) {
        this.productName = productName;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Override
    public String toString() {
        return quantity + "";
    }

    @Override
    public int compareTo(Order o) {
        if (Double.compare(o.unitPrice, this.unitPrice) != 0) {
            return Double.compare(o.unitPrice, this.unitPrice);
        }
        else {
            return Integer.compare(this.quantity, o.quantity);
        }
    }

    public static void main(String[] args) {
        ArrayList<Order> orders = new ArrayList<>();
        orders.add(new Order("Laptop", 3, 999.99));
        orders.add(new Order("Phone", 5, 599.99));
        orders.add(new Order("Tablet", 2, 299.99));
        orders.add(new Order("Headphones", 10, 199.99));

        Collections.sort(orders);
        System.out.println(orders);

    }
}
