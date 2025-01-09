package delegat;

public class Sztylet implements Weapon{
    @Override
    public void attack() {
        System.out.println("Zatakowano z Sztyletu");
    }
}
