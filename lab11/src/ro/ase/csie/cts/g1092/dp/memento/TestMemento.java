package ro.ase.csie.cts.g1092.dp.memento;

public class TestMemento {
    public static void main(String[] args) {
        SuperHero superHero = new SuperHero("Superman", "flying", 500);

        HeroRestorePoint initial = superHero.saveData();

        superHero.setLifePoints(1000);
        System.out.println("Lifepoints: " + superHero.getLifePoints());

        superHero.restoreData(initial);
        System.out.println("Lifepoints: " + superHero.getLifePoints());
    }
}
