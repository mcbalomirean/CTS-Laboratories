package ro.ase.csie.cts.g1092.dp.simplefactory;

public class TestSimpleFactory {
    public static void main(String[] args) {
        Superhero superhero = new Superhero("Superman");
//        superhero.setWeapon(new Bazooka("Is bazooka! Boom!"));
//        superhero.setWeapon(new MachineGun(50, "MG-50", 60));

        AbstractWeapon bazooka = WeaponsFactory.getWeapon(WeaponType.BAZOOKA, "Is bazooka! Boom!");
        superhero.setWeapon(bazooka);
        superhero.setWeapon(WeaponsFactory.getWeapon(WeaponType.MACHINE_GUN, "MG-50"));
    }
}
