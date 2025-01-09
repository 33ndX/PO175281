package delegat;

public class Miecz implements Weapon{
    @Override
    public void attack() {
        System.out.println("Zatakowano z miecza");
    }
}
