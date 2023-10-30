package Lab4_200042149_FactoryMethod;

public class NYStylePepperoniPizza extends Pizza {
    public NYStylePepperoniPizza() {
        name = "NY Style Pepperoni Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";
        toppings.add("Grated Reggiano Cheese Pepperoni");
    }

    void cut() {
        System.out.println("Cutting the pizza into triangle slices");
    }
}
