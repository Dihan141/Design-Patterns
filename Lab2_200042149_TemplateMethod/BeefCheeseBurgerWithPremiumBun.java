package Lab2_200042149_TemplateMethod;

public class BeefCheeseBurgerWithPremiumBun extends Burger{
    @Override
    protected void AddPatty() {
        setPatty("Beef patty");
    }

    @Override
    protected void AddBun() {
        setBun("Premium bun");
    }

    @Override
    protected void AddToppings() {
        setToppings("Cheese");
    }
}
