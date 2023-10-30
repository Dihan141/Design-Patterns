package Lab3_200042149_StrategyMethod.behaviourClasses;

import Lab3_200042149_StrategyMethod.interfaces.ShootingBehaviour;

public class ShootingFromHand implements ShootingBehaviour {
    @Override
    public String Shoot() {
        return "Shoots buffing aura from hands";
    }
}
