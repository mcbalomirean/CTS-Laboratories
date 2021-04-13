package ro.ase.csie.cts.g1092.dp.decorator;

public class TestDecorator {
    public static void main(String[] args) {
        SuperHeroCharacter fantasyHero = new FantasySuperHero("Blue Dragon", 1000, true);
        fantasyHero.move();
        fantasyHero.crouch();
        fantasyHero.takeDamage(500);

        // should act damaged
        SuperHeroCharacter woundedHero = new WoundedDecorator(fantasyHero);
        woundedHero.move();

        fantasyHero.healDamage(500);

        // add a shield/armor to dragon
        SuperHeroCharacter heroWithShield = new ShieldDecorator(fantasyHero, 200);
        heroWithShield.takeDamage(500);

        SuperHeroCharacter woundedHeroWithShield = new ShieldDecorator(woundedHero, 200);
        woundedHeroWithShield.move();
        woundedHeroWithShield.takeDamage(500);
    }
}
