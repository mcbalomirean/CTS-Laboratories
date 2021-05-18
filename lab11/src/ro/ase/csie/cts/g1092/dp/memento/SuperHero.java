package ro.ase.csie.cts.g1092.dp.memento;

public class SuperHero {
    private String name, power;
    private int lifePoints;

    public SuperHero(String name, String power, int lifePoints) {
        this.name = name;
        this.power = power;
        this.lifePoints = lifePoints;
    }

    public void attack() {
        System.out.println("Is attacking.");
    }

    public void heal() {
        System.out.println("Is healing.");
    }

    public void move() {
        System.out.println("Is moving.");
    }

    public HeroRestorePoint saveData() {
        return new HeroRestorePoint(this.name, this.power, this.lifePoints);
    }

    public void restoreData(HeroRestorePoint memento) {
        this.name = memento.getName();
        this.power = memento.getPower();
        this.lifePoints = memento.getLifePoints();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public int getLifePoints() {
        return lifePoints;
    }

    public void setLifePoints(int lifePoints) {
        this.lifePoints = lifePoints;
    }
}
