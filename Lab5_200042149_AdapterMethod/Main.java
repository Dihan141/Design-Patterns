package Lab5_200042149_AdapterMethod;

public class Main {
    public static void main(String[] args){
        Guns gun = new M24();

        gun.Shoot();
        gun.Reload();

        TacticalKnife tacticalKnife = new TacticalKnife();
        gun = new KnifeAdapter(tacticalKnife);

        System.out.println("\n");

        gun.Shoot();
        gun.Reload();
    }
}
