package ro.ase.csie.cts.g1092.dp.adapter.disney;

public class DonaldDuck implements DisneyActions {
    String name;
    int hitPoints;

    public DonaldDuck(int hitPoints) {
        this.name = "Donald Duck";
        this.hitPoints = hitPoints;
    }

    @Override
    public void changeLocation(int x, int y) {
        System.out.printf("Moving to a new location: x%d y%d%n", x, y);
    }

    @Override
    public void getWounded(int hitPoints) {
        System.out.printf("%d hit points lost by %s!%n", hitPoints, name);
        this.hitPoints -= hitPoints;
    }

    @Override
    public void getHealed(int hitPoints) {
        System.out.printf("%d hit points gained by %s!%n", hitPoints, name);
        this.hitPoints += hitPoints;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getHitPoints() {
        return this.hitPoints;
    }
}
