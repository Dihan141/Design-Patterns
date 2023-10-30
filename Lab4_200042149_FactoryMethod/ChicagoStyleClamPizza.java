package Lab4_200042149_FactoryMethod;

public class ChicagoStyleClamPizza extends Pizza {
    public ChicagoStyleClamPizza(){
        name = "Chicago style clam Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";
        toppings.add("Shredded Mozzarella Cheese Jalapeno");
    }

    void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
