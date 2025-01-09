package delegat;

public class Gracz {
   Weapon bron;

    public Gracz(Weapon bron) {
        this.bron = bron;
    }

    public void zaatakuj(){
        bron.attack();
    }
}
