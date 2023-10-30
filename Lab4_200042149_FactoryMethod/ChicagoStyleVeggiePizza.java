package Lab4_200042149_FactoryMethod;

public class ChicagoStyleVeggiePizza extends Pizza {
    public ChicagoStyleVeggiePizza(){
        name = "Chicago style veggie Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";
        toppings.add("Shredded Mozzarella Cheese Jalapeno Olive");
    }

    void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
