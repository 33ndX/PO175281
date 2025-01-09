package zad5;

public class Main {
    public static <T> void swap(T[] array, int index1, int index2) {
        if (array == null || index1 < 0 || index2 < 0 || index1 >= array.length || index2 >= array.length) {
            throw new IndexOutOfBoundsException("Indeksy są poza zakresem tablicy.");
        }

        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void main(String[] args) {
        Integer[] myArray = {1, 2, 3, 4};
        swap(myArray, 0, 2);
        for (Integer element : myArray) {
            System.out.print(element + " ");
        }
    }
}
