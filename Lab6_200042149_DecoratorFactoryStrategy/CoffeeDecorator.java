package Lab6_200042149_DecoratorFactoryStrategy;

public class CoffeeDecorator implements Coffee{
    protected Coffee coffee;

    public CoffeeDecorator(Coffee coffee){
        this.coffee = coffee;
    }
    @Override
    public float Cost() {
        return coffee.Cost();
    }

    @Override
    public String getDescription() {
        return coffee.getDescription();
    }
}
