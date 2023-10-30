package Lab6_200042149_DecoratorFactoryStrategy;

public class CoffeeShop {
    CoffeeFactory coffeeFactory;
    Pricing pricing;

    public CoffeeShop(CoffeeFactory coffeeFactory){
        this.coffeeFactory = coffeeFactory;
        this.pricing = new NormalPricing();
    }

    public void setPricing(Pricing pricing){
        this.pricing = pricing;
    }
    public void OrderCoffee(String type){
        Coffee coffee = coffeeFactory.createCoffee(type);

        System.out.println(coffee.getDescription());
        System.out.println("Price: " + pricing.CalculatePrice(coffee));
    }
}
