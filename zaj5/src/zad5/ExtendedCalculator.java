package zad5;

public class ExtendedCalculator extends Calculator{
    public int add(int num1, int num2, int num3){
        return super.add(num1, num2) + num3;
    }
}
