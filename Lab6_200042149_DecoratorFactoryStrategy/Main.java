package Lab6_200042149_DecoratorFactoryStrategy;

public class Main {
    public static void main(String[] args){
        CoffeeShop coffeeShop = new CoffeeShop(new CoffeeFactory());

        //without discount
        coffeeShop.OrderCoffee("milk and suger");

        //with discount
        coffeeShop.setPricing(new DiscountPricing());
        coffeeShop.OrderCoffee("milk and suger");

    }
}
