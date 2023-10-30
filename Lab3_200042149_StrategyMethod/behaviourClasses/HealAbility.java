package Lab3_200042149_StrategyMethod.behaviourClasses;

import Lab3_200042149_StrategyMethod.interfaces.AbilityBehaviour;

public class HealAbility implements AbilityBehaviour {
    @Override
    public String UseAbility() {
        return  "Heals allies";
    }
}
