package com.singgih.strategypattern.weaponbehavior;

import com.singgih.strategypattern.WeaponBehavior;

/**
 * Created by singgihrs on 2/28/17.
 */
public class AxeBehavior implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("Spray with axe!!!");
    }

}
