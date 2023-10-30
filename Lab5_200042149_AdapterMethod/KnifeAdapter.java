package Lab5_200042149_AdapterMethod;

public class KnifeAdapter implements Guns{
    Knives knives;

    public KnifeAdapter(Knives knives){
        this.knives = knives;
    }
    @Override
    public void Shoot() {
        System.out.println("Throwing the knife...");
        knives.Stabb();
    }

    @Override
    public void Reload() {
        System.out.println("Getting next knife...");
    }
}
