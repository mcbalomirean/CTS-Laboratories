package ro.ase.csie.cts.g1092.dp.simplefactory;

public class Pistol extends AbstractWeapon {

    public Pistol(int powerLevel, String description) {
        super(powerLevel, description);
    }

    @Override
    public void pewPew() {
        System.out.println("Pew pew! -> -> ->");
    }
}
