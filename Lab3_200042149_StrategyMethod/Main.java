package Lab3_200042149_StrategyMethod;

import Lab3_200042149_StrategyMethod.behaviourClasses.*;

public class Main {
    public static void main(String[] args){
        Hero hero = new DamageDealer();
        hero.setName("Baston");
        hero.setAbilityBehaviour(new DamageAbility());
        hero.setShootingBehaviour(new ShootingWithGun());
        System.out.println(hero.toString());

        System.out.println("\n");

        hero = new Healer();
        hero.setName("Casandra");
        hero.setAbilityBehaviour(new HealAbility());
        hero.setShootingBehaviour(new ShootingWithStaff());
        System.out.println(hero.toString());

        System.out.println("\n");

        hero = new Support();
        hero.setName("Miguel");
        hero.setAbilityBehaviour(new SupportAbility());
        hero.setShootingBehaviour(new ShootingFromHand());
        System.out.println(hero.toString());
    }
}
