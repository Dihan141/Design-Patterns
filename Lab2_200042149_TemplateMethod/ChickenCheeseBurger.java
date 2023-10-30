package Lab2_200042149_TemplateMethod;

public class ChickenCheeseBurger extends Burger{

    @Override
    protected void AddPatty() {
        setPatty("Chicken patty");
    }

    @Override
    protected void AddBun() {
        setBun("Normal bun");
    }

    @Override
    protected void AddToppings() {
        setToppings("Cheese");
    }
}
