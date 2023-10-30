package Lab6_200042149_DecoratorFactoryStrategy;

public class MilkDecorator extends CoffeeDecorator{
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public float Cost() {
        return super.Cost() + 10;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", with Milk";
    }
}
