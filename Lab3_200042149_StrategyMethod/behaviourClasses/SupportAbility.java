package Lab3_200042149_StrategyMethod.behaviourClasses;

import Lab3_200042149_StrategyMethod.interfaces.AbilityBehaviour;

public class SupportAbility implements AbilityBehaviour {
    @Override
    public String UseAbility() {
        return "Gives allies damage buff";
    }
}
