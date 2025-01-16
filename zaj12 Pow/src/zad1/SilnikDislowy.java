package zad1;

public class SilnikDislowy implements Silnik{

    @Override
    public void uruchom() {
        System.out.println("Silnik Dislowy urchomiony");
    }

    @Override
    public void zatrzymaj() {
        System.out.println("Silnik Dislowy zatrzymany");
    }
}
