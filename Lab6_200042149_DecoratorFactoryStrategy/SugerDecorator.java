package Lab6_200042149_DecoratorFactoryStrategy;

public class SugerDecorator extends CoffeeDecorator{
    public SugerDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public float Cost() {
        return super.Cost() + 5;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", with Suger";
    }
}
