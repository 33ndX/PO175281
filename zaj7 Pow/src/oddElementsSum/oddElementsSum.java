package oddElementsSum;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class oddElementsSum {

    public static int oddElementsSum(int[] lista){
        int result = 0;
        for (int i = 0; i < lista.length; i++){
            if (lista[i] % 2 != 0){
                result += lista[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int list[] = {1, 2, 3};
        System.out.println(oddElementsSum(list));
    }
}
