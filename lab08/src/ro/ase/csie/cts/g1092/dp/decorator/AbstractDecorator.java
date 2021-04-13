package ro.ase.csie.cts.g1092.dp.decorator;

public abstract class AbstractDecorator extends SuperHeroCharacter {
    SuperHeroCharacter decoratedObject;

    public AbstractDecorator(SuperHeroCharacter decoratedObject) {
        super(decoratedObject.name, decoratedObject.power);
        this.decoratedObject = decoratedObject;
    }

    @Override
    public void move() {
        decoratedObject.move();
    }

    @Override
    public void crouch() {
        decoratedObject.crouch();
    }

    @Override
    public void takeDamage(int amount) {
        decoratedObject.takeDamage(amount);
    }

    @Override
    public void healDamage(int amount) {
        decoratedObject.healDamage(amount);
    }
}
