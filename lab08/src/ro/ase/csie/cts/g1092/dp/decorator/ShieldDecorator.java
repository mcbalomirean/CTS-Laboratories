package ro.ase.csie.cts.g1092.dp.decorator;

public class ShieldDecorator extends AbstractDecorator {
    int shieldPower;

    public ShieldDecorator(SuperHeroCharacter decoratedObject, int shieldPower) {
        super(decoratedObject);
        this.shieldPower = shieldPower;
    }

    @Override
    public void takeDamage(int amount) {
        int realAmount = amount - shieldPower;

        if (realAmount > 0) {
            super.takeDamage(realAmount);
        }
    }
}
