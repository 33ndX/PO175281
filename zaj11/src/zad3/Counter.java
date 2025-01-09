package zad3;

import java.util.ArrayList;
import java.util.List;

public class Counter<T> {
    private List<T> elements;
    private int count;

    public Counter() {
        this.elements = new ArrayList<>();
        this.count = 0;
    }

    public void add(T element) {
        elements.add(element);
        count++;
    }

    public int getCount() {
        return count;
    }

    public static void main(String[] args) {
        Counter<String> stringCounter = new Counter<>();
        stringCounter.add("hello");
        stringCounter.add("world");
        System.out.println("Count: " + stringCounter.getCount());

        Counter<Integer> intCounter = new Counter<>();
        intCounter.add(1);
        intCounter.add(2);
        intCounter.add(3);
        System.out.println("Count: " + intCounter.getCount());
    }
}
