package Lab6_200042149_DecoratorFactoryStrategy;

public class NormalPricing implements Pricing{
    @Override
    public float CalculatePrice(Coffee coffee) {
        return coffee.Cost();
    }
}
