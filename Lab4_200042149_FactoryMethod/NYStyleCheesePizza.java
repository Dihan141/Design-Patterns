package Lab4_200042149_FactoryMethod;

public class NYStyleCheesePizza extends Pizza{
    public NYStyleCheesePizza() {
        name = "NY Style Sauce and Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";
        toppings.add("Grated Reggiano Cheese");
    }

    void cut() {
        System.out.println("Cutting the pizza into triangle slices");
    }
}
