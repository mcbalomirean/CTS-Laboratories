package ro.ase.csie.cts.g1092.dp.adapter;

import ro.ase.csie.cts.g1092.dp.adapter.disney.DisneyActions;
import ro.ase.csie.cts.g1092.dp.adapter.disney.DonaldDuck;

import java.util.ArrayList;

public class TestAdapter {
    public static void main(String[] args) {
        // simulate game
        SuperHeroCharacter fantasyHero = new FantasySuperHero("Blue Dragon", 1000, true);
        fantasyHero.move();
        fantasyHero.crouch();
        fantasyHero.takeDamage(500);
        fantasyHero.healDamage(500);

        // use Disney character as SuperHeroCharacter
        DisneyActions donaldDuck = new DonaldDuck(500);
        donaldDuck.changeLocation(100, 500);
        donaldDuck.getWounded(250);
        donaldDuck.getHealed(250);

        ArrayList<SuperHeroCharacter> gameHeroes = new ArrayList<>();
        gameHeroes.add(fantasyHero);

        DisneyToSuperHeroAdapter donaldAdapter = new DisneyToSuperHeroAdapter(donaldDuck);
        gameHeroes.add(donaldAdapter);

        for (SuperHeroCharacter heroCharacter : gameHeroes) {
            heroCharacter.move();
            heroCharacter.crouch();
            heroCharacter.takeDamage(250);
            heroCharacter.healDamage(250);
        }
    }
}
