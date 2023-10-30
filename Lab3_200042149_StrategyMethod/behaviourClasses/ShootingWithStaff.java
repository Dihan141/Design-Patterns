package Lab3_200042149_StrategyMethod.behaviourClasses;

import Lab3_200042149_StrategyMethod.interfaces.ShootingBehaviour;

public class ShootingWithStaff implements ShootingBehaviour {

    @Override
    public String Shoot() {
        return "Shoots healing orb from staff";
    }
}
