package Lab6_200042149_DecoratorFactoryStrategy;

public class DiscountPricing implements Pricing{
    @Override
    public float CalculatePrice(Coffee coffee) {
        return coffee.Cost() * 0.8f;
    }
}
