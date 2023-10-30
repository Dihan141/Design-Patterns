package Lab3_200042149_StrategyMethod;

import Lab3_200042149_StrategyMethod.interfaces.*;

public abstract class Hero {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private AbilityBehaviour abilityBehaviour;
    private ShootingBehaviour shootingBehaviour;

    public void setShootingBehaviour(ShootingBehaviour shootingBehaviour) {
        this.shootingBehaviour = shootingBehaviour;
    }

    public void setAbilityBehaviour(AbilityBehaviour abilityBehaviour) {
        this.abilityBehaviour = abilityBehaviour;
    }

    public abstract void AbilityAnimation();

    @Override
    public String toString() {
        return "Name: " + name + "\n" + abilityBehaviour.UseAbility() + "\n" + shootingBehaviour.Shoot();
    }
}
