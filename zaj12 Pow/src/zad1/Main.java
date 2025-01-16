package zad1;

public class Main {
    public static void main(String[] args) {
        Silnik b = new BenzynowySilnik();
        Samochod s1 = new Samochod(b);
        s1.start();
        s1.stop();

        Silnik d = new SilnikDislowy();
        Samochod s2 = new Samochod(d);
        s2.start();
        s2.stop();

    }
}
