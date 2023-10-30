package Lab4_200042149_FactoryMethod;

public class Main {
    public static void main(String[] args){
        PizzaStore nyPizzaStore = new NYPizzaStore();
        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();

        Pizza pizza = nyPizzaStore.orderPizza("cheese");
        System.out.println("Dihan ordered " + pizza.getName());

        System.out.println("\n");

        pizza = chicagoPizzaStore.orderPizza("cheese");
        System.out.println("Anan ordered " + pizza.getName());

        System.out.println("\n");

        pizza = chicagoPizzaStore.orderPizza("veggie");
        System.out.println("Jawad ordered " + pizza.getName());
    }
}
