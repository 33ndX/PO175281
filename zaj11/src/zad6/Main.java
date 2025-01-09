package zad6;

public class Main {
    public static <T extends Comparable<T>> T maxValue(T[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Tablica nie może być pusta.");
        }

        T max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(max) > 0) {
                max = array[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        Float[] floatArray = {1.2f, 3.4f, 2.2f, 5.6f};
        String[] stringArray = {"apple", "orange", "banana", "pear"};

        System.out.println("Max value in intArray: " + maxValue(intArray));
        System.out.println("Max value in floatArray: " + maxValue(floatArray));
        System.out.println("Max value in stringArray: " + maxValue(stringArray));
    }
}

