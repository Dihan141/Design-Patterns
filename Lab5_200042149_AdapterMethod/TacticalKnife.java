package Lab5_200042149_AdapterMethod;

public class TacticalKnife implements Knives {
    @Override
    public void Stabb() {
        System.out.println("Stabbing...");
    }

    @Override
    public void Spin() {
        System.out.println("Spinning...");
    }
}
