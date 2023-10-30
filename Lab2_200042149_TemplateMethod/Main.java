package Lab2_200042149_TemplateMethod;

public class Main {
    public static void main(String[] args) {
        Burger chickenCheeseBurger = new ChickenCheeseBurger();
        chickenCheeseBurger.CreateBurger();

        Burger beefCheeseBurger = new BeefCheeseBurgerWithPremiumBun();
        beefCheeseBurger.CreateBurger();

        Burger chickenSteakBurger = new ChickenSteakBurgerWithPickles();
        chickenSteakBurger.CreateBurger();

        System.out.println(chickenCheeseBurger.toString());
        System.out.println(beefCheeseBurger.toString());
        System.out.println(chickenSteakBurger.toString());
    }
}