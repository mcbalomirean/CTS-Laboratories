package ro.ase.csie.cts.g1092.dp.adapter;

import ro.ase.csie.cts.g1092.dp.adapter.disney.DisneyActions;

public class DisneyToSuperHeroAdapter extends SuperHeroCharacter {
    DisneyActions disneyCharacter = null;

    public DisneyToSuperHeroAdapter(DisneyActions disneyCharacter) {
        super(disneyCharacter.getName(), disneyCharacter.getHitPoints());
        this.disneyCharacter = disneyCharacter;
    }

    @Override
    public void move() {
        disneyCharacter.changeLocation(0, 0);
    }

    @Override
    public void crouch() {
        System.out.printf("%s crouching!%n", disneyCharacter.getName());
    }

    @Override
    public void takeDamage(int amount) {
        disneyCharacter.getWounded(amount);
    }

    @Override
    public void healDamage(int amount) {
        disneyCharacter.getHealed(amount);
    }
}
