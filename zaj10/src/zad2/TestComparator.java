package zad2;

public class TestComparator implements MyComparator {

    @Override
    public int compare(int a, int b) {
        if(a < b) {
            return -1;
        } else if (a == b) {
            return 0;
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        TestComparator comparator = new TestComparator();
        System.out.println(comparator.compare(3, 4));
    }
}
