package zad6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Wprowadź pierwszą liczbę: ");
                int number1 = scanner.nextInt();
                System.out.print("Wprowadź drugą liczbę: ");
                int number2 = scanner.nextInt();

                int result = number1 / number2;
                System.out.println("Wynik dzielenia: " + result);
                break;
            } catch (ArithmeticException e) {
                System.out.println("Błąd: Dzielenie przez zero! Spróbuj ponownie.");
                scanner.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Błąd: Nieprawidłowe dane wejściowe! Wprowadź liczby całkowite.");
                scanner.nextLine();
            }
        }
        scanner.close();
    }
}

