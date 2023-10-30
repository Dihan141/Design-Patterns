package Lab4_200042149_FactoryMethod;

public class NYStyleVeggiePizza extends Pizza {
    public NYStyleVeggiePizza() {
        name = "NY Style Vegetable Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";
        toppings.add("Grated Reggiano Cheese Pepperoni Olive");
    }

    void cut() {
        System.out.println("Cutting the pizza into triangle slices");
    }
}
