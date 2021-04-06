package ro.ase.csie.cts.g1092.dp.factorymethod;

import ro.ase.csie.cts.g1092.dp.simplefactory.*;

public class RealWeaponsFactory extends AbstractWeaponsFactory {
    @Override
    public AbstractWeapon getWeapon(WeaponType weaponType, String description) {
        AbstractWeapon weapon = null;
        switch (weaponType) {
            case PISTOL:
                weapon = new Pistol(10, description);
                break;
            case MACHINE_GUN:
                weapon = new MachineGun(50, description, 60);
                break;
            case BAZOOKA:
                weapon = new Bazooka(description);
                break;
            default:
                throw new UnsupportedOperationException();
        }
        return weapon;
    }
}
