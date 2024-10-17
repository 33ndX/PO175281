import javax.lang.model.type.NullType;
import java.util.ArrayList;
import java.util.Scanner;


public class ListyTablicoweTest {
    public static int minimumValue(ArrayList<Integer> lista){
        int minimum = lista.getFirst();
        for (Integer liczba : lista){
            if (minimum > liczba){
                minimum = liczba;
            }
        }
        return minimum;
    }

    public static double average(ArrayList<Double> lista){
        double sum = 0;
        for (Double liczba : lista){
            sum += liczba;
        }
            return sum/lista.size();
        }
    public static int countZeros(ArrayList<Integer> lista){
        int counter = 0;
        for (Integer liczba : lista){
            if(liczba == 0){
                counter++;
            }
        }
        return counter;
    }
    public static String reverseString(String napis){
        StringBuilder reversed = new StringBuilder(napis);
        return reversed.reverse().toString();
    }

    public static Boolean Charat(String napis){
        return napis.charAt(0) == napis.charAt(napis.length()-1);
    }

//    public static String reverseFristLast(String napis){
//        return napis.charAt(napis.length()-1) +
//    }
    public static void choinka(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj znak: ");
        char znak = scanner.next().charAt(0);
        System.out.print("Podaj wysokość: ");
        int n = scanner.nextInt();
        StringBuilder choinka = new StringBuilder();
        for (int i = 1; i <= n; i++)
        {
            for (int j = 0; j < n - i; j++)
            {
                choinka.append(" ");
            }
            for (int k = 0; k < 2 * i - 1; k++)
            {
                choinka.append(znak);
            }
            choinka.append("\n");
        }
        System.out.println(choinka.toString());

    }

}
