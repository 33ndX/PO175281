package zad1;

public class BenzynowySilnik implements Silnik{


    @Override
    public void uruchom() {
        System.out.println("Silnik Benzynowy urchomiony");
    }

    @Override
    public void zatrzymaj() {
        System.out.println("Silnik Benzynowy zatrzymany");
    }
}
