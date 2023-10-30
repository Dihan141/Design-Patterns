package Lab4_200042149_FactoryMethod;

public class NYStyleClamPizza extends Pizza {
    public NYStyleClamPizza() {
        name = "NY Style Clam Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";
        toppings.add("Grated Reggiano Cheese");
    }

    void cut() {
        System.out.println("Cutting the pizza into triangle slices");
    }
}
