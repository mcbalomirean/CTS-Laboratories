package ro.ase.csie.cts.g1092.dp.factorymethod;

import ro.ase.csie.cts.g1092.dp.simplefactory.AbstractWeapon;
import ro.ase.csie.cts.g1092.dp.simplefactory.Superhero;
import ro.ase.csie.cts.g1092.dp.simplefactory.WeaponType;

public class TestFactoryMethod {
    public static void main(String[] args) {
        Superhero superhero = new Superhero("Superman");
        boolean isKidsMode = true;

        AbstractWeaponsFactory abstractFactory = null;

        if (isKidsMode) {
            abstractFactory = new WaterWeaponsFactory();
        } else {
            abstractFactory = new RealWeaponsFactory();
        }

        AbstractWeapon bazooka = abstractFactory.getWeapon(WeaponType.BAZOOKA, "Is bazooka! Boom!");
        superhero.setWeapon(bazooka);
        superhero.setWeapon(abstractFactory.getWeapon(WeaponType.MACHINE_GUN, "MG-50"));
    }
}
