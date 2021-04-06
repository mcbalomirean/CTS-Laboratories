package ro.ase.csie.cts.g1092.dp.simplefactory;

public class Bazooka extends AbstractWeapon {

    public Bazooka(String description) {
        super(1000, description);
    }

    @Override
    public void pewPew() {
        System.out.println("Boom boom! ------>***");
    }
}
