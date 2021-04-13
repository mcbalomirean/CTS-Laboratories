package ro.ase.csie.cts.g1092.dp.adapter;

public abstract class SuperHeroCharacter {
    protected String name;
    protected int power;

    public SuperHeroCharacter(String name, int power) {
        this.name = name;
        this.power = power;
    }

    public abstract void move();
    public abstract void crouch();
    public abstract void takeDamage(int amount);
    public abstract void healDamage(int amount);
}
