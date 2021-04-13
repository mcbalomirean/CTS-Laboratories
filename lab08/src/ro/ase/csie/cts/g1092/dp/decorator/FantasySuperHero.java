package ro.ase.csie.cts.g1092.dp.decorator;

public class FantasySuperHero extends SuperHeroCharacter {
    boolean canFly;

    public FantasySuperHero(String name, int power, boolean canFly) {
        super(name, power);
        this.canFly = canFly;
    }

    @Override
    public void move() {
        if (canFly) {
            System.out.println("Flying!");
        } else {
            System.out.println("Moving fast!");
        }
    }

    @Override
    public void crouch() {
        if (canFly) {
            System.out.println("Not able to crouch. Huh?");
        } else {
            System.out.println("I can't believe they're crouching!");
        }
    }

    @Override
    public void takeDamage(int amount) {
        System.out.printf("%d damage taken by %s!%n", amount, name);
        this.power -= amount;
    }

    @Override
    public void healDamage(int amount) {
        System.out.printf("%d damage healed by %s!%n", amount, name);
        this.power += amount;
    }
}
