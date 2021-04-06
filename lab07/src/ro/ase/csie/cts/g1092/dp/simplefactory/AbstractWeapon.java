package ro.ase.csie.cts.g1092.dp.simplefactory;

public abstract class AbstractWeapon {
    int powerLevel;
    String description;

    public AbstractWeapon(int powerLevel, String description) {
        this.powerLevel = powerLevel;
        this.description = description;
    }

    public abstract void pewPew();
}
