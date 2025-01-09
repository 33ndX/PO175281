package zad2;

public class Main {
    public static <T> boolean isEqual(T obj1, T obj2) {
        return obj1.equals(obj2);
    }

    public static void main(String[] args) {
        Integer num1 = 10;
        Integer num2 = 11;
        System.out.println(isEqual(num2, num1));
    }
}
