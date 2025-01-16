package zad1;

public class Samochod {
    private Silnik s;

    public Samochod(Silnik s) {
        this.s = s;
    }

    public void start(){
        s.uruchom();
    }

    public void stop(){
        s.zatrzymaj();
    }
}
