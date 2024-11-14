package minValue;

import java.util.ArrayList;
import java.util.Arrays;

public class num {
    public static double minimumValue(ArrayList<Double> array){
        double min = array.getFirst();
        for (int i = 1; i < array.size(); i++){
            if (array.get(i)<min){
                min = array.get(i);
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Double tab[] = {12.23, 21.32, 43.21};
        ArrayList<Double> list = new ArrayList<>(Arrays.asList(tab));
        System.out.println(minimumValue(list));


    }
}
