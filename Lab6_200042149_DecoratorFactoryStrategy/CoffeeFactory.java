package Lab6_200042149_DecoratorFactoryStrategy;

public class CoffeeFactory {
    public Coffee createCoffee(String type){
        if(type.equals("normal")){
            return new NormalCoffee();
        } else if (type.equals("milk")) {
            return new MilkDecorator(new NormalCoffee());
        } else if (type.equals(("suger"))) {
            return new SugerDecorator(new NormalCoffee());
        } else if (type.equals("milk and suger")) {
            return new SugerDecorator(new MilkDecorator(new NormalCoffee()));
        }else
            return null;
    }
}
