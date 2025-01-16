package zad4;

import zad1.Main;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class GenericQueue<T> {
    private ArrayList<T> list;

    public GenericQueue() {
        list = new ArrayList<>();
    }

    public void enqueue(T element){
        list.add(element);
    }

    public T dequeue(){
        if (list.isEmpty()) {
           throw new NoSuchElementException("Kolejka jest pusta");
        }
        T temp = list.getFirst();
        list.remove(0);
        return temp;
    }

    public static void main(String[] args) {
        GenericQueue<Integer> g1 = new GenericQueue<>();
        g1.enqueue(2);
        g1.enqueue(3);
        g1.enqueue(4);
        System.out.println(g1.dequeue());
        System.out.println(g1.dequeue());
        System.out.println(g1.dequeue());
        System.out.println(g1.dequeue());
    }
}
