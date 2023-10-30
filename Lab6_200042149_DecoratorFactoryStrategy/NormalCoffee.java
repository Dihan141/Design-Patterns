package Lab6_200042149_DecoratorFactoryStrategy;

public class NormalCoffee implements Coffee{
    @Override
    public float Cost() {
        return 20;
    }

    @Override
    public String getDescription() {
        return "Normal coffee";
    }
}
