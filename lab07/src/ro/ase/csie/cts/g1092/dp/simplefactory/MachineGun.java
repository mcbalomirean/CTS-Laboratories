package ro.ase.csie.cts.g1092.dp.simplefactory;

public class MachineGun extends AbstractWeapon {
    int ammunition;

    public MachineGun(int powerLevel, String description, int ammunition) {
        super(powerLevel, description);
        this.ammunition = ammunition;
    }

    @Override
    public void pewPew() {
        System.out.println("Brrratatat! ->->->->");
    }
}
