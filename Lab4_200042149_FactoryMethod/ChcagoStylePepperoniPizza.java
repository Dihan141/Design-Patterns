package Lab4_200042149_FactoryMethod;

public class ChcagoStylePepperoniPizza extends Pizza {
    public ChcagoStylePepperoniPizza(){
        name = "Chicago style pepperoni Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";
        toppings.add("Shredded Mozzarella Cheese Pepperoni");
    }

    void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
