package Lab5_200042149_AdapterMethod;

public class M24 implements Guns{
    @Override
    public void Shoot() {
        System.out.println("Shooting...");
    }

    @Override
    public void Reload() {
        System.out.println("Reloading...");
    }
}
