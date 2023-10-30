package Lab2_200042149_TemplateMethod;

public class ChickenSteakBurgerWithPickles extends Burger{

    @Override
    protected void AddPatty() {
        setPatty("Chicken steak patty");
    }

    @Override
    protected void AddBun() {
        setBun("Normal bun");
    }

    @Override
    protected void AddToppings() {
        setToppings("Pickles");
    }
}
