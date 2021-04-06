package ro.ase.csie.cts.g1092.dp.factorymethod;

import ro.ase.csie.cts.g1092.dp.simplefactory.AbstractWeapon;
import ro.ase.csie.cts.g1092.dp.simplefactory.WeaponType;

public class WaterWeaponsFactory extends AbstractWeaponsFactory {
    @Override
    public AbstractWeapon getWeapon(WeaponType weaponType, String description) {
        AbstractWeapon weapon = null;
        switch (weaponType) {
            case BAZOOKA:
                weapon = new WaterBalloon("Splashy splash make boom boom!");
                break;
            default:
                throw new IllegalArgumentException("I am the illegalest");
        }
        return weapon;
    }
}
